/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contrasenyaaleatoria;
import java.util.Random;
/**
 *
 * @author miguel
 */
public class ClaseContrasenya {

    int numero1;
    int numero2;
    int numero3;
    int numero4;
    int letranumero;
    char letra;   

public ClaseContrasenya(){
    Random aleatorio= new Random();
    numero1= aleatorio.nextInt(10);
    numero2= aleatorio.nextInt(10);
    numero3= aleatorio.nextInt(10);
    numero4= aleatorio.nextInt(10);
    letranumero= aleatorio.nextInt(90-65+1)+65;
    letra= (char) letranumero;
    
}

public String pasarAString(){
    return String.valueOf(numero1)+String.valueOf(numero2)+
            String.valueOf(numero3)+String.valueOf(numero4)+letra;
}

public boolean valida(){
    boolean valida=(!numerosiguales(numero1, numero2, 
                numero3, numero4)&&
                numero1numero4impar(numero1, numero4)
                && numero2numero3par(numero2, numero3)&&
                (letraFX(letranumero)));
    return valida;
}


 private static boolean numerosiguales(int a,int b,int c, int d) {
        boolean repite=false;
        if((a==b)||(a==c)||(a==d)||(b==c)||(b==d)||(c==d)){
        repite=true;
            System.out.println("se repite");
        }else{
            System.out.println("no se repite");
        }
         return repite;
    }
 private static boolean numero1numero4impar(int a,int b) {
        boolean impar=true;
        if((a+b)%2==0){
        impar=false;
        }
        return impar;
    }
     private static boolean numero2numero3par(int a,int b) {
        boolean par=false;
        if((a*b)%2==0){
        par=true;
        }
        return par;
    }
     
      private static boolean letraFX(int a) {
        boolean valido=false;
        if(a>=70 && a<=88){
        valido=true;
        }
        return valido;
    }
 
 
 
}