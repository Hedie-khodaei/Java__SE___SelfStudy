package se10.mft3.repository;

import mft3.entity.Person;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PersonRepositiry implements Repository<Person,Integer> {

    @Override
    public void save(Person person) throws Exception {
        //1_Connect
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE ",
                " javase ",
                " java123");

        //--------------------------------------------------------------------------------------------------------
        //2_Transaction/Report
        //hak/SQL Injection
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into persons (id,name,family,birth_Date,role,status) VALUES (?,?,?,?,?,?)"
        );
        preparedStatement.setInt(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setDate(4, Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(5, person.getRole().name());
        preparedStatement.setBoolean(6, person.isStatus());
        preparedStatement.execute();

        //3_Disconnect
        preparedStatement.close();
        connection.close();
    }

    @Override
    public void edit(Person person) throws Exception {
        //1_Connect
        Connection connection =DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE ",
                " javase ",
                " java123");

        //--------------------------------------------------------------------------------------------------------
        //2_Transaction/Report
        //hak/SQL Injection
        PreparedStatement preparedStatement = connection.prepareStatement(
                "update persons set name=?,family=?,birth_Date=?,role=?,status=? where id=?"
        );

        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setDate(3, Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(4, person.getRole().name());
        preparedStatement.setBoolean(5, person.isStatus());
        preparedStatement.setInt(6, person.getId());
        preparedStatement.execute();

        //3_Disconnect
        preparedStatement.close();
        connection.close();

    }

    @Override
    public void delete(Integer id) throws Exception {

        //1_Connect
        Connection connection =DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE ",
                " javase ",
                " java123");

        //--------------------------------------------------------------------------------------------------------
        //2_Transaction/Report
        //hak/SQL Injection
        PreparedStatement preparedStatement = connection.prepareStatement(
                "delete from persons  where id=?"
        );


        preparedStatement.setInt(1, id);
        preparedStatement.execute();

        //3_Disconnect
        preparedStatement.close();
        connection.close();

    }
}
