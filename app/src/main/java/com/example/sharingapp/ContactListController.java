package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {
    private ContactList contact_list;

    public ContactListController(ContactList contact_list){
        this.contact_list = contact_list;
    }

    public void setContacts(ArrayList<Contact> item_list) {
        this.contact_list.setContacts(item_list);
    }

    public ArrayList<Contact> getContacts() {
        return contact_list.getContacts();
    }

    public ArrayList<String> getAllUsernames() {
        return contact_list.getAllUsernames();
    }

    public boolean addContact(Contact contact, Context context){
        AddContactCommand add_contact_command = new AddContactCommand(contact_list, contact, context);
        add_contact_command.execute();
        return add_contact_command.isExecuted();
    }

    public boolean deleteContact(Contact contact, Context context) {
        DeleteContactCommand command = new DeleteContactCommand(contact_list, contact, context);
        command.execute();
        return command.isExecuted();
    }

    public boolean editContact(Contact contact, Contact updated_contact, Context context){
        EditContactCommand command = new EditContactCommand(contact_list, contact, updated_contact, context);
        command.execute();
        return command.isExecuted();
    }

    public Contact getContact(int index) {
        return contact_list.getContact(index);
    }

    public int getIndex(Contact contact) {
        return contact_list.getIndex(contact);
    }

    public int getSize() {
        return contact_list.getSize();
    }

    public Contact getContactByUsername(String username) {
        return contact_list.getContactByUsername(username);
    }

    public boolean hasContact(Contact contact) {
        return contact_list.hasContact(contact);
    }

    public boolean isUsernameAvailable(String username) {
        return contact_list.isUsernameAvailable(username);
    }

    public void loadContacts(Context context) {
        contact_list.loadContacts(context);
    }

    public boolean saveContacts(Context context) {
        return contact_list.saveContacts(context);
    }

    public void addObserver(Observer observer) {
        contact_list.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        contact_list.removeObserver(observer);
    }
}
