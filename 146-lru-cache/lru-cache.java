class LRUCache {
    int size;
    LinkedHashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        size = capacity;
    }
    
    public int get(int key) {
         return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key, value);
            return;
        }

         if (map.size() == size) {
            Integer lruKey = map.keySet().iterator().next();
            map.remove(lruKey);
        }
            map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */