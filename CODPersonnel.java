import java.util.ArrayList;

/**
 * CODPersonnel Class 
 * subclasses Employee , Student
 * 
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */


public class CODPersonnel {
private ArrayList<Employee> employees = new ArrayList<Employee>();
private ArrayList<Student> students= new ArrayList<Student>();
int cpnumofemp, cpnumofstd;


public CODPersonnel(Employee employees, Student students) {
	
	this.employees.add(employees);
	this.students.add(students);
	
}
//methods


public void addEmployee(Employee in){
	employees.add(in);
	//cpnumofemp++;
}
public ArrayList<Employee>  getEmployees() {
	return employees;
}


public void setEmployees(Employee employees) {
	this.employees.remove(cpnumofemp);
	this.employees.add(cpnumofemp, employees);
		
}


public ArrayList<Student>  getStudents() {
	return students;
	
}


public void setStudents(Student students) {
	this.students.remove(cpnumofstd);
	this.students.add(cpnumofstd,students);
	
}


public void addStudent(Student in){
	students.add(in);
	//cpnumofstd++;
}
}
