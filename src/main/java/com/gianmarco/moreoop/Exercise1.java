//  Use an Enum to model the days of the week and print them using a loop.
// 1. Print them with the first letter capitalized (without changing the Enum constants).
// 2. Alternate between printing the first letter capitalized or whatever letter is approximately
//   in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
// 3. Print 10 randomly-chosen days of the week

package com.gianmarco.moreoop;

import java.util.Random;

public class Exercise1 {
    enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        for (Day day : Day.values() ) {
//            System.out.println(day);
        }

        // Bonus 1
        for (Day day : Day.values()) {
            String dayLowerCaseText = day.toString().toLowerCase();
            String firstCapitalizeLetter = dayLowerCaseText.substring(0, 1).toUpperCase();
            String result = firstCapitalizeLetter + dayLowerCaseText.substring(1);
//            System.out.println(result);
        }

        // Bonus 2
        int index = 0;
        for (Day day : Day.values()) {
            String dayLowerCaseText = day.toString().toLowerCase();

            if (index % 2 == 0) {
                String firstCapitalizeLetter = dayLowerCaseText.substring(0, 1).toUpperCase();
                String result = firstCapitalizeLetter + dayLowerCaseText.substring(1);
//                System.out.println(result);
            } else {
                int middleIndex = dayLowerCaseText.length() / 2;
                StringBuilder sb = new StringBuilder();
                String firstPart = dayLowerCaseText.substring(0, middleIndex);
                sb.append(firstPart);
                String middelCapitalizeLetter = dayLowerCaseText.substring(middleIndex, middleIndex + 1).toUpperCase();
                sb.append(middelCapitalizeLetter);
                String remainingString = dayLowerCaseText.substring(middleIndex + 1);
                sb.append(remainingString);
//                System.out.println(sb.toString());
            }

            index++;
        }

        // Bonus 3
        Random random = new Random();
        for (int counter = 0; counter < 10; counter++) {
            int myIndex = random.nextInt(7);
            Day randomDay = Day.values()[myIndex];
            System.out.println(randomDay);
        }
    }
}
