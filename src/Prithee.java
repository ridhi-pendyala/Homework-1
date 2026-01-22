public class Prithee {

    private int stop;
    private String[] words;

    public Prithee (String[] words, int stop){
        this.stop = stop;
        this.words = words;
    }

    public String getWord(){
        return words[stop];
    }
}
