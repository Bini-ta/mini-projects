package com.project.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter                               //Lombok dependencies to create getter and setter methods
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity                              //Make this class a entity class
@Table(name = "Employees")          //Table name in Database
public class Employee {
    @Id                                 //make ID as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //primary key generation strategy
    private long id;

    @Column(name = "First_Name", nullable = false)   //If you do not provide @Column annotation
                                                    // Jpa will take default property name (firstName)
    private Object firstName;

    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    @Column(name = "Email_Id", nullable = false)
    private String emailId;

	public Object getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public Object getEmailId() {
		// TODO Auto-generated method stub
		return emailId;
	}

	public void setFirstName1(Object object) {
		// TODO Auto-generated method stub
		this.firstName = object;
	}

	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmailId(Object emailId2) {
		// TODO Auto-generated method stub
		
	
	}

}
