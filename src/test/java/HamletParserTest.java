import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() throws FileNotFoundException {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        Boolean expected = false;
        String noHamlet = hamletParser.replaceHamlet();
        Boolean actual = noHamlet.contains("Hamlet");
        Assert.assertEquals(expected, actual);
        //Pattern pattern = Pattern.compile("Leon");
        //Matcher matcher = pattern.matcher(hamletData);
        //Boolean actual = matcher.matches(regex);
    }

    @Test
    public void testChangeHoratioToTariq() {
        Boolean expected = false;
        String noHamlet = hamletParser.replaceHamlet();
        Boolean actual = noHamlet.contains("Hamlet");
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        Boolean expected = true;
        Boolean actual = hamletText.contains("Horatio");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHamlet() {
        Boolean expected = true;
        Boolean actual = hamletText.contains("Hamlet");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findFile () throws FileNotFoundException {
        hamletParser.findHamlet();
    }

    @Test
    public void replaceHamlet () {
        hamletParser.replaceHamlet();
    }
}