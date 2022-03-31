import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// 1] Jméno klienta — budeme ukládat jména a příjmení klientů
        String clientName = "Jan Novak";

        // 2] Počet nákupů — kolik zákazníků si koupilo tento výrobek
        int purchases = 8;

        // 3] Název města, kde firma sídlí
        String city = "Prague";

        // 4] Spotřeba vozidla v litrech na 100 km
        double fuelConsumption = 6.4;

        // 5] Množství kabelů — délka UTP kabelu na skladě v metrech
        double utpCableLength = 540.5;

        // 6] Datum narození klienta
        LocalDate clientBirthdate = LocalDate.of(1989, 3, 23);

        // Registrační značka vozidla („SPZ“)
        String vehicleRegistrationCode = "B12 5137";

        // IP adresa verze 4
        String ipAddress = "331.893.12.90";

    }
}
