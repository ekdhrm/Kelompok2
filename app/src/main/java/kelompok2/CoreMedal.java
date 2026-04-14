package kelompok2;

public class CoreMedal {
    private String name;
    private MedalType type;
    
    public CoreMedal(String name, MedalType type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public MedalType getType() {
        return type;
    }

    public enum MedalType{HEAD, ARMS, LEGS}
}