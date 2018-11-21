import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your tweet:");
        String tweet = in.nextLine();

        if (tweet.length() > 140) {
            System.out.println("No! Your tweet is too long!");
            System.out.println("Excess number: " + tweet.substring(139).length());

        } else {
            System.out.println("Length correct");

            int hashtagNum = 0;
            int attributionNum = 0;
            int linkNum = 0;

            for (int i = 0; i < tweet.length(); i++) {
                if (tweet.charAt(i) == '#' && tweet.charAt(i + 1) != ' ') {
                    hashtagNum++;
                }

                if(tweet.charAt(i)=='@' && tweet.charAt(i+1) !=' '){
                    attributionNum++;
                }

                if(tweet.substring(i).toLowerCase().startsWith("http://")){
                    linkNum++;
                }


            }
            System.out.println("Hashtags: " + hashtagNum);
            System.out.println("Atrributions: " +attributionNum);
            System.out.println("Links: " + linkNum);
        }
    }
}
