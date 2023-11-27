import java.util.Scanner;

/**
 * 相比于Test1，优化了：
 * ------------------
 * 1、变量命名
 * 2、switch case分支判断
 * 3、异常捕获（但除数为0，没有处理）
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("请选择运算符号(+、-、*、/)：");
            String strOperate = sc.nextLine();
            System.out.println("请输入数字B：");
            double numberB = Double.parseDouble(sc.nextLine());
            double result = 0d;

            switch (strOperate) {
                case "+":
                    result = numberA + numberB;
                    break;
                case "-":
                    result = numberA - numberB;
                    break;
                case "*":
                    result = numberA * numberB;
                    break;
                case "/":
                    result = numberA / numberB;
                    break;
            }
            System.out.println("结果是：" + result); // 结果是：Infinity 除数为0还是没有单独的判断机制
        } catch (Exception e) {
            System.out.print("您的输入有误：");
            e.printStackTrace();
        }
    }
}
