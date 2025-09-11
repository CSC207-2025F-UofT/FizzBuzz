package lab1;

public class Multiples {

    // Task 1: 参数化并返回结果
    public static int main(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                count++;
            }
        }
        return count;
    }

    // Task 2: 重载 main，提供默认值 (1000, 3, 5)
    public static int main() {
        return main(1000, 3, 5);
    }

    // 可选：真正可运行的入口，方便在 IDE 里运行测试
    public static void main(String[] args) {
        System.out.println(main()); // 打印默认参数的结果
    }
}
