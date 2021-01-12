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

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmpItemViewHolder> {
    private Context context;
    private ArrayList<EmployeeDetails> employeeDetailsArrayList;
    public EmployeeAdapter(ArrayList<EmployeeDetails> loc_employeeDetailsArrayList) {
        this.employeeDetailsArrayList=loc_employeeDetailsArrayList;
    }

    @NonNull
    @Override
    public EmpItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View itemView = LayoutInflater.from(context).inflate(R.layout.emp_holder_item, parent, false);
        return new EmployeeAdapter.EmpItemViewHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull EmpItemViewHolder empItemViewHolder, int position) {
        empItemViewHolder.bindEmployeeDetails(employeeDetailsArrayList.get(position),empItemViewHolder);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class EmpItemViewHolder extends RecyclerView.ViewHolder{

        public EmpItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }

      void   bindEmployeeDetails(EmployeeDetails employee,EmpItemViewHolder empItemViewHolder){

        }
    }
}


