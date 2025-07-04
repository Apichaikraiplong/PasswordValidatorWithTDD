package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }



        

        // Test Case 2: รหัสผ่านมีแต่ตัวเลขควรจะ WEAK
        PasswordStrength result2 = PasswordValidator.validate("123456");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Password only numbers ");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }



        // Test Case 3: รหัสผ่านมีแต่ตัวอักษรควรจะ WEAK
        PasswordStrength result3 = PasswordValidator.validate("abcdef");
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passed: Password only String  ");
        } else {
            System.out.println("Test Case 3 FAILED: Expected WEAK but got " + result3);
        }
 


        // Test Case 4: รหัสผ่านที่ซ้ำกันควรจะ WEAK
        PasswordStrength result4 = PasswordValidator.validate("555555");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 Passed: Duplicate password ");
        } else {
            System.out.println("Test Case 4 FAILED: Expected WEAK but got " + result4);
        }



        // Test Case 5: รหัสผ่านที่ผสมตัวเลขและตัวอักษรควรจะ MEDIUM
        PasswordStrength result5 = PasswordValidator.validate("abc456");
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5 Passed: String and Password ");
        } else {
            System.out.println("Test Case 5 FAILED: Expected MEDIUM but got " + result5);
        }



        // Test Case 6: รหัสผ่านที่ผสมตัวเลขและตัวอักษรโดยมีตัวอักษรตัวใหญ่บางตัวควรจะ MEDIUM
        PasswordStrength result6 = PasswordValidator.validate("Abc456");
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 Passed: String and Password ");
        } else {
            System.out.println("Test Case 6 FAILED: Expected MEDIUM but got " + result6);
        }



        // Test Case 7: รหัสผ่านที่ผสมตัวเลขและตัวอักษรและอักษรพิเศษควรจะ Strong
        PasswordStrength result7 = PasswordValidator.validate("abc_56");
        if (result7 == PasswordStrength.STRONG) {
            System.out.println("Test Case 7 Passed: String and Password and Special character ");
        } else {
            System.out.println("Test Case 7 FAILED: Expected STRONG but got " + result7);
        }



        // Test Case 8: รหัสผ่านที่ผสมตัวเลขและตัวอักษรและอักษรพิเศษโดยมีตัวอักษรตัวใหญ่บางตัวควรจะ Strong
        PasswordStrength result8 = PasswordValidator.validate("Abc_56");
        if (result8 == PasswordStrength.STRONG) {
            System.out.println("Test Case 8 Passed: String and Password and Special character ");
        } else {
            System.out.println("Test Case 8 FAILED: Expected STRONG but got " + result8);
        }
        System.out.println("--------------------------------");
    }
}

