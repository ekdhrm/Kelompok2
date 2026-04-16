package kelompok2;

import javax.xml.transform.TransformerException;

public class OScanner {

    private final TransformationEngine engine;

    public OScanner(TransformationEngine engine) {
        this.engine = engine;
    }

    // scan utama (transform + charge)
    public String scan(OOODriver driver) throws TransformerException {
        return engine.processScan(driver);
    }

    // finisher
    public String scanFinisher() throws TransformerException {
        return engine.executeSkill();
    }

    // insert medal ke Tajadol Device
    public void scanInsertTajadolMedal(int slot, CoreMedal medal) throws TransformerException {
        engine.getTajadolDevice().insertMedalToSlot(slot, medal);
    }
}