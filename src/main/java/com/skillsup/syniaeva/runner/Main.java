package main.java.com.skillsup.syniaeva.runner;

import java.util.Arrays;
import java.util.Scanner;

import main.java.com.skillsup.syniaeva.entities.Contact;
import main.java.com.skillsup.syniaeva.entities.ContactType;
import main.java.com.skillsup.syniaeva.entities.EmailContact;
import main.java.com.skillsup.syniaeva.entities.PhoneContact;
import main.java.com.skillsup.syniaeva.factory.ContactsFactory;
import main.java.com.skillsup.syniaeva.factory.creators.ContactCreator;
import main.java.com.skillsup.syniaeva.factory.creators.EmailContactCreator;
import main.java.com.skillsup.syniaeva.factory.creators.PhoneNumberContactCreator;
import main.java.com.skillsup.syniaeva.services.sorters.EmailContactsSorter;
import main.java.com.skillsup.syniaeva.services.sorters.PhoneNumberContactsSorter;
import main.java.com.skillsup.syniaeva.store.ContactsList;
import main.java.com.skillsup.syniaeva.store.EmailsList;
import main.java.com.skillsup.syniaeva.store.PhonesList;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class Main {
	public static void main(String[] args) {

		EmailsList emailsList = new EmailsList();
		PhonesList phonesList = new PhonesList();

		EmailContactCreator emailContactCreator = new EmailContactCreator();
		emailContactCreator.populateTestData(emailsList);

		PhoneNumberContactCreator phoneNumberContactCreator = new PhoneNumberContactCreator();
		phoneNumberContactCreator.populateTestData(phonesList);


		ContactCreator contactCreator;

		Scanner sc = new Scanner(System.in);
		System.out.println("Let's have fun with you contacts");

		while(true) {

			System.out.println(
					"Pick an action: \n 1) to add new contact please enter kind of new contact: email or phone? \n 2) to finish creating contacts just enter stop");

			String contactKind = sc.next();

			if (contactKind.equalsIgnoreCase("stop")) break;

			contactCreator = ContactsFactory.makeCreator(contactKind);

			System.out.println("Please enter the name of new contact");
			String name = sc.next();
			System.out.println("Please enter the actual contact value");
			String contact = sc.next();
			System.out.println("Please pick the type of new contact: family, work, friends or other");
			ContactType contactType = ContactType.valueOf(sc.next());
			Contact contact1 = contactCreator.create(name, contact, contactType);

			if (contactKind.equalsIgnoreCase("email")) {
				emailsList.add(contact1);
			} else {
				phonesList.add(contact1);
			}

		}

		System.out.println("Not sorted emailsList: " + emailsList);

		EmailContact[] sortedbyNameEmailContacts = EmailContactsSorter.sortByName(emailsList.getContacts());

		System.out.println("Sorted by name emailsList: \n" + Arrays.toString(sortedbyNameEmailContacts));

		System.out.println("Not sorted phonesList: " + phonesList);

		PhoneContact[] sortedByTypePhoneContacts = PhoneNumberContactsSorter.sortByContactType(phonesList.getContacts());

		System.out.println("Sorted by type phonesList: \n" + Arrays.toString(sortedByTypePhoneContacts));
	}
}
