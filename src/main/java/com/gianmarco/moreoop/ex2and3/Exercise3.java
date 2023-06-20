// Write a method that takes the following input String and returns the following
// output String:
// Input: getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
// Output: hamburgers, meatloaf, spaghetti, ecc...

package com.gianmarco.moreoop.ex2and3;

public class Exercise3 {

    public static void main(String[] args) {
        String foods = getFoodForDays("sunday, monday, tuesday, wednesday, thursday, friday, saturday");
        System.out.println(foods);
    }

    private static String getFoodForDays(String daysString) {
        String[] days = daysString.split(",");
        StringBuilder sb = new StringBuilder();

        for (String day : days) {
            sb.append(DayOfWeek.valueOf(day.strip().toUpperCase()).getFood());
            sb.append(", ");
        }

        int lastCommaSpaceIndex = sb.lastIndexOf(", ");
        sb.delete(lastCommaSpaceIndex, lastCommaSpaceIndex + 1); // lastCommaIndex + 1 -> spazio dopo la virgola
        return sb.toString();
    }
}
