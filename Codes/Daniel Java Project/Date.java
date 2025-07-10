public class Date {
    private int month;
    private int day;

    // constructs the given month/day
    public Date(int m, int d) {
        month = m;
        day = d;
    }

    // getters
    // returns the day
    public int getDay() {
        return day;
    }

    // returns the month
    public int getMonth() {
        return month;
    }

    // returns the number of days
    // in this date's month.
    public int daysInMonth() {
        // consider month is an int from 1-12
        // write some if conditions that can differentiate 30days month, 31days month and Feb
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            return 28;
        } else {
            return 30;
        }
    }

    // compares dates (true if same)
    public boolean equals(Date d) {
        if (this.month == d.month && this.day == d.day) {
            return true;
        } else {
            return false;
        }
    }

    // modifies this date's state
    // forward in time by 1 day,
    // wrapping month/year if needed
    public void nextDay() {
        // jan01.nextDay() (month=1, day=1) should be forwarded to (month=2, day=2)
        // 1. increase the day
        this.day++;
        // 2. if the day was 31jan, then there shouldn't be jan32
        // 3. after increase, if the day is larger than dayInMonth, I shall increase the month and change my day
        if (this.day > this.daysInMonth()) {
            this.month++;
            this.day = this.day - daysInMonth();
        }
    }

    // set month/date to given values
    public void setDate(int m, int d) {
        month = m;
        day = d;
    }

    public boolean isBefore(Date d) {
        // write your code here
        if (d.month > this.month) {
            return true;
        } else if (d.month == this.month) {
            if (d.day > this.day) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Date jan01 = new Date(1, 1);
        Date jul04 = new Date(7, 4);
        Date jul22 = new Date(7, 22);
        Date sep19 = new Date(9, 19);
        Date dec03 = new Date(12, 3);

        // The following calls should return true:
        jan01.equals(jul04);
        System.out.println(jul04.isBefore(jul22));
        System.out.println(sep19.isBefore(dec03));
        System.out.println(jan01.isBefore(sep19));

        // The following calls should return false:
        System.out.println(dec03.isBefore(jul22));
        System.out.println(jul22.isBefore(jul04));
        System.out.println(sep19.isBefore(sep19));
    }

}