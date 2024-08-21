/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author SCIS2-17
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner sc = new Scanner(System.in);
        int num1 = 66928;
        int num2 = 66992;
        ArrayList<Integer> div1 = new ArrayList();
        ArrayList<Integer> div2 = new ArrayList();
        int suma1 = 0;
        int suma2 = 0;
        
        long tInicio = System.nanoTime();

        for (int i = 1; i < num1; i++) {
            double div = num1 % i;

            if (div == 0) {

                div1.add(i);

            }

        }
        for (int i = 1; i < num2; i++) {
            double div = num2 % i;

            if (div == 0) {

                div2.add(i);

            }

        }

        for (int i = 0; i < div1.size(); i++) {

            suma1 = suma1 + div1.get(i);

        }
        System.out.println(suma1);

        for (int i = 0; i < div2.size(); i++) {

            suma2 = suma2 + div2.get(i);
        }
        System.out.println(suma2);

        if (suma1 == num2 && suma2 == num1) {
            System.out.println(" son amigos ");
        } else {
            System.out.println("no son amigos");
        }
        
        long tFinal = System.nanoTime();
        long tDiferencia = tFinal - tInicio;
        
        
        System.out.println("la cantidad de tiempo es de " + tDiferencia);
    }
    
}
