class SnapshotArray {
    int snapId = 0;
    TreeMap<Integer, Integer>[] Records;
    public SnapshotArray(int length) {
        Records = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            Records[i] = new TreeMap<Integer, Integer>();
            Records[i].put(0, 0);
        }
    }
    public void set(int index, int val) {
        Records[index].put(snapId, val);
    }
    public int snap() {
        return snapId++;
    }
    public int get(int index, int snapId) {
        return Records[index].floorEntry(snapId).getValue();
    }
}
//Awesome way to think in terms of using TreeMap as it is already sorted and then using floorEntry(Binary Search) to it to get the solution