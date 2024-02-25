package com.ekdev.homeworks.fifthHomework.collections.part1.exercise1;

/*
Дан список чатов.
Каждый чат состоит из двух полей: название и количество пользователей в этом чате.

Задача:

- Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.

- Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество
совпадает, то по названию в алфавитном порядке.

- Также предоставить сортировку чатов по названию по умолчанию.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ExerciseRunner {

    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>();
        chatList.add(new Chat("firstChat", 10));
        chatList.add(new Chat("secondChat", 20));
        chatList.add(new Chat("thirdChat", 1030));
        chatList.add(new Chat("fourthChat", 40));
        chatList.add(new Chat("fifthChat", 1050));
        chatList.add(new Chat("aSixthChat", 1050)); //название чтобы при сортировке он был первее fifthChat
        List<Chat> updatedChatList = removeChatWithUsersCountLessThan(chatList, 1000);
        System.out.println(updatedChatList);
        sortByUsersCountAndName(updatedChatList);
        System.out.println(updatedChatList);
    }

    private static List<Chat> removeChatWithUsersCountLessThan(List<Chat> chatList, int usersNumber) {
        Iterator<Chat> iterator = chatList.iterator();
        while (iterator.hasNext()) {
            Chat chat = iterator.next();
            if (chat.getUsersCount() < usersNumber) {
                iterator.remove();
            }
        }
        return chatList;
    }

    private static void sortByUsersCountAndName(List<Chat> unsortedChatList) {
        unsortedChatList.sort(Comparator.comparing(Chat::getUsersCount).reversed().thenComparing(Chat::getName));
    }
}
