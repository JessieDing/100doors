package com.jessie;

public class PrintProcessor {
    private String[] doorStatus = new String[100];

//    public String[] getDoorStatus(){
//        return doorStatus;
//    }

    public String[] parseToString(boolean[] doors) {
        for (int i = 0; i < doorStatus.length; i++) {
            doorStatus[i] = String.valueOf(doors[i]);
            if (doors[i]) {
                doorStatus[i] = "open";
            } else {
                doorStatus[i] = "closed";
            }
        }
        return doorStatus;
    }
}
