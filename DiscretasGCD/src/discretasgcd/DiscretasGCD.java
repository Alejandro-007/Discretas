/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretasgcd;

import java.util.Scanner;

/**
 *
 * @author Talia Palacio Mira
 */
public class DiscretasGCD {

        public static void main(String[] args) {
        int a,b,sw = 1;
        String y="y";
        
        Scanner Leer = new Scanner(System.in);         
        do{
                System.out.println("        Recuerde que el primer numero debe ser mayor al segundo");
                System.out.println("");
                System.out.println("        Ingrese el primer numero");
                a = Leer.nextInt();
                System.out.println("        Ingrese el segundo numero");
                b = Leer.nextInt();
                
                if (GCD(a,b) != 0){
                    System.out.println("        El Maximo Comun Divisor (GCD) de los numeros ingresados es:  " + Math.abs(GCD(a,b)));
                    System.out.println("");  
                }
            System.out.println("        Desea ingresar otro par de nuemros (y/n)");
            y = Leer.next(); 
            
            if(!y.equals("y")){
                sw = 0;                
            }
            
        }while(sw == 1);     
    }
    
    public static int GCD (int a,int b){
        int gcd = 0, divisor = a,residuo,dividendo = b;
       if (a == 0 && b == 0){
           System.out.println("     Los dos valores NO pueden ser cero a la vez");
           return 0;            
       }else{
           if (b != 0 ){
                if (Math.abs(a) >= Math.abs(b)){

                    do{            
                        residuo = dividendo % divisor;
                        dividendo = divisor;
                        gcd = divisor;
                        divisor = residuo;     

                    }while (residuo != 0); 
                    
                }else{
                    dividendo = a;
                    divisor = b;
                    do{            
                        residuo = dividendo % divisor;
                        dividendo = divisor;
                        gcd = divisor;
                        divisor = residuo;     

                    }while (residuo != 0);
                }           
           }else{
               gcd = a;
           }
       }
        return gcd;
    }
    
}
