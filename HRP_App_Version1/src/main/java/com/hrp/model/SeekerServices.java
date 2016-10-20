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
@Table(name = "seeker_services")
public class SeekerServices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_id", updatable = false, insertable = false)
	private Services services;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seeker_id", updatable = false, insertable = false)
	private Seeker seeker;

	@Column(name = "created_date", updatable = false)
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "deleted_yn")
	private Boolean deletedYn;

	public SeekerServices() {
		super();
	}

	public SeekerServices(SeekerServices seekerServices) {
		super();
		this.id = seekerServices.id;
		this.seeker = seekerServices.seeker;
		this.services = seekerServices.services;
		this.createdDate = seekerServices.createdDate;
		this.updatedDate = seekerServices.updatedDate;
		this.deletedYn = seekerServices.deletedYn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	public Seeker getSeeker() {
		return seeker;
	}

	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
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
		return "SeekerServices [id=" + id + ", services=" + services + ", seeker=" + seeker + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", deletedYn=" + deletedYn + "]";
	}

}
