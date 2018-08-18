package MainPortal;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class A_LData {
    private final int id;
    private final StringProperty fName;
    private final StringProperty lName;
    private final StringProperty maths;
    private final StringProperty bio;
    private final StringProperty physics;
    private final StringProperty chemistry;
    private final StringProperty acc;
    private final StringProperty logic;
    private final StringProperty it;
    private final StringProperty business;
    private final StringProperty hinCul;
    private final StringProperty eng;
    private final StringProperty eco;
    private final int dRank;
    private final int iRank;

    public int getId() {
        return id;
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

    public String getMaths() {
        return maths.get();
    }

    public StringProperty mathsProperty() {
        return maths;
    }

    public String getBio() {
        return bio.get();
    }

    public StringProperty bioProperty() {
        return bio;
    }

    public String getPhysics() {
        return physics.get();
    }

    public StringProperty physicsProperty() {
        return physics;
    }

    public String getChemistry() {
        return chemistry.get();
    }

    public StringProperty chemistryProperty() {
        return chemistry;
    }

    public String getAcc() {
        return acc.get();
    }

    public StringProperty accProperty() {
        return acc;
    }

    public String getLogic() {
        return logic.get();
    }

    public StringProperty logicProperty() {
        return logic;
    }

    public String getIt() {
        return it.get();
    }

    public StringProperty itProperty() {
        return it;
    }

    public String getBusiness() {
        return business.get();
    }

    public StringProperty businessProperty() {
        return business;
    }

    public String getHinCul() {
        return hinCul.get();
    }

    public StringProperty hinCulProperty() {
        return hinCul;
    }

    public String getEng() {
        return eng.get();
    }

    public StringProperty engProperty() {
        return eng;
    }

    public String getEco() {
        return eco.get();
    }

    public StringProperty ecoProperty() {
        return eco;
    }

    public int getDRank() {
        return dRank;
    }

    public int getIRank() {
        return iRank;
    }

    public A_LData(int id, String fName, String lName, String maths, String bio, String physics, String chemistry, String acc, String logic, String it, String business, String hinCul, String eng, String eco, int dRank, int iRank) {
        this.id = id;
        this.fName = new SimpleStringProperty(fName);
        this.lName = new SimpleStringProperty(lName) ;
        this.maths =new SimpleStringProperty(maths) ;
        this.bio = new SimpleStringProperty(bio) ;
        this.physics = new SimpleStringProperty(physics) ;
        this.chemistry = new SimpleStringProperty(chemistry) ;
        this.acc = new SimpleStringProperty(acc) ;
        this.logic = new SimpleStringProperty(logic) ;
        this.it = new SimpleStringProperty(it) ;
        this.business = new SimpleStringProperty(business) ;
        this.hinCul = new SimpleStringProperty(hinCul) ;
        this.eng = new SimpleStringProperty(eng) ;
        this.eco = new SimpleStringProperty(eco) ;
        this.dRank = dRank ;
        this.iRank = iRank;

    }
}
