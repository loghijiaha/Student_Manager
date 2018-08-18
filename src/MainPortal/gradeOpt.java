package MainPortal;

public enum gradeOpt {
    A,B,C,S,F;
    public String value(){
        return name();
    }
    public static gradeOpt fromValue(String v){
        return valueOf(v);
    }
}
