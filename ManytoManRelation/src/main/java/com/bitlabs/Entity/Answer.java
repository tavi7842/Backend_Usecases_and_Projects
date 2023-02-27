package com.bitlabs.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Answer {

	@Id
	private int id;
	private String Answer;
	
	@ManyToMany
	private List<Question> que;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public List<Question> getQue() {
		return que;
	}

	public void setQue(List<Question> que) {
		this.que = que;
	}

	public Answer(int id, String answer, List<Question> que) {
		super();
		this.id = id;
		Answer = answer;
		this.que = que;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", Answer=" + Answer + ", que=" + que + "]";
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
