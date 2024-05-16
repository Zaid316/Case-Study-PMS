package test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import dao.ProjectRepositoryImpl;
import entity.model.*;

public class test1 {
    ProjectRepositoryImpl pri=new ProjectRepositoryImpl();

    @Test
    public void emptest(){
		Employee emp=new Employee();
		emp.setId(13);
		emp.setName("Test");
		emp.setDesignation("Test test");
		emp.setGender("Male");
		emp.setSalary(20000);
		emp.setProject_id(1);
		
		boolean result=pri.createEmployee(emp);
		assertTrue(result, "Employee creation Successful");
    }

    @Test
    public void taskTest(){

        Task t = new Task();
        t.setTask_id(11);
        t.setTask_name("Testing");
        t.setProject_id(1);
        t.setEmployee_id(1);
        t.setStatus("Assigned");
        boolean result =pri.createTask(t);
        assertTrue(result, "Task creation successful");
    }

    
}
