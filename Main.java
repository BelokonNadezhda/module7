
public class Main {

    public static void main(String[] args) {

        Designer designer1 = new Designer("Иванов", "дизайнер");
        Upakovka upakovka1 = new Upakovka("Петрова","упаковщица");
        Print equip1 = new Print("Develop",true);
        Rezka equip2 = new Rezka("Ideal",false);
        Lamin equip3 = new Lamin("Bagel",false,"матовая");


        // этапы прохождения заказа
        designer1.work();
        equip2.work(0);
        equip1.work();
        equip2.work(1);
        equip3.work();
        upakovka1.work();
    }
}
