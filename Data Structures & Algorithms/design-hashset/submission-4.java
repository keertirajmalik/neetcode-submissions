class MyHashSet {
    int[] set;
    int index;

    public MyHashSet() {
        set = new int[1000000];
        index = 0;
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }
        set[index] = key;
        index += 1;
    }

    public void remove(int key) {
        if(!contains(key)){
            return;
        }
        int k = 0;
        for (int i = 0; i < index; i++) {
            if (set[i] == key) {
                continue;
            }
            set[k] = set[i];
            k += 1;
        }
        index -= 1;
    }

    public boolean contains(int key) {
        for (int i = 0; i < index; i++) {
            if (set[i] == key) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */