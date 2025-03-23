package Mayor_tres_numeros;

import java.util.Scanner;

public class mayor_tres_numeros {
    public static void main(String[] args) {
/*
    Mayor de Tres Números
    Descripción: Encuentra el número más grande entre tres valores dados.

    Instrucciones:
    Usa prompt() para pedir tres números.
    Usa if-else o Math.max() para encontrar el mayor.
    Muestra el resultado en consola.
*/

        Scanner numeros = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = numeros.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = numeros.nextInt();
        System.out.println("Ingrese el tercer número");
        int num3 = numeros.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " Es mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " Es mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero " + num3 + " Es mayor");
        } else {
            System.out.println("ingrese un número mayor a 0");
//        }
        }
    }
}