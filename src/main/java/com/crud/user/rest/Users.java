package com.crud.user.rest;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String first_name;

    private String last_name;
    
    private String email;
    
    private String phone_no;
    
    private String addr_line_1;
    
    private String addr_line_2;
    
    @OneToMany(targetEntity=UserAccounts.class, cascade = CascadeType.ALL)  
    private List<UserAccounts> userAccounts;  

	public Users() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone_no
	 */
	public String getPhone_no() {
		return phone_no;
	}

	/**
	 * @param phone_no the phone_no to set
	 */
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	/**
	 * @return the addr_line_1
	 */
	public String getAddr_line_1() {
		return addr_line_1;
	}

	/**
	 * @param addr_line_1 the addr_line_1 to set
	 */
	public void setAddr_line_1(String addr_line_1) {
		this.addr_line_1 = addr_line_1;
	}

	/**
	 * @return the addr_line_2
	 */
	public String getAddr_line_2() {
		return addr_line_2;
	}

	/**
	 * @param addr_line_2 the addr_line_2 to set
	 */
	public void setAddr_line_2(String addr_line_2) {
		this.addr_line_2 = addr_line_2;
	}

	/**
	 * @return the userAccounts
	 */
	public List<UserAccounts> getUserAccounts() {
		return userAccounts;
	}

	/**
	 * @param userAccounts the userAccounts to set
	 */
	public void setUserAccounts(List<UserAccounts> userAccounts) {
		this.userAccounts = userAccounts;
	}
	
	
	

}
