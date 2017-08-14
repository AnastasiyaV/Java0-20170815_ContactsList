package main.java.com.skillsup.syniaeva.services.sorters;

import main.java.com.skillsup.syniaeva.entities.EmailContact;
import main.java.com.skillsup.syniaeva.services.comparators.EmailContactsComparator;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class EmailContactsSorter {

	private static void sort(EmailContact[] originalContactsArray, EmailContactsComparator comparator) {

		for (int i = originalContactsArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (comparator.compare(originalContactsArray[j], originalContactsArray[j + 1])) {
					EmailContact t = originalContactsArray[j];
					originalContactsArray[j] = originalContactsArray[j + 1];
					originalContactsArray[j + 1] = t;
				}
			}
		}

	}

	public static EmailContact[] sortByName(EmailContact[] originalContactsArray) {
		sort(originalContactsArray, new EmailContactsComparator() {
			@Override
			public boolean compare(EmailContact first, EmailContact second) {
				if (first.getName().compareTo(second.getName())>0) {
					return true;
				}
				return false;
			}
		});
		return originalContactsArray;
	}

	public static EmailContact[] sortByContactType(EmailContact[] originalContactsArray) {
		sort(originalContactsArray, new EmailContactsComparator() {
			@Override
			public boolean compare(EmailContact first, EmailContact second) {
				if (first.getContactType().toUpperCase().compareTo(second.getContactType().toUpperCase())>0) {
					return true;
				}
				return false;
			}
		});
		return originalContactsArray;
	}
}
