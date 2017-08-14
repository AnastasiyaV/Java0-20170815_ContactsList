package main.java.com.skillsup.syniaeva.entities;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailContact implements Contact {

	private String name;
	private String emailAdress;
	private String contactType;

	public EmailContact(String name, String emailAdress) {
		this.name = name;
		this.emailAdress = emailAdress;
		this.contactType = "OTHERS";
	}

	public EmailContact(String name, String emailAdress, String contactType) {
		this.name = name;
		this.emailAdress = emailAdress;
		this.contactType = contactType;
	}

	public String getContactType() {
		return contactType;
	}

	@Override
	public String getContact() {
		return emailAdress;
	}

	@Override
	public String getName() {
		return name;
	}

	public void writeEmail(String message) {
		System.out.println("The message " + message + " was written to the " + name);
	}

	@Override
	public String toString() {
		return "\n EmailContact {" +
				"name='" + name + '\'' +
				", emailAdress='" + emailAdress + '\'' +
				", contactType='" + contactType + '\'' +
				"}";
	}
}
