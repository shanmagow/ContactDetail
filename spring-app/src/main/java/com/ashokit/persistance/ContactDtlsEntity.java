package com.ashokit.persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DTLS")
public class ContactDtlsEntity {
	
	@GeneratedValue
	@Id
	@Column (name="contact_id")
	private int cid;
	@Column (name="contact_name")
	private String cname;
	@Column (name="contact_email")
	private String cemail;
	@Column (name="contact_num")
	private Long cnum;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public Long getCnum() {
		return cnum;
	}
	public void setCnum(Long cnum) {
		this.cnum = cnum;
	}
	

}
