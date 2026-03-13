package com.mapbox.maps;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TileCacheBudgetInMegabytes implements Serializable {
    private final long size;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public TileCacheBudgetInMegabytes(long j) {
        this.size = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.size == ((TileCacheBudgetInMegabytes) obj).size;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.size));
    }

    public String toString() {
        return Xa.h.i(this.size, new StringBuilder("[size: "), "]");
    }
}
