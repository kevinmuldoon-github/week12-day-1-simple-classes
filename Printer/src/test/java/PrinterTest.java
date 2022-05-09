import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(25, 50);
    }

    @Test
    public void hasPaper() {
        assertEquals(25, printer.getSheets());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canPrint() {
        printer.printPaper(2,3);
        assertEquals(19, printer.getSheets());
        assertEquals(44, printer.getToner());
    }

}
