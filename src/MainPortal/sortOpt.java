package MainPortal;

public enum sortOpt {
    id,firstName,lastName;
    public String value(){
        return name();
    }
    public static sortOpt fromValue(String v){
        return valueOf(v);
    }
}
