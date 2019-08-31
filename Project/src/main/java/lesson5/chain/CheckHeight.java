package lesson5.chain;

public class CheckHeight extends BlockCheck {

    @Override
    public Boolean check(People people) {
        if (people.getAge() > 175){
            System.out.println("Height is not "  + people.getName());
            return false;
        }else{
            System.out.println("Height is ok " + people.getName());
        }

        return checkNext(people);
    }
}
