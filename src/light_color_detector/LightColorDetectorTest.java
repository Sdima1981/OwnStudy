package light_color_detector;

public class LightColorDetectorTest {

    public static void main(String[] args){
        LightColorDetector colorDetector  = new LightColorDetector ();
        colorDetector.wavelength = 449;
        System.out.print ("If the wavelength is " + colorDetector.wavelength + "  ");
        colorDetector.detect ();

    }
}
