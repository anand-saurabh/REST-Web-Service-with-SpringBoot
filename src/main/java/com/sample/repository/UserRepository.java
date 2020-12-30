package com.sample.repository;

import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.sample.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.datastax.driver.core.querybuilder.QueryBuilder.eq;

@Repository
public class UserRepository {

    @Autowired
    CassandraOperations cassandraOperations;

    public List<UserData> getUserData(String id)
    {
        List<UserData>
        userDataList;
        Statement statement = QueryBuilder.select()
                .all()
                .from("user_info")
                .where(eq("user_id", id));
        statement.setConsistencyLevel(ConsistencyLevel.QUORUM);
        userDataList = cassandraOperations
                .select(statement.toString(), UserData.class);
        return userDataList;
    }

    public void saveUserData(UserData userData)
    {
        cassandraOperations.insert(userData);
    }
}
