public class Designer extends Personal implements Workable {


    public Designer(String sname, String prof) {
        super(sname, prof);
    }

    @Override
    public void work(){
        System.out.printf("%s  Макет готов!%n", sname);
    }
}
