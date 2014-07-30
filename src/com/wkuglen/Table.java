package com.wkuglen;

import java.util.ArrayList;

/**
 * Created by wkuglen.
 */
public class Table {

    private ArrayList<Item> onTable;

    public Table()
    {
        onTable = new ArrayList<Item>();
    }

    public void addItem(Item i)
    {
        onTable.add(i);
    }

    public void reset()
    {
        onTable = new ArrayList<Item>();
    }




}
