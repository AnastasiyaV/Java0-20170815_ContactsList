package main.java.com.skillsup.syniaeva.factory;

import main.java.com.skillsup.syniaeva.entities.Contact;
import main.java.com.skillsup.syniaeva.factory.creators.ContactCreator;
import main.java.com.skillsup.syniaeva.factory.creators.EmailContactCreator;
import main.java.com.skillsup.syniaeva.factory.creators.PhoneNumberContactCreator;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class ContactsFactory {

	public static ContactCreator makeCreator(String contactKind) {
		return contactKind.equalsIgnoreCase("Phone")? new PhoneNumberContactCreator() : new EmailContactCreator();
	}
}
