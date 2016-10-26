package com.jessie;

public class Application {
    public static void main(String[] args) {
        DoorTrigger doorTrigger = new DoorTrigger();
        Printer printer = new Printer();

        Door[] doors = doorTrigger.trigger();

        for (int count = 0; count < 100; count++){   // 用Door类的 getNumber，foreach遍历。更好
            printer.print("Door" + (count + 1) + " is" + " " + doors[count].getStatus());
        }
    }
}
