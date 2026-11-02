class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int currentFloor = 0;

        for (int i = 0; i < requests.length; i++) {
            time += Math.abs(requests[i] - currentFloor);
            currentFloor = requests[i];
        }

        return time;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna