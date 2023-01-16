package com.example.javaprothreadingnotes.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.javaprothreadingnotes.domain.User;
import org.springframework.stereotype.Repository;

@Repository

public interface UserMapper extends BaseMapper<User> {
}
