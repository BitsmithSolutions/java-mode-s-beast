package com.lemondronor.modesbeast;

public class ArrayUtils {

  static final int INDEX_NOT_FOUND = -1;

  public static int indexOf(final byte[] array, final byte valueToFind, int startIndex,
                            int stopIndex) {
    if (array == null) {
      return INDEX_NOT_FOUND;
    }
    if (startIndex < 0) {
      startIndex = 0;
    }
    for (int i = startIndex; i < stopIndex; i++) {
      if (valueToFind == array[i]) {
        return i;
      }
    }
    return INDEX_NOT_FOUND;
  }

  public static int indexOf(final byte[] array, final byte valueToFind, int startIndex) {
    return indexOf(array, valueToFind, startIndex, array.length);
  }
}
