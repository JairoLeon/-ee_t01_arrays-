/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t01_arrays;

/**
 *
 * @author Jairo
 */
import java.io.*;
public class Archivo {
    
  public void leerArchivo()throws FileNotFoundException,IOException{
     File file=new File("Archivo.txt");  
     FileReader archivo =new FileReader(file);
     BufferedReader input=new BufferedReader(archivo);
     String entrada="";
     Integer tamaño=Integer.parseInt(input.readLine());
     Integer[] arreglo=new Integer[tamaño];
    
     System.out.println("ENTRADA:\n"+tamaño);
     while((entrada=input.readLine())!=null){
      System.out.println(entrada);
    }
    for(int i=1;i<=tamaño;i++){
      arreglo[i-1]=i;
    }
    System.out.println("forma descendente:");
    for(int y=tamaño;y>0;y--){
      System.out.println(arreglo[y-1]);
    } 
   }   
    
}
