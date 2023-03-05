import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.managerClass.FilmsManager;

public class MangerClassTest {

    @Test
    public void testAddAndShowFilmsOneElement() {
        FilmsManager manager = new FilmsManager();

        manager.add("TaxiI");


        String[] expected = {"TaxiI"};
        String[] actual = manager.showAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddAndShowFilmsEmpty() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.showAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddAndShowFilmsEquivalent() {
        FilmsManager manager = new FilmsManager();

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");
        manager.add("TaxiIV");


        String[] expected = {"TaxiI", "TaxiII", "TaxiIII", "TaxiIV"};
        String[] actual = manager.showAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsDefaultEmpty() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsDefaultMiddle() {
        FilmsManager manager = new FilmsManager();

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");
        manager.add("TaxiIV");


        String[] expected = {"TaxiIV", "TaxiIII", "TaxiII", "TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsDefaultBoundaryValuesMinusOne() {
        FilmsManager manager = new FilmsManager();

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");
        manager.add("TaxiIV");
        manager.add("TaxiV");
        manager.add("TaxiVI");
        manager.add("TaxiVII");
        manager.add("TaxiVIII");
        manager.add("TaxiIX");


        String[] expected = {"TaxiIX", "TaxiVIII", "TaxiVII", "TaxiVI", "TaxiV", "TaxiIV", "TaxiIII", "TaxiII", "TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsDefaultBoundaryValuesEquals() {
        FilmsManager manager = new FilmsManager();

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");
        manager.add("TaxiIV");
        manager.add("TaxiV");
        manager.add("TaxiVI");
        manager.add("TaxiVII");
        manager.add("TaxiVIII");
        manager.add("TaxiIX");
        manager.add("TaxiX");


        String[] expected = {"TaxiX", "TaxiIX", "TaxiVIII", "TaxiVII", "TaxiVI", "TaxiV", "TaxiIV", "TaxiIII", "TaxiII", "TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsWithParameterEmpty() {
        FilmsManager manager = new FilmsManager(4);

        String[] expected = {};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsWithParameterBoundaryValuesOne() {
        FilmsManager manager = new FilmsManager(4);

        manager.add("TaxiI");


        String[] expected = {"TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testShowLastFilmsWithParameterBoundaryValuesMinusOne() {
        FilmsManager manager = new FilmsManager(4);

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");


        String[] expected = {"TaxiIII", "TaxiII", "TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ttestShowLastFilmsWithParameterBoundaryValuesEquals() {
        FilmsManager manager = new FilmsManager(4);

        manager.add("TaxiI");
        manager.add("TaxiII");
        manager.add("TaxiIII");
        manager.add("TaxiIV");


        String[] expected = {"TaxiIV", "TaxiIII", "TaxiII", "TaxiI"};
        String[] actual = manager.showLastFilms();

        Assertions.assertArrayEquals(expected, actual);
    }


}
