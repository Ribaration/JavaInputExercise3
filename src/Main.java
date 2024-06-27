/* Program to count the letters, spaces, numbers and other input string*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String inputString = input.nextLine();
        count(inputString);
    }
    public static void count(String x){
        char [] ch = x.toCharArray();
        int space=0, letter=0 , num=0, others=0;

        for(int i=0;i<x.length();i++){
            if(Character.isDigit(ch[i])){
                num++;
            }else if (Character.isLetter(ch[i])){
                letter++;
            }else if (Character.isSpace(ch[i])){
                space++;
            }else{
                others++;
            }

        }
        System.out.println(letter);
        System.out.println(space);
        System.out.println(num);
        System.out.println(others);
    }

}