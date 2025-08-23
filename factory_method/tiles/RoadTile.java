package factory_method.tiles;

import factory_method.Tile;

public class RoadTile implements Tile{
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public void action(){
        // action
    };

}
