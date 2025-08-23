package factory_method.tiles;

import factory_method.Tile;

public class WaterTile implements Tile{
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action(){
        // action
    };

}
