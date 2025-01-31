package com.example.challenge97;

public enum Day {
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
    private final  boolean isweekday;

    Day(boolean isweekday) {
        this.isweekday = isweekday;
    }
    public String getType(){
        return isweekday?"weekday":"weekend";
    }
}
