package lesson4.phraseanalizer;

import java.sql.SQLOutput;

public class  PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyser myPhrase = new PhraseAnalyser ();
        myPhrase.analyse ("Make education great again");
        myPhrase.printInformation ();

        PhraseAnalyserTest testRunner = new PhraseAnalyserTest ();
        testRunner.shouldBeCouldBeWorseEnd ();
        testRunner.shouldBeCouldBeWorseStart ();
        testRunner.shouldBeFineReally ();
        testRunner.shouldBeStandsNoChance ();
    }

    public void shouldBeStandsNoChance(){
        PhraseAnalyser victim = new PhraseAnalyser ();
        String expectedResult = "It stands no chance..";
        String actualResult = victim.analyse ("Make education great again");
        if (actualResult.equals (expectedResult)){
            System.out.println ("Test shouldBeStandsNoChance PASSED!");
        }else {
            System.out.println ("Test shouldBeStandsNoChance FAILED!");
        }
    }

    public void shouldBeCouldBeWorseEnd(){
        PhraseAnalyser victim = new PhraseAnalyser ();
        String expectedResult = "It could be worse";
        String actualResult = victim.analyse ("If education great again");
        if (actualResult.equals (expectedResult)){
            System.out.println ("Test shouldBeCouldBeWorseEnd PASSED!");
        }else {
            System.out.println ("Test shouldBeCouldBeWorseEnd FAILED!");
        }
    }

    public void shouldBeCouldBeWorseStart(){
        PhraseAnalyser victim = new PhraseAnalyser ();
        String expectedResult = "It could be worse";
        String actualResult = victim.analyse ("Make education disappear");
        if (actualResult.equals (expectedResult)){
            System.out.println ("Test shouldBeCouldBeWorseStart PASSED!");
        }else {
            System.out.println ("Test shouldBeCouldBeWorseStart FAILED!");
        }
    }

    public void shouldBeFineReally (){
        PhraseAnalyser victim = new PhraseAnalyser ();
        String expectedResult = "It is fine, really";
        String actualResult = victim.analyse ("What are you talking about");
        if (actualResult.equals (expectedResult)){
            System.out.println ("Test shouldBeFineReally PASSED!");
        }else {
            System.out.println ("Test shouldBeFineReally FAILED!");
        }
    }




}
