package com.ekdev.homeworks.fifthHomework.collections.part1.exercise1;

import java.util.Objects;

class Chat {

    private String name;
    private int usersCount;

    public Chat(String name, int usersCount) {
        this.name = name;
        this.usersCount = usersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
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
        return usersCount == chat.usersCount && Objects.equals(name, chat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, usersCount);
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersCount=" + usersCount +
                '}';
    }
}
