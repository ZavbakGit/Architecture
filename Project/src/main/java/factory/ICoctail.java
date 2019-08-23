package factory;

public interface ICoctail extends IFood {
    String getGlass();

    @Override
    default  String getDescription(){
        return getName() + "" + getGlass();
    }

}
