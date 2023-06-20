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

package com.gianmarco.moreoop.ex2;

public enum DayOfWeek {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String food;

    DayOfWeek(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
