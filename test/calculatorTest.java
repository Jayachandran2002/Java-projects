package exercisePackage.test;


import exercisePackage.CoreJavaPrograms.calculator;

class calculatorTest {

    @org.junit.jupiter.api.Test
    void addTest() {
        calculator c = new calculator();
        c.add(12,12);
    }
}