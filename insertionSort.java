/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSCI335ProjectOne;

/**
 *
 * @author Chrishon595
 */
public class insertionSort 
{
    public int BinarySearch (int IDs[], int low, int high, int key)
    {
        int mid;

        if (low == high)
            return low;

        mid = low + ((high - low) / 2);

        if (key > IDs[mid])
            return BinarySearch (IDs, mid + 1, high, key);
        else if (key < IDs[mid])
            return BinarySearch (IDs, low, mid, key);

        return mid;
    }
    public void binaryInsertionSort(int[] IDs)
    {
        int ins, i, j;
        int tmp;

        for (i = 1; i < IDs.length; i++) 
        {
            ins = BinarySearch(IDs, 0, i, IDs[i]);
            if (ins < i) 
            {
                tmp = IDs[i];
                for (j = i - 1; j >= ins; j--)
                    IDs[j + 1] = IDs[j];
                IDs[ins] = tmp;
            }
        }
    }
}

