package factory_method;

public class Game {
    Map map;
    void createMap(String type, int width, int height){
        if("city".equals(type)){
            map = new CityMap(width, height);
        }else if("wilderness".equals(type)){
            map = new WildernessMap(width, height);
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.createMap("city", 10, 10);
        game.map.display();
    }
}
