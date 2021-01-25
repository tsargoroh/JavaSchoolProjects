package vko2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Mainclass {
    public static void main(String[] args) {
        String temp = null;
        System.out.print("Give a name to the dog: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            temp = br.readLine();
        } catch (IOException ex) {
        }
        Dog dog1 = new Dog(temp);
        System.out.print("What does a dog say: ");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextLine();
        dog1.speak(temp);
    }
}