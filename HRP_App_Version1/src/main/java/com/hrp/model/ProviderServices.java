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
@Table(name = "provider_services")
public class ProviderServices {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "service_id", updatable = false, insertable = false)
	private Services services;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provider_id", updatable = false, insertable = false)
	private Provider provider;

	@Column(name = "created_date", updatable = false)
	private Date createdDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "deleted_yn")
	private Boolean deletedYn;

	public ProviderServices() {
		super();
	}

	public ProviderServices(ProviderServices providerServices) {
		super();
		this.id = providerServices.id;
		this.provider = providerServices.provider;
		this.services = providerServices.services;
		this.createdDate = providerServices.createdDate;
		this.updatedDate = providerServices.updatedDate;
		this.deletedYn = providerServices.deletedYn;
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

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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
		return "ProviderServices [id=" + id + ", services=" + services + ", provider=" + provider + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + ", deletedYn=" + deletedYn + "]";
	}

}
