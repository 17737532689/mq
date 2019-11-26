package com.hzf.mq.dao;

import com.hzf.mq.entity.DAttachmentRes;
import com.hzf.mq.entity.DAttachmentResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DAttachmentResMapper {
    int countByExample(DAttachmentResExample example);

    int deleteByExample(DAttachmentResExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(DAttachmentRes record);

    int insertSelective(DAttachmentRes record);

    List<DAttachmentRes> selectByExample(DAttachmentResExample example);

    DAttachmentRes selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") DAttachmentRes record, @Param("example") DAttachmentResExample example);

    int updateByExample(@Param("record") DAttachmentRes record, @Param("example") DAttachmentResExample example);

    int updateByPrimaryKeySelective(DAttachmentRes record);

    int updateByPrimaryKey(DAttachmentRes record);
}