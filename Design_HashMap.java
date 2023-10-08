class MyHashMap {
    
    LinkedList<Entry>[] bucket;
    final int SIZE = 1009; // larger prime number
    
    //entry class
    class Entry{
            int key;
            int val;
            public Entry(int key, int val){
                this.key = key;
                this.val = val;
            }
        }
    /** Initialize your data structure here. */
    public MyHashMap() {
        bucket = new LinkedList[SIZE];
        for (int i = 0;i<bucket.length;i++)
            bucket[i] = new LinkedList<Entry>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getHash(key); // identify the bucket
        LinkedList<Entry> entryLink = bucket[index]; 
        if (get(key) != -1) remove(key);   // if the key is available then remove it // same as update
        Entry entry = new Entry(key, value); //otherwise
        entryLink.add(entry);    
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getHash(key);
        LinkedList<Entry> entryLink = bucket[index]; 
        Iterator<Entry> it = entryLink.iterator();
        while(it.hasNext()){
           Entry entry = it.next();
           if(entry.key == key) return entry.val;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getHash(key);
        LinkedList<Entry> entryLink = bucket[index]; 
        Iterator<Entry> it = entryLink.iterator();
        while(it.hasNext()){
           Entry entry = it.next();
           if(entry.key == key) it.remove();
        }
    }
    
    public int getHash(int key){
        return key % SIZE;
    }
}
