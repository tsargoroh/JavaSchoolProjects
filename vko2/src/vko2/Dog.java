package vko2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dog {
    private String name;
    private String says;
    
    public Dog(String name){
        if (name.trim().isEmpty() == true)
            name = "Doge";
        System.out.println("Hey, my name is " + name + "!");
        this.name = name;
        this.says = "Much wow!";
    }
    
    public void speak(String text){
        while (text.trim().isEmpty() == true){
            System.out.println(says);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("What does a dog say: ");
            try {
                text = br.readLine();
            } catch (IOException ex) {
            }
        }
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()){
            if (scanner.hasNextBoolean())
                System.out.println("Such boolean: " + scanner.next());
            else if (scanner.hasNextInt())
                System.out.println("Such integer: " + scanner.next());
        }
    }
}