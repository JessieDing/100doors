package com.jessie;

public class OneHundredDoors_old {

//    private static boolean trigger(Boolean door) {
//        Boolean doorStatus;
//        doorStatus = !door;
//        return doorStatus;
//
//    }

    public static void main(String[] args) {
        boolean[] doors = new boolean[100]; //用Boolean[] doors = new Boolean[100] 报错，空指针异常
        for (int i = 1; i <= doors.length; i++) {
            for (int j = 0; j < doors.length; j++) {
                if ((j + 1) % i == 0) {
                    doors[j] = !doors[j];
                }
            }
        }

        String[] doorStatus = new String[100];
        for (int i = 0; i < doorStatus.length; i++) {
            doorStatus[i] = String.valueOf(doors[i]);
            if (doors[i]) {
                doorStatus[i] = "open";
            } else {
                doorStatus[i] = "closed";
            }
        }

        for (int counter = 0; counter < 100; counter++) {
            System.out.println("Door" + (counter + 1) + " is" + " " + doorStatus[counter]);
        }
    }
}
