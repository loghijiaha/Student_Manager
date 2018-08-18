package MainPortal;

public enum medOpt {
    Tamil,English;
    public String value(){
        return name();
    }
    public static medOpt fromValue(String v){
        return valueOf(v);
    }
}
