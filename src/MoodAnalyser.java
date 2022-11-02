import java.util.Scanner;

public class MoodAnalyser {
    public String analyseMood(){
        String mood;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mood");
        mood=sc.next();
        return mood;
    }

    public static void main(String[] args) {
        MoodAnalyser analyser=new MoodAnalyser();
        System.out.println("Message is:"+analyser.analyseMood());
    }
}
