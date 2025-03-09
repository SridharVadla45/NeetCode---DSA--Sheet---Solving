package src.Graph.Problems.shortestpath.wordladder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;

public class Solution {
    static class Pair {
        String val;
        int level;

        Pair(String val, int level) {
            this.val = val;
            this.level = level;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> queue = new LinkedList<>();
        HashSet<String> words = new HashSet<>(wordList); // Directly add all words

        if (!words.contains(endWord)) {
            return 0; // If endWord is not in wordList, no transformation is possible.
        }

        queue.add(new Pair(beginWord, 1)); // Start level at 1
        words.remove(beginWord); // Remove beginWord from the set

        while (!queue.isEmpty()) {
            Pair original = queue.poll();
            String currentWord = original.val;
            int currentLevel = original.level;

            if (currentWord.equals(endWord)) {
                return currentLevel;
            }

            char[] currentChars = currentWord.toCharArray();
            int len = currentChars.length;

            for (int i = 0; i < len; i++) {
                char originalChar = currentChars[i]; // Store the original char
                for (char j = 'a'; j <= 'z'; j++) {
                    currentChars[i] = j;
                    String newWord = new String(currentChars);

                    if (words.contains(newWord)) {
                        queue.add(new Pair(newWord, currentLevel + 1));
                        words.remove(newWord);
                    }
                }
                currentChars[i] = originalChar; // Restore the original char
            }
        }
        return 0;
    }
}