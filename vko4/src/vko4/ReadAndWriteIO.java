package vko4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteIO {
    private BufferedReader br;
    private String line;
    public void readFile(String fileName) {
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}