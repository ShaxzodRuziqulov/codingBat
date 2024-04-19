package logic1;

public class Main {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }
    public int dateFashion(int you, int date) {
        if (you<=2 && date<=8) {
            return 0;
        } else if (you>=8 && date>=8) {
            return 2;
        } else {
            return 1;
        }
    }
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer){
            if (temp>=60 && temp<=90){
                return true;
            }
        }else{
            if (temp>=60 && temp<=100){
                return true;
            }
        }
        return false;
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday){
            if (speed<=60){
                return 0;
            } else if (speed<=80) {
                return 1;
            } else {
                return 2;
            }
        }else {
            if (speed<=65){
                return 0;
            } else if (speed<=85) {
                return 1;
            } else {
                return 2;
            }
        }
    }
    public int sortaSum(int a, int b) {
        if (a+b<=11 && a+b>=19){
            return 20;
        }else {
            return a+b;
        }
    }
    public String alarmClock(int day, boolean vacation) {
        if (vacation){
            if (day==0 || day==6){
                return "off";
            }else {
                return "10:00";
            }
        }else {
            if (day==0 || day==6){
                return "10:00";
            }else {
                return "7:00";
            }
        }
    }

    public static void main(String[] args) {

    }
}
