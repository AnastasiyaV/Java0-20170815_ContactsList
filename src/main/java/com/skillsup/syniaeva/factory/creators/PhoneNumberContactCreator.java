package main.java.com.skillsup.syniaeva.factory.creators;

import main.java.com.skillsup.syniaeva.entities.PhoneContact;
import main.java.com.skillsup.syniaeva.store.PhonesList;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class PhoneNumberContactCreator implements ContactCreator {

	private PhoneContact phoneContact1 = new PhoneContact("Оля", "+38(096)-745-25-96", "Friends");
	private PhoneContact phoneContact2 = new PhoneContact("Сергей Петрович рабочий", "756-85-96", "Work");
	private PhoneContact phoneContact3 = new PhoneContact("Лена парикмахер", "093-852-89-74", "Others");
	private PhoneContact phoneContact4 = new PhoneContact("мама", "095-501-92-48", "family");
	private PhoneContact phoneContact5 = new PhoneContact("Катя секретарь", "067-745-25-89", "work");
	private PhoneContact phoneContact6 = new PhoneContact("бабуля", "095-752-89-96", "family");
	private PhoneContact phoneContact7 = new PhoneContact("Андрюха", "099-852-89-74", "friends");
	private PhoneContact phoneContact8 = new PhoneContact("Кирюха", "096-721-36-77", "friends");
	private PhoneContact phoneContact9 = new PhoneContact("Толик поставщик", "066-638-15-98", "work");

	public PhoneContact create(String name, String phoneNumber) {
		return new PhoneContact(name, phoneNumber);
	}

	public PhoneContact create(String name, String phoneNumber, String contactType) {
		return new PhoneContact(name, phoneNumber, contactType);
	}

	public void populateTestData(PhonesList list) {
		list.add(phoneContact1);
		list.add(phoneContact2);
		list.add(phoneContact3);
		list.add(phoneContact4);
		list.add(phoneContact5);
		list.add(phoneContact6);
		list.add(phoneContact7);
		list.add(phoneContact8);
		list.add(phoneContact9);
	}
}
