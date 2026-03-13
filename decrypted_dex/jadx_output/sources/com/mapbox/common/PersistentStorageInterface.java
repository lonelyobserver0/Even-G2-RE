package com.mapbox.common;

import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import java.util.Date;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface PersistentStorageInterface {
    Expected<PersistentStorageError, PersistentStorageData> get(String str);

    Expected<PersistentStorageError, List<PersistentStorageData>> getAll();

    Expected<PersistentStorageError, List<PersistentStorageData>> getMulti(List<String> list);

    Expected<PersistentStorageError, Long> getStorageSize();

    Expected<PersistentStorageError, Date> put(String str, DataRef dataRef);

    Expected<PersistentStorageError, Date> putMulti(List<PersistentStorageKeyValue> list);

    Expected<PersistentStorageError, None> remove(String str);

    Expected<PersistentStorageError, Long> removeAll();

    Expected<PersistentStorageError, Long> removeMulti(List<String> list, boolean z2);

    Expected<PersistentStorageError, None> shrinkToFit();
}
