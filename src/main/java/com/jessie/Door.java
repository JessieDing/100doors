package com.jessie;

public class Door {
    private int number;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus(){
        if (status){
            return "open";
        }
        else {
            return "closed";
        }
    }

}
