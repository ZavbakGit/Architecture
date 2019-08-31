package lesson5.chain;

public class CheckAge extends BlockCheck{

    @Override
    public Boolean check(People people) {
        if (people.getAge() < 18){
            System.out.println("Age is not " + people.getName());
            return false;
        }else{
            System.out.println("Age is ok " + people.getName());
        }

       return checkNext(people);
    }
}
