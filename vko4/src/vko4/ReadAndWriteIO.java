package vko4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ReadAndWriteIO {
    private BufferedReader br;
    private String line;
    
    public void readZip(String zipName) {
        try {
            ZipFile zip = new ZipFile(zipName);
            Enumeration<? extends ZipEntry> entries = zip.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                br = new BufferedReader(new InputStreamReader(zip.getInputStream(entry)));
                while ((line = br.readLine()) != null)
                        System.out.println(line);
                br.close();
            }
        } catch (IOException ex) {}
    }
}