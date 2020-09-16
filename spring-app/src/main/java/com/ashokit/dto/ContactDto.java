package com.ashokit.dto;

import javax.persistence.Id;

public class ContactDto {
	
		private int cid;
		private String cname;
		private String cemail;
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
