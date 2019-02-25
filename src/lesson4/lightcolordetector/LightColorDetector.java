package lesson4.lightcolordetector;

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
