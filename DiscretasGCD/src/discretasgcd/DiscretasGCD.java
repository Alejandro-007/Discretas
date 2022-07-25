
/*
    elabora un programa donde el usuario pueda ingresar dos numeros enteros pisitivos,
    y se le permita hallar el GCD, utilizando el algoritmo de Euclides.

            JOHAN SEBASTIAN HENAO CAÑAS
            DOUGLAS LANNY ALARCÓN SALAZAR
            ALEJANDRO BECERRA ACEVEDO

            johan.henao1@udea.edu.co
            douglas.alarcon@udea.edu.co
            alejandro.becerraa@udea.edu.co
 */


package discretasgcd;

import java.util.Scanner;


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
                    System.out.println("        El Maximo Comun Divisor (GCD) de los numeros ingresados es:  " + GCD(a,b));
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
        int gcd = 0, divisor = Math.abs(b),residuo,dividendo = Math.abs(a);
        if (divisor == 0 && dividendo == 0){
            System.out.println("     Los dos valores NO pueden ser cero a la vez");
            return 0;            
        }else{
            if (dividendo != 0 && divisor !=0){
                if (dividendo >= divisor){
                    do{ 
                        //residuo = dividendo % divisor;
                        residuo = divide_unsigned(dividendo, divisor);
                        dividendo = divisor;
                        gcd = divisor;
                        divisor = residuo;     

                    }while (residuo != 0); 
                 }else{
                     dividendo = Math.abs(b);
                     divisor = Math.abs(a);
                     do{            
                         residuo = divide_unsigned(dividendo, divisor);
                         dividendo = divisor;
                         gcd = divisor;
                         divisor = residuo;  
                     }while (residuo != 0);
                }           
            }else{
                if (dividendo <= divisor){
                    gcd = divisor;
                 }else{
                     divisor= Math.abs(a);
                     dividendo = Math.abs(b);
                     gcd = divisor;
                }                
            }
        }
        return gcd;
    }
    
    static int divide_unsigned(int n, int d){
        int r = n;
        while (r >= d){
            r = r-d;
        }
        return r;
        }
    
}
