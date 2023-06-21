//  Write a method that takes the following inputs and returns the corresponding outputs:
//  8->0, 7->1, 6->2, 5->3, 4->4, 3->5, 2->6, 1->7

package com.gianmarco.moreoop;

public class Exercise6 {

    public static void main(String[] args) {
        for (int index = 8; index > 0; index--) {
            System.out.println(convert(index));
        }
    }

    public static int convert(int num) {
        return 8 - num;
    }
}
