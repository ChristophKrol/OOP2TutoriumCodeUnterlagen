package item.tools;

import item.Item;

public class Shovel extends Item {


    private void dig(){
        //this.durability --;
    }
    @Override
    public void use() {
        this.dig();

    }
}
