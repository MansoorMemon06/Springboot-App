package com.mansoor.Springboot.controller;

import com.mansoor.Springboot.entity.Department;
import com.mansoor.Springboot.error.DepartmentNotFoundException;
import com.mansoor.Springboot.repository.DepartmentRepository;
import com.mansoor.Springboot.service.DepartmentService;
import com.mansoor.Springboot.service.DepartmentServiceImpl;

import jakarta.validation.Valid;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired

    private DepartmentService departmentService;
    private final Logger LOGGER= LoggerFactory.getLogger(DepartmentController.class);



@PostMapping("/department")
public Department saveDepartment(@Valid @RequestBody Department department){
    LOGGER.info("inside saveDepartment in DepartmentController");
      return departmentService.saveDepartment(department);
}
@GetMapping("/department")
public List<Department> fatchDepartmentList(){
    LOGGER.info("inside fatchDepartment in DepartmentController");
    return departmentService.fatchDepartmentList();

}
@GetMapping("/department/{id}")
public Department fatchDepartmentById(@PathVariable("id")Long departmentId) throws DepartmentNotFoundException {
    LOGGER.info("inside fatchDepartment in DepartmentController");
    return  departmentService.fatchDepartmentById(departmentId);

}
@DeleteMapping("/department/{id}")
public String deleteDepartmentById(@PathVariable("id") Long departmentId){
     departmentService.deleteDepartmentById(departmentId);
     return "Department Deleted Successfully!!";
}
@PutMapping("/department/{id}")
public Department updateDepartment(@PathVariable("id")Long departmentId,@RequestBody Department department){

return  departmentService.updateDepartment(departmentId,department);
}
@GetMapping("/departments/name/{name}")
public Department fatchDepartmentByName(@PathVariable("name") String departmentName){
return  departmentService.fatchDepartmentByName(departmentName);

}

}
