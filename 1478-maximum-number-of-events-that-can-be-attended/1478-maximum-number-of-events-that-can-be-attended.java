
class Solution {
    public int maxEvents(int[][] events) {
        // Sort events based on the starting day
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        int day = 0;          
        int index = 0;       
        int n = events.length; 
        int result = 0;      
        
        // Priority queue to keep track of the end days of events
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // if pq.isEmoty that means no events then what is the first even?
        // the event at starting day
        while (!pq.isEmpty() || index < n) {
            // If the priority queue is empty, move to the next available day
            if (pq.isEmpty()) {
                day = events[index][0];
            }
            
            //2. Find all the events that can be attended in given day
            while (index < n && events[index][0] <= day) {
                pq.offer(events[index][1]);
                index++;
            }
            
            // 3.Attend the event that ends the earliest (the top of the priority queue)
            pq.poll();
            result++; // Increment the count of attended events
            day++;    // Move to the next day
            
            // Remove all events from the priority queue that end before the current day
            //6. if the current day is 5 and a event has ended on day 4 then that even is expired and we cannot attend it so remove it from the queue.
            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        
        return result;
    }
}