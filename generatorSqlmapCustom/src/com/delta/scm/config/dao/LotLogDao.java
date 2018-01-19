package com.delta.scm.config.dao;

import com.delta.scm.config.entity.WipLotlogReportEntity;

public interface LotLogDao {
    int deleteByPrimaryKey(String loggroupserial);

    int insert(WipLotlogReportEntity record);

    int insertSelective(WipLotlogReportEntity record);

    WipLotlogReportEntity selectByPrimaryKey(String loggroupserial);

    int updateByPrimaryKeySelective(WipLotlogReportEntity record);

    int updateByPrimaryKey(WipLotlogReportEntity record);
}