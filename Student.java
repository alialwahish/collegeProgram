import java.util.ArrayList;

/**
 * Student Class
 * SubClasses Course, Address
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */

public class Student {
private int[] id= new int[1];
private String [] name = new String [1];
private Address[] address= new Address[1];
private ArrayList<Course> courses = new ArrayList<Course>();
int numOfStud;
int numofCorse;




public Student(int id, String name, Address address, Course courses) {
	
	this.id[numOfStud] = id;
	this.name[numOfStud] = name;
	this.address[numOfStud] = address;
	this.courses.add(courses);
}
// methods
public int getId() {
	return id[numOfStud];
}
public void setId(int id) {
	this.id[numOfStud] = id;
}
public String getName() {
	return name[numOfStud];
}
public void setName(String name) {
	this.name[numOfStud] = name;
}
public Address getAddress() {
	return address[numOfStud];
}
public void setAddress(Address address) {
	this.address[numOfStud] = address;
}
public ArrayList<Course> getCourses() {
	return courses;
}
public void setCourses(Course courses) {
	this.courses.remove(numofCorse);
	this.courses.add(numofCorse, courses);
}

public ArrayList<Course> registerCourse (Course in){
		
	courses.add(in);
	//numofCorse++;
	return courses;
}
public ArrayList<Course> dropCourse(Course in){
	if(numofCorse<1){	
	courses.remove(in);
		courses.add(new Course());
	}
	return courses;
}
}
