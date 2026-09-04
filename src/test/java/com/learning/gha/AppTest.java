package com.learning.gha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

    private final App app = new App();

    @Test
    void greetsNamedUser() {
        assertEquals("Hello, Aru!", app.greet("Aru"));
    }

    @Test
    void greetsWorldWhenNameMissing() {
        assertEquals("Hello, World!", app.greet(null));
        assertEquals("Hello, World!", app.greet("  "));
    }

    @Test
    void addsNumbers() {
        assertEquals(5, app.add(2, 3));
    }
}
