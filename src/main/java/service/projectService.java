/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

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
    
    public ArrayList<List<String>> mytable(){
       ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(Arrays.asList("Gelas","15000"));
        data.add(Arrays.asList("Sendok", "15000"));
        data.add(Arrays.asList("Piring","15000"));
        data.add(Arrays.asList("Meja","15000"));
        data.add(Arrays.asList("Kursi","15000"));
        data.add(Arrays.asList("Lemari","15000"));
        
        return data;
    }
    
}
