package kelompok2;

public enum ComboRule {
    TATOBA("Taka", "Tora", "Batta"),
    GATAKIRIBA("Kuwagata", "Kamakiri", "Batta"),
    LATORARTAR("Lion", "Tora", "Cheetah"),
    SAGOHZO("Sai", "Gorilla", "Zou"),
    SHAUTA("Shachi", "Unagi", "Tako"),
    TAJADOL("Taka", "Kujaku", "Condor"),
    PUTOTYRA("Ptera", "Tricera", "Tyranno"),
    BURAKAWANI("Cobra", "Kame", "Wani");

    String head;
    String arms;
    String legs;

    ComboRule(String head, String arms, String legs){
        this.head = head;
        this.arms = arms;
        this.legs = legs;
    }
    boolean matches(OOODriver driver){
        return driver.getHead().getName().equals(head) &&
               driver.getArms().getName().equals(arms) &&
               driver.getLegs().getName().equals(legs);
    }

    public String getComboName(){
        return this.name();
    }
}
