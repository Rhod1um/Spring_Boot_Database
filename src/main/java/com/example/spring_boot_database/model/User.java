package com.example.spring_boot_database.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //ved brug af Entitu skal man fortælle den hvad PK er med @Id tagget
@Getter //Det er lombok plugin vi bruger her, det vi valgte da vi lavede projektet
@Setter //laver gettere og settere automatisk bag i
public class User {
    @Id
    private int usrID;
    private String usrName, password, favTeacher;
    //skal hedde præcis det samme som i databasen


    /*
    public int getUsrID()                        {return usrID;}

    public void setUsrID(int usrID)              {this.usrID = usrID;}

    public String getUsrName()                   {return usrName;}

    public void setUsrName(String usrName)       {this.usrName = usrName;}

    public String getPassword()                  {return password;}

    public void setPassword(String password)     {this.password = password;}

    public String getFavTeacher()                {return favTeacher;}

    public void setFavTeacher(String favTeacher) {this.favTeacher = favTeacher;}
    */
}
