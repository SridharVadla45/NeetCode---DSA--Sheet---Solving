//package src.Graph.Problems.shortestpath.wordladder;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class Solution {
//    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
//
//        Queue<String> queue = new LinkedList<>();
//        HashSet<String> words = new HashSet<>();
//        for(String s :wordList){
//            words.add(s);
//        }
//        queue.add(beginWord);
//        if(words.contains(beginWord)) words.remove(beginWord);
//
//        while(!queue.isEmpty()){
//            char [] current = queue.poll().toCharArray();
//            int len = current.length;
//            for(int i=0;i<len;i++){
//                for(int j=0;j<26;j++){
//                    current[i]= (char) ('a'+j);
//                    if(current)
//                }
//            }
//        }
//
//    }
//}
