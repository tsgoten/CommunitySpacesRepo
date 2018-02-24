package com.example.tsgot.communityspacesagain;

class Person {

    private String nameOfPerson;
    private int areaOfRequest;
    private String plantGrowing;
    private long timeOfGrowth;
    private String contacts[] = new String[2];
    //position 0 is for phone number, position 1 is for email

    //constructor for person
    public Person(String Name, int GardenArea, String nameOfPlant, long growthTime, String Contact[]) {
        nameOfPerson = Name;
        areaOfRequest = GardenArea;
        plantGrowing = nameOfPlant;
        timeOfGrowth = growthTime;
        contacts = Contact;
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

    public String[] getContacts()
    {
        return contacts;
    }
}

