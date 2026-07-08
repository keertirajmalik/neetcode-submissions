class Node {
    int key;
    Node next;
    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class MyHashSet {
    Node[] bucket;
    public MyHashSet() {
        bucket = new Node[10000];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new Node(0);
        }
    }

    public void add(int key) {
        int index = key % bucket.length;
        Node cur = bucket[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                return;
            }
            cur = cur.next;
        }

        cur.next = new Node(key);
    }

    public void remove(int key) {
        int index = key % bucket.length;
        Node cur = bucket[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    public boolean contains(int key) {
        int index = key % bucket.length;
        Node cur = bucket[index];

        while (cur.next != null) {
            if (cur.next.key == key) {
                return true;
            }
            cur = cur.next;
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