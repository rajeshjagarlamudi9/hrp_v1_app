package com.hrp.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	@Id
	@GeneratedValue
	Integer id;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "qualification_id")
	private Qualification qualification;
	
	@JoinColumn(name = "experience")
	private int experience;
	
	@Column
	private String first_name;
	
	@Column
	private String middle_name;
	
	@Column
	private String last_name;
	
	@Column
	private String mobile;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date created_date;
	
	@Column
	@Temporal(TemporalType.DATE)
    private Date updated_date;
	
	@Column
    private Integer deleted_yn;
	
	public UserProfile(){
		super();
	}
	
	public UserProfile(UserProfile userProfile){
		super();
		this.id = userProfile.id;
		this.qualification = userProfile.qualification;
		this.experience = userProfile.experience;
		this.first_name = userProfile.first_name;
		this.middle_name = userProfile.middle_name;
		this.last_name = userProfile.last_name;
		this.mobile = userProfile.mobile;
		this.created_date = userProfile.created_date;
		this.updated_date = userProfile.updated_date;
		this.deleted_yn = userProfile.deleted_yn;
	}
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public Integer getDeleted_yn() {
		return deleted_yn;
	}
	public void setDeleted_yn(Integer deleted_yn) {
		this.deleted_yn = deleted_yn;
	}
	
}
