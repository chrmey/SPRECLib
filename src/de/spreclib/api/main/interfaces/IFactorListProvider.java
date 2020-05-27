package de.spreclib.api.main.interfaces;

public interface IFactorListProvider<T extends IListOption> {

  T getOptionFromCodeString(String codeString);
}
