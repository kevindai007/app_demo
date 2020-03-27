package com.jhtech.appdemo.dao;

import com.jhtech.appdemo.domain.Staff;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    int batchInsert(@Param("list") List<Staff> list);

    List<Staff> findByNameAndBirthday(@Param("name") String name, @Param("birthday") Date birthday);
}