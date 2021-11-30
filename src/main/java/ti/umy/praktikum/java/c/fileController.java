/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.praktikum.java.c;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.projectService;

/**
 *
 * @author Dedi Wardani
 */

@Controller
public class fileController {
    projectService serv = new projectService();
    
    @RequestMapping("/")
    public String viewIndex(){
     return "index"; 
    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String getGreeting(){
        
        return "Hello World !!! " + serv.name;
        
    }
    
    @RequestMapping("/viewUtility")
    @ResponseBody
    public ArrayList<String> getDataUtil(){
        
        return serv.tabel();
        
    }
    
    @RequestMapping("/tampilkandata")
    public String tampil(Model kurir){
        
        ArrayList<String> paket = new ArrayList<>();
        
        paket = serv.tabel(); //untuk mengisi arrayList lokal
        
        kurir.addAttribute("perkakas", paket); //proses mengirim data yang ada di arraylist
        
        return "viewData"; //Didalam tanda Petik adl nama file html
    }
    
    @RequestMapping("/tampilkanall")
    public String tampilarrayduaD(Model kurir){
        
        ArrayList<List<String>> paket = new ArrayList<>();
        
        paket = serv.mytable(); //untuk mengisi arrayList lokal
        
        kurir.addAttribute("perkakas", paket); //proses mengirim data yang ada di arraylist
        
        return "viewData"; //Didalam tanda Petik adl nama file html
    }
    
}
