package main.java.com.skillsup.syniaeva.entities;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailContact implements Contact {

	private String name;
	private String emailAdress;
	private ContactType contactType;

	public EmailContact(String name, String emailAdress) {
		this.name = name;
		this.emailAdress = emailAdress;
		this.contactType = ContactType.OTHER;
	}

	public EmailContact(String name, String emailAdress, ContactType contactType) {
		this.name = name;
		this.emailAdress = emailAdress;
		this.contactType = contactType;
	}

	public ContactType getContactType() {
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
