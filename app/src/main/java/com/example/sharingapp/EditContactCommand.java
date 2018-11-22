package com.example.sharingapp;

import android.content.Context;

public class EditContactCommand extends Command {
    private ContactList contacts;
    private Contact old_contact;
    private Contact new_contact;
    private Context context;

    public EditContactCommand(ContactList contacts, Contact old_contact, Contact new_contact, Context context){
        this.contacts = contacts;
        this.old_contact = old_contact;
        this.new_contact = new_contact;
        this.context = context;
    }

    public void execute(){
        contacts.deleteContact(old_contact);
        contacts.addContact(new_contact);
        setIsExecuted(contacts.saveContacts(context));
    }
}
