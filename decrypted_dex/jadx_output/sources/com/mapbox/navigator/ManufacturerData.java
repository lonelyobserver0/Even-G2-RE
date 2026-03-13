package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ManufacturerData implements Serializable {
    private final byte[] data;
    private final int id;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ManufacturerData(int i3, byte[] bArr) {
        this.id = i3;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManufacturerData manufacturerData = (ManufacturerData) obj;
        return this.id == manufacturerData.id && Objects.equals(this.data, manufacturerData.data);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), this.data);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.o(this.id, ", data: ", sb2);
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append("]");
        return sb2.toString();
    }
}
