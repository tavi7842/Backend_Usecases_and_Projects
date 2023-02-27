package com.bitlabs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String answer;

@OneToOne
private Question que;

public Question getQue() {
	return que;
}
public void setQue(Question que) {
	this.que = que;
}
public int getId() {
	return id;
}
@Override
public String toString() {
	return "Answer [id=" + id + ", answer=" + answer + ", que=" + que + "]";
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public Answer(int id, String answer, Question que) {
	super();
	this.id = id;
	this.answer = answer;
	this.que = que;
}
public void setAnswer(String answer) {
	this.answer = answer;
}


public Answer() {
	super();
	// TODO Auto-generated constructor stub
}



}
