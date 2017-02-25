    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a7p1;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SPP2EGervacciRA7P1 {

    /**
     * @param args the command line arguments
     */@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    int count = 0;
    Long [] directorio = new Long [10];
    for (int i=0; i<directorio.length; i++){
        directorio [i] = tel("el número telefónico "+ (i+1+": "));
    }
    int num=consult("cuantos números desea consultar");
    do{
    int consulta = consult("el número que desea consultar.");   
    count = count + 1;
    if(consulta>directorio.length){
    System.out.println("Ingresó un valor no disponible");
    }
    else System.out.println("El número de la persona "+consulta+" es: "+directorio[consulta-1]+"\n");
    } while (count<num);
    }
    public static long tel(String mensaje){
        Scanner kb = new Scanner (System.in);
        long varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = kb.nextLong();
        flag=false;
        }
        catch (Exception ex){
            System.out.println("Por favor introduzca un número válido");
            flag=true;
            kb.next();
        } 
        }while (flag); 
    return varEntera;
    }
    public static int consult(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.println("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    
}
