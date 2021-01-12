package com.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.roomdatabase.RoomDataBaseEntities.Employee;
import com.roomdatabase.RoomDataBaseHelper.RoomDBhelper;

import static com.roomdatabase.RoomDataBaseHelper.RoomDBhelper.getroomDBhelperInstance;

public class MainActivity extends AppCompatActivity {

    RoomDBhelper roomDBhelperInstance;
    FloatingActionButton addEmployeeButton;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViews();
        intializeRoomDBHelper();
        addEmployee();
    }

    private void intializeViews() {
        addEmployeeButton=(FloatingActionButton)findViewById(R.id.addEMployee_fabButton);
        recyclerView=(RecyclerView)findViewById(R.id.employeeList_RecycleView);
    }

    private void intializeRoomDBHelper() {
        roomDBhelperInstance=getroomDBhelperInstance(this);
    }

    private void addEmployee(){
        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                roomDBhelperInstance.getEmployeeDAO().insertEmployee(new Employee("vinay","vinaytshetty@gmail.com","12"));
            }
        });

    }

}