package net.hoangduchuu.demomvc.Controller;

import net.hoangduchuu.demomvc.Model.User;

/**
 * Created by hoang on 7/7/17.
 */

public class MainActivityController {
    User user;

    public MainActivityController() {
        user = new User();
    }

    public String getInfoUser() {
        return user.getInfoUser();
    }
}
