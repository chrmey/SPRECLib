package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PostCentrifugationDelayOption;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import java.util.ArrayList;

public final class PostCentrifugationDelayListProvider extends AbstractListProvider {

  public PostCentrifugationDelayListProvider() {
    super();
  }

  @Override
  public ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PostCentrifugationDelay entry : PostCentrifugationDelay.values()) {
      IListOption option = new PostCentrifugationDelayOption(entry);
      list.add(option);
    }
    return list;
  }
}
