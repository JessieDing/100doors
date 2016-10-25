package com.jessie;

public class DoorTrigger {
    private boolean[] doors = new boolean[100];

//    public boolean[] getDoors() {
//        return doors;   //外面ger到的doors是下面trigger中return的doors吗？
//    }

    public boolean[] trigger() {
        for (int i = 1; i <= doors.length; i++) {
            for (int j = 0; j < doors.length; j++) {
                if ((j + 1) % i == 0) {
                    doors[j] = !doors[j];
                }
            }
        }
        return doors;
    }
}
