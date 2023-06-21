//  If you modeled a chess board in Java using a two-dimensional array, how could you
//  convert chess notation, or coordinate notation of chess, to an element in that two-dimensional array?
//  For example, in the chess board image below, square a8 might map to
//  array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
//  chess coordinate and returns array coordinates. This exercise simply builds on the previous two.
//  Use the following test data:
//      INPUT       OUTPUT
//       8a          0,0
//       1h          7,7
//       5g          6,3
//       4d          3,4

package com.gianmarco.moreoop;

public class Exercise7 {

    public static void main(String[] args) {
        System.out.println(getArrayIndex("8a"));
        System.out.println(getArrayIndex("1h"));
        System.out.println(getArrayIndex("5g"));
        System.out.println(getArrayIndex("4d"));
    }

    public static String getArrayIndex(String chessCoords) {
        // esempio di chessCoords -> "8a"
        char coordinateX = chessCoords.charAt(1); // a
        char coordinateY = chessCoords.charAt(0); // '8' -> devo trasformalo prima in stringa per poterlo trasformare in numero
        String coordinateYToString = Character.toString(coordinateY); // per trasformarlo uso metodo toString della classe java Character
        int coordinateYToInt = Integer.parseInt(coordinateYToString);
        int x = getCoordinatesX(coordinateX);
        int y = getCoordinatesY(coordinateYToInt);
        // Formatto risultato
        return String.format("x = %d, y = %d%n", x, y);
    }

    public static int getCoordinatesX(char letter) {
        return letter - 97; // 97 è il codice ASCII della a minus, e da lì in poi è in ordine crescente
    }

    public static int getCoordinatesY(int num) {
        return 8 - num;
    }
}
