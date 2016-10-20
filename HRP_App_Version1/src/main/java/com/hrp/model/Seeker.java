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
@Table(name = "seeker")
public class Seeker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", updatable = false, insertable = false)
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "qualification_id", updatable = false, insertable = false)
	private Qualification qualification;

	@Column(name = "work_experience")
	private Long workExperience;

	@Column(name = "created_date", updatable = false)
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "deleted_yn")
	private Boolean deletedYn;

	public Seeker() {
		super();
	}

	public Seeker(Seeker seeker) {
		super();
		this.id = seeker.id;
		this.user = seeker.user;
		this.qualification = seeker.qualification;
		this.workExperience = seeker.workExperience;
		this.createdDate = seeker.createdDate;
		this.updatedDate = seeker.updatedDate;
		this.deletedYn = seeker.deletedYn;
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

	public Long getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(Long workExperience) {
		this.workExperience = workExperience;
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

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Seeker [id=" + id + ", user=" + user + ", qualification=" + qualification + ", workExperience="
				+ workExperience + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", deletedYn="
				+ deletedYn + "]";
	}

}
