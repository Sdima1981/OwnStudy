package lesson4.phraseanalizer;

public class PhraseAnalyser {
    String phrase;
    String result;

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String analyse(String phrase) {
        this.phrase = phrase;

        if (phrase.startsWith ("Make") && phrase.endsWith ("great again")) {
            return result = "It stands no chance..";
        } else if (phrase.startsWith ("Make") || phrase.endsWith ("great again")) {
            return result = "It could be worse";
        } else {
            return result = "It is fine, really";
        }
    }

    public void printInformation() {
        System.out.println (getPhrase () + "! " + getResult ());
    }
}
