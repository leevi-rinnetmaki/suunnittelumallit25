package factory_method.tiles;

import factory_method.Tile;

public class BuildingTile implements Tile{
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public void action(){
        // action
    };

}
