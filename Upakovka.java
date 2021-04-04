public class Upakovka extends  Personal implements Workable {


    public Upakovka(String sname, String prof) {
        super(sname, prof);
    }

    @Override
    public void work() {
        System.out.printf("%s  Заказ упакован!%n", sname);
    }
}
