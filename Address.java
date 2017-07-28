
public class Address {
private String[] streetAddress = new String [1];
private String [] city = new String [1];
private String [] state = new String [1];
private String [] zipcode = new String[1];
int numOfAdd=0;




public Address(String streetAddress, String city, String state, String zipcode) {
	super();
	this.streetAddress[numOfAdd] = streetAddress;
	this.city[numOfAdd] = city;
	this.state[numOfAdd] = state;
	this.zipcode[numOfAdd] = zipcode;
}
//methods

public String getStreetAddress() {
	return streetAddress[numOfAdd];
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress[numOfAdd] = streetAddress;
}
public String getCity() {
	return city[numOfAdd];
}
public void setCity(String city) {
	this.city[numOfAdd] = city;
}
public String getState() {
	return state[numOfAdd];
}
public void setState(String state) {
	this.state[numOfAdd] = state;
}
public String getZipcode() {
	return zipcode[numOfAdd];
}
public void setZipcode(String zipcode) {
	this.zipcode[numOfAdd] = zipcode;
}



}
