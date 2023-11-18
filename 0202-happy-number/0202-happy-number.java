class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);

            int sumOfSquares = 0;
            while (n > 0) {
                int digit = n % 10;
                sumOfSquares += digit * digit;
                n /= 10;
            }

            n = sumOfSquares;
        }

        return n == 1;
    }
}