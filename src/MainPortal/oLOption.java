package MainPortal;

public enum oLOption {
    maths,science,eng,tamil,religion,history,b1,b2,b3;
    public String value(){
        return name();
    }
    public static oLOption fromValue(String v){
        return valueOf(v);
    }
}
