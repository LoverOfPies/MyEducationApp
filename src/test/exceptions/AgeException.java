package test.exceptions;

public class AgeException extends Exception {

    private int age;

    public AgeException(String message, int age){
        super(message);
        this.age = age;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
