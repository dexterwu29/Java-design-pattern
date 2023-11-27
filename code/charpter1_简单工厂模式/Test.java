import java.util.Scanner;

/**
 * 最终版客户端
 */
public class Test {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = Double.parseDouble(sc.nextLine());
            System.out.println("请选择运算符号(+、-、*、/)：");
            String strOperate = sc.nextLine();
            System.out.println("请输入数字B：");
            double numberB = Double.parseDouble(sc.nextLine());

            Operation oper = OperationFactory.createOperate(strOperate);
            double result = oper.getResult(numberA, numberB);
            System.out.println("结果是：" + result);
        } catch (Exception e) {
            System.out.println("您的输入有误：" + e.toString());
        }
    }
}
