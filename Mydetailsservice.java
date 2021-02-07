package com.example.Mydetails;

import org.springframework.stereotype.Component;

import lombok.Builder;

@Component
public class Mydetailsservice {
String name;
int myid;
 String passedout;
 String interests;
 String team;
 String location;
 String phno;
public void setName(String name) {
	this.name = name;
}
public void setMyid(int myid) {
	this.myid = myid;
}
public void setPassedout(String passedout) {
	this.passedout = passedout;
}
public void setInterests(String interests) {
	this.interests = interests;
}
public void setTeam(String team) {
	this.team = team;
}
public void setLocation(String location) {
	this.location = location;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getName() {
	return name;
}
public int getMyid() {
	return myid;
}
public String getPassedout() {
	return passedout;
}
public String getInterests() {
	return interests;
}
public String getTeam() {
	return team;
}
public String getLocation() {
	return location;
}
public String getPhno() {
	return phno;
}
public Mydetailsservice(String name, int myid, String passedout, String interests, String team, String location,
		String phno) {
	super();
	this.name = name;
	this.myid = myid;
	this.passedout = passedout;
	this.interests = interests;
	this.team = team;
	this.location = location;
	this.phno = phno;
}
public Mydetailsservice() {
	
}

 
 
}