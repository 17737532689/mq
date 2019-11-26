package com.hzf.mq.dao;

import com.hzf.mq.entity.DResRealtime;
import com.hzf.mq.entity.DResRealtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DResRealtimeMapper {
    int countByExample(DResRealtimeExample example);

    int deleteByExample(DResRealtimeExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(DResRealtime record);

    int insertSelective(DResRealtime record);

    List<DResRealtime> selectByExample(DResRealtimeExample example);

    DResRealtime selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") DResRealtime record, @Param("example") DResRealtimeExample example);

    int updateByExample(@Param("record") DResRealtime record, @Param("example") DResRealtimeExample example);

    int updateByPrimaryKeySelective(DResRealtime record);

    int updateByPrimaryKey(DResRealtime record);
}