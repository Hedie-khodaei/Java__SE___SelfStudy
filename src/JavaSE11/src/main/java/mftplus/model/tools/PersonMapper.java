package mftplus.model.tools;

import mftplus.model.entity.Person;
import mftplus.model.enums.Role;

import java.sql.ResultSet;

public class PersonMapper {
    public Person  PersonMapper(ResultSet resultSet)throws Exception {
        return
                Person
                        .builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .family(resultSet.getString("family"))
                        .birthDate(resultSet.getDate("birth_date").toLocalDate())
                        .role(Role.valueOf(resultSet.getString("role")))
                        .status(resultSet.getBoolean("status"))
                        .build();




    }

}
