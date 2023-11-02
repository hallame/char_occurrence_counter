
import java.util.Scanner;
public class toUpperKase {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str1, str2 = "";
            String str0;
            System.out.println("Enter the letter you want to put to UpperCase: ");
            str0 = in.nextLine();
            char ch0 = str0.charAt(0);
            String ch1 = str0.toUpperCase();
            String ch2 = str0.toLowerCase();
            char ch3 = ch1.charAt(0);
            char ch4 = ch2.charAt(0);
            System.out.println("Enter a word: ");
            str1 = in.nextLine();

            for(int i=0; i<str1.length(); i++){
                char ch5 = str1.charAt(i);
                if(ch5 == ch3 || ch5 == ch4){
                    str2 += ch3;

                }else{
                    str2 += ch5;

                }
            }
            System.out.println(str1+ " with '" + ch0 + "' toUpperCase:");
            System.out.println(str2);
        }
    }

