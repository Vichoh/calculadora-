
package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
       
    Scanner s = new Scanner (System.in);    
        
    int numero,a,b,q,c,n,m;
    double x,z,d;
    numero = 0;
    q = 0;
    a = 0;
    b = 0;
    d = 0;
    
    do {
        
        try {

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
            System.out.println("-------");
            
            q = 0;


        } catch (Exception letra) {
           
            System.out.println("usted a ingresado un variable no valida, Porfavor intente nuevamente");
            s.nextLine();
            System.out.println(letra.toString());
            q = 1;
            
        }
    } while (q == 1);
        
    
    do {
       switch (numero) {
        case 1:
            
            System.out.println("ingrese dos numeros que desee sumar ");
            
            do {    
                try {
                    a = s.nextInt();
                    b = s.nextInt();

                    c = a + b;
                    q = 0;
                    System.out.println("La suma es = "+c);

                } catch (Exception uno) {

                   System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                   s.nextLine();
                   q = 1 ; 
                } 
            } while (q == 1);
            
            
        break;

            
        case 2:
            
            System.out.println("ingrese los numeros que se restan ");  
            
            do {
                try {


                    a = s.nextInt();
                    b = s.nextInt();

                    c = a - b;

                    System.out.println("La resta es = "+c); 
                    
                    q = 0;

                } catch (Exception dos) {

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    q = 1;
                    s.nextLine();
                    
                }
            } while (q == 1);
            
        break;

            
        case 3:
            
            do {
                try {
                    System.out.println("ingrese los numeros a multiplicar ");  

                    a = s.nextInt();
                    b = s.nextInt();

                    c = a * b;

                    System.out.println("La multiplicacion es = "+c); 
                    q = 0;

                } catch (Exception tres) {

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    q = 1;     
                    s.nextLine();
                    
                }
            } while (q == 1);
            
        break;

            
        case 4:
            
            System.out.println("ingrese (el dividendo y luego el dividor)  ");  
            
            do {
                try {
                    
                    n = s.nextInt();
                    m = s.nextInt();

                    if (m != 0) { 

                        d = (double) n/m;
                        System.out.println("La divicion es = "+d); 
                        q = 0;
                        
                    } else {
                        
                        d = n/m;
                    }

                    

                } catch (ArithmeticException cuatro) {

                    System.out.println("Error al dividir entre 0");
                    System.out.println("Intentelo nuevamente");

                    q = 1;
                    s.nextLine();

                } catch (InputMismatchException cuatro){
                    
                    System.out.println("Caracter ingresado no valido / intente nuevamente");
                    q = 1;
                    s.nextLine();
                    
                }   
            
            } while (q == 1);  
            
        break;
        
            
        case 7:
            
            do {
                try {

                    System.out.println("Para confirmar salida de la calculadora presione cualquier numero superio a 7 o menor a 0 ¡ para volver al menu principal presione cualquier nuemro entre 1 y 6¡ "); 
                    numero = s.nextInt();
                    q = 0;

                } catch (Exception siete){

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    s.nextLine();
                    q = 1;

                }    
            } while (q == 1);
            
        break;
        
        case 5:
            
            do {
                try {
                    System.out.println("ingrese los numeros para obtener el cual es mayor ");  

                    a = s.nextInt();
                    b = s.nextInt();

                    if (a > b) {

                        System.out.println(a + "es mayor " + b);
                    }else { 
                        System.out.println(b + "es mayor " + a);
                    }    
                    q = 0;

                } catch (Exception cinco){

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    q = 1;
                    s.nextLine();
                }
            } while (q == 1);
            
        break;
        
            
        case 6:   
         
            do {    
                try {
                    System.out.println("ingrese el numero ");  

                    z = s.nextDouble();

                    System.out.println("ingrese el porsentaje que quiere obtener de  " + z);  

                    x = s.nextDouble();

                    d = (x * z) / 100; 

                    a = (int) x;
                    b = (int) z;

                    System.out.println(" El " +  a + "% de " + b +" = " + d );  

                    q = 0;
                } catch (Exception seis){

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    q = 1;
                    s.nextLine();

                }
            } while (q == 1);
        
        break;
            
            
        default:
                System.out.println("Ingrese una de las opciones correspodientes  ");
                numero = 4;
            break;
        }   
        
        if (numero<=6 && numero>=1) {
            
            do {
                try {
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

                    q = 0;

                } catch (Exception def){

                    System.out.println("usted a ingresado un Caracter invalido, Intente nuevamente");
                    s.nextLine();
                    q = 1;
                }  
            } while (q == 1);    
        }
            
            
            
    } while (numero<=7 && numero>=1);
    
    
    
    }
    
}
