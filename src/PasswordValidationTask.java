public class PasswordValidationTask {

    //3.String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    // 1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    // if all requirements above are met, the method returns true, otherwise returns  false


    public static void main(String[] args) {

        String password = "hello123!";

        System.out.println("validPassword(password) = " + validPassword(password));

    }


    public static boolean validPassword(String s){

        boolean isValidPassword = false;

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial =false;


        if(s.length()>=6 && !s.isEmpty()){

        for (int i = 0; i < s.length(); i++) {

                if(Character.isLowerCase(s.charAt(i))){
                    hasLower=true;
                }else if(Character.isUpperCase(s.charAt(i))){
                    hasUpper = true;
                }else if(Character.isDigit(s.charAt(i))){
                    hasDigit = true;
                }else{
                    hasSpecial = true;
                }
        }
        }else{
            return isValidPassword;//false
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;

    }







}
