package DependencyInversion;

public class PersonalComputer {
    private final IMonitor monitor;
    private final IKeyBoard keyBoard;

    public PersonalComputer(IMonitor monitor, IKeyBoard keyBoard) {
        this.monitor = monitor;
        this.keyBoard = keyBoard;
    }

    public void start() {
        monitor.action();
        keyBoard.action();
    }
}
