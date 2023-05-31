package core;

import java.time.LocalDate;
import java.util.Objects;

public class StatisticCurrency {
    private int Cur_ID;
    private LocalDate Date;
    private String Cur_Abbreviation;
    private long Cur_Scale;
    private String Cur_Name;
    private long Cur_OfficialRate;

    public StatisticCurrency() {
    }

    public StatisticCurrency(int cur_ID, LocalDate date, String cur_Abbreviation, long cur_Scale, String cur_Name, long cur_OfficialRate) {
        Cur_ID = cur_ID;
        Date = date;
        Cur_Abbreviation = cur_Abbreviation;
        Cur_Scale = cur_Scale;
        Cur_Name = cur_Name;
        Cur_OfficialRate = cur_OfficialRate*10000;
    }

    public int getCur_ID() {
        return Cur_ID;
    }

    public void setCur_ID(int cur_ID) {
        Cur_ID = cur_ID;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getCur_Abbreviation() {
        return Cur_Abbreviation;
    }

    public void setCur_Abbreviation(String cur_Abbreviation) {
        Cur_Abbreviation = cur_Abbreviation;
    }

    public long getCur_Scale() {
        return Cur_Scale;
    }

    public void setCur_Scale(long cur_Scale) {
        Cur_Scale = cur_Scale;
    }

    public String getCur_Name() {
        return Cur_Name;
    }

    public void setCur_Name(String cur_Name) {
        Cur_Name = cur_Name;
    }

    public long getCur_OfficialRate() {
        return Cur_OfficialRate;
    }

    public void setCur_OfficialRate(long cur_OfficialRate) {
        Cur_OfficialRate = cur_OfficialRate*10000;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatisticCurrency that = (StatisticCurrency) o;
        return Cur_ID == that.Cur_ID && Cur_Scale == that.Cur_Scale && Cur_OfficialRate == that.Cur_OfficialRate && Objects.equals(Date, that.Date) && Objects.equals(Cur_Abbreviation, that.Cur_Abbreviation) && Objects.equals(Cur_Name, that.Cur_Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Cur_ID, Date, Cur_Abbreviation, Cur_Scale, Cur_Name, Cur_OfficialRate);
    }

    @Override
    public String toString() {
        return "StatisticCurrency{" +
                "Cur_ID=" + Cur_ID +
                ", Date=" + Date +
                ", Cur_Abbreviation='" + Cur_Abbreviation + '\'' +
                ", Cur_Scale=" + Cur_Scale +
                ", Cur_Name='" + Cur_Name + '\'' +
                ", Cur_OfficialRate=" + Cur_OfficialRate +
                '}';
    }
}
