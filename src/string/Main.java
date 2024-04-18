package string;

public class Main {
    public String helloName(String name) {
        return "hello" + name;
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(0, str.length() - 2);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() > 2) {
            return str.substring(2) + str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String right2(String str) {
        if (str.length() > 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        } else {
            return str;
        }
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        } else {
            return "";
        }
    }

    public String lastChars(String a, String b) {
        if (a.isEmpty())
            a = "@";
        if (b.isEmpty())
            b = "@";

        return a.charAt(0) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0))
            return a + b.substring(1);
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, str.length() - 2)
                    + str.substring(str.length() - 1) + str.charAt(str.length() - 2);
        } else {
            return str;
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        return str.startsWith(str.substring(0, 2)) && str.endsWith(str.substring(str.length() - 2, str.length() - 1));
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String firstLastNChars(String str, int n) {
        String firstNChars = str.substring(0, n);
        String lastNChars = str.substring(str.length() - n);
        return firstNChars + lastNChars;
    }

    public String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0)
            return str.substring(0, 2);
        else
            return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
    }

    public boolean hasBad(String str) {
        if (str.startsWith("bad")) {
            return true;
        }
        return str.length() >= 4 && str.startsWith("bad", 1);
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public boolean frontAgain1(String str) {
        if (str.length() >= 2) {
            String firstTwo = str.substring(0, 2);
            String lastTwo = str.substring(str.length() - 2);
            return firstTwo.equals(lastTwo);
        } else {
            return false;
        }
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length())
            return a + b;
        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            return a.substring(diff) + b;

        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff);
        }

    }

    public String extraFront(String str) {
//        if (str.length() > 2) {
//            return str.substring(0, 2)+str.substring(0, 2)+str.substring(0, 2);
//        } else if (str.length()==2) {
//            return str.substring(0, 2)+str.substring(0,2)+str.substring(0,2);
//        } else if(str.isEmpty()){
//            return "";
//        } else{
//            return str.substring(0, 1)+str.substring(0, 1)+str.substring(0, 1);
//        }
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    public String without2(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.length() == 2) {
            return "";
        } else {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2, str.length() - 1))) {
                return str.substring(2);
            } else {
                return str;
            }
        }
    }

    public String deFront(String str) {
        if (str.length() < 2) {
            return str;
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        } else if (str.charAt(0) == 'a') {
            return str.charAt(0) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

    public String startWord(String str, String word) {
        int lenStr = str.length();
        int lenWord = word.length();
        if (lenStr == 0) {
            return "";
        }
        if (lenWord > lenStr) {
            return "";
        }
        if (word.length() == 1) {
            return str.substring(0, 1);
        } else if (str.substring(1, lenWord).equals(word.substring(1, lenWord))) {
            return str.substring(0, lenWord);
        } else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.equals("x")) {
            return "";
        }
        if (str.startsWith("x") && str.endsWith("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else if (str.startsWith("x")) {
            return str.substring(1);
        } else if (str.length() < 2) {
            return "";
        } else {
            return str;
        }
    }

    public String withoutX2(String str) {
        if(str.equals("x")){
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        if (str.charAt(0) == 'x' && str.charAt(1)=='x') {
            return str.substring(2);
        }else if (str.charAt(0)=='x'){
            return str.substring(1);
        }else if (str.charAt(1)=='x'){
            return str.charAt(0)+str.substring(2);
        }else {
            return str;
        }
    }


    public static void main(String[] args) {

    }
}
