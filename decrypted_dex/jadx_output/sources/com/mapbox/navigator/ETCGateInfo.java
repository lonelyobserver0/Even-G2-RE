package com.mapbox.navigator;

import Xa.h;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ETCGateInfo implements Serializable {
    private final int id;
    private final long monotonicTimestampNanoseconds;

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ETCGateInfo(int i3, long j) {
        this.id = i3;
        this.monotonicTimestampNanoseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ETCGateInfo eTCGateInfo = (ETCGateInfo) obj;
        return this.id == eTCGateInfo.id && this.monotonicTimestampNanoseconds == eTCGateInfo.monotonicTimestampNanoseconds;
    }

    public int getId() {
        return this.id;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.id), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[id: ");
        b.o(this.id, ", monotonicTimestampNanoseconds: ", sb2);
        return h.i(this.monotonicTimestampNanoseconds, sb2, "]");
    }
}
