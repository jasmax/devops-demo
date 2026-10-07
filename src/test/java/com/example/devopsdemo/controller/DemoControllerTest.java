package com.example.devopsdemo.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoControllerTest {

    @Test
    void helloReturnsExpectedMessage() {
        DemoController controller = new DemoController();
        assertEquals("DevOps demo application is running!", controller.hello());
    }
}
