/* Name: Jhonrick Dela Cruz
    Section: BSIT 2 Y1 - 5
    OOPR WEEK 5 Assignment 1
 */
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("BufferedReader version: ");
        Buffer beff = new Buffer();
        beff.input();
        beff.display();
        System.out.println("\nScanner version: ");
        Scan scam = new Scan();
        scam.input();
        scam.display();
    }
}

class Buffer {
    String fWord, sWord, tWord;

    public void input()throws IOException {
        BufferedReader scanf = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Enter first word: ");
        fWord = scanf.readLine();
        System.out.print("Enter second word: ");
        sWord = scanf.readLine();
        System.out.print("Enter third word: ");
        tWord = scanf.readLine();

    }
    public void display() {
        System.out.println(fWord + " " + sWord + " " + tWord + ".");
    }
}

class Scan {
    String word1, word2, word3;

    public void input() {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter first word: ");
        word1 = scanf.nextLine();
        System.out.print("Enter second word: ");
        word2 = scanf.nextLine();
        System.out.print("Enter third word: ");
        word3 = scanf.nextLine();
    }

    public void display() {
        System.out.println(word1 + " " + word2 + " " + word3 + ".");
    }

}