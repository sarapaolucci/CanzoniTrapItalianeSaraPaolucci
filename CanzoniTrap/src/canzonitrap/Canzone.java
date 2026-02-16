/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canzonitrap;

/**
 *
 * @author paolucci.sara
 */
public class Canzone {
    private String nome, cantante;
    private int punteggio, anno;
    
    public Canzone(String no, String c, int an, int p){
        this.nome = no;
        this.punteggio = p;
        this.anno = an;
        this.cantante = c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getPunteggio(){
        return punteggio;
    }
}
