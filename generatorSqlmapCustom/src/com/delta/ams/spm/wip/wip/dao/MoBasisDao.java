package com.delta.ams.spm.wip.wip.dao;

import com.delta.ams.spm.wip.wip.entity.MoBasisEntity;

public interface MoBasisDao {
    int deleteByPrimaryKey(String mono);

    int insert(MoBasisEntity record);

    int insertSelective(MoBasisEntity record);

    MoBasisEntity selectByPrimaryKey(String mono);

    int updateByPrimaryKeySelective(MoBasisEntity record);

    int updateByPrimaryKey(MoBasisEntity record);
}