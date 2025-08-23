package factory_method;

import factory_method.tiles.*;
import java.util.ArrayList;

public class CityMap extends Map {
    ArrayList<Tile> tiles = new ArrayList<>();

    @Override
    Tile createTile() {
        double rand = Math.random();
        if(rand<(1d/3d)){
            tiles.add(new RoadTile());
            return new RoadTile();
        }
        else if(rand<(2d/3d)){
            tiles.add(new ForestTile());
            return new ForestTile();
        }
        else {
            tiles.add(new BuildingTile());
            return new BuildingTile();
        }
    }

    @Override
    void display() {
        for(Tile x : tiles) {
            System.out.println(x.getCharacter());
        }
    }   
}