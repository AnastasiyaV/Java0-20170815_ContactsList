package main.java.com.skillsup.syniaeva.factory.creators;

import main.java.com.skillsup.syniaeva.entities.Contact;
import main.java.com.skillsup.syniaeva.entities.ContactType;
import main.java.com.skillsup.syniaeva.store.ContactsList;

/**
 * Created by osyniaeva on 8/14/17.
 */
public interface ContactCreator {
	Contact create(String name, String contact);
	Contact create(String name, String contact, ContactType contactType);
}
