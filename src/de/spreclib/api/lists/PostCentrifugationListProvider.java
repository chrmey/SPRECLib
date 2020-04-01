package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PostCentrifugationOption;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;
import java.util.ArrayList;

public final class PostCentrifugationListProvider extends AbstractListProvider {

  public PostCentrifugationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PostCentrifugation entry : PostCentrifugationList.POST_CENTRIFUGATIONS) {
      IListOption option = new PostCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

}
