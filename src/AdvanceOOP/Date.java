package AdvanceOOP;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day,int month,int year)  {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public  boolean validateday()  {
        if (month ==2 && day> 31)  {
            System.out.println("february does not exceed 29");
        }
        if (month==4 && day>30 || month==7 && day>30 || month==9 && day >30 || month ==11 && day>30){
            System.out.println("does not exist");
        }
       return true;
    }
    public boolean validatemonth() {
        if (day <1 && month >12 ) {
            System.out.println("out of date");
        }
        return true;
    }
    public boolean validateyear() {
        return year % 4 ==0;
    }
}
