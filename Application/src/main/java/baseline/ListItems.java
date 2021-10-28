package baseline;

import java.util.LinkedList;

public class ListItems
{
    LinkedList<Item> listOfItems = new LinkedList();

    public void addItemToList(LinkedList<Item> listOfItems)
    {
        Item itemX = new Item();
        itemX.editTitle();
        listOfItems.add(itemX);
    }

}
