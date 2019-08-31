import lesson5.chain.*;
import lesson5.command.CommandMenu;
import lesson5.command.CopyMenu;
import lesson5.command.PasteMenu;

public class Main {
    public static void main(String[] args) {

        //Цепочка обязанностей
        BlockCheck checkAge = new CheckAge();
        checkAge.linkWith(new CheckHeight())
                .linkWith(new CheckWeight());


        People[] mass = {new People(19, "Alex", 178, 83),
                new People(19, "Andey", 176, 95)
        };

        for (int i = 0; i < mass.length; i++) {
            System.out.println("\n");
            if (checkAge.check(mass[i])) {
                System.out.println(mass[i].getName() + " is checked!");
            } else {
                System.out.println(mass[i].getName() + " is bad");
            }
        }

        System.out.println("\n");

        CommandMenu[] commandMenus = {
                new CopyMenu(true),
                new PasteMenu(false)
        };

        System.out.println("Edit menu");
        for (CommandMenu commandMenu : commandMenus) {
            System.out.println(commandMenu.getTitle() + " is active: " + commandMenu.getActive());
        }

        for (CommandMenu commandMenu : commandMenus) {
            commandMenu.execute();

        }




    }
}
