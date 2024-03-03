package com.ekdev.homeworks.fifthHomework.collections.part1.exercise2;

import java.util.List;
import java.util.Objects;

class Chat {

    private String name;
    private List<User> usersList;

    public Chat(String name, List<User> usersList) {
        this.name = name;
        this.usersList = usersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Chat chat = (Chat) o;
        return Objects.equals(name, chat.name) && Objects.equals(usersList, chat.usersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, usersList);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersList=" + usersList +
                '}';
    }
}
