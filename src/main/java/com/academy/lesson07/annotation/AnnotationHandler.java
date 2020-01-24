package com.academy.lesson07.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationHandler {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MethodContainer methodContainer = new MethodContainer();
        Method[] methods = MethodContainer.class.getDeclaredMethods();
        for(Method method : methods) {
            if (method.isAnnotationPresent(Run.class))
                method.invoke(methodContainer);
        }
    }
}
