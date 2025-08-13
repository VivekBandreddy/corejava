package com.capg.java17.switchclass;

public class SwitchClasses {

    public String traditionalSwitch(int i) {

        switch (i) {

            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day";
        }
    }

    public String java17Switch(int i) {
        String s = switch (i) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        return s;
    }

    public static void main(String[] args) {
        SwitchClasses switchClasses = new SwitchClasses();
        for (int i = 0; i < 10; i++) {
            System.out.println("traditionalSwitch " + switchClasses.traditionalSwitch(i));
            System.out.println("java17Switch " + switchClasses.java17Switch(i));
        }
    }


}
