package com.xinjock.nbteam.mapper;

import com.xinjock.nbteam.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Mapper
public interface UserMapper {
    List<User> findAll();

    User findOne(Integer id);

    void addOne(User user);

    void updateOne(User user);

    void delOne(Integer id);
}
