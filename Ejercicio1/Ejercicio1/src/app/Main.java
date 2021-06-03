package app;

import java.util.Scanner;


/*Sabiendo la cantidad de bancos de cada aula, el usuario deberá ingresar la cantidad de alumnos
 * inscriptos para cursar tercer grado y el sistema deberá determinar qué aula es la indicada para
 * la cantidad ingresada. La escuela ya sabe que la máxima capacidad de sus aulas es de 40 alumnos,
 * por lo tanto, la cantidad de alumnos inscriptos que ingresa el usuario siempre será un número menor
 * o igual a 40. Las 3 aulas deben quedar ocupadas según los datos ingresados.*/ 


public class Main {
    private static  Scanner tec = new Scanner(System.in);
    private static int ningresado = 0;
    private static Aula uno = new Aula("Amarilla", 30  , false);
    private static Aula dos = new Aula("Verde", 35  , false);
    private static Aula tres = new Aula("Azul", 40  , false);
    
    public Main() {
        
    }   
    
    public static void main(String[] args) {
        int i = 0;
        int aula = 0;
        
     do { 
            
        System.out.print("Porfavor ingrese la cantidad de alumnos:\n ");
          
        ningresado = tec.nextInt();
                 
        if(ningresado > 0 && ningresado <41){  
            aula = comparacion(ningresado);
            
            if((aula==0) && (uno.isCompleta() ==false)){
                System.out.println("\nEl aula indicada para esa cantidad es la Amarilla");
                uno.setCompleta(true);
                System.out.println("Aula Amarilla asignada con éxito!\n");
                System.out.println("_________________________________________________________ \n\n");
                i++;
                
            } else if (((aula==1) && (dos.isCompleta() ==false)) || ((uno.isCompleta() ==true)&& (dos.isCompleta() ==false)) ){
                System.out.println("\nEl aula indicada para esa cantidad es la Verde");
                dos.setCompleta(true);
                System.out.println("Aula amarilla Verde con éxito!\n");
                System.out.println("_________________________________________________________ \n");
                i++;
                      
                
            } else if (((aula==2) && (tres.isCompleta() ==false)) || ((tres.isCompleta() ==false) && ((uno.isCompleta() ==true) || (dos.isCompleta() ==true)))) {
                System.out.println("El aula indicada para esa cantidad es la Azul"); 
                tres.setCompleta(true);
                System.out.println("Esta aula ya quedó ocupada!\n");
                System.out.println("_________________________________________________________ \n");
                i++;
            }
        
        }else {System.out.println("Número invalido. Ingreselo nuevamente\n");
                   
        }
     }while (i < 3);
        
     
          
    }
      
    private static int comparacion (int ningresado){
        int min = 999;
        int posicion = 0;
        int[] vector = new int[3];
        
        vector [0]= uno.getBancos() - ningresado;
        vector [1] =dos.getBancos() - ningresado; 
        vector [2] =tres.getBancos() - ningresado;
          
        for(int i=0; i< 3; i++ ){
            if((min>vector[i]) && (vector[i]>= 0)){
                min = vector[i];
                posicion = i;

            }
            
         }       
        
        return posicion;
        }
}