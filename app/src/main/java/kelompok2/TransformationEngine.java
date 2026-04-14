package kelompok2;

import javax.xml.transform.TransformerException;

public class TransformationEngine {
    private String lastScan = "";

    public String processScan(OOODriver driver) throws TransformerException {
        if (!driver.isComplete()) {
            throw new TransformerException("Slot belum lengkap!");
        }

        String currentKey = driver.getCombinationKey();

        if (currentKey.equals(lastScan)){
            return "initiating Scanning Charge";
        }

        lastScan = currentKey;

        for (ComboRule rule : ComboRule.values()) {
            if (rule.matches(driver)) {
                return "Combo: " + rule.getComboName();
            }
        }
        return "Mixed Combo";
    }
}
