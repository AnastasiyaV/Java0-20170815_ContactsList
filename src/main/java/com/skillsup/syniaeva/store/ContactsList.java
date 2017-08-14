package main.java.com.skillsup.syniaeva.store;

import main.java.com.skillsup.syniaeva.entities.Contact;
/**
 * Created by osyniaeva on 8/14/17.
 */
public interface ContactsList {
	void add(Contact contact);
	Contact get(int index);
}
