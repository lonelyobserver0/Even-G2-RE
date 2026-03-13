package com.mapbox.common;

import Xa.h;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PersistentStorageData implements Serializable {
    private final String key;
    private final Date timestamp;
    private final DataRef value;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageData(String str, Date date, DataRef dataRef) {
        this.key = str;
        this.timestamp = date;
        this.value = dataRef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PersistentStorageData persistentStorageData = (PersistentStorageData) obj;
        return Objects.equals(this.key, persistentStorageData.key) && Objects.equals(this.timestamp, persistentStorageData.timestamp) && Objects.equals(this.value, persistentStorageData.value);
    }

    public String getKey() {
        return this.key;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public DataRef getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.timestamp, this.value);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[key: ");
        h.z(sb2, this.key, ", timestamp: ");
        sb2.append(RecordUtils.fieldToString(this.timestamp));
        sb2.append(", value: ");
        sb2.append(RecordUtils.fieldToString(this.value));
        sb2.append("]");
        return sb2.toString();
    }
}
