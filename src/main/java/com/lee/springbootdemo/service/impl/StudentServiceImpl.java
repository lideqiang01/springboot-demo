package com.lee.springbootdemo.service.impl;

import com.lee.springbootdemo.entity.Student;
import com.lee.springbootdemo.mapper.StudentMapper;
import com.lee.springbootdemo.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2019-09-20
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
