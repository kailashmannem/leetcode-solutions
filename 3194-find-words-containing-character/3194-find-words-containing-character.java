class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isPresent(words[i], x)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isPresent(String word, char c) {
        for (char w : word.toCharArray()) {
            if (w == c) return true;
        }
        return false;
    }
}