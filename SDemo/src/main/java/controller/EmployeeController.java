package controller;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeController extends ActionSupport{
	private  String name,email,address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void validate() {
		if(name.equals(" "))
			addFieldError("name","name is required");
		if(email.equals(" "))
			addFieldError("email","email is required");
		if(address.equals(" "))
			addFieldError("address","address is required");
	}

	@Override
	public String execute() throws Exception {
	System.out.println(name);
	System.out.println(email);
	System.out.println(address);
	return "success";
	
	}
	
	

}
