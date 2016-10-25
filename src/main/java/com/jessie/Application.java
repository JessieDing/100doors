package com.jessie;

public class Application {
    public static void main(String[] args) {
        DoorTrigger doorTrigger = new DoorTrigger();
        PrintProcessor processor = new PrintProcessor();
        Printer printer = new Printer();

        boolean[] doors = doorTrigger.trigger();
        String[] doorStatus = processor.parseToString(doors);

        for (int counter = 0; counter < 100; counter++){
            printer.print("Door" + (counter + 1) + " is" + " " + doorStatus[counter]);
        }
    }
}
