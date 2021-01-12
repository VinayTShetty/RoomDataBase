package com.roomdatabase.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.roomdatabase.CustomObjects.EmployeeDetails;
import com.roomdatabase.R;
import com.roomdatabase.RoomDataBaseEntities.Employee;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<EmployeeDetails> employeeDetailsArrayList;
    public EmployeeAdapter(ArrayList<EmployeeDetails> loc_employeeDetailsArrayList) {
        this.employeeDetailsArrayList=loc_employeeDetailsArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View itemView = LayoutInflater.from(context).inflate(R.layout.emp_holder_item, parent, false);
        return new EmployeeAdapter.EmpItemViewHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull EmpItemViewHolder empItemViewHolder, int position) {
        empItemViewHolder.bindEmployeeDetails(empItemViewHolder,position);
    }

    @Override
    public int getItemCount() {
        return employeeDetailsArrayList.size();
    }

    public class EmpItemViewHolder extends RecyclerView.ViewHolder{

        public EmpItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }

      void   bindEmployeeDetails(Employee employee,int postion){

        }
    }
}
