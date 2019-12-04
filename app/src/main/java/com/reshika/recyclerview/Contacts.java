package com.reshika.recyclerview;

public class Contacts {
    private String name;
    private String phoneNo;
    private int imageId;

    public Contacts(String name,String phoneNo, int imageId)
    {
        this.name=name;
        this.phoneNo=phoneNo;
        this.imageId=imageId;
    }

    //Getter Setter
    public String getName()
    {
        return name;
    }
    public void setName()
    {
        this.name= name;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }
    public void setPhoneNo()
    {
        this.phoneNo= phoneNo;
    }

    public int getImageId()
    {
        return imageId;
    }
    public void setImageId()
    {
        this.imageId= imageId;
    }


}
