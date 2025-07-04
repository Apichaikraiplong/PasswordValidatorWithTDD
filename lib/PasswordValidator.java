package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องรับค่าเพื่อการตรวจสอบ
     * @return PasswordStrength INVALID และ อื่นๆ
     * 
     */


    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        if (password==null || password.length()<=3) 
            return PasswordStrength.INVALID;

            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasDigit = false;
            boolean hasSpecial = false;

            for (char c : password.toCharArray()) {
                if (Character.isLowerCase(c)) 
                    hasLower = true;
                else if(Character.isUpperCase(c))
                    hasUpper = true;
                else if(Character.isDigit(c))
                    hasDigit = true;
                else 
                    hasSpecial = true;
            }

            
            if(hasLower && !hasDigit ) return PasswordStrength.WEAK;
            if(hasDigit && !hasLower ) return PasswordStrength.WEAK;
            if(hasUpper && hasDigit && !hasSpecial ) return PasswordStrength.MEDIUM;
            if(hasLower && hasDigit && !hasSpecial ) return PasswordStrength.MEDIUM;
            if(hasLower && hasDigit && hasSpecial && !hasUpper  ) return PasswordStrength.STRONG;
            if(hasLower && hasDigit && hasSpecial && hasUpper  ) return PasswordStrength.STRONG;
            
            return null;
    
        }
        
    }
