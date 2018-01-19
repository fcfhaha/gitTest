package com.delta.scm.config.dao;

import com.delta.scm.config.entity.WipCountEntity;

public interface WipCountDao {
    int insert(WipCountEntity record);

    int insertSelective(WipCountEntity record);
}