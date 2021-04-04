public abstract class Equipment extends Typography {

    protected boolean eqtype;

    public Equipment(String sname, boolean eqtype) {
        super(sname);
        this.eqtype = eqtype;
    }

    public Equipment(String sname) {
        super(sname);
    }

    abstract public void work();

}

