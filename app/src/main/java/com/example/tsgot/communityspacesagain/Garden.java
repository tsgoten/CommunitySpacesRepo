package com.example.tsgot.communityspacesagain;

public class Garden {

    private String name;
    private int zipCode;
    private int xDimensions;
    private int yDimensions;
    private int area;


    public Garden(String Name, int zip, int x, int y, int Area) {
        name = Name;
        zipCode = zip;
        xDimensions = x;
        yDimensions = y;
        area = Area;
    }


    public String getName() {
        return name;
    }
    public int getZipCode() {
        return zipCode;
    }
    public int getxDimensions() {
        return xDimensions;
    }
    public int getyDimensions() {
        return yDimensions;
    }
    public int getArea() {
        return area;
    }

}
