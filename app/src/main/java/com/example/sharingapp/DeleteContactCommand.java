package com.example.sharingapp;

import android.content.Context;

public class DeleteContactCommand extends Command {
    private ContactList contacts;
    private Contact contact;
    private Context context;

    public DeleteContactCommand(ContactList contacts, Contact contact, Context context){
        this.contacts = contacts;
        this.contact = contact;
        this.context = context;
    }

    public void execute(){
        contacts.deleteContact(contact);
        setIsExecuted(contacts.saveContacts(context));
    }
}
