package kelompok2;

import javax.xml.transform.TransformerException;

public class TransformationEngine {

    private String lastScan = "";
    private State state = State.IDLE;

    private TajadolDevice tajadolDevice = new TajadolDevice();

    public String processScan(OOODriver driver) throws TransformerException {

        if (!driver.isComplete()) {
            throw new TransformerException("Slot belum lengkap!");
        }

        String currentKey = driver.getCombinationKey();

        switch (state) {

            case IDLE -> {
                lastScan = currentKey;
                state = State.TRANSFORMED;

                for (ComboRule rule : ComboRule.values()) {
                    if (rule.matches(driver)) {
                        String comboName = rule.getComboName();

                        if (comboName.equals("TAJADOL")) {
                            tajadolDevice.setTajadolForm(true);
                            return "Combo: TAJADOL | Ready";
                        }

                        return "Combo: " + comboName;
                    }
                }

                return "Mixed Combo";
            }

            case TRANSFORMED -> {
                if (currentKey.equals(lastScan)) {
                    state = State.CHARGED;
                    return "Scanning Charge!";
                }

                // combo berubah → reset
                state = State.IDLE;
                return processScan(driver);
            }

            case CHARGED -> {
                return "Already Charged!";
            }
        }

        return "Invalid State";
    }

    public String executeSkill() throws TransformerException {

        if (state != State.CHARGED) {
            throw new TransformerException("Belum di-charge!");
        }

        String result;

        if (tajadolDevice.isTajadolForm()) {
            result = tajadolDevice.spinAndScan();
        } else {
            result = "Normal Combo Finisher!";
        }

        // balik ke transformed setelah finisher
        state = State.TRANSFORMED;

        return result;
    }

    public TajadolDevice getTajadolDevice() {
        return tajadolDevice;
    }

    public void reset() {
        state = State.IDLE;
        lastScan = "";
        tajadolDevice.setTajadolForm(false);
    }
}