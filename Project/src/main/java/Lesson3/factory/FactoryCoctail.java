package Lesson3.factory;

public class FactoryCoctail implements IFactoryCoctail {
    public ICoctail getCoctail(CoctailEnum coctailEnum) {
        switch (coctailEnum) {
            case Machito:
                return new Machito();
            case Margarita:
                return new Margarita();
            default:
                return null;
        }
    }
}
