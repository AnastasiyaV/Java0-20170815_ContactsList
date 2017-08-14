package main.java.com.skillsup.syniaeva.entities;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class PhoneContact implements Contact {

	private String name;
	private String phoneNumber;
	private String contactType;

	public PhoneContact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.contactType = "OTHERS";
	}

	public PhoneContact(String name, String phoneNumber, String contactType) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.contactType = contactType;
	}

	public String getContactType() {
		return contactType;
	}

	@Override
	public String getContact() {
		return phoneNumber;
	}

	@Override
	public String getName() {
		return name;
	}

	public void call() {
		System.out.println("The call to " + name  + " was made");
	}

	@Override
	public String toString() {
		return "\n PhoneContact {" +
				"name='" + name + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", contactType='" + contactType + '\'' +
				"}";
	}
}
