package lesson5.command;

public class PasteMenu extends CommandMenu {

    public PasteMenu(Boolean isActive) {
        super("Paste", isActive);
    }

    @Override
    public void execute() {
        System.out.println("Executing paste command");
    }
}
