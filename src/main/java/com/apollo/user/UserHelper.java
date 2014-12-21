package com.apollo.user;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created by alpereninal on 21/12/14.
 */
public class UserHelper {

    public static String getUserIdOfLoggedInUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDao) {
            UserDao user = (UserDao) principal;
            return user.getEmail();
        }
        else if (principal instanceof User) {
            return ((User) principal).getUsername();
        } else {
            throw new RuntimeException("Do not know how to handle {} " + principal.getClass());
        }
    }

}
