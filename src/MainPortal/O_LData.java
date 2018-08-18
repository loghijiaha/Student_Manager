package MainPortal;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class O_LData {
    private final int id;
    private final StringProperty fName;
    private final StringProperty lName;
    private final StringProperty medium;
    private final StringProperty maths;
    private final StringProperty science;
    private final StringProperty english;
    private final StringProperty tamil;
    private final StringProperty religion;
    private final StringProperty history;
    private final StringProperty b1;
    private final StringProperty b2;
    private final StringProperty b3;
    private final int districtRank;

    public O_LData(int id, String fName, String lName, String medium, String maths, String science, String english, String tamil, String religion, String history, String b1, String b2, String b3, int districtRank) {
        this.id = id;
        this.fName = new SimpleStringProperty(fName) ;
        this.lName = new SimpleStringProperty(lName) ;
        this.medium = new SimpleStringProperty(medium) ;
        this.maths = new SimpleStringProperty(maths) ;
        this.science = new SimpleStringProperty(science) ;
        this.english = new SimpleStringProperty(english) ;
        this.tamil = new SimpleStringProperty(tamil) ;
        this.religion = new SimpleStringProperty(religion) ;
        this.history = new SimpleStringProperty(history) ;
        this.b1 = new SimpleStringProperty(b1) ;
        this.b2 = new SimpleStringProperty(b2) ;
        this.b3 = new SimpleStringProperty(b3) ;
        this.districtRank = districtRank ;
    }

    public int getId() {
        return id;
    }

    public int getDistrictRank() {
        return districtRank;
    }

    public String getfName() {
        return fName.get();
    }

    public StringProperty fNameProperty() {
        return fName;
    }

    public String getlName() {
        return lName.get();
    }

    public StringProperty lNameProperty() {
        return lName;
    }

    public String getMedium() {
        return medium.get();
    }

    public StringProperty mediumProperty() {
        return medium;
    }

    public String getMaths() {
        return maths.get();
    }

    public StringProperty mathsProperty() {
        return maths;
    }

    public String getScience() {
        return science.get();
    }

    public StringProperty scienceProperty() {
        return science;
    }

    public String getEnglish() {
        return english.get();
    }

    public StringProperty englishProperty() {
        return english;
    }

    public String getTamil() {
        return tamil.get();
    }

    public StringProperty tamilProperty() {
        return tamil;
    }

    public String getReligion() {
        return religion.get();
    }

    public StringProperty religionProperty() {
        return religion;
    }

    public String getHistory() {
        return history.get();
    }

    public StringProperty historyProperty() {
        return history;
    }

    public String getB1() {
        return b1.get();
    }

    public StringProperty b1Property() {
        return b1;
    }

    public String getB2() {
        return b2.get();
    }

    public StringProperty b2Property() {
        return b2;
    }

    public String getB3() {
        return b3.get();
    }

    public StringProperty b3Property() {
        return b3;
    }

}
