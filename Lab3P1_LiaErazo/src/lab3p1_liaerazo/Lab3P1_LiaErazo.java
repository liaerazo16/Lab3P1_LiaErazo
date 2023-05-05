/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_liaerazo;
import java.util.Scanner;
/**
 *
 * @author Paola
 */
public class Lab3P1_LiaErazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
                Scanner leer2= new Scanner (System.in);

            int resp=1;
            while (true){
                System.out.println(" MENU ");
                System.out.println("1. Serie Euclidiana ");
                System.out.println("2. Pokebola ");
                System.out.println("3. ¡OK Boomer!");
                System.out.println(" Ingrese su opcion: ");
                int opcion = leer2.nextInt();
                    switch(opcion){
                        case 1:
                            System.out.println(" Ingrese la cantidad de puntos :");
                            int num =leer2.nextInt();
                            double acumulador=0;
                            for (int i=1;i<=num;i++){
                            System.out.println("Ingrese el valor de x :");
                            int x=leer2.nextInt();
                            System.out.println("Ingrese el valor de y :");
                            int y=leer2.nextInt();
                            double menos=x-y;
                            double poten= Math.pow(menos, 2);
                            acumulador=poten+acumulador;
                             double square=Math.sqrt(acumulador);
                             System.out.println("La distancia euclidiana es :"+ square);
                            }
                         break;  
                        case 2:
                         System.out.println("Ingrese el tamaño de su pokebola :");
                            int n=leer.nextInt();
                            if (n>0){
                            }else{
                                System.out.println("ERROR, intente de nuevo");
                            for(int i=1;i<=n;i++){
                                System.out.println("*");
                                for (int j=1; j<=n;j++){
                                    System.out.println("*");
                                }
                            } 
                            }
                          break;
                        case 3:
                            System.out.println( "Ingrese su año de nacimiento :");
                            int año=leer.nextInt();
                            if (año<=0){
                            }else{
                                System.out.println("ERROR, intente de nuevo");
                            }
                            while (año>0){
                            if (año<1964 && año>1946){
                             System.out.println("!Felicidades usted es de la generacion Baby Boomer Gen!");   
                            }
                            if (año<1979 && año>1960){
                               System.out.println("!Felicidades usted es Generation X !");
                            }
                            if (año<1985 && año>1975){
                                System.out.println("!Felicidades usted es de la generacion Xennials!");
                            }
                            if (año<1994 && año>1980){
                                System.out.println("!Felicidades usted es Millenials!");
                            }
                            if (año<1990 && año>2012){
                                System.out.println("!Felicidades usted es de la generacion Gen Z!");
                            }else{
                                System.out.println("!Felicidades usted es de la generacion Gen Alpha!");
                            }
                            }
                         break;
                } 
                    //
            }        
    }
}