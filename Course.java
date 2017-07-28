/**
 *	Course Class 
 *	no subclasses 
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */


public class Course {
private int [] id = new int [1];
private String [] name = new String [1];
private String [] section = new String [1];
int numOfCourse;



public Course (){
	this.id[numOfCourse] = 000;
	this.name[numOfCourse] = "Dropped class";
	this.section[numOfCourse] = "null";
}
public Course(int id, String name, String section) {
	
	this.id[numOfCourse] = id;
	this.name[numOfCourse] = name;
	this.section[numOfCourse] = section;
}

//methods
public int getId() {
	return id[numOfCourse];
}
public void setId(int id) {
	this.id[numOfCourse] = id;
}
public String getName() {
	return name[numOfCourse];
}
public void setName(String name) {
	this.name[numOfCourse] = name;
}
public String getSection() {
	return section[numOfCourse];
}
public void setSection(String section) {
	this.section[numOfCourse] = section;
}


}
