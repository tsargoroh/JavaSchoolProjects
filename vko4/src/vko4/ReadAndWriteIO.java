package vko4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIO {
    private BufferedReader br;
    private BufferedWriter bw;
    private String line;
    public void readFile(String fileName) {
        try {
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public void readAndWrite(String inputFileName, String outputFileName) {
        try {
            br = new BufferedReader(new FileReader(inputFileName));
            bw = new BufferedWriter(new FileWriter(outputFileName));
            while ((line = br.readLine()) != null){
                bw.write(line + "\n");
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}