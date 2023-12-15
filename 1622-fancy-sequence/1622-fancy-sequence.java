class Fancy {
    static final int MOD = 1_000_000_007;
    static final int MAX_CAPACITY = 100_001;
    static int[] reverseElems = new int[101];
    static {
        reverseElems[1] = 1;
        for (int i = 2; i < reverseElems.length; i++) {
            reverseElems[i] = (int)fp(i, MOD - 2);
        }
    }

    private int addTag = 0;
    private int multiTag = 1;
    private int reverseMultiTag = 1;

    int[] arr;
    int size = 0;

    public Fancy() {
        arr = new int[MAX_CAPACITY];
        size = 0;
    }
    
    public void append(int val) {
        if (size < MAX_CAPACITY) {
            arr[size++] = calc(val, multiTag, addTag);
        }
    }

    private int calc(int v, int r, int d) {
        v -= d;
        if (v < 0) {
            v += MOD;
        }
        return (int)(1L * v * reverseMultiTag % MOD);
    }

    private static long fp(int base, int p) {
        if (base == 1 || p == 0) {
            return 1;
        } else if (p == 1) {
            return base;
        }
        long ans = 1L;
        long b = base;
        while (p > 0) {
            if ((p & 1) == 1) {
                ans *= b;
                ans %= MOD;
            }
            p >>>= 1;
            b *= b;
            b %= MOD;
        }
        return ans;
    }
    
    public void addAll(int inc) {
        addTag += inc;
        addTag %= MOD;
    }
    
    public void multAll(int m) {
        multiTag = (int)(1L * multiTag * m % MOD);
        addTag = (int)(1L * addTag * m % MOD);
        reverseMultiTag = (int)(1L * reverseMultiTag * reverseElems[m] % MOD);
    }
    
    public int getIndex(int idx) {
        if (idx >= size) {
            return -1;
        }
        int ans = arr[idx];
        return (int)((1L * ans * multiTag + addTag) % MOD);
    }
}