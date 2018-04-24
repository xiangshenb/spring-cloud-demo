package com.client.dataaccess.mapper;

import com.client.dataaccess.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int insert(User record);

    List<User> selectAll();
}