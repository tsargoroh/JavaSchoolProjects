package vko4;

//import java.io.File;

public class Mainclass {
    public static void main(String[] args) {
        ReadAndWriteIO io = new ReadAndWriteIO();
        io.readFile("input.txt");
        //System.out.println(System.getProperty("user.dir"));
        
        /*File file = new File(".");
        for(String fileNames : file.list()) System.out.println(fileNames);*/
    }
}