/*Задача : определить цвет по "длине волны", вывести результат на консоль.
Если диапазон не входит в видимый спектр, вывести на консоль "Light is not visible"
        Определение цвета по длине волны.
        Фиолетовый от 380 до меньше чем 450
        Синий от 450 до меньше чем 495
        Зеленый от 495 до меньше чем 570
        Желтый от 570 до меньше чем 590
        Оранжевый от 590 до меньше чем 620
        Красный от 620 до 750

        Другими словами : фиолетовый цвет находится в диапазоне 380-449 (450 не входит в диапазон).

        Написать класс LightColorDetector с методом detect(int wavelength), проверить.
        Загрузить в качестве ответа архив ZIP c 2 классами :
        LightColorDetector и LightColorDetectorTest (c методом main).

        *Написать тесты*/

package lightcolordetector;

public class LightColorDetector {

    int wavelength;
    String result;

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength() {
        this.wavelength = wavelength;
    }

    public String getResult() {
        return result;
    }

    public void setResult() {
        this.result = result;
    }

    String detect(int wavelenght) {

        if ((wavelenght >= 380) && (wavelenght < 450)) {
            this.wavelength = wavelenght;
            return result = "The light is Violet";
        } else if ((wavelenght >= 450) && wavelenght < 495) {
            this.wavelength = wavelenght;
            return result = "The light is Blue";
        } else if ((wavelenght >= 495) && (wavelenght < 570)) {
            this.wavelength = wavelenght;
            return result = "The light is Green";
        } else if ((wavelenght >= 570) && (wavelenght < 590)) {
            this.wavelength = wavelenght;
            return result = "The light is Yellow";
        } else if ((wavelenght >= 590) && (wavelenght < 620)) {
            this.wavelength = wavelenght;
            return result = "The light is Orange";
        } else if ((wavelenght >= 620) && (wavelenght < 750)) {
            this.wavelength = wavelenght;
            return result = "The light is Red";
        } else {
            this.wavelength = wavelenght;
            return result = "The light is not visible!";
        }
    }

    public void printInformation() {
        System.out.println ("If the light wave length is equal to " + getWavelength ());
        System.out.println (getResult ());
    }


}
