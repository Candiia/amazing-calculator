import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: 
                    int num1=leerEnteroEntrada;
                    int nm2=leerEnteroEntrada;

                    System.out.println("Solución: " + suma(num1 + num2));

                    break;
            case 2: 
                    int num1=leerEnteroEntrada;
                    int nm2=leerEnteroEntrada;

                    System.out.println("Solución: " + resta(num1 - num2));

                    break;
            case 3: 
                    int num1=leerEnteroEntrada;
                    int nm2=leerEnteroEntrada;

                    System.out.println("Solución: " + multiplicacion(num1 * num2));
                    break;
            case 4:
                    int num1=leerEnteroEntrada;
                    int nm2=leerEnteroEntrada;

                    System.out.println("Solución: " + divisionEntera(num1 / num2));
                    break;
            case 5: 
                    int num1=leerEnteroEntrada;
                    int nm2=leerEnteroEntrada;

                    System.out.println("Solución: " + divisionEntera(num1 / num2));
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}