package com.roomdatabase.CustomObjects;

public class EmployeeDetails {
    private String emp_id;
    private String emp_mail;
    private String emp_name;

    public EmployeeDetails(String emp_id, String emp_mail, String emp_name) {
        this.emp_id = emp_id;
        this.emp_mail = emp_mail;
        this.emp_name = emp_name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }
}
