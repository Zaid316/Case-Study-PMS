package entity.model;

public class Task {
    public int task_id;
    public String task_name;
    public int project_id;
    public int employee_id;
    public String status;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return " Task ID: " + task_id +
               " Task Name: " + task_name +
               " Project ID: " + project_id +
               " Employee ID: " + employee_id +
               " Status: " + status;
    }
}
    

