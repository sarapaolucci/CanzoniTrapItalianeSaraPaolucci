/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canzonitrap;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class Gestore {
    private FileManager f;
    private ArrayList<Canzone>canzoni;
    
    public Gestore(String s) throws IOException{
        this.f = new FileManager(s);
        canzoni = new ArrayList();
        f.leggiFile(canzoni);
    }
    
    public double punteggioMedio(){
        double somma = 0;
        for(int i = 0; i < canzoni.size();i++){
            somma+= canzoni.get(i).getPunteggio();
        }
        return somma/canzoni.size();
    }
    
    public String canzoniPunteggio(){
        int menoCinque = 0;
        int piuOtto = 0;
        for(int i = 0; i < canzoni.size();i++){
            if(canzoni.get(i).getPunteggio()> 8 ){
                piuOtto++;
            }
            else if(canzoni.get(i).getPunteggio() < 5 ){
                menoCinque++;
            }
        }
        return"Le canzoni con punteggio superiore a 8: " + piuOtto + "\nLe canzoni con punteggio inferiore a 5: " + menoCinque;
    }
    
    public String PunteggioMaggioreEMinore(){
        int max = 0;
        String nomeMax = "";
        String nomeMin = "";
        int min = 1000;
        for(int i = 0; i < canzoni.size();i++){
            if(canzoni.get(i).getPunteggio() < min){
                min = canzoni.get(i).getPunteggio();
                nomeMin = canzoni.get(i).getNome();
            }
            if(canzoni.get(i).getPunteggio() > max){
                max = canzoni.get(i).getPunteggio();
                nomeMax = canzoni.get(i).getNome();
            }
        }
       return"La canzone con il punteggio più alto è: " + nomeMax + "(punteggio " + max + ")" + "\nLa canzone con il punteggio più basso è: " + nomeMin + "(punteggio " + min + ")";
    }
    
}
