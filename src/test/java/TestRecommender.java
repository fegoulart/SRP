import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestRecommender {

    @Test
    public void basic_test() {
        Recommender r = new Recommender();

        List<Movie> recommenations = r.recommendations(BBDD.JOHN);

        Assert.assertFalse(recommenations.contains(BBDD.ET));
    }

    @Test
    public void test_format() {
        Recommender r = new Recommender();

        String csv = r.recommendationsCSV(BBDD.JOHN);

        String expected = "Saving Private Ryan,Spielberg,war";

        Assert.assertEquals(expected, csv);

    }

}
