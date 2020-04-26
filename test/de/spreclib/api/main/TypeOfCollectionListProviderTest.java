package de.spreclib.api.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import de.spreclib.api.main.TypeOfCollectionListProvider;
import de.spreclib.api.main.TypeOfCollectionOption;
import de.spreclib.api.main.interfaces.IListOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TypeOfCollectionListProviderTest {

  private TypeOfCollectionListProvider typeOfCollectionListProvider;
  private List<TypeOfCollectionOption> typeOfCollectionList;

  @Before
  public void setUp() {
    this.typeOfCollectionListProvider = new TypeOfCollectionListProvider();
    this.typeOfCollectionList = typeOfCollectionListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.typeOfCollectionList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.typeOfCollectionList) {
      assertNotNull(option.getStringRepresentation());
    }
  }
}