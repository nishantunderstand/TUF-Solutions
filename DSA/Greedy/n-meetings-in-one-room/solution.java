class Pair{
    int start;
    int end;
    int idx;
    
    public Pair(int start, int end,int idx){
        this.start = start;
        this.end = end;
        this.idx = idx;
    }
    
}


class Solution {

    public int maxMeetings(int[] start, int[] end) {
       ArrayList<Integer> res = new ArrayList<>();
        
        
        // Ascending Order
        
        PriorityQueue<Pair> minPQ = new PriorityQueue<>(
            
            (a,b)-> {
                if(a.end != b.end){
                    return Integer.compare(a.end,b.end);
                }
                return Integer.compare(a.idx,b.idx); // Tie-Breaker 
            }
            
            );
        
        
        
        
        for(int i=0;i<start.length;i++){
            minPQ.offer(new Pair(start[i],end[i],i+1)); // 1-Based Indexing 
        }
        
        
        int lastEnd  = -1;
        int meetingRoomCnt = 0;
        
        while(!minPQ.isEmpty()){
            Pair curr = minPQ.poll();
            
            if(curr.start>lastEnd){
                res.add(curr.idx);
                lastEnd = curr.end;
                meetingRoomCnt++;
            }
        }
        
        //Collections.sort(res); // What Order they are excepting ??
        //return res;
        return meetingRoomCnt;
    }
}