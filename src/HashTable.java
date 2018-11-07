/*
Emma Lu
10/2/18
Hash Table
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HashTable {
    ArrayList<String>[] hashTable;
    int numPair;

    //initializes an array of size capacity
    public HashTable(int capacity){
        hashTable = new ArrayList[capacity];
        numPair = 0;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public void put(String key, String value){
        numPair ++;
        String pair = "" + key +", " + value;
        int index = hashCode(key)% hashTable.length;
        hashTable[index] = hashTable[index].add(pair);

        if (numPair> 0.8* hashTable.length){
            resize(hashTable.length *2);
        }

    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public ArrayList<String> get(String key){
        int index = hashCode(key) % hashTable.length;
        return hashTable[index];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
        int index = hashCode(key)% values.length;
        return index;
    }

    public void resize(int newM){
        ArrayList<String>[] valuesNew = new ArrayList[newM];
        for(int i = 0; i< hashTable.length; i++){
            for (int j = 0; j < hashTable[i].size(); j++){
                put(hashTable[i], hashTable[i].get(j));
            }

        }


    }



}
