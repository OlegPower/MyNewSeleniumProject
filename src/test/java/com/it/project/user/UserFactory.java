package com.it.project.user;

import com.it.project.Utils.Utils;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserFactory {
    private static ResourceBundle user = ResourceBundle.getBundle("user");

    public static Users getValidUser() {
        return new Users(
                user.getString("userName"),
                user.getString("password"),
                user.getString("email")
        );
    }

    public static ArrayList<Users> getRandomUser(int count) {
        return (ArrayList<Users>) Stream.generate(() ->
                new Users(Utils.getRandomString(10),
                        Utils.getRandomString(15),
                        Utils.getRandomString(10) + "@gmail.com"))
                .limit(count).collect(Collectors.toList());
    }
}
