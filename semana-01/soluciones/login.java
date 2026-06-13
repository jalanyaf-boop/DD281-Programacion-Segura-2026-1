import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, contrasena;
        int intentos = 0;
        boolean accesoConcedido = false;

        System.out.print("Ingrese su nombre de usuario: ");
        usuario = sc.nextLine();

        while (intentos < 3 && !accesoConcedido) {
            System.out.print("Ingrese su contraseña: ");
            contrasena = sc.nextLine();

            // Validaciones de seguridad
            if (contrasena.length() < 8) {
                System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
            } else if (!contrasena.matches(".*[0-9].*")) {
                System.out.println("Error: La contraseña debe contener al menos un número.");
            } else if (!contrasena.matches(".*[A-Z].*")) {
                System.out.println("Error: La contraseña debe contener al menos una letra mayúscula.");
            } else {
                System.out.println("Acceso concedido. Bienvenido, " + usuario + ".");
                accesoConcedido = true;
                break;
            }

            intentos++;
            if (intentos == 3) {
                System.out.println("Cuenta bloqueada por múltiples intentos fallidos.");
            }
        }

        sc.close();
    }
}
