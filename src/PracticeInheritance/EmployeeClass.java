package PracticeInheritance;

public class EmployeeClass extends PersonClass {
    private String employeeId;
    private String title;

    public EmployeeClass(){
        super("Sigrid");
        System.out.println("Esto es un constructor de un empleado por default");
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
