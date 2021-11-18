/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contrasenyaaleatoria;


/**
 *
 * @author miguel
 */
public class contrasenya2 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        
   
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseContrasenya contrasenya;
       
        do{
        contrasenya= new ClaseContrasenya();
        String Contraseñatexto = contrasenya.pasarAString();
        System.out.println("la cotraseña es "+ Contraseñatexto);   
            
        }while(!contrasenya.valida());
    }
    
}

        
       
    

