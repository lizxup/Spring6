package org.example.spring6.client;

import org.example.spring6.web.UserAction;

public class Test {
    public static void main(String[] args) {
        UserAction userAction = new UserAction();
        userAction.deleteRequest();
    }
}
