package projects.project_1; // this is just because i have my project in a folder

/*Brian LewConklin
 * the class Date provides a way to store the date of any specific day between 1800 and 2200. it includes
 * methods to increment the date, compare dates, and display dates in month day year format
 */

public class Date {
    
    // stores the day of the month
    private int day = 1;
    
    // stores an int representation of the month 
    private int month = 1;

    // stores the year as an int
    private int year = 1800;

    // stores whether or not the current day is the last day of the month
    private boolean isLastDayOfMonth = false;

    // this method is checking if the day month and year provided is valid and assigning the inputs
    // to those fields as well as isLastDayOfMonth
    public Date(int day, int month, int year) {
        
        if (month == 1) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 2) {
            if (day > 28){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 3) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 4) {
            if (day > 30){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 5) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 6) {
            if (day > 30){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 7) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 8) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 9) {
            if (day > 30){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 10) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 11) {
            if (day > 30){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 12) {
            if (day > 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        }    

        this.day = day;
        if (day < 1) {
            this.day = 1;
        }
        if (month == 1) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 2) {
            if (day > 28 || day == 28){
                this.day = 28;
                isLastDayOfMonth = true;
            }
        } else if (month == 3) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 4) {
            if (day > 30 || day == 30){
                this.day = 30;
                isLastDayOfMonth = true;
            }
        } else if (month == 5) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 6) {
            if (day > 30 || day == 30){
                this.day = 30;
                isLastDayOfMonth = true;
            }
        } else if (month == 7) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 8) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 9) {
            if (day > 30 || day == 30){
                this.day = 30;
                isLastDayOfMonth = true;
            }
        } else if (month == 10) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        } else if (month == 11) {
            if (day > 30 || day == 30){
                this.day = 30;
                isLastDayOfMonth = true;
            }
        } else if (month == 12) {
            if (day > 31 || day == 31){
                this.day = 31;
                isLastDayOfMonth = true;
            }
        }

        this.month = month;
        if (month < 1) {
            this.month = 1;
        } else if (month > 12) {
            this.month = 12;
        }
        
        this.year = year;
        if (year < 1800) {
            this.year = 1800;
        } else if (year > 2200) {
            this.year = 2200;
        }

    }
    
    // gets the current month
    public int getMonth() {
        return this.month;
    }

    // gets the current day
    public int getDay() {
        return this.day;
    }

    // gets the current year
    public int getYear() {
        return this.year;
    }

    // returns the number of days in the month corresponding to the int input
    public static int daysPerMonth(int numMonth) {
        switch(numMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }

    // compares this and the input and returns true if they are equal or if the input date is 
    // larger and this.day is the last day of the month
    public boolean sameEffectiveDayAs(Date date) {
        if (date.day == this.day) {
            return true;
        } else if (date.day > this.day && this.isLastDayOfMonth) {
            return true;
        }
        return false;
    }

    // increments the date by 1 day
    public void incrementeDate() {
        if (this.isLastDayOfMonth) {
            this.month += 1;
            this.day = 1;
            this.isLastDayOfMonth = false;
            if (this.month > 12) {
                this.month = 1;
                this.year += 1;
            }
            if (this.year > 2200) {
                this.year = 2200;
            }
        } else {
            this.day += 1;
        }
    }

    // returns true if the input is a date and has the same day and month as this
    @Override
    public boolean equals(Object o) {
        if (o instanceof Date){
            Date d2 = (Date) o;
            if (this.getDay() == d2.getDay() && this.getMonth() == d2.getMonth()) {
                return true;
            }
        }
        return false;
    }

    // returns the current date as a string in format Month, day year
    @Override
    public String toString() {
        String monthWord = "January";
        if (this.month == 2) {
            monthWord = "February";
        } else if (this.month == 3) {
            monthWord = "March";
        } else if (this.month == 4) {
            monthWord = "April";
        } else if (this.month == 5) {
            monthWord = "May";
        } else if (this.month == 6) {
            monthWord = "June";
        } else if (this.month == 7) {
            monthWord = "July";
        } else if (this.month == 8) {
            monthWord = "August";
        } else if (this.month == 9) {
            monthWord = "September";
        } else if (this.month == 10) {
            monthWord = "October";
        } else if (this.month == 11) {
            monthWord = "November";
        } else if (this.month == 12) {
            monthWord = "December";
        }

        return monthWord + " " + this.day + ", " + this.year;
    }
}
