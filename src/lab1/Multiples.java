package lab1;

public class Multiples {

    // === MarkUs 会调用的目标方法 ===
    public static int multiples(int n, int a, int b) {
        // 用等差数列求和 + 容斥，O(1)
        long sa = sumMultiplesBelow(n, a);
        long sb = sumMultiplesBelow(n, b);
        long sl = sumMultiplesBelow(n, lcm(a, b));
        long ans = sa + sb - sl;
        return (int) ans;
    }

    // ---- 可选：保留你在作业里改过的“返回值版 main”与重载 ----
    public static int main(int n, int a, int b) {
        return multiples(n, a, b);
    }

    public static int main() {
        return multiples(1000, 3, 5);
    }

    // 可选：真正可运行入口，便于本地运行
    public static void main(String[] args) {
        System.out.println(main());
    }

    // ===== 辅助函数 =====
    private static long sumMultiplesBelow(int n, int m) {
        if (m <= 0) return 0;
        long k = (n - 1L) / m;              // 小于 n 的倍数个数
        return m * k * (k + 1) / 2;         // m*(1+...+k)
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    private static int lcm(int x, int y) {
        return x / gcd(x, y) * y;
    }
}
