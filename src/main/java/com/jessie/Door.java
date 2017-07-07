package com.jessie;

class Door {
    private int number;
    private boolean status;

    boolean isStatus() {
        return status;
    }

    void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    String getStatus(){
        if (status){
            return "open";
        }
        else {
            return "closed";
        }
    }

}
