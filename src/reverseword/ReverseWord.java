/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reverseword;
import java.util.Scanner;
/**
 *
 * @author adona
 */
public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        
        char[] reverse = new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            reverse[i] = word.charAt(word.length() - (i+1));
            
        }
        System.out.println(reverse);
    }
}
