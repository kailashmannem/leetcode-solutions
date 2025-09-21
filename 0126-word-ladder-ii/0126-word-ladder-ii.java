class Solution {
    //BFS + DFS approach
    private void dfs(String word, String beginWord, List<String> seq, Map<String, Integer> shortest, List<List<String>> ans) {
        if (word.equals(beginWord)) {
            List<String> temp = new ArrayList<>(seq);
            Collections.reverse(temp);
            ans.add(temp);
            return;
        }
        int level = shortest.get(word);
        char[] currWord = word.toCharArray();
        for (int i = 0; i < currWord.length; i++) {
            char original = currWord[i];
            for (char ch = 'a'; ch <= 'z'; ch++) {
                currWord[i] = ch;
                String search = new String(currWord);
                if (shortest.containsKey(search) && shortest.get(search) + 1 == level) {
                    seq.add(search);
                    dfs(search, beginWord, seq, shortest, ans);
                    seq.remove(seq.size() - 1);
                }
            }
            currWord[i] = original;
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        List<List<String>> ans = new ArrayList<>();
        if (!set.contains(endWord)) return ans;
        Queue<String> queue = new ArrayDeque<>();
        Map<String, Integer> shortest = new HashMap<>();
        queue.offer(beginWord);
        shortest.put(beginWord, 1);
        set.remove(beginWord);
        while (!queue.isEmpty()) {
            String currWord = queue.poll();
            int level = shortest.get(currWord);
            if (currWord.equals(endWord)) break;
            char[] word = currWord.toCharArray();
            for (int i = 0; i < word.length; i++) {
                char original = word[i];
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    word[i] = ch;
                    String search = new String(word);
                    if (set.contains(search)) {
                        queue.offer(search);
                        shortest.put(search, level + 1);
                        set.remove(search);
                    }
                }
                word[i] = original;
            }
        }
        if (shortest.containsKey(endWord)) {
            List<String> seq = new ArrayList<>();
            seq.add(endWord);
            dfs(endWord, beginWord, seq, shortest, ans);
        }
        return ans;
    }
    //BFS approach
    // public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    //     Set<String> set = new HashSet<>(wordList);
    //     List<List<String>> ans = new ArrayList<>();
    //     if (!set.contains(endWord))
    //         return ans;
    //     Queue<List<String>> queue = new LinkedList<>();
    //     List<String> start = new ArrayList<>();
    //     start.add(beginWord);
    //     queue.offer(start);
    //     int level = 1;
    //     List<String> used = new ArrayList<String>();
    //     used.add(beginWord);
    //     boolean found = false;
    //     while (!queue.isEmpty()) {
    //         List<String> words = queue.poll();
    //         if (words.size() > level) {
    //             level += 1;
    //             for (String word : used) {
    //                 set.remove(word);
    //             }
    //             used.clear();
    //             if (found)
    //                 break;
    //         }
    //         String last = words.get(words.size() - 1);
    //         if (last.equals(endWord)) {
    //             ans.add(words);
    //             found = true;
    //         }
    //         char[] currWord = last.toCharArray();
    //         for (int i = 0; i < currWord.length; i++) {
    //             char original = currWord[i];
    //             for (char ch = 'a'; ch <= 'z'; ch++) {
    //                 currWord[i] = ch;
    //                 String current = new String(currWord);
    //                 if (set.contains(current)) {
    //                     List<String> newWords = new ArrayList<>(words);
    //                     newWords.add(current);
    //                     queue.add(newWords);
    //                     used.add(current);
    //                 }
    //             }
    //             currWord[i] = original;
    //         }
    //     }
    //     return ans;
    // }

    //DFS approach
    // public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    //     Set<String> words = new HashSet<>(wordList);
    //     List<List<String>> result = new ArrayList<>();
    //     if (!words.contains(endWord)) return result;
    //     List<String> seq = new ArrayList<>();
    //     seq.add(beginWord);
    //     dfs(beginWord, endWord, words, new int[]{Integer.MAX_VALUE}, seq, result);
    //     return result;
    // }
    // private void dfs(String word, String endWord, Set<String> words, int[] count, List<String> seq, List<List<String>> ans) {
    //     if (count[0] < seq.size()) return;
    //     if (word.equals(endWord)) {
    //         if (count[0] == seq.size()) ans.add(new ArrayList<String>(seq));
    //         else if (count[0] > seq.size()) {
    //             ans.clear();
    //             count[0] = seq.size();
    //             ans.add(new ArrayList<String>(seq));
    //         }
    //         else return;
    //     }
    //     char[] currWord = word.toCharArray();
    //     for (int i = 0; i < currWord.length; i++) {
    //         char original = currWord[i];
    //         for (char ch = 'a'; ch <= 'z'; ch++) {
    //             currWord[i] = ch;
    //             String check = new String(currWord);
    //             if (words.contains(check)) {
    //                 seq.add(check);
    //                 words.remove(check);
    //                 dfs(check, endWord, words, count, seq, ans);
    //                 words.add(check);
    //                 seq.remove(seq.size() - 1);
    //             }
    //         }
    //         currWord[i] = original;
    //     }
    // }
}