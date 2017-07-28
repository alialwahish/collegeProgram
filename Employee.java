/**
 * Employee Class
 * SubClasses PayInfo , Address
 * 
 * @author Ali Bayati
 * @version 7/16/2017
 *
 */
public class Employee {
private String [] name = new String [1];
private Address[] address = new Address[1];
private PayInfo[] pay = new PayInfo[1];
int numOfEmp;




public Employee(String name, Address address, PayInfo pay) {
	
	this.name[numOfEmp] = name;
	this.address[numOfEmp] = address;
	this.pay[numOfEmp] = pay;
}
//methods
public String getName() {
	return name[numOfEmp];
}
public void setName(String name) {
	this.name[numOfEmp] = name;
}
public Address getAddress() {
	return address[numOfEmp];
}
public void setAddress(Address address) {
	this.address[numOfEmp] = address;
}
public PayInfo getPay() {
	return pay[numOfEmp];
}
public void setPay(PayInfo pay) {
	this.pay[numOfEmp] = pay;
}

}
