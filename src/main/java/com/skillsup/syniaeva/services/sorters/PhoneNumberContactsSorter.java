package main.java.com.skillsup.syniaeva.services.sorters;

import main.java.com.skillsup.syniaeva.entities.PhoneContact;
import main.java.com.skillsup.syniaeva.services.comparators.PhoneContactsComparator;

/**
 * Created by osyniaeva on 8/14/17.
 */
public class PhoneNumberContactsSorter {
	private static void sort(PhoneContact[] originalContactsArray, PhoneContactsComparator comparator) {

		for (int i = originalContactsArray.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (comparator.compare(originalContactsArray[j], originalContactsArray[j + 1])) {
					PhoneContact t = originalContactsArray[j];
					originalContactsArray[j] = originalContactsArray[j + 1];
					originalContactsArray[j + 1] = t;
				}
			}
		}

	}

	public static PhoneContact[] sortByName(PhoneContact[] originalContactsArray) {
		sort(originalContactsArray, new PhoneContactsComparator() {
			@Override
			public boolean compare(PhoneContact first, PhoneContact second) {
				if (first.getName().compareTo(second.getName())>0) {
					return true;
				}
				return false;
			}
		});
		return originalContactsArray;
	}

	public static PhoneContact[] sortByContactType(PhoneContact[] originalContactsArray) {
		sort(originalContactsArray, new PhoneContactsComparator() {
			@Override
			public boolean compare(PhoneContact first, PhoneContact second) {
				if (first.getContactType().toUpperCase().compareTo(second.getContactType().toUpperCase())>0) {
					return true;
				}
				return false;
			}
		});
		return originalContactsArray;
	}
}
