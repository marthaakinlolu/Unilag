package com.example.unilag.service;

import com.example.unilag.model.DepartmentModel;
import com.example.unilag.repository.DepartmentModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final
    DepartmentModelRepository departmentModelRepository;

    @Autowired
    public DepartmentService(DepartmentModelRepository deptRepository) {
        this.departmentModelRepository = deptRepository;
    }


   public DepartmentModel addDept(DepartmentModel requestObject){
           DepartmentModel response = departmentModelRepository.save(requestObject);
           return response;
    }

    public List<DepartmentModel> getDept() {
       return departmentModelRepository.findAll();
    }
}
