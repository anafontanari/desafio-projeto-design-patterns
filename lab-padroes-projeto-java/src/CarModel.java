public class CarModel {

    private String text;
    private static final CarModel instance;

    public static CarModel createInstance(String text)
    {
        this.instance = new CarModel();
        this.instance.text = text;
    }

    public static  getInstance(){
        return instance;
    }

}
