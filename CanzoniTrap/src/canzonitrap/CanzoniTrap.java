/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canzonitrap;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class CanzoniTrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Gestore g = new Gestore("canzoni_trap.txt");
        ArrayList<String>DaStampare = new ArrayList();
        DaStampare.add("Punteggio medio delle canzoni: "+ g.punteggioMedio());
        DaStampare.add(g.canzoniPunteggio());
        DaStampare.add(g.PunteggioMaggioreEMinore());
        FileManager f = new FileManager("output_trp.txt");
        f.scriviFile(DaStampare);
    }
    
}
