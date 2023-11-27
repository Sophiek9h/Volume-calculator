package com.twdc.volume;

public class shape {
    int shape;
    String shapeName;

    //constructor
    public shape(int shape, String shapeName) {
        this.shape = shape;
        this.shapeName = shapeName;
    }


    //Getters and setters
    public int getShape() {
        return shape;
    }

    public void setShape(int shape) {
        this.shape = shape;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
