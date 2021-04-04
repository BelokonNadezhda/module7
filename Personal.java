public abstract class Personal extends Typography {
    protected String prof;

    public Personal(String sname) {
        super(sname);
    }

    public Personal(String sname, String prof) {
        super(sname);
        this.prof = prof;
    }
}
