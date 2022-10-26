package com.example.unilag.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String deptName;
    private String deptNum;
    private String deptHod;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(String deptNum) {
        this.deptNum = deptNum;
    }

    public String getDeptHod() {
        return deptHod;
    }

    public void setDeptHod(String deptHod) {
        this.deptHod = deptHod;
    }

    @Override
    public String toString() {
        return "DepartmentModel{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", deptNum='" + deptNum + '\'' +
                ", deptHod='" + deptHod + '\'' +
                '}';
    }
}
