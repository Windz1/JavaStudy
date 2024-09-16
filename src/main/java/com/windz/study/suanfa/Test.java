import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 创建 Arithmetic 的实例
        Arithmetic arithmetic = new Arithmetic();
        // 创建 Solution 的实例
        Arithmetic.Solution solution = arithmetic.new Solution();
        // 测试数组
        int[] nums = {5, 3, 8, 1, 2, 7};
        // 调用 numberGame 方法
        ArrayList<Integer> result = solution.numberGame(nums);
        // 输出结果
        System.out.println(result);
    }
}

