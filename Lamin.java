public class Lamin extends Equipment {

    public String plenka;

    public Lamin(String sname, boolean eqtype) {
        super(sname, eqtype);

    }

    public Lamin(String sname, boolean eqtype, String plenka) {
        super(sname, eqtype);
        this.plenka = plenka;
    }

    @Override
    public void work() {
        System.out.println(sname + "  Заказ заламинирован. Ламинационная пленка - " + plenka);
    }
}
