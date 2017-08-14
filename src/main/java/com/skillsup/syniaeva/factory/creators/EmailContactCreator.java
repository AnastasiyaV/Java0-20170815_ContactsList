package main.java.com.skillsup.syniaeva.factory.creators;

import main.java.com.skillsup.syniaeva.entities.EmailContact;
import main.java.com.skillsup.syniaeva.store.EmailsList;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailContactCreator implements ContactCreator {

	private EmailContact emailContact1 = new EmailContact("Masha", "masha@gmail.com", "Friends");
	private EmailContact emailContact2 = new EmailContact("Sergey Petrovich", "sergey_petrovicha@mail.ru", "Work");
	private EmailContact emailContact3 = new EmailContact("Yakov Alekseevich", "yasha@gmail.com", "Work");
	private EmailContact emailContact4 = new EmailContact("Petya", "petya@gmail.com", "Friends");
	private EmailContact emailContact5 = new EmailContact("Sofa", "sonya@gmail.com", "Friends");
	private EmailContact emailContact6 = new EmailContact("Detskie igrushki", "toys@gmail.com", "Others");
	private EmailContact emailContact7 = new EmailContact("Brat vasya", "vasyok@gmail.com", "Family");
	
	public EmailContact create(String name, String emailAdress) {
		return new EmailContact(name, emailAdress);
	}

	public EmailContact create(String name, String emailAdress, String contactType) {
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
