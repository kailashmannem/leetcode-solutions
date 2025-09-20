class Solution {
    private class Pair<T,V> {
        T word; V count;
        Pair(T word, V count) {
            this.word = word;
            this.count = count;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        if (!words.contains(endWord)) return 0;
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<String, Integer>(beginWord, 1));
        while (!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            char[] arr = pair.word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    arr[i] = ch;
                    String word = new String(arr);
                    if(words.contains(word)) {
                        if (word.equals(endWord)) return pair.count + 1;
                        queue.offer(new Pair<String, Integer>(word, pair.count + 1));
                        words.remove(word);
                    }
                }
                arr[i] = original;
            }
        }
        return 0;
    }
}