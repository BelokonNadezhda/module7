import java.io.PrintStream;

public class Print extends Equipment {

    public Print(String sname, boolean eqtype) {
        super(sname, eqtype);

    }

    @Override
    public void work() {
        System.out.printf("%s  Заказ напечатан.%n",
                sname);
    }
}
