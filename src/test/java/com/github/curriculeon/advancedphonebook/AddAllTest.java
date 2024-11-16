package com.github.curriculeon.advancedphonebook;

import com.github.curriculeon.AdvancedPhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AddAllTest {


    @Test
    public void test1() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
                "302-555-1111",
        };

        // when
        advancedPhoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = advancedPhoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }



    @Test
    public void test2() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-5555",
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
        };

        // when
        advancedPhoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = advancedPhoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }


    @Test
    public void test3() {
        // given
        AdvancedPhoneBook advancedPhoneBook = new AdvancedPhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-1212",
                "302-555-3434",
                "302-555-4545",
                "302-555-5656",
        };

        // when
        advancedPhoneBook.addAll(name, phoneNumbers);
        List<String> actualPhoneNumbers = advancedPhoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(phoneNumbers), actualPhoneNumbers);
    }
}
