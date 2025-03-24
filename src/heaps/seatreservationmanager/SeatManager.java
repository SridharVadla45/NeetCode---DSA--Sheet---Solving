package src.heaps.seatreservationmanager;

import java.util.PriorityQueue;

public class SeatManager {
    private PriorityQueue<Integer> seats;
    public SeatManager(int n) {
        seats = new PriorityQueue<>();
       for(int i=1;i<=n;i++){
           seats.offer(i);
       }
    }

    public int reserve() {
      return !seats.isEmpty() ? seats.poll() : -1;
    }

    public void unreserve(int seatNumber) {
       seats.offer(seatNumber);
    }

}
