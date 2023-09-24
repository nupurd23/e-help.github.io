package com.ehelp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

        @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String email;
		private String name;
		private String phn;
		private String address;
		private String consult;

		public User(String email, String name, String phn, String address, String consult) {
			super();
			this.email = email;
			this.name = name;
			this.phn = phn;
			this.address = address;
			this.consult=consult;
		}

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhn() {
			return phn;
		}

		public void setPhn(String phn) {
			this.phn = phn;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getConsult() {
			return consult;
		}

		public void setConsult(String consult) {
			this.consult = consult;
		}

		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
	
}
