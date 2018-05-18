public class Boat {


    int power;
    int lenght;
    int width;
    int posX;
    int water = 100;
    static String xui;
    String developerName;
    String model;

    public Boat(int power, int lenght, int width, int posX, String developerName, String model) {
        this.power = power;
        this.lenght = lenght;
        this.width = width;
        this.posX = posX;
        this.developerName = developerName;
        this.model = model;
    }


    public void move(int t) {
        posX = t * power / water + posX;
    }
}
