package com.bitlabs.Annotate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bit.StudentMarks;

@Entity
@Table(name="Student_Data")
public class StudentInfo {
@Id
private int Id;
private String Name;
private String DeptName;
private StudentMarks stu;

public StudentInfo(int id, String name, String deptName, StudentMarks stu) {
	super();
	Id = id;
	Name = name;
	DeptName = deptName;
	this.stu = stu;
}

public StudentMarks getStu() {
	return stu;
}

public void setStu(StudentMarks stu) {
	this.stu = stu;
}

public StudentInfo() {
	super();
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDeptName() {
	return DeptName;
}
public void setDeptName(String deptName) {
	DeptName = deptName;
}

@Override
public String toString() {
	return "StudentInfo [Id=" + Id + ", Name=" + Name + ", DeptName=" + DeptName + ", stu=" + stu + "]";
}


}
