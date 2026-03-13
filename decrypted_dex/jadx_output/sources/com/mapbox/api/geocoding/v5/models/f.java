package com.mapbox.api.geocoding.v5.models;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f12318a;

    public f(List list) {
        this.f12318a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        List list = this.f12318a;
        return list == null ? fVar.f12318a == null : list.equals(fVar.f12318a);
    }

    public final int hashCode() {
        List list = this.f12318a;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return E1.a.l(StubApp.getString2(265), new StringBuilder(StubApp.getString2(13162)), this.f12318a);
    }
}
