package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    private AdvancedPhoneBook phonebook;

    public SimplePhoneBook(AdvancedPhoneBook phoneBook) {
        this.phonebook = phoneBook;
    }

    public SimplePhoneBook() {
        this.phonebook = new AdvancedPhoneBook();
    }

    public void add(String name, String phoneNumberToAdd) {
        phonebook.add(name, phoneNumberToAdd);
    }

    public String get(String name) {
        return this.phonebook.getMap().get(name).get(0);
    }

    public Boolean hasEntry(String phoneNumber) {
        return this.phonebook.hasEntry(phoneNumber);
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public List<String> getAllContactNames() {
        return this.phonebook.getAllContactNames();
    }

    public String reverseLookup(String phoneNumber) {
        return this.phonebook.reverseLookup(phoneNumber);
    }

}
