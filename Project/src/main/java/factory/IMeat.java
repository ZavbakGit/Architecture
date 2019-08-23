package factory;

public interface IMeat extends IFood {
    String getType();

    @Override
    default  String getDescription(){
        return getName() + "" + getType();
    }
}
