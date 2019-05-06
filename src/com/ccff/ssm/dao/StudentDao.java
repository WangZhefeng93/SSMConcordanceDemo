package com.ccff.ssm.dao;

import com.ccff.ssm.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    public int insert(Student student);
}
