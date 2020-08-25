package com.hs.ravishka.domain;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="user")
	public class UserDTO {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column(name="user_id")
		private Integer id;
		
		@Column(name="user_firstName")
		private String firstname;
		
		@Column(name="user_lastName")
		private String lastname;
		
		@Column(name="user_Age")
		private Integer age;
		
		@Column(name="user_Email")
		
		
		private String email;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
	}

	
	
	
	


