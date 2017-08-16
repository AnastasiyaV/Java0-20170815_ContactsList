package main.java.com.skillsup.syniaeva.services.comparators;

import main.java.com.skillsup.syniaeva.entities.PhoneContact;

public interface ContactComparator <T> {
	boolean compare ( T first, T second);
}


