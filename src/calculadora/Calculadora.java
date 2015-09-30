
package calculadora;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
       
    Scanner s = new Scanner (System.in);    
        
    int numero,a,b;    
    
    
    System.out.println("Digite el numero de la operacion que desea eralizar");
    System.out.println();
    System.out.println("1:sumar 2 números ");
    System.out.println("2:restar 2 números ");
    System.out.println("3:multiplicar 2 números ");
    System.out.println("4:dividir 2 números ");
    System.out.println("5:cual de los dos numeros es mayor ");
    System.out.println("6:Porsentaje de un numero ");
    System.out.println("7:salir ");
    numero = s.nextInt();
    
    do {
        switch (numero) {
        case 1:
            
            System.out.println("ingrese dos numeros que desee sumar ");
            
            a = s.nextInt();
            b = s.nextInt();
            
            int c = a + b;
            
            System.out.println("La suma es = "+c);
            
            break;

        case 2:
            
            System.out.println("ingrese los numeros que se restan ");  
            
            a = s.nextInt();
            b = s.nextInt();
            
            c = a - b;
            
            System.out.println("La resta es = "+c); 
            
            break;

        case 3:
            
            System.out.println("ingrese los numeros a multiplicar ");  
            
            a = s.nextInt();
            b = s.nextInt();
            
            c = a * b;
            
            System.out.println("La multiplicacion es = "+c); 
            
            break;

        case 4:
            
            System.out.println("ingrese (el dividendo y luego el dividor)  ");  
            
            double z = s.nextDouble();
            double x = s.nextDouble();
            
          
            double d = z/x;
            
            System.out.println("La divicion es = "+d); 
            break;
        
        case 7:
            
            System.out.println("Para confirmar salida de la calculadora presione 7¡ para volver al menu principal 1¡ "); 
            numero = s.nextInt();
            
            break;
        
        case 5:
            
            System.out.println("ingrese los numeros para obtener el cual es mayor ");  
           
            a = s.nextInt();
            b = s.nextInt();
            
            if (a > b) {
                
                System.out.println(a + "es mayor " + b);
            }else { 
                System.out.println(b + "es mayor " + a);
            }    
                   
            break;
        
        case 6:   
            
            System.out.println("ingrese el numero ");  
           
            z = s.nextDouble();
            
            System.out.println("ingrese el porsentaje que quiere obtener de  " + z);  
            
            x = s.nextDouble();
            
            d = (x * z) / 100; 
            
            a = (int) x;
            b = (int) z;
            
            System.out.println(" El " +  a + "% de " + b +" = " + d );  
            
            break;
            
        default:
                System.out.println("Ingrese una de las opciones anteriomente nombradas  ");
                numero = s.nextInt();
            break;
        }   
        
        if (numero<=6 && numero>=1) {
            System.out.println();
            System.out.println("Digite el numero de la operacion que desea realizar");
            System.out.println();
            System.out.println("1:sumar 2 números ");
            System.out.println("2:restar 2 números ");
            System.out.println("3:multiplicar 2 números ");
            System.out.println("4:dividir 2 números ");
            System.out.println("5:cual de los dos numeros es mayor  ");
            System.out.println("6:porsentaje de un numero ");
            System.out.println("7:salir ");
            System.out.println();
            
            numero = s.nextInt();
        }
            
            
            
    } while (numero<=6 && numero>=1);
    
    
    
    }
    
}
