class Solution {
    private class Pair {
        String word; int count;
        Pair(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        if (!words.contains(endWord)) return 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(beginWord, 1));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            char[] arr = pair.word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    arr[i] = ch;
                    String word = new String(arr);
                    if(words.contains(word)) {
                        if (word.equals(endWord)) return pair.count + 1;
                        queue.offer(new Pair(word, pair.count + 1));
                        words.remove(word);
                    }
                }
                arr[i] = original;
            }
        }
        return 0;
    }
}