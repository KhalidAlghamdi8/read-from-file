/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read.from.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 *
 * @author khali
 */
public class ReadFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            FileReader fr=new FileReader("mytext.txt");
            BufferedReader br = new BufferedReader(fr);
            String line= br.readLine();
            while (line!=null) {
                System.out.println(line);      
                        fr.close();

                
            }
        } catch (IOException e) {
        }
    }
    
}
