// Write code to print the following using only an Enum & loop without using any conditionals :
// (if/else/switch/etc.)
// We eat pot roast on Sunday
// We eat spaghetti on Monday
// We eat tacos on Tuesday
// We eat chicken on Wednesday
// We eat meatloaf on Thursday
// We eat hamburgers on Friday
// We eat pizza on Saturday
//   1. Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.

package com.gianmarco.moreoop.ex2and3;

public class Exercise2 {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.printf("We eat %s on %s%n", day.getFood(), capitalizeFirstLetter(day.name()));
        }

    }

    public static String capitalizeFirstLetter(String day) {
        String dayLowerCaseText = day.toString().toLowerCase();
        String firstCapitalizeLetter = dayLowerCaseText.substring(0, 1).toUpperCase();
        String remainingString = dayLowerCaseText.substring(1);
        String result = firstCapitalizeLetter + remainingString;
        return result;
    }
}
