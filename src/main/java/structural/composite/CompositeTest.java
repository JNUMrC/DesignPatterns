package structural.composite;

/**
 * 组合：将对象组合成树形结构以表示‘部分-整体’的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
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
