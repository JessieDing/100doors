package com.jessie;

public class OneHundredDoors {

//    private static boolean trigger(Boolean door) {
//        Boolean doorStatus;
//        doorStatus = !door;
//        return doorStatus;
//
//    }

    public static void main(String[] args) {
        boolean[] doors = new boolean[100]; //用Boolean[] doors = new Boolean[100] 报错，空指针异常
        int i;
        int j;
        for (i = 1; i <= doors.length; i++) {
            for (j = 0; j < doors.length; j++) {
                if ((j + 1) % i == 0) {
                    doors[j] = !doors[j];
                }
            }
        }
        for (int counter = 0; counter < 100; counter++) {
            System.out.println("Door" + (counter + 1) + " is" + " " + doors[counter]);
        }
    }
}
