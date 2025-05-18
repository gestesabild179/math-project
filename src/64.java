import java.util.*;

class MathProject {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.5, 3.7);
        Collections.sort(numbers);

        double median = numbers.stream()
                                .mapToDouble(n -> n)
                                .sorted() // 使用Arrays方法对数组进行排序
                                .average()   // 算术平均数，计算整个数组的均值
                                .orElse(0);  // 如果数组为空则返回0
        System.out.println("Median: " + median);
    }
}
