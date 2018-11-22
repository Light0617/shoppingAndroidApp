package com.example.sharingapp;
import android.content.Context;

public class AddContactCommand extends Command {
    private ContactList contacts;
    private Contact contact;
    private Context context;

    public AddContactCommand(ContactList contacts, Contact contact, Context context){
        this.contacts = contacts;
        this.contact = contact;
        this.context = context;
    }

    public void execute(){
        contacts.addContact(contact);
        setIsExecuted(contacts.saveContacts(context));
    }
}
