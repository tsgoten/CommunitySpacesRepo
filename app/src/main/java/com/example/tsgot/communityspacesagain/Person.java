package com.example.tsgot.communityspacesagain;

class Person {

    private String nameOfPerson;
    private int areaOfRequest;
    private String plantGrowing;
    private long timeOfGrowth;
    private String number;
    //position 0 is for phone number, position 1 is for email

    //constructor for person
    public Person(String Name, int GardenArea, String nameOfPlant, long growthTime, String number) {
        nameOfPerson = Name;
        areaOfRequest = GardenArea;
        plantGrowing = nameOfPlant;
        timeOfGrowth = growthTime;
        this.number = number;
    }

    //accessor methods

    public String getName()
    {
        return nameOfPerson;

    }

    public int getRequestArea()
    {
        return areaOfRequest;
    }

    public String plantGrowing()
    {
        return plantGrowing;
    }

    public long getGrowthTime()
    {
        return timeOfGrowth;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public void setAreaOfRequest(int areaOfRequest) {
        this.areaOfRequest = areaOfRequest;
    }

    public void setPlantGrowing(String plantGrowing) {
        this.plantGrowing = plantGrowing;
    }

    public void setTimeOfGrowth(long timeOfGrowth) {
        this.timeOfGrowth = timeOfGrowth;
    }

}

