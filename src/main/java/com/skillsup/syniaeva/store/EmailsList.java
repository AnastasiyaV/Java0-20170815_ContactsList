package main.java.com.skillsup.syniaeva.store;

import java.util.Arrays;

import main.java.com.skillsup.syniaeva.entities.Contact;
import main.java.com.skillsup.syniaeva.entities.EmailContact;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailsList implements ContactsList {
	EmailContact[] contacts;
	private int index;

	public EmailsList() {
		contacts = new EmailContact[10];
		index=0;
	}

	@Override
	public void add(Contact contact) {
		if(contacts.length-1 > index) {
			contacts[index] = (EmailContact)contact;
			index++;
		} else {
			contacts = Arrays.copyOf(contacts, contacts.length + 10);
			contacts[index] = (EmailContact)contact;
			index++;
		}
	}

	public int getIndex() {
		return index;
	}

	public EmailContact get(int index) {
		return contacts[index];
	}

	public EmailContact[] getContacts() {
		return Arrays.copyOfRange(contacts,0,index);
	}

	public void setContacts(EmailContact[] contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "EmailsList:\n"
				+ Arrays.toString(getContacts() ) +
				'}';
	}
}
