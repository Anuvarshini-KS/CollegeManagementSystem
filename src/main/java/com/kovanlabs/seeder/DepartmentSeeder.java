package com.kovanlabs.seeder;

import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Component
public class DepartmentSeeder {
    @Autowired
    private DataSource dataSource;
    public void seed(){
        Faker faker = new Faker();
        String query = "INSERT INTO department(dept_name) VALUES (?)";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(query)){
            for(int i=0;i<100;i++)
            {
                String deptName = faker.educator().course();
                ps.setString(1,deptName);
                ps.executeUpdate();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
