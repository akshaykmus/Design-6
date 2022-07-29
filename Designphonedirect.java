
//Time :O(1)
//Space : O(n)

class PhoneDirectory {
    Queue<Integer> q;
    HashSet<Integer> set;

    public PhoneDirectory(int maxNumbers) {
        this.q = new LinkedList<>();
        this.set = new HashSet<>();
        for (int i = 0; i < maxNumbers; i++) {
            q.add(i);
            set.add(i);
        }
    }

    public int get() {
        if (q.isEmpty())
            return -1;
        int re = q.poll();
        set.remove(re);
        return re;
    }

    public boolean check(int number) {
        return set.contains(number);
    }

    public void release(int number) {
        if (!set.contains(number)) {
            q.add(number);
            set.add(number);
        }
    }
}