package com.hrp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String email;

	@OneToOne
	@JoinColumn(name = "user_profile_id")
	@Cascade(CascadeType.ALL)
	private UserProfile userProfile;

	@Column
	@Temporal(TemporalType.DATE)
	private Date created_date;

	@Column
	@Temporal(TemporalType.DATE)
	private Date updated_date;

	@Column
	private Long deleted_yn;

	public User() {
		super();
	}

	public User(User user) {
		super();
		this.id = user.id;
		this.email = user.email;
		this.userProfile = user.userProfile;
		this.created_date = user.created_date;
		this.updated_date = user.updated_date;
		this.deleted_yn = user.deleted_yn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public Long getDeleted_yn() {
		return deleted_yn;
	}

	public void setDeleted_yn(Long deleted_yn) {
		this.deleted_yn = deleted_yn;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
