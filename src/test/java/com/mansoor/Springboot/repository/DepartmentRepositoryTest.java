//package com.mansoor.Springboot.repository;
//
//import com.mansoor.Springboot.entity.Department;
//import org.junit.jupiter.api.BeforeEach;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//class DepartmentRepositoryTest {
//
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//    @Autowired
//    private TestEntityManager entityManager;
//
//
//
//    @BeforeEach
//    void setUp() {
//        Department department=
//        Department.builder()
//                .departmentName("Mechanical Engineering")
//                .departmentCode("ME-011")
//                .departmentAddress("Karachi")
//                .build();
//        entityManager.persist(department);
//    }
//
//    public void WhenFindById_thenReturnDepartment(){
//        Department department= departmentRepository.findById(1L).get();
//        assertEquals(department.getDepartmentName(),"Mechanical engineering");
//
//    }
//
//}