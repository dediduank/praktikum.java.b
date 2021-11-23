/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;

/**
 *
 * @author Dedi Wardani
 */
public class projectService {
    
    public String name = "Prasetya";
    
    public ArrayList<String> tabel(){
        ArrayList<String> data = new ArrayList<>();
        
        data.add("Gelas");
        data.add("Sendok");
        data.add("Piring");
        data.add("Meja");
        data.add("Kursi");
        data.add("Lemari");
        
        return data;
    }
    
}
