package org.example;

import java.util.Arrays;
import java.util.Scanner;

/*
Primera parte

Suponer un sistema de reserva de asientos para un anfiteatro. El teatro
cuenta con 10 filas de 10 asietos cada una. Se necesita desarrollar un
Sistema (sin uso de bases de datos, únicamente manejo de datos de forma
logica) que permita llevar a cabo lo siguiente.

- 1. Cargar el "mapa" de las filas y asientos. Indicando con una "x" los
asientos ocupados y con una "L" los asientos libres. Al iniciar el
programa, Todos los asientos deben estar libres.

- 2. Manejar la reserva de asientos contemplado que un asiento SOLO
PUEDE SER RESERVADO si se encuentra en estado "L", en caso de que
esté en estado "X", se debera permitir al comprador elegir otro asiento.
Si se encuentra  en estado "L", debera pasar automaticamente al estado
"X".

- 3. Para finalizar el programa se demera ingresar un valor en
particular. Contemplar que no existe una cantidad exacta de veces que
el programa se puede ejecutar.

- 4. Contemplar que SOLO EXISTEN 10 FILAS Y 10 ASIENTOS. No se pueden
vender asientos fuera de esas numeraciones. No se permite
"sobreventa"

- CONSIDERACIONES: No es necesaria implementacion de GUI ni de DB. Se
evaluara 100% el manejo logico del desarrollado de la aplicacion.

- EXTRA: En caso de que un cluente solicite visalizar cuales son los
asientos libres. el sistema deme permitir mostrar de forma grafica el
mapa de asientos. NO UTILIZAR GUI para este caso. Utilizar
UNICAMENTE logica y salida por consola
 */
public class Main {
    public static void main(String[] args) {

        String[][] seats = {{"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",},
                {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L",}};
        Scanner scanner = new Scanner(System.in);
        int row;
        int column;
        String flat = " ";


        while (!flat.equalsIgnoreCase("si")) {
            System.out.print("Si desea ver el mapa de sillas escribe \"si\"\n" +
                    "de lo contrario escribe cualquier valor\n" +
                    "Deseas ver el mapa de sillas: ");
            String matrix = scanner.next();
            System.out.println(" ");
            if (matrix.equals("si")){
                for (int i = 0; i <seats.length; i++) {
                    for (int j = 0; j < seats.length; j++) {
                        System.out.print(seats[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
            System.out.println(" ");
            System.out.print("En que posicion le gustaria reservar su asiento\n" +
                    "Fila: ");
            row = scanner.nextInt();
            System.out.print("Columna: ");
            column = scanner.nextInt();
            System.out.println(" ");

            if (seats[row][column].equals("L")) {
                seats[row][column] = "X";
                System.out.println("Su asiento fue reservado\n" +
                        "Si desea salir ingrese \"si\"");
            }else{
                System.out.println("El asiento que desea reservar ya esta reservado por favor escoja otro\n" +
                        "Si no desea otro asiento puede salir ingresando \"si\"");
            }
            System.out.println("Si desea continuar puede ingresar cualquier valor\n" +
                    "Desea salir: ");
            flat = scanner.next();
        }
        for (int i = 0; i < seats.length; i++){
            System.out.println(Arrays.toString(seats[i]));
        }
    }
}