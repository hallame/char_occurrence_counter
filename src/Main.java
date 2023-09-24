
import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int it = 0, nb = 0;
        String str, ch0, str2 = "", vide = "";
        System.out.println("Enter the letter of interest:");
        ch0 = in.nextLine();
        String ch4 = ch0.toUpperCase();
        String ch5 = ch0.toLowerCase();
        char ch2 = ch4.charAt(0);
        char ch3 = ch5.charAt(0);
        System.out.println("Enter un word:");
        str = in.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (ch1 == ch2 || ch1 == ch3) {
                nb += 1;
                it += 1;
                if (nb == 1) {
                    if (i == str.length() - 1) { // if the character is the last one in the string, no need compare to next one, so we stop
                        str2 += ch1;
                        str2 += "{" + nb + "}";
                    } else {
                        if (ch1 == str.charAt(i + 1)) {
                            str2 += ch1;
                        } else {
                            str2 += ch1;
                            str2 += "{" + nb + "}";
                            nb = 0;
                        }
                    }d
                } else if (nb >= 2) {
                    if (i == str.length()) {
                        str2 += "{" + nb + "}";
                    } else {
                        if (ch1 == str.charAt(i + 1)) {
                            str2 += vide;
                        } else {
                            str2 += "{" + nb + "}";
                            nb = 0;
                        }
                    }
                }
            }else{
                    str2 += ch1;
                }
        }
            if (it == 0) {
                System.out.println("There isn't " + ch2 + " in " + str);
            } else {
                System.out.println("Occurence of " + ch2 + "/" + ch3+":");
                System.out.println(str2);
                //System.out.println(it+" "+ch2);
            }
        }
    }
