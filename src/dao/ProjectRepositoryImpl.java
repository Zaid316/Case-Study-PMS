package dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.model.*;

import util.DBConnection;

public class ProjectRepositoryImpl implements IProjectRepository {
    private Connection con;
	private PreparedStatement stat;
	
	public  ProjectRepositoryImpl()
	{
		con=DBConnection.getConnect();
	}

    public boolean createEmployee(Employee emp){
        try{
            stat=con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
            stat.setInt(1, emp.getId());
            stat.setString(2, emp.getName());
            stat.setString(3, emp.getDesignation());
            stat.setString(4, emp.getGender());
            stat.setDouble(5, emp.getSalary());
            stat.setInt(6, emp.getProject_id());
            int rows = stat.executeUpdate();
            if(rows > 0){
                System.out.println("Employee Created Successfully");
            }
            return rows>0;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        

        }

        public boolean createProject(Project pj){
            try{
            stat=con.prepareStatement("insert into project values(?,?,?,?,?)");
            stat.setInt(1, pj.getId());
            stat.setString(2, pj.getProjectName());
            stat.setString(3, pj.getDescription());
            stat.setString(4, pj.getStartDate());
            stat.setString(5, pj.getStatus());

            int rows = stat.executeUpdate();
            if(rows > 0){
                System.out.println("Project Created Successfully");
            }
            return rows>0;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }


    }

    public boolean createTask(Task task) {
            try {
            stat = con.prepareStatement("INSERT INTO task (task_id, task_name, project_id, employee_id, status) VALUES (?, ?, ?, ?, ?)");
            stat.setInt(1, task.getTask_id());
            stat.setString(2, task.getTask_name());
            stat.setInt(3, task.getProject_id());
            stat.setInt(4, task.getEmployee_id());
            stat.setString(5, task.getStatus());
    
            int rows = stat.executeUpdate();
            if (rows > 0) {
                System.out.println("Task Created Successfully");
            }
            return rows > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean assignProjectToEmployee(int projectId, int employeeId) {
        try {
            stat = con.prepareStatement("UPDATE employee SET project_id = ? WHERE id = ?");
            stat.setInt(1, projectId);
            stat.setInt(2, employeeId);

            int rows = stat.executeUpdate();
            if (rows > 0) {
                System.out.println("Project Assigned to Successfully to Employee ID: " + employeeId);
        }
            return rows > 0;
    } 
        catch (SQLException e)
    {
            System.out.println(e.getMessage());
            return false;
    }
}

    public boolean deleteEmployee(int userId) {
        try {
            stat = con.prepareStatement("DELETE FROM Employee WHERE id = ?");
            stat.setInt(1, userId);

            int rows = stat.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee with ID " + userId + " deleted successfully.");
             } 
             return rows>0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean assignTaskInProjectToEmployee(int taskId, int projectId, int employeeId) {
        try {
            stat= con.prepareStatement("UPDATE task SET project_id = ?, employee_id = ? WHERE task_id = ?");
            stat.setInt(1, projectId);
            stat.setInt(2, employeeId);
            stat.setInt(3, taskId);

       
            int rows = stat.executeUpdate();
            if (rows > 0) {
                System.out.println("task with id "+ " " + taskId + "in project " + " " + projectId + "successfully assigned to employee " + employeeId);
             } 

            return rows>0;
           
        } catch (SQLException e) 
        {
            System.out.println(e.getMessage());
            return false;
        }
    }
 

    public boolean deleteProject(int projectId) {
        try {
            stat = con.prepareStatement("DELETE FROM Project WHERE Id = ?");
            stat.setInt(1, projectId);

            int rows = stat.executeUpdate();

            if (rows > 0) {
                System.out.println("Project with ID " + projectId + " deleted successfully.");
                return true;
            } else {
                System.out.println("Project with ID " + projectId + " not found.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Task> getAllTasks(int project_id, int employee_id) {
    List<Task> tasks = new ArrayList<>();
    try {
        stat = con.prepareStatement("SELECT * FROM Task WHERE project_id= ? AND employee_id = ?");
        stat.setInt(1, project_id );
        stat.setInt(2, employee_id );
        ResultSet resultSet = stat.executeQuery();
        while (resultSet.next()) {
            Task task = new Task();
            task.setTask_id(resultSet.getInt("task_id"));
            task.setTask_name(resultSet.getString("task_name"));
            task.setProject_id(resultSet.getInt("project_id"));
            task.setEmployee_id(resultSet.getInt("employee_id"));
            task.setStatus(resultSet.getString("status"));
            tasks.add(task);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return tasks;
}

    
}




    

