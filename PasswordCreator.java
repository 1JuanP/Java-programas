import java.util.Scanner;

public class PasswordCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        
                while (true) {
                    System.out.print("Dame tu contraseña: ");
                    String password = scanner.nextLine();
                    String errorMessage = "";
        
                    if (password.length() < 10) {
                        errorMessage += "La contraseña debe tener al menos 10 caracteres.\n";
                    }
        
                    boolean Lowercase = false;
                    boolean Uppercase = false;
                    boolean numero = false;
                    boolean carecter = false;
        
                    for (char c : password.toCharArray()) {
                        if (Character.isLowerCase(c)) {
                            Lowercase = true;
                        } else if (Character.isUpperCase(c)) {
                            Uppercase = true;
                        } else if (Character.isDigit(c)) {
                            numero = true;
                        } else if ("!@#$%^&*()_+-=[]{};:'\",.<>?/|\\`~".contains(String.valueOf(c))) {
                            carecter = true;
                        }
                    }
        
                    if (!Lowercase) {
                        errorMessage += "La contraseña debe tener por lo menos una letra minúscula.\n";
                    }
                    if (!Uppercase) {
                        errorMessage += "La contraseña debe tener por lo menos una letra mayúscula.\n";
                    }
                    if (!numero) {
                        errorMessage += "La contraseña debe tener por lo menos un número.\n";
                    }
                    if (!carecter) {
                        errorMessage += "La contraseña debe tener por lo menos un carácter especial.\n";
                    }
        
                    if (!errorMessage.isEmpty()) {
                        System.out.println("Error: La contraseña no cumple con los siguientes requisitos:\n" + errorMessage);
                    } else {
                        System.out.println("La contraseña es segura.");
                        break; 
                    }
                }
        
                scanner.close();
            }
        }
        


      
        
