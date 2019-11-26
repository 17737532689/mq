package com.hzf.mq.dao;

import com.hzf.mq.entity.DDataMinCars;
import com.hzf.mq.entity.DDataMinCarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDataMinCarsMapper {
    int countByExample(DDataMinCarsExample example);

    int deleteByExample(DDataMinCarsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDataMinCars record);

    int insertSelective(DDataMinCars record);

    List<DDataMinCars> selectByExampleWithBLOBs(DDataMinCarsExample example);

    List<DDataMinCars> selectByExample(DDataMinCarsExample example);

    DDataMinCars selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDataMinCars record, @Param("example") DDataMinCarsExample example);

    int updateByExampleWithBLOBs(@Param("record") DDataMinCars record, @Param("example") DDataMinCarsExample example);

    int updateByExample(@Param("record") DDataMinCars record, @Param("example") DDataMinCarsExample example);

    int updateByPrimaryKeySelective(DDataMinCars record);

    int updateByPrimaryKeyWithBLOBs(DDataMinCars record);

    int updateByPrimaryKey(DDataMinCars record);
}