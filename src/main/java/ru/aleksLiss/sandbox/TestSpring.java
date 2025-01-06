package ru.aleksLiss.sandbox;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classical", ClassicalMusic.class);
        classicalMusic.getSong();

        context.close();
    }
}
