package com.roomdatabase.RoomDataBaseEntities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "EmployeeDetails")
public class Employee implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "employee_Name")
    private String emp_Name="";
    @ColumnInfo(name = "employee_email")
    private String emp_Email="";
    @ColumnInfo(name = "employee_Eid")
    private String emp_id="";

    public Employee(String emp_Name, String emp_Email, String emp_id) {
        this.emp_Name = emp_Name;
        this.emp_Email = emp_Email;
        this.emp_id = emp_id;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Email() {
        return emp_Email;
    }

    public void setEmp_Email(String emp_Email) {
        this.emp_Email = emp_Email;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }
}
