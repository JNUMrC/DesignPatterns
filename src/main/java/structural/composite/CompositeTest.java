package structural.composite;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class CompositeTest {
    public static void main(String[] args) {
        Employee zhangsan = new Employee("zhangsan", "销售", 5000);
        Employee lisi = new Employee("lisi", "销售", 4000);
        Employee jinguanzhang = new Employee("jinguanzhang", "销售主管", 10000);
        jinguanzhang.add(zhangsan);
        jinguanzhang.add(lisi);
        for (Employee employee : jinguanzhang.getSubOrdinates()) {
            System.out.println(employee.toString());
        }
    }
}
