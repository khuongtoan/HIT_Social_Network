package controller;

import model.User;

public class UserSession {

private static User currentUser = new User("toan", "12", "kxydumobo@gmail.com", "ban thich an gi", "tao");

public static User getCurrentUser() {
    return currentUser;
}

public static void setCurrentUser(User user) {
    currentUser = user;
}
}
