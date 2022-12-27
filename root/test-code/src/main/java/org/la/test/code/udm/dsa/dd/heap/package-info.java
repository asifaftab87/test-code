package org.la.test.code.udm.dsa.dd.heap;

/*
    Heap is a complete tree
    complete tree having two kids only leaf node not
    having two kids. If leaf node having 1 node it should
    be left
    Heap are of two types
    Max heap and Min heap
    Max heap: children node either <= parent node
    Min heap: children node either >= parent node
    For max heap highest value node is root node
    for min heap lowest value node is root node
                                  22
                          19           18
                      15     3      14    4
                   12
    Above tree can keep inside an array like this
    array = [22, 19, 18, 15, 3, 14, 4, 12]
    For the node at array[i]
    left child = 2i + 1
    right child = 2i + 2

    parent = floor((i-1)/2)
 */


