package at.riag.refugees;

import at.riag.refugees.category.TestCategory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExcludeTags(TestCategory.SLOW_TESTS)
public class FastTest {

}