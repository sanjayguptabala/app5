package day3;

import java.util.Scanner;

public class Str {
    char fun(char a){
        return a;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char input = sc.next().charAt(0);
            Str o = new Str();
            char r = o.fun(input);
            System.out.println("Result: " + r);
        }
    }
}
