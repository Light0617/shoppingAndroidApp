package com.example.sharingapp;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers;

    public Observable(){
        observers = new ArrayList<>();
    }

    public void notifyObservers(){
        for(Observer obs : observers){
            obs.update();
        }
    }

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void removeObserver(Observer obs){
        if(observers.contains(obs)){
            observers.remove(obs);
        }
    }

}
