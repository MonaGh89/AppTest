package com.gh.mona.variblesapp;

public class Boxer {

    private int boxesiz = 22 ;
    private int size = 2;
    private int color = 33;


    public Boxer(int boxesiz, int size, int color) {
        this.boxesiz = boxesiz;
        this.size = size;
        this.color = color;
    }

    public int getBoxesiz() {
        return boxesiz;
    }

    public int getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    public void setBoxesiz(int boxesiz) {
        this.boxesiz = boxesiz;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
