package kelompok2;

public class OScanner {
    private TransformationEngine engine;

    public OScanner(TransformationEngine engine){
        this.engine = engine;
    }

    public String scan(OOODriver driver) throws TransformationException{
        return engine.processScan(driver);
    }
}
