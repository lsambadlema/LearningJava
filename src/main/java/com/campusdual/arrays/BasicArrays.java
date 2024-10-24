package com.campusdual.arrays;

public class BasicArrays {
    public static void main(String[] args) {
        int[] firstIntArray = new int[3];      //array: int[]
        firstIntArray[0] = 15;
        firstIntArray[1] = 17;
        firstIntArray[2] = 19;

        String[] firstStringArray = {"A", "B", "C", "D"};

        System.out.println("First int array lenght: " + firstIntArray.length);    //nos permite saber la capacidad total
        System.out.println("First String array lenght: " + firstStringArray.length);


        System.out.println("First int array position value: " + firstIntArray[0]);    //nos permite saber la capacidad total
        System.out.println("First String array position value: " + firstStringArray[0]);


        System.out.println("Last int array position value: " + firstIntArray[firstIntArray.length - 1]);    //longitud - 1 = última posición
        System.out.println("Last String array position value: " + firstStringArray[firstStringArray.length - 1]);

        System.out.println("Loop trough first int array");
        for (int i = 0; i < firstIntArray.length; i++) {
            System.out.print(firstIntArray[i] + " ");     //ponse un espacio en blanco con " " para que os numeros salgan con separacion
            //PRINT para que non mo poña en distintas líneas se non que na misma

        }
        System.out.println();     //salto de linea

        System.out.println("Loop trough first String array");
        for (int i = 0; i < firstStringArray.length; i++) {
            System.out.print(firstStringArray[i] + " ");
        }

        System.out.println("\n");


        //matriz 3x3

        int maxi = 3;
        int maxj = 3;
        int value = 0;
        //tantos corchetes como indices hay (maxi maxj : 2)
        int[][] secondIntArray = new int[maxi][maxj];
        //fori:
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {

                //para que value valga 1 e vaia incrementando en 1:
                value++;
                secondIntArray[i][j] = value;

            }
        }
        for (int i = 0; i < maxi; i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();    // e o mismo que: System.out.print("\n");

        }

        System.out.println("\n");

        String[][] secondStringArray = {{"A", "B", "C", "D"}, {"E", "F", "G", "H"}, {"I", "J", "K", "L"}};

        for (int i = 0; i < secondStringArray.length; i++) {
            for (int j = 0; j < secondStringArray[i].length; j++) {
                System.out.print(secondStringArray[i][j] + " ");
            }
            System.out.println();    // e o mismo que: System.out.print(\n);

        }
    }
}