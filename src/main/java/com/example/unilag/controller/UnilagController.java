package com.example.unilag.controller;

import com.example.unilag.model.DepartmentModel;
import com.example.unilag.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UnilagController {

    private final DepartmentService departmentService;

    @Autowired
    public UnilagController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/addDepartment")
    public DepartmentModel addDept(@RequestBody DepartmentModel request){
        return departmentService.addDept(request);
    }

    @GetMapping("/getDepartment")
    public  List<DepartmentModel> getDept() {
        return departmentService.getDept();
    }
}
