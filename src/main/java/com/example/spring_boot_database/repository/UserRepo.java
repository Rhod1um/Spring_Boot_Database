package com.example.spring_boot_database.repository;

import com.example.spring_boot_database.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    //dao data access objects - interface med CRUD, vi implementere ikke noget selv
    //dao er med interfaces i stedet for javaklasser
    //lige nu gør vi det hele manuelt, ikke dao
    @Autowired
    private JdbcTemplate template; //

    //preparedStatement bruges ved fx updates men alm Statement klasse bruges ved fetch all simple statements
    public List<User> fetchAll(){ //sql statement skal være i string literal, DML
        String sql = "SELECT usrID, usrName, facTeacher FROM users";
        //få adgang til vores mode, user: skal være RowMapper<T> i spring framework, ikke den anden der kommer frem
        //smider ting fra table automatisk ind i user
        //rowmapper giver adgang til User klasse. User klasse peger på table
        //Fordi vi har @Entity på user ved spring boot at User svare til en entitet i en tabel
        //den ved den passer til users tabel pga de attributter der er i User passer til tabellen users
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        //rowMapper mapper rows i tabbeln
        return template.query(sql, rowMapper); //det her er i stedet for det while-loop som
        //normalt tager resultset.nextString("name") ud af databasen og lægger attributter i ny entity i liste
    }
}
