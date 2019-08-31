package lesson5.command;

public abstract class CommandMenu {
    private String title;
    private Boolean isActive;

    public CommandMenu(String title, Boolean isActive) {
        this.title = title;
        this.isActive = isActive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public abstract void execute();
}
