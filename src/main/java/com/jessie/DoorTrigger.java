package com.jessie;

class DoorTrigger {
    private Door[] doors = new Door[100]; //数组

//    public boolean[] getDoors() {
//        return doors;   //外面ger到的doors是下面trigger中return的doors吗？
//    }

    Door[] trigger() {
        for (int i = 1; i <= doors.length; i++) {
            for (int j = 0; j < doors.length; j++) {
                if ((j + 1) % i == 0) {
                    if (doors[j] == null) {     // 需将第j个Door对象new出来，否则为空
                        doors[j] = new Door();
                    }
                    doors[j].setStatus(!doors[j].isStatus());
                }
            }
        }
        return doors;
    }
}
