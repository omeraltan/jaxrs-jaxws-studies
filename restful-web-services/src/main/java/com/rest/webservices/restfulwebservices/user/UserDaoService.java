package com.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Ömer", LocalDate.now().minusYears(40)));
        users.add(new User(++usersCount, "Ebru", LocalDate.now().minusYears(35)));
        users.add(new User(++usersCount, "Adil", LocalDate.now().minusYears(12)));
        users.add(new User(++usersCount, "Elif", LocalDate.now().minusYears(6)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }

    public User deleteById(int id) {
        User user = findOne(id);
        users.remove(user);
        return user;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

}
