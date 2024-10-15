package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        whileLoop(4);

    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num2) {
        int num1 = 0;

        while(num1 < num2) {
            System.out.println(num1 + " < " + num2 + ". El proximo ciclo valdra: " + (num1 + 1));
            num1++;
        }



    }
}