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

package light_color_detector;

public class LightColorDetector {

    int spectreMin = 380;
    int spectreMax = 750;
    String violet = "The light is Violet";
    String blue = "The light is Blue";
    String green = "The light is Green";
    String yellow = "The light is Yellow";
    String orange  = "The light is Orange";
    String red = "The light is Red";
    String invisible = "The light is not visible!";
    int wavelength;

    public int getWavelength() {
        return wavelength;}
        public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    public void detect(){
        if((wavelength >= 380) && (wavelength < 450)){
            System.out.println (violet);
        }else if ((wavelength >= 450) && (wavelength < 495)){
            System.out.println (blue);
        }else if ((wavelength >= 495) && (wavelength < 570)){
            System.out.println (green);
        }else if ((wavelength >= 570) && (wavelength < 590)){
            System.out.println (yellow);
        }else if ((wavelength >= 590) && (wavelength < 620)){
            System.out.println (orange);
        }else if ((wavelength >= 620) && (wavelength < 750)){
            System.out.println (red);
        }
        else {
            System.out.println (invisible);
        }
    }

}
