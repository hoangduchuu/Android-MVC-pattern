package net.hoangduchuu.demomvc.Model;

/**
 * Created by hoang on 7/7/17.
 */

public class User {
    private String age = "23", name = "Huu Hoang Mac dinh";

    public User() {
    }

    public User(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfoUser() {
        return name + "--" + age;
    }
}
