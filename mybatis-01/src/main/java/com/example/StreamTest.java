package com.example;

import com.example.pojo.User;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: 崔少杰
 * @date: 2020/11/1
 * @version: 1.0.0
 */
public class StreamTest {

    @Test
    public void test() {

        List<User> userList = Arrays.asList(new User(1, "zhangsan", new Date(), "m", "北京"),
                new User(2, "lisi", new Date(), "f", "南京"),
                new User(3, "wangwu", new Date(), "m", "上海"),
                new User(4, "maliu", new Date(), "f", "深圳"),
                new User(5, "zhaoqi", new Date(), "m", "广州"),
                new User(6, "sunba", new Date(), "f", "重庆"));


        List<User> users = userList.stream().filter(user -> "f".equals(user.getSex())).collect(Collectors.toList());
        users.forEach(System.out::println);

        System.out.println("*******************");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        System.out.println("***********");

        System.out.println("zhangsan...");

        System.out.println("lisi...");


    }
}
