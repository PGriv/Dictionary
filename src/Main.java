import java.util.Locale;
import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Index index = new Index();
        try (Scanner sc= new Scanner(System.in)){
            String entry ="";

            while (true){
                System.out.println("Give a word for the dictionary or type the word 'quit' to exit");
                entry=sc.next();
                if (entry.equals("quit")) {
                    System.out.println("Exiting...");
                    break;
                }
                char[] characters= entry.toCharArray();
                boolean valid=true;
                for (char c: characters){
                    if (!Character.isAlphabetic(c)){
                        System.out.println("You have to type only characters");
                        valid=false;
                        break;
                    }
                    }
                if (valid){
                    index.add(entry.toLowerCase());
                }
                System.out.println(index);
            }
    }
}}
