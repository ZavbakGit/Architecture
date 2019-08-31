package lesson5.command;

public class CopyMenu extends CommandMenu {

    public CopyMenu(Boolean isActive) {
        super("Copy", isActive);
    }

    @Override
   public void execute() {
        System.out.println("Executing copy command");
    }
}
