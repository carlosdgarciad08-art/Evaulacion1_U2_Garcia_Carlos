
public class Parqueadero {

    public static int leerMinutos(Scanner sc) {
        int minutos;

        do {
            System.out.print("Ingrese los minutos: ");
            minutos = sc.nextInt();

            if (minutos < 1 || minutos > 1440) {
                System.out.println("Error: ingrese un valor entre 1 y 1440.");
            }

        } while (minutos < 1 || minutos > 1440);

        return minutos;
    }

    public static int horasCobradas(int minutos) {
        return (minutos + 59) / 60;
    }

    // Calcula la tarifa según el tipo de vehículo
    public static double tarifa(int horas, char tipo) {
        double costoHora;

        if (tipo == 'A' || tipo == 'a') {
            costoHora = 1.00;
        } else {
            costoHora = 0.50;
        }

        double total = horas * costoHora;

        // Descuento del 20% si supera las 8 horas
        if (horas > 8) {
            total = total * 0.80;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);

        System.out.print("Tipo de vehículo (A = Auto, M = Moto): ");
        char tipo = sc.next().charAt(0);

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.println("\n--- FACTURA DE PARQUEADERO ---");
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas cobradas: " + horas);
        System.out.printf("Total a pagar: $%.2f%n", total);

        sc.close();
    }
}
