package de.fuas.algorithms;

import java.lang.reflect.Method;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Tag;

public class DisplayNameGeneratorMethodTag extends DisplayNameGenerator.Standard {

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        Tag[] checks = testMethod.getDeclaredAnnotationsByType(Tag.class);
        String name = super.generateDisplayNameForMethod(testClass, testMethod);

        if (checks.length > 0) {
            return checks[0].value() + ": " + name;
        } else {
            return name;
        }
    }

}
