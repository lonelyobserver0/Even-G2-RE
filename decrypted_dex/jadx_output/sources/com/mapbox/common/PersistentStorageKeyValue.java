package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PersistentStorageKeyValue implements Serializable {
    private final String key;
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageKeyValue(String str, DataRef dataRef) {
        this.key = str;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageKeyValue persistentStorageKeyValue = (PersistentStorageKeyValue) obj;
        return Objects.equals(this.key, persistentStorageKeyValue.key) && Objects.equals(this.value, persistentStorageKeyValue.value);
    }

    public String getKey() {
        return this.key;
    }

    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[key: ");
        h.z(sb2, this.key, ", value: ");
        sb2.append(RecordUtils.fieldToString(this.value));
        sb2.append("]");
        return sb2.toString();
    }
}
