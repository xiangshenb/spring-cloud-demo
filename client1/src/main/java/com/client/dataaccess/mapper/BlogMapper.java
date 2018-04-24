package com.client.dataaccess.mapper;

import com.client.dataaccess.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    Blog selectByPrimaryKey(Integer id);

    List<Blog> selectAll();

    int updateByPrimaryKey(Blog record);
}