package org.example.task5;

public class User implements Observer {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.println(userName + " получил уведомление: " + message);
    }
}
