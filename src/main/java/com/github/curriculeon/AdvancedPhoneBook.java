package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class AdvancedPhoneBook {
    private Map<String, List<String>> phonebook;

    public AdvancedPhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public AdvancedPhoneBook() {
        this.phonebook = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        this.addAll(name, phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        this.phonebook.put(name, new ArrayList<>(Arrays.asList(phoneNumbers)));
    }

    public void remove(String name) {
        this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        for(Map.Entry<String, List<String>> num : this.phonebook.entrySet()){
            if(num.getValue().get(0).equals(name)){
                return true;
            }
        }
        return false;
    }

    public List<String> lookup(String name) {
        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        for(Map.Entry<String, List<String>> num : this.phonebook.entrySet()){
            if(num.getValue().get(0).equals(phoneNumber)){
                return num.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames() {
        return new LinkedList<>(this.phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}
