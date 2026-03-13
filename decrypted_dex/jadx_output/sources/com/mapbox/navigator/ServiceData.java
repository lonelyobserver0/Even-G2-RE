package com.mapbox.navigator;

import Xa.h;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class ServiceData implements Serializable {
    private final byte[] data;
    private final String uuid;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ServiceData(String str, byte[] bArr) {
        this.uuid = str;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceData serviceData = (ServiceData) obj;
        return Objects.equals(this.uuid, serviceData.uuid) && Objects.equals(this.data, serviceData.data);
    }

    public byte[] getData() {
        return this.data;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Objects.hash(this.uuid, this.data);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[uuid: ");
        h.z(sb2, this.uuid, ", data: ");
        sb2.append(RecordUtils.fieldToString(this.data));
        sb2.append("]");
        return sb2.toString();
    }
}
