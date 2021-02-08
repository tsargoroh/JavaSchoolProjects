package vko4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteIO {
    private BufferedReader br;
    private BufferedWriter bw;
    private String line;
    private Scanner sc;
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
                if (line.length() < 30 && !line.trim().isEmpty()) {
                    sc = new Scanner(line);
                    sc.useDelimiter("");
                    while (sc.hasNext()){
                        if (sc.next().equals("v")) {
                            bw.write(line + "\n");
                            break;
                        }
                    }
                }
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