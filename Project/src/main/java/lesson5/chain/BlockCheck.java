package lesson5.chain;

public abstract class BlockCheck {

    protected BlockCheck next;

    public BlockCheck linkWith(BlockCheck next) {
        this.next = next;
        return next;
    }

    public abstract Boolean check(People  people);

    protected boolean checkNext(People people) {
        if (next == null) {
            return true;
        }
        return next.check(people);
    }
}
