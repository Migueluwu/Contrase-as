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
public class ContrasenyaAleatoria {

    /**
     * @param args the command line arguments
     */
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio= new Random();
        
        int posicion1,posicion2,posicion3,posicion4, letranumero;
        char letra;
        boolean valida=false;
        do{
        posicion1= aleatorio.nextInt(10);
        posicion2= aleatorio.nextInt(10);
        posicion3= aleatorio.nextInt(10);
        posicion4= aleatorio.nextInt(10);
        letranumero= aleatorio.nextInt(90-65+1)+65;
        letra= (char) letranumero;
        System.out.println("la cotraseña es "+ posicion1+posicion2+posicion3+posicion4+letra);
        valida=(!numerosiguales(posicion1, posicion2, posicion3, posicion4)&&numero1numero4impar(posicion1, posicion4)
                && numero2numero3par(posicion2, posicion3)&&(letraFX(letranumero)));
        }while(!valida);
    }
    
}
