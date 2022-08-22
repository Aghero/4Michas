package com.company;

import java.util.Arrays;

public class Main {

    static String[][] createPicture(int n) {
        if (n < 1) {
            return null;
        }

        int edge = 2 * n - 1;
        String[][] array = new String[edge][edge];

        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                array[i][j] = n - distanceFromTheEdge(i, j, edge) + " ";
            }
        }

        // Printing array
        for (int i = 0; i < edge; i++) {
            for (int j = 0; j < edge; j++) {
                System.out.printf("%s", array[i][j]);
            }
            System.out.println();
        }
        return array;
    }

    static int distanceFromTheEdge(int i, int j, int edge) {
        return getSmaller(distanceFromEdge(i, edge), distanceFromEdge(j, edge));
    }

    static int distanceFromEdge(int cord, int edge) {
        if (cord < edge / 2) {
            return cord;
        }

        return edge - 1 - cord;
    }

    static int getSmaller(int first, int second) {
        if (first > second) {
            return second;
        }

        return first;
    }

    public static void main(String[] args) {
        createPicture(4);

        // You can change to this one if you wish
//        System.out.println(Arrays.deepToString());
    }
}
