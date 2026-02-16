/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canzonitrap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class FileManager {
    private String csvFile;
    
    public FileManager(String s){
        this.csvFile= s;
    }
    
    public void leggiFile(ArrayList<Canzone> canzoni) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(csvFile))){
            String line;
            while((line = reader.readLine()) != null){
                String[] colonne = line.split(";");
                Canzone c = new Canzone(colonne[0],colonne[1],Integer.parseInt(colonne[2]),Integer.parseInt(colonne[3]));
                canzoni.add(c);
            }
        }
    }
    
    public void scriviFile(ArrayList<String> DaStampare) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))){
            for(int i = 0; i < DaStampare.size(); i++){
                writer.write(DaStampare.get(i));
                writer.newLine();
                writer.newLine();
            }
        }
    }
}
