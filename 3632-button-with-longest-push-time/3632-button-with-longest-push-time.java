class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int button = events[0][0], max_time = events[0][1];
        for (int i=1;i<events.length;i++) {
            if (max_time <= events[i][1] - events[i-1][1]) {
                button = (max_time == events[i][1] - events[i-1][1])?Math.min(button,events[i][0]):events[i][0];
                max_time = events[i][1] - events[i-1][1];
            }
        }
        return button;
    }
}