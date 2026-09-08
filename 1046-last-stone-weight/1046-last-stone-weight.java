class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> mh = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            mh.offer(num);
        }
        while(mh.size() > 1){
            int y = mh.poll();
            int x = mh.poll();

            if(x != y){
                mh.offer(y - x);
            }
        }
        if(mh.isEmpty()) return 0;
        else return mh.peek();
        
    }
}