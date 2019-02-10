/*Биржа ценных бумаг открывается утром и создаются все объекты акций с ценой вечернего закрытия.
 Задача: необходимо реализовать класс Stock (акция) таким образом, чтобы была возможность узнать текущую цену акции, а также ее минимальную и максимальную стоимость за день.
 Поля класса:
 String company
 double currentValue
 double max
 double min

 Методы:
 getCompany()
 getCurrentValue()
 getMax()
 getMin()
 updatePrice()
 printInformation()

 Каждая акция должна описывать к какой компании (company) она относится, а также содержать цену с вечернего закрытия (currentValue). Это значит, что необходим конструктор классаобязательно должен быть с company и currentValue.
 Стоимость акции может меняться в цене и на каждое изменение вызывается метод updatePrice. Метод должен автоматически обновить все состояние акции (если такое возможно).

 Например:
 Биржа ценных бумаг открывается утром, цена акции на момент вечернего закрытия 150$.
 Соответственно, на начальном этапе минимальная цена за день, максимальная цена за день и текущая цена равны 150$.
 После открытия биржи, цена акции начинает “скакать”, таким образом минимальная и максимальная цена за
 день меняются в зависимости от пиковых значений.
 После повышения цены со 150$ до 150.37$, текущая и максимальная цена устанавливаются в размере 150.37$,
 а минимальная цена остается неизменной (150$).
 Затем происходит падение цены и стоимость акции падает до 149.82$. Текущая и минимальная цена акции становится 149.82$,
 максимальная цена с момента последнего повышения цены не изменилась и осталась в размере 150.37$.
 Stock ibm = new Stock("IBM", 150)

 Состояние объекта:
 currentValue = 150
 max = 150
 min = 150

 ibm.updatePrice(150.37);
 ibm.updatePrice(149.82);
 Ibm.updatePrice(150.12);

 Итоговое состояние объекта:
 currentValue = 150.12
 max = 150.37
 min = 149.82

 Реализовать метод printInformation для вывода на консоль всех значений на консоль
Протестировать класс.
*/
package stock;

public class Stock {

    String company;
    double currentValue;
    double max;
    double min;

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    void updatePrice(double currentValue) {

        if (currentValue < min) {
            min = currentValue;
            this.currentValue = currentValue;
        } else if ((currentValue > min) && (currentValue > max)) {
            max = currentValue;
            this.currentValue = currentValue;
        } else if ((currentValue > min) && (currentValue < max)) {
            this.currentValue = currentValue;
        }
        if (currentValue != currentValue) {
            currentValue = currentValue;
        }
        //System.out.println ("current " + currentValue);
        //System.out.println ("max " + max);
        //System.out.println ("min " + min);
    }

    void printInformation() {
        System.out.println ("current " + currentValue);
        System.out.println ("max " + max);
        System.out.println ("min " + min);
    }


    public static void main(String[] args) {
        Stock stock = new Stock ();
        stock.company = "IBM";
        stock.currentValue = 150;
        stock.min = 150;


        stock.updatePrice (150.37);
        stock.updatePrice (149.82);
        stock.updatePrice (150.12);

        stock.printInformation ();
    }

}

