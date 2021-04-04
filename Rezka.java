public class Rezka extends Equipment {

    private int ntype;

    public Rezka(String sname, boolean eqtype) {
        super(sname, eqtype);
    }

    @Override
    public void work() {
       work(ntype);
    }

    public void work(int ntype) {
        if (ntype == 0) {
            System.out.println(sname + "  Бумага порезана в формат заказа");
        } else {
            System.out.println(sname + "  Заказ порезан");
        }
    }

    public Rezka(String sname, boolean eqtype, int ntype) {
        super(sname, eqtype);
        this.eqtype = eqtype;
        this.ntype = ntype;
    }

}
