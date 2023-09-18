/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio08;

/**
 *
 * @author tayara.5970
 */
   
   import java.util.ArrayList;
   import java.util.List;

   public class exercicio0809 {
   public static void main(String[] args) {
    
   List<Integer> lista1 = new ArrayList<>();
   lista1.add(1);
   lista1.add(2);
   lista1.add(3);
   System.out.println("Lista1:" + lista1);
   
   List<Integer> lista2 = new ArrayList<>();
   lista2.add(4);
   lista2.add(5);
   lista2.add(6);
   System.out.println("Lista2:" + lista2);
   
   List<Integer> listaCombinada = new ArrayList<>();
   listaCombinada.addAll(lista1);
   listaCombinada.addAll(lista2);
   
   System.out.println("Lista combinada:" + listaCombinada);
   
   }
   }























 
   