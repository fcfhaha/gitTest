package com.delta.scm.config.dao;

import com.delta.scm.config.entity.ErrorEntity;

public interface ErrorDao {
    int insert(ErrorEntity record);

    int insertSelective(ErrorEntity record);
}