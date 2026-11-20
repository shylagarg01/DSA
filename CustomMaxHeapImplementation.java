
class Solution {

    public int lastStoneWeight(int[] stones) {

        MaxHeap heap = new MaxHeap();

        for(int stone : stones) {
            heap.insert(stone);
        }

        while(heap.size() > 1) {

            int y = heap.remove(); // Largest
            int x = heap.remove(); // Second largest

            if(y != x) {
                heap.insert(y - x);
            }
        }

        return heap.size() == 0 ? 0 : heap.remove();
    }
}

class MaxHeap {

    ArrayList<Integer> heap = new ArrayList<>();

    // Insert element
    public void insert(int val) {

        heap.add(val);

        int child = heap.size() - 1;

        // Heapify Up
        while(child > 0) {

            int parent = (child - 1) / 2;

            if(heap.get(child) > heap.get(parent)) {

                int temp = heap.get(child);
                heap.set(child, heap.get(parent));
                heap.set(parent, temp);

                child = parent;
            }
            else {
                break;
            }
        }
    }

    // Remove maximum element
    public int remove() {

        int max = heap.get(0);

        int last = heap.remove(heap.size() - 1);

        if(heap.size() > 0) {

            heap.set(0, last);

            heapifyDown(0);
        }

        return max;
    }

    // Heapify Down
    private void heapifyDown(int parent) {

        int size = heap.size();

        while(true) {

            int left = 2 * parent + 1;
            int right = 2 * parent + 2;

            int largest = parent;

            if(left < size &&
               heap.get(left) > heap.get(largest)) {
                largest = left;
            }

            if(right < size &&
               heap.get(right) > heap.get(largest)) {
                largest = right;
            }

            if(largest != parent) {

                int temp = heap.get(parent);
                heap.set(parent, heap.get(largest));
                heap.set(largest, temp);

                parent = largest;
            }
            else {
                break;
            }
        }
    }

    public int size() {
        return heap.size();
    }
}
