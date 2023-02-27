package com.bitlabs.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Question {
	
	@Id
	private int id;
	private String Question;
	
	@ManyToMany
	private List<Answer> ans;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> listA) {
		this.ans = listA;
	}

	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int id, String question, List<Answer> ans) {
		super();
		this.id = id;
		Question = question;
		this.ans = ans;
	}

	
	
	

}
