package com.example.navigationbar.Developers;



public class Persion {
    private String name, branch, rollno,imgURL;

    public Persion(String name, String branch, String rollno, String imgURL)
    {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
        this.imgURL=imgURL;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public String getBranch()
    {
        return branch;
    }

    public void setRollNo(String rollno) {this.rollno = rollno;}

    public String getRollno()
    {
        return rollno;
    }

    public void setImage()
    {
        this.imgURL=imgURL;
    }
    public String getImage()
    {
        return imgURL;
    }

}
