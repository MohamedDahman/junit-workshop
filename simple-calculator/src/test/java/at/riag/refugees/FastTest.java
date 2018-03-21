package at.riag.refugees;

import at.riag.refugees.category.SlowTests;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(SlowTests.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        ParameterizedCalculatorTest.class })
public class FastTest {

}