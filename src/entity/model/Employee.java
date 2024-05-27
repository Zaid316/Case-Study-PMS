package entity.model;

public class Employee {
    public int id;
    public String name;
    public String designation;
    public String gender;
    public double salary;
    public int project_id;
    


public Employee(){
    
}

public Employee(int id, String name, String designation, String gender, double salary, int project_id) {
    this.id = id;
    this.name = name;
    this.designation = designation;
    this.gender = gender;
    this.salary = salary;
    this.project_id = project_id;
}

public int getId() {
    return id;   
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDesignation() {
    return designation;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public int getProject_id() {
    return project_id;
}

public void setProject_id(int project_id) {
    this.project_id = project_id;
}

}



