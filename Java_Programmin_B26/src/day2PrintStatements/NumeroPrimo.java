package day2PrintStatements;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        int numero, acumulador=1,enteros=1;
        System.out.println("Ingrese un numero: ");
        Scanner leer=new Scanner(System.in);
        numero=leer.nextInt();
        System.out.println("El numero ingresado es: "+numero);
        while (numero>=acumulador){
            if (enteros%2==1){
                System.out.println(enteros+" ");
                acumulador++;
            }
            enteros++;
        }
    }
}
