package mftplus.model.repository;

import mftplus.model.entity.Person;
import mftplus.model.tools.ConnectionProvider;
import mftplus.model.tools.PersonMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonRepositiry implements Repository<Person,Integer>, AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private PersonMapper personMapper = new PersonMapper();

    public PersonRepositiry() throws SQLException {
        connection = ConnectionProvider.getProvider().getConnection();
    }

    @Override
    public void save(Person person) throws Exception {
        preparedStatement = connection.prepareStatement(
                "insert into  persons(id,name,family,birth_Date,role,status) VALUES (person_seq.nextval,?,?,?,?,?)"
        );
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setDate(3, Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(4, person.getRole().name());
        preparedStatement.setBoolean(5, person.isStatus());
        preparedStatement.execute();
    }


    @Override
    public void edit(Person person) throws Exception {
        preparedStatement = connection.prepareStatement(
                "update persons set name=?,family=?,birth_Date=?,role=?,status=? where id=?"
        );
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getFamily());
        preparedStatement.setDate(3, Date.valueOf(person.getBirthDate()));
        preparedStatement.setString(4, person.getRole().toString());
        preparedStatement.setBoolean(5, person.isStatus());
        preparedStatement.setInt(6, person.getId());


    }

    //3_Disconnect
    @Override
    public void delete(Integer id) throws Exception {
        preparedStatement = connection.prepareStatement(
                "delete from  persons where id=?"
        );
        preparedStatement.setInt(1, id);
        preparedStatement.execute();
    }

    @Override
    public List<Person> findAll() throws Exception {
        List<Person> personList = new ArrayList<>();

        preparedStatement = connection.prepareStatement("select * from persons order by family,name ");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Person person = personMapper.PersonMapper(resultSet);
            personList.add(person);
        }
        return personList;
    }

    @Override
    public Person findById(Integer id) throws Exception {
        Person person = null;

        preparedStatement = connection.prepareStatement("select * from persons where  name=? and family=?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();


        if (resultSet.next()) {
            person = personMapper.PersonMapper(resultSet);

        }

        return person;
    }

    public  List<Person> findByNameAndFamily (String name , String family) throws Exception {
       List<Person> personList = new ArrayList<>();

        preparedStatement = connection.prepareStatement("select * from persons where name like ? and family like ?");
        preparedStatement.setString(1, name+"%");
        preparedStatement.setString(2, family+"%");
        ResultSet resultSet = preparedStatement.executeQuery();


        while (resultSet.next()) {
          Person  person = personMapper.PersonMapper(resultSet);
          personList.add(person);
        }

        return personList;
    }

    @Override
    public void close() throws Exception {
        connection.close();


    }

}



/*
         create table persons  (
        id number   unique not null,
        name nvarchar2(20)   not null,
        family nvarchar2(20)   not null,
        birth_date date         not null,
        role nvarchar2(20) default 'customer',
         status number(1)     default 1
        );

 */