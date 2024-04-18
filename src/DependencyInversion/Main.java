package DependencyInversion;
interface IMonitor {
    void action();
}

interface IKeyBoard {
    void action();
}


class SimpleMonitor implements IMonitor {
    public void action() {
        System.out.println("SimpleMonitor : showing");
    }
}

class LedMonitor implements IMonitor {
    public void action() {
        System.out.println("LedMonitor : showing");
    }
}

class SimpleKeyBoard implements IKeyBoard{
    public void action() {
        System.out.println("SimpleKeyboard : Press button");
    }
}


public class Main {
    public static void main(String[] args) {
        IKeyBoard sk = new SimpleKeyBoard();

        IMonitor sm = new SimpleMonitor();
        IMonitor lm = new LedMonitor();

        PersonalComputer pc1 = new PersonalComputer(sm, sk);
        pc1.start();

        PersonalComputer pc2 = new PersonalComputer(lm, sk);
        pc2.start();
    }
}
