package main.java.com.skillsup.syniaeva.factory.creators;

import main.java.com.skillsup.syniaeva.entities.ContactType;
import main.java.com.skillsup.syniaeva.entities.EmailContact;
import main.java.com.skillsup.syniaeva.store.EmailsList;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailContactCreator implements ContactCreator {

	private EmailContact emailContact1 = new EmailContact("Masha", "masha@gmail.com", ContactType.FAMILY);
	private EmailContact emailContact2 = new EmailContact("Sergey Petrovich", "sergey_petrovicha@mail.ru", ContactType.WORK);
	private EmailContact emailContact3 = new EmailContact("Yakov Alekseevich", "yasha@gmail.com", ContactType.WORK);
	private EmailContact emailContact4 = new EmailContact("Petya", "petya@gmail.com", ContactType.FRIENDS);
	private EmailContact emailContact5 = new EmailContact("Sofa", "sonya@gmail.com", ContactType.FRIENDS);
	private EmailContact emailContact6 = new EmailContact("Detskie igrushki", "toys@gmail.com", ContactType.OTHER);
	private EmailContact emailContact7 = new EmailContact("Brat vasya", "vasyok@gmail.com", ContactType.FAMILY);
	
	public EmailContact create(String name, String emailAdress) {
		return new EmailContact(name, emailAdress);
	}

	public EmailContact create(String name, String emailAdress, ContactType contactType) {
		return new EmailContact(name, emailAdress, contactType);
	}
	
	public void populateTestData(EmailsList list) {
		list.add(emailContact1);
		list.add(emailContact2);
		list.add(emailContact3);
		list.add(emailContact4);
		list.add(emailContact5);
		list.add(emailContact6);
		list.add(emailContact7);
	}
}
