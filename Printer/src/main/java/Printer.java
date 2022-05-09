public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void printPaper(int pages, int copies) {
        if (sheets  > (pages*copies) && toner > (pages*copies)) {
            this.sheets = this.sheets - (pages*copies);
            this.toner = this.toner - (pages*copies);
        } // end if
    }

}
