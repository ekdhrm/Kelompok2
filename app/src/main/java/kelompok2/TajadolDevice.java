package kelompok2;

import javax.xml.transform.TransformerException;

public class TajadolDevice {

    private static final int TOTAL_SLOTS = 7;

    private final CoreMedal[] medalSlots;
    private final int currentPivotIndex;
    private boolean isTajadolForm;

    public TajadolDevice() {
        this.medalSlots = new CoreMedal[TOTAL_SLOTS];
        this.currentPivotIndex = 0;
        this.isTajadolForm = false;
    }

    public void setTajadolForm(boolean isTajadolForm) {
        this.isTajadolForm = isTajadolForm;
    }

    public boolean isTajadolForm() {
        return isTajadolForm;
    }

    public void insertMedalToSlot(int slotIndex, CoreMedal medal) throws TransformerException {
        if (slotIndex < 0 || slotIndex >= TOTAL_SLOTS) {
            throw new TransformerException("Slot tidak valid!");
        }
        if (medalSlots[slotIndex] != null) {
            throw new TransformerException("Slot sudah terisi!");
        }
        medalSlots[slotIndex] = medal;
    }

    public String spinAndScan() {

        int scanned = 0;

        for (int i = 0; i < TOTAL_SLOTS; i++) {
            int index = (currentPivotIndex + i) % TOTAL_SLOTS;

            if (medalSlots[index] != null) {
                scanned++;
            }
        }

        double power = (double) scanned / TOTAL_SLOTS * 100;

        return "Tajadol Strike! Scanned: " + scanned + "/7 | Power: " + String.format("%.2f", power) + "%";
    }
}