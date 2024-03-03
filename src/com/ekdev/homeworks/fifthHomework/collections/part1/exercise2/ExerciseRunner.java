package com.ekdev.homeworks.fifthHomework.collections.part1.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа
Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.

Задача:

- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет

- С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */
public class ExerciseRunner {

    public static void main(String[] args) {
        User ivan = new User(1, "Ivan", 15);
        User pavel = new User(2, "Pavel", 17);
        User igor = new User(3, "Igor", 25);
        User lena = new User(4, "Lena", 35);
        User ira = new User(5, "Ira", 50);

        List<User> userListFirstChat = new ArrayList<>();
        userListFirstChat.add(ivan);
        userListFirstChat.add(igor);

        List<User> userListSecondChat = new ArrayList<>();
        userListFirstChat.add(pavel);
        userListFirstChat.add(lena);

        List<User> userListThirdChat = new ArrayList<>();
        userListFirstChat.add(ivan);
        userListFirstChat.add(ira);

        List<Chat> chatList = new ArrayList<>();
        chatList.add(new Chat("firstChat", userListFirstChat));
        chatList.add(new Chat("secondChat", userListSecondChat));
        chatList.add(new Chat("thirdChat", userListThirdChat));

        List<User> userList = getAllUsersAsListOlderThan(chatList, 18);
        System.out.println(userList);
        System.out.println(getAverageAgeOfUsers(userList));
    }

    private static List<User> getAllUsersAsListOlderThan(List<Chat> chatList, int age) {
        List<User> users = new ArrayList<>();
        for (Chat chat : chatList) {
            List<User> usersList = chat.getUsersList();
            for (User user : usersList) {
                if (user.getAge() > age) {
                    users.add(user);
                }
            }
        }
        return users;
    }

    private static double getAverageAgeOfUsers(List<User> userList) {
        int age = 0;
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            age += user.getAge();
        }
        return (double) age / userList.size();
    }
}
