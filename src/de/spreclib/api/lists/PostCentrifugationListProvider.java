package de.spreclib.api.lists;

import java.util.ArrayList;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.PostCentrifugationOption;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;

public final class PostCentrifugationListProvider implements IListProvider {
  private ArrayList<IListOption> postCentrifugationList = new ArrayList<>();

  public PostCentrifugationListProvider() {
    this.postCentrifugationList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (PostCentrifugation entry : PostCentrifugationList.POST_CENTRIFUGATIONS) {
      IListOption option = new PostCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return postCentrifugationList;
  }
}
