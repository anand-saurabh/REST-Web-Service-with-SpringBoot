package com.sample.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("user_info")
public class UserData {
    @PrimaryKeyColumn(name = "marketing_label_desc", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    String id;
    @PrimaryKeyColumn(name = "start_date", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    String firstName;

    @Column("last_name")
    String lastName;
    @Column("age")
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
