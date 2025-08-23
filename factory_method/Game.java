package factory_method;

public class Game {
    Map map;
    void createMap(String type){
        if(type == "city"){
            map = new CityMap();
        }else if(type == "wilderness"){
            map = new WildernessMap();
        }
    }
    public static void main(String[] args) {
        Game game = new Game();
        game.createMap("city");
        game.map.createTile();
        game.map.createTile();
        game.map.createTile();
        game.map.display();
    }
}
