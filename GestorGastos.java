import java.util.ArrayList;
import java.util.Scanner;

public class GestorGastos
{
    public static void main(String[] args)
    {
        ArrayList<String> conceptos = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir)
        {
            System.out.println("\n--- MI GESTOR DE GASTOS ---");
            System.out.println("1. Añadir gasto");
            System.out.println("2. Ver lista de gastos");
            System.out.println("3. Salir");
            System.out.println("4. Calcular total gastado");
            System.out.print("Elige una opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            if (opcion == 1)
            {
                System.out.print("Concepto: ");
                conceptos.add(sc.nextLine());
                System.out.print("Monto: ");
                montos.add(sc.nextDouble());
                System.out.println("¡Gasto guardado!");
            }
            else if (opcion == 2)
            {
                System.out.println("\n--- Lista de Gastos ---");
                for (int i = 0; i < conceptos.size(); i++)
                {
                    System.out.println("- " + conceptos.get(i) + ": $" + montos.get(i));
                }
            }
            else if (opcion == 3)
            {
                salir = true;
                System.out.println("Cerrando programa...");
            }
            else if (opcion == 4)
            {
                double total = 0;
                for (double monto : montos)
                {
                    total += monto;
                }
                System.out.println("\n--- Total Gastado ---");
                System.out.println("El total gastado es: $" + total);
            }
        }
        sc.close();
    }
}