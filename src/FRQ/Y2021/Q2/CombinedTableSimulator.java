package FRQ.Y2021.Q2;

public class CombinedTableSimulator {

    public static void main(String[] args) {
        SingleTable table1 = new SingleTable(4, 74, 60.0);
        SingleTable table2 = new SingleTable(8, 74, 70.0);
        SingleTable table3 = new SingleTable(12, 76, 75.0);

        CombinedTable c1 = new CombinedTable(table2, table1);
        System.out.println(c1.canSeat(9));
        System.out.println(c1.canSeat(11));
        System.out.println(c1.getDesirability());

        CombinedTable c2 = new CombinedTable(table2, table3);
        System.out.println(c2.canSeat(18));
        System.out.println(c2.getDesirability());

        table2.setViewQuality(80);
        System.out.println(c2.getDesirability());
    }
}
