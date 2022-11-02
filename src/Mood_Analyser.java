public class Mood_Analyser {
public Mood_Analyser() {
    System.out.println("Mood is HAPPY");
}
    public Mood_Analyser(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Mood_Analyser obj1=new Mood_Analyser();
        Mood_Analyser obj=new Mood_Analyser("SAD MOOD");


    }
}