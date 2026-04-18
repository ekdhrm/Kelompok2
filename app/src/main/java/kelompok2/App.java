package kelompok2;

import javax.xml.transform.TransformerException;

public class App {

    public static void main(String[] args) throws TransformerException, TransformationException {

        TransformationEngine engine = new TransformationEngine();
        OScanner scanner = new OScanner(engine);
        OOODriver driver = new OOODriver();

        // Medal setup
        CoreMedal taka = new CoreMedal("Taka", CoreMedal.MedalType.HEAD);
        CoreMedal tora = new CoreMedal("Tora", CoreMedal.MedalType.ARMS);
        CoreMedal batta = new CoreMedal("Batta", CoreMedal.MedalType.LEGS);

        CoreMedal kujaku = new CoreMedal("Kujaku", CoreMedal.MedalType.ARMS);
        CoreMedal condor = new CoreMedal("Condor", CoreMedal.MedalType.LEGS);

        CoreMedal kuwagata = new CoreMedal("Kuwagata", CoreMedal.MedalType.HEAD);
        CoreMedal kamakiri = new CoreMedal("Kamakiri", CoreMedal.MedalType.ARMS);
        CoreMedal cobra = new CoreMedal("Cobra", CoreMedal.MedalType.HEAD);

        System.out.println("=== OOO DRIVER SIMULATOR ===");

        try {

            // =========================================
            // 1. FULL COMBO (TATOBA) -> EJECT
            // =========================================
            System.out.println("\n[1] Full Medal Combo (Tatoba)");

            System.out.println("Insert medal OOODriver...");
            driver.insertMedal(taka);
            driver.insertMedal(tora);
            driver.insertMedal(batta);

            System.out.println("Scanning...");
            System.out.println("Hasil: " + scanner.scan(driver));

            System.out.println("Ejecting...");
            driver.reset();
            engine.reset();

            // =========================================
            // 2. MIXED COMBO -> SCANNING CHARGE -> EJECT
            // =========================================
            System.out.println("\n[2] Mixed Medal Combo + Scanning Charge");

            System.out.println("Insert medal OOODriver...");
            driver.insertMedal(taka);
            driver.insertMedal(tora);
            driver.insertMedal(condor);

            System.out.println("Scanning...");
            System.out.println("Hasil: " + scanner.scan(driver));

            System.out.println("Scanning Charge...");
            System.out.println("Charge Result: " + scanner.scan(driver));

            System.out.println("Ejecting...");
            driver.reset();
            engine.reset();

            // =========================================
            // 3. TAJADOL COMBO + FINISHER -> EJECT
            // =========================================
            System.out.println("\n[3] Tajadol Medal Combo");

            System.out.println("Insert medal OOODriver...");
            driver.insertMedal(taka);
            driver.insertMedal(kujaku);
            driver.insertMedal(condor);

            System.out.println("Scanning...");
            System.out.println("Hasil: " + scanner.scan(driver));

            System.out.println("Insert medal ke Tajadol Device...");
            scanner.scanInsertTajadolMedal(0, kuwagata);
            scanner.scanInsertTajadolMedal(1, tora);
            scanner.scanInsertTajadolMedal(2, batta);
            scanner.scanInsertTajadolMedal(3, kamakiri);
            scanner.scanInsertTajadolMedal(4, cobra);

            System.out.println("Scanning again...");
            System.out.println("Hasil: " + scanner.scan(driver));

            System.out.println("Scanning Tajadol Device...");
            System.out.println("Device Result: " + scanner.scanFinisher());

            System.out.println("Ejecting...");
            driver.reset();
            engine.reset();

            // =========================================
            // 4. INVALID COMBO -> EJECT
            // =========================================
            System.out.println("\n[4] Invalid Medal Combo");

            // Contoh invalid: 2 HEAD + 1 ARMS
            driver.insertMedal(taka);
            driver.insertMedal(kuwagata);
            driver.insertMedal(tora);

            System.out.println("Scanning...");
            System.out.println("Hasil: " + scanner.scan(driver));

            System.out.println("Ejecting...");
            driver.reset();
            engine.reset();

        } catch (TransformerException | TransformationException e) {
            System.out.println("Invalid: " + e.getMessage());
        }
    }
}