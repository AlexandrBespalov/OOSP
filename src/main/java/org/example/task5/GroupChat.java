package org.example.task5;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements Chat {
    private List<Observer> observers = new ArrayList<>();
    private String chatName;

    public GroupChat(String chatName) {
        this.chatName = chatName;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Пользователь подписан на чат: " + chatName);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Пользователь отписан от чата: " + chatName);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update("Новое сообщение в чате \"" + chatName + "\": " + message);
        }
    }

    public void addMessage(String message) {
        System.out.println("Новое сообщение в чате \"" + chatName + "\": " + message);
        notifyObservers(message);
    }
}
