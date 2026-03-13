package com.mapbox.api.routetiles.v1.versions.models;

import com.stub.StubApp;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f12371a;

    public a(List list) {
        if (list == null) {
            throw new NullPointerException(StubApp.getString2(13173));
        }
        this.f12371a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f12371a.equals(((a) obj).f12371a);
    }

    public final int hashCode() {
        return this.f12371a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return E1.a.l(StubApp.getString2(265), new StringBuilder(StubApp.getString2(13174)), this.f12371a);
    }
}
