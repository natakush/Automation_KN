package test_packege;

import com.github.javafaker.Faker;

public class Test_Class {
    public static void main(String[] args) {
        System.out.println(Faker.instance().artist().name());
    }
}
