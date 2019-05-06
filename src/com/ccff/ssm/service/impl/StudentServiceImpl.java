package com.ccff.ssm.service.impl;

import com.ccff.ssm.dao.StudentDao;
import com.ccff.ssm.pojo.Student;
import com.ccff.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studnetService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao = null;

    @Override
    @Transactional
    public int insertStudent(Student student) {
        return studentDao.insert(student);
    }
}
