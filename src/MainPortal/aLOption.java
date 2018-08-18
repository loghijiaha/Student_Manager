package MainPortal;

public enum aLOption {
    Maths,Bio,Physics,Chemistry,Accounting,Logic,IT,Business,HinduCulture,English,Economics;
    public String value(){
        return name();
    }
    public static aLOption fromValue(String v){
        return valueOf(v);
    }

}
