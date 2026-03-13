package com.mapbox.api.geocoding.v5.models;

import java.io.Serializable;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12312a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12313b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12315d;

    public d(String str, String str2, List list, List list2) {
        this.f12312a = str;
        if (list == null) {
            throw new NullPointerException("Null query");
        }
        this.f12313b = list;
        if (list2 == null) {
            throw new NullPointerException("Null features");
        }
        this.f12314c = list2;
        if (str2 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.f12315d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f12312a.equals(dVar.f12312a) && this.f12313b.equals(dVar.f12313b) && this.f12314c.equals(dVar.f12314c) && this.f12315d.equals(dVar.f12315d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f12312a.hashCode() ^ 1000003) * 1000003) ^ this.f12313b.hashCode()) * 1000003) ^ this.f12314c.hashCode()) * 1000003) ^ this.f12315d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeocodingResponse{type=");
        sb2.append(this.f12312a);
        sb2.append(", query=");
        sb2.append(this.f12313b);
        sb2.append(", features=");
        sb2.append(this.f12314c);
        sb2.append(", attribution=");
        return AbstractC1482f.k(sb2, this.f12315d, "}");
    }
}
