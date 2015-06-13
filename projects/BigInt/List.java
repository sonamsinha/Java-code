package com.data.bigint;

/**
 * Created by sonamsinha on 2/9/15.
 */
public interface List {

    public int get();

    public int get(int pos);

    /* add info List at position pos (0 = start of list)
       if pos > size of the list, add it to the end */
    public boolean add(int info, int pos);

    /* add info to the end of list */
    public boolean add(int info);

    /* remove node from end of list -
       note that we aren't concerned about what the node contains */
    public boolean remove();

    /* remove node at position pos (0 is start of list) */
    public boolean remove(int pos);

    /* return true if List contains info, false otherwise */
    public boolean contains(int info);

    /* readable display of the List's contents */
    public String toString();

    /* number of nodes in the list */
    public int size();
}
