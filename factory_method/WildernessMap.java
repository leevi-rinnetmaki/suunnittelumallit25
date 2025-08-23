package factory_method;

import factory_method.tiles.*;
import java.util.ArrayList;

public class WildernessMap extends Map {
    ArrayList<Tile> tiles = new ArrayList<>();

    @Override
    Tile createTile() {
        double rand = Math.random();
        if(rand<(1d/3d)){
            tiles.add(new SwampTile());
            return new SwampTile();
        }
        else if(rand<(2d/3d)){
            tiles.add(new WaterTile());
            return new WaterTile();
        }
        else {
            tiles.add(new BuildingTile());
            return new ForestTile();
        }
    }

    @Override
    void display() {
        for(Tile x : tiles) {
            System.out.println(x.getCharacter());
        }
    }   
}