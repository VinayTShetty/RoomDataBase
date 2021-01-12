package com.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import com.roomdatabase.RoomDataBaseEntities.Employee;
import com.roomdatabase.RoomDataBaseHelper.RoomDBhelper;

import static com.roomdatabase.RoomDataBaseHelper.RoomDBhelper.getroomDBhelperInstance;

public class MainActivity extends AppCompatActivity {

    RoomDBhelper roomDBhelperInstance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeRoomDBHelper();
        addEmployee();
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