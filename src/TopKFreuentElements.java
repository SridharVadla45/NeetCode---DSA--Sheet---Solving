package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFreuentElements {
    public static void main(String[] args) {
        var obj = new TopKFreuentElements();
        int [] nums ={1,1,1,2,2,3};
        obj.topKFrequent(nums,2);
    }
    static class Element implements Comparable<Element>{
        int value;
        int frequency;
        public Element(int value,int frequency){
            this.value = value;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Element o) {
            return Integer.compare(o.frequency,this.frequency);
        }

        @Override
        public String toString() {
            return "Element{" +
                    "value=" + value +
                    ", frequency=" + frequency +
                    '}';
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
      // count frequency of all elements
        HashMap<Integer,Element> hashMap = new HashMap<>();
        for(int i:nums){
            if(hashMap.containsKey(i)){
                Element element = hashMap.get(i);
                element.frequency++;
            }else hashMap.put(i, new Element(i, 1));
        }

        // create max heap for most k frequent elements

        PriorityQueue<Element> priorityQueue = new PriorityQueue<>();
        for(Element e :hashMap.values()){
            priorityQueue.offer(e);
            System.out.println(e.toString());
        }

        int [] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=priorityQueue.poll().value;
        }
        return ans;
    }
}
