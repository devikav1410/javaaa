class AgeValidator {
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above to proceed.");
        } else {
            System.out.println("Access granted. Age: " + age);
        }
    }
}

public class ThrowThrowsDemo {
    public static void main(String[] args) {
        try {
            AgeValidator.checkAge(16);  
            AgeValidator.checkAge(20);  
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
