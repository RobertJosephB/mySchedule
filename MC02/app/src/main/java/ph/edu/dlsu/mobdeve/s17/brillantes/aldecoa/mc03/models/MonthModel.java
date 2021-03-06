package ph.edu.dlsu.mobdeve.s17.brillantes.aldecoa.mc03.models;

import java.io.Serializable;
import java.util.ArrayList;

public class MonthModel implements Serializable {

    private String              monthNum;
    private String              monthName;
    private ArrayList<DayModel> days;

    public MonthModel (int num) {
        int i, j = 0;

        switch (num) {
            case 0: j = 31;     this.monthNum = "01";    this.monthName = "January";     break;
            case 1: j = 28;     this.monthNum = "02";    this.monthName = "February";    break;
            case 2: j = 31;     this.monthNum = "03";    this.monthName = "March";       break;
            case 3: j = 30;     this.monthNum = "04";    this.monthName = "April";       break;
            case 4: j = 31;     this.monthNum = "05";    this.monthName = "May";         break;
            case 5: j = 30;     this.monthNum = "06";    this.monthName = "June";        break;
            case 6: j = 31;     this.monthNum = "07";    this.monthName = "July";        break;
            case 7: j = 31;     this.monthNum = "08";    this.monthName = "August";      break;
            case 8: j = 30;     this.monthNum = "09";    this.monthName = "September";   break;
            case 9: j = 31;     this.monthNum = "10";    this.monthName = "October";     break;
            case 10: j = 30;    this.monthNum = "11";    this.monthName = "November";    break;
            case 11: j = 31;    this.monthNum = "12";    this.monthName = "December";    break;
        }

        this.days = new ArrayList<>();
        for (i = 1; i <= j; i++) {
            this.days.add(new DayModel(i, this.monthName));
        }
    }

    public String getMonthNum() {
        return monthNum;
    }

    public void setMonthNumber(String monthNum) {
        this.monthNum = monthNum;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public ArrayList<DayModel> getDays() {
        return days;
    }

    public void setDays(ArrayList<DayModel> days) {
        this.days = days;
    }
}
