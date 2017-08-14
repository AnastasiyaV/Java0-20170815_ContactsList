package main.java.com.skillsup.syniaeva.store;

import java.util.Arrays;

import main.java.com.skillsup.syniaeva.entities.Contact;
import main.java.com.skillsup.syniaeva.entities.PhoneContact;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class PhonesList implements ContactsList {

	PhoneContact[] contacts;
	private int index;

	public PhonesList() {
		contacts = new PhoneContact[10];
		index=0;
	}

	@Override
	public void add(Contact contact) {
		if(contacts.length-1 > index) {
			contacts[index] = (PhoneContact)contact;
			index++;
		} else {
			contacts = Arrays.copyOf(contacts, contacts.length + 10);
			contacts[index] = (PhoneContact)contact;
			index++;
		}
	}

	public int getIndex() {
		return index;
	}

	public PhoneContact get(int index) {
		return contacts[index];
	}

	public PhoneContact[] getContacts() {
		return Arrays.copyOfRange(contacts,0,index);
	}

	public void setContacts(PhoneContact[] contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "PhonesList: \n"
				+ Arrays.toString( getContacts()) +
				'}';
	}
}
