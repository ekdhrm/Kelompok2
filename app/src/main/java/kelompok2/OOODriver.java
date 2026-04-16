package kelompok2;

public class OOODriver {
    CoreMedal head;
    CoreMedal arms;
    CoreMedal legs;

    public void insertMedal(CoreMedal medal) throws TransformationException{
        switch (medal.getType()) {
            case HEAD -> {
                if (head != null) throw new TransformationException("no head inserted");
                head = medal;
            }
            case ARMS -> {
                if (arms != null) throw new TransformationException("no arms inserted");
                arms = medal;
            }
            case LEGS -> {
                if (legs != null) throw new TransformationException("no legs inserted");
                legs = medal;
            }
            default -> throw new AssertionError();
        }
    }

    boolean isComplete(){
        return head != null && arms != null && legs != null;
    }

    public CoreMedal getHead() { return head; }
    public CoreMedal getArms() { return arms; }
    public CoreMedal getLegs() { return legs; }
    
    public String getCombinationKey() {
        return head.getName() + "-" + arms.getName() + legs.getName();
    }
}
