package core;

import java.time.LocalDateTime;
import java.util.Objects;

public class Currency {
    private final int Cur_ID;
    private final long Cur_ParentID;
    private final String Cur_Abbreviation;
    private final String Cur_Name;
    private final String Cur_Name_Bel;
    private final String Cur_Name_Eng;
    private final String Cur_QuotName;
    private final String Cur_QuotName_Bel;
    private final String Cur_QuotName_Eng;
    private final String Cur_NameMulti;
    private final String Cur_Name_BelMulti;
    private final String Cur_Name_EngMulti;
    private final long Cur_Scale;
    private final long Cur_Periodicity;
    private LocalDateTime Cur_DateStart;
    private LocalDateTime Cur_DateEnd;

    public Currency(int cur_ID, long cur_ParentID, String cur_Abbreviation, String cur_Name, String cur_Name_Bel,
                    String cur_Name_Eng, String cur_QuotName, String cur_QuotName_Bel, String cur_QuotName_Eng,
                    String cur_NameMulti, String cur_Name_BelMulti, String cur_Name_EngMulti,
                    long cur_Scale, long cur_Periodicity, LocalDateTime cur_DateStart, LocalDateTime cur_DateEnd) {
        Cur_ID = cur_ID;
        Cur_ParentID = cur_ParentID;
        Cur_Abbreviation = cur_Abbreviation;
        Cur_Name = cur_Name;
        Cur_Name_Bel = cur_Name_Bel;
        Cur_Name_Eng = cur_Name_Eng;
        Cur_QuotName = cur_QuotName;
        Cur_QuotName_Bel = cur_QuotName_Bel;
        Cur_QuotName_Eng = cur_QuotName_Eng;
        Cur_NameMulti = cur_NameMulti;
        Cur_Name_BelMulti = cur_Name_BelMulti;
        Cur_Name_EngMulti = cur_Name_EngMulti;
        Cur_Scale = cur_Scale;
        Cur_Periodicity = cur_Periodicity;
        Cur_DateStart = cur_DateStart;
        Cur_DateEnd = cur_DateEnd;
    }

    public int getCur_ID() {
        return Cur_ID;
    }

    public long getCur_ParentID() {
        return Cur_ParentID;
    }

    public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

    public String getCur_Name() {
        return Cur_Name;
    }

    public String getCur_Name_Bel() {
        return Cur_Name_Bel;
    }

    public String getCur_Name_Eng() {
        return Cur_Name_Eng;
    }

    public String getCur_QuotName() {
        return Cur_QuotName;
    }

    public String getCur_QuotName_Bel() {
        return Cur_QuotName_Bel;
    }

    public String getCur_QuotName_Eng() {
        return Cur_QuotName_Eng;
    }

    public String getCur_NameMulti() {
        return Cur_NameMulti;
    }

    public String getCur_Name_BelMulti() {
        return Cur_Name_BelMulti;
    }

    public String getCur_Name_EngMulti() {
        return Cur_Name_EngMulti;
    }

    public long getCur_Scale() {
        return Cur_Scale;
    }

    public long getCur_Periodicity() {
        return Cur_Periodicity;
    }

    public LocalDateTime getCur_DateStart() {
        return Cur_DateStart;
    }

    public void setCur_DateStart(LocalDateTime cur_DateStart) {
        Cur_DateStart = cur_DateStart;
    }

    public LocalDateTime getCur_DateEnd() {
        return Cur_DateEnd;
    }

    public void setCur_DateEnd(LocalDateTime cur_DateEnd) {
        Cur_DateEnd = cur_DateEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Cur_ID == currency.Cur_ID && Cur_ParentID == currency.Cur_ParentID && Cur_Scale == currency.Cur_Scale && Cur_Periodicity == currency.Cur_Periodicity && Objects.equals(Cur_Abbreviation, currency.Cur_Abbreviation) && Objects.equals(Cur_Name, currency.Cur_Name) && Objects.equals(Cur_Name_Bel, currency.Cur_Name_Bel) && Objects.equals(Cur_Name_Eng, currency.Cur_Name_Eng) && Objects.equals(Cur_QuotName, currency.Cur_QuotName) && Objects.equals(Cur_QuotName_Bel, currency.Cur_QuotName_Bel) && Objects.equals(Cur_QuotName_Eng, currency.Cur_QuotName_Eng) && Objects.equals(Cur_NameMulti, currency.Cur_NameMulti) && Objects.equals(Cur_Name_BelMulti, currency.Cur_Name_BelMulti) && Objects.equals(Cur_Name_EngMulti, currency.Cur_Name_EngMulti) && Objects.equals(Cur_DateStart, currency.Cur_DateStart) && Objects.equals(Cur_DateEnd, currency.Cur_DateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cur_ID, Cur_ParentID, Cur_Abbreviation, Cur_Name, Cur_Name_Bel, Cur_Name_Eng, Cur_QuotName, Cur_QuotName_Bel, Cur_QuotName_Eng, Cur_NameMulti, Cur_Name_BelMulti, Cur_Name_EngMulti, Cur_Scale, Cur_Periodicity, Cur_DateStart, Cur_DateEnd);
    }

    @Override
    public String toString() {
        return "Currency{" +
                "Cur_ID=" + Cur_ID +
                ", Cur_ParentID=" + Cur_ParentID +
                ", Cur_Abbreviation='" + Cur_Abbreviation + '\'' +
                ", Cur_Name='" + Cur_Name + '\'' +
                ", Cur_Name_Bel='" + Cur_Name_Bel + '\'' +
                ", Cur_Name_Eng='" + Cur_Name_Eng + '\'' +
                ", Cur_QuotName='" + Cur_QuotName + '\'' +
                ", Cur_QuotName_Bel='" + Cur_QuotName_Bel + '\'' +
                ", Cur_QuotName_Eng='" + Cur_QuotName_Eng + '\'' +
                ", Cur_NameMulti='" + Cur_NameMulti + '\'' +
                ", Cur_Name_BelMulti='" + Cur_Name_BelMulti + '\'' +
                ", Cur_Name_EngMulti='" + Cur_Name_EngMulti + '\'' +
                ", Cur_Scale=" + Cur_Scale +
                ", Cur_Periodicity=" + Cur_Periodicity +
                ", Cur_DateStart=" + Cur_DateStart +
                ", Cur_DateEnd=" + Cur_DateEnd +
                '}';
    }

}
