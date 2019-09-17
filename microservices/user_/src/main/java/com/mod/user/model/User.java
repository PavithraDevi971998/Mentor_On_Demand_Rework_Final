package com.mod.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
@Column(name="phoneNumber")
private long phoneNumber;
@Column(name="password")
private String password;
@Column(name="statususer")
private String statusUser;
@Column(name="active")
private boolean active;
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
public String getStatusUser() {
	return statusUser;
}
public void setStatusUser(String statusUser) {
	this.statusUser = statusUser;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", password="
			+ password + "]";
}

}
