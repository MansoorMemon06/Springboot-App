package com.mansoor.Springboot.service;

import com.mansoor.Springboot.entity.Department;
import com.mansoor.Springboot.error.DepartmentNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(@RequestBody Department department);

    public List<Department> fatchDepartmentList();

    public Department fatchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departments);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fatchDepartmentByName(String departmentName);
}
