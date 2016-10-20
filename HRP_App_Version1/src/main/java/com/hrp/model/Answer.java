package com.hrp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", updatable = false, insertable = false)
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id", updatable = false, insertable = false)
	private Questions questions;

	@Column(name = "answer")
	private String answer;

	@Column(name = "created_date", updatable = false)
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "deleted_yn")
	private Boolean deletedYn;

	public Answer() {
		super();
	}

	public Answer(Answer answr) {
		super();
		this.id = answr.id;
		this.user = answr.user;
		this.questions = answr.questions;
		this.answer = answr.answer;
		this.createdDate = answr.createdDate;
		this.updatedDate = answr.updatedDate;
		this.deletedYn = answr.deletedYn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Questions getQuestions() {
		return questions;
	}

	public void setQuestions(Questions questions) {
		this.questions = questions;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getDeletedYn() {
		return deletedYn;
	}

	public void setDeletedYn(Boolean deletedYn) {
		this.deletedYn = deletedYn;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", user=" + user + ", questions=" + questions + ", answer=" + answer
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deletedYn=" + deletedYn + "]";
	}

}
