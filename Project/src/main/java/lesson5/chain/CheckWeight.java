package lesson5.chain;

public class CheckWeight extends BlockCheck {

    @Override
    public Boolean check(People people) {
        if (people.getWeight() > 85){
            System.out.println("Weight is not " + people.getName());
            return false;
        }else{
            System.out.println("Weight is ok " +   people.getName());
        }

        return checkNext(people);
    }
}
