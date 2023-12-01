class Solution {
    public int largestAltitude(int[] gain) {
       int HA = 0;
       int CA = 0;

        for (int altitudeGain : gain) {
            CA += altitudeGain;

            if (CA > HA) {
                HA = CA;
            }
        }

        return HA; 
    }
}