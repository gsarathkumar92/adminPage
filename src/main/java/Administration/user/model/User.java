package Administration.user.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
private String fname;
private String lname;
@Override
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + "]";
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
}
