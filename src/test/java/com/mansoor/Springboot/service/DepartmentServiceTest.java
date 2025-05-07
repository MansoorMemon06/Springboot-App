//package com.mansoor.Springboot.service;
//
//import com.mansoor.Springboot.entity.Department;
//import com.mansoor.Springboot.repository.DepartmentRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//class DepartmentServiceTest {
//
//    @InjectMocks
//    private DepartmentServiceImpl departmentService;
//
//    @Mock
//    private DepartmentRepository departmentRepository;
//
//    @BeforeEach
//    void before() {
//        Department department= Department.builder()
//                .departmentName("IT")
//                .departmentAddress("karachi")
//                .departmentCode("IT-22")
//                .departmentId(1L)
//                .build();
//        when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
//                .thenReturn(department);
//    }
//
//     @Test
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//    String departmentName="IT";
//
//        Department found = departmentService.fatchDepartmentByName(departmentName);
//
//        assertEquals(departmentName,found.getDepartmentName());
//    }
//
//}