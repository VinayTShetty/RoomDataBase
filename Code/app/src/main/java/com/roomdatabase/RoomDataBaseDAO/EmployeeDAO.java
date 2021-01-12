package com.roomdatabase.RoomDataBaseDAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.roomdatabase.RoomDataBaseEntities.Employee;

import java.util.List;

@Dao
public interface EmployeeDAO {
    @Query("select * from employeedetails")
    List<Employee> getAllEmployeeDetails();
    @Insert
    void insertEmployee(Employee employee);
    @Update
    void updateEmployee(Employee employee);
    @Delete
    void deleteEmployee(Employee employee);
}
