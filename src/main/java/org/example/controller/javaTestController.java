package org.example.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class javaTestController {
    private int data;

    public static void main(String[] args) {
        System.out.println("test world");

        javaTestController controller = new javaTestController();
        controller.setData(20);
        System.out.println(controller.getData());
    }

}
