package com.mapbox.api.matching.v5.models;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12356b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12357c;

    /* renamed from: d, reason: collision with root package name */
    public final List f12358d;

    public c(String str, String str2, List list, List list2) {
        if (str == null) {
            throw new NullPointerException("Null code");
        }
        this.f12355a = str;
        this.f12356b = str2;
        this.f12357c = list;
        this.f12358d = list2;
    }

    public final boolean equals(Object obj) {
        String str;
        List list;
        List list2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f12355a.equals(cVar.f12355a) && ((str = this.f12356b) != null ? str.equals(cVar.f12356b) : cVar.f12356b == null) && ((list = this.f12357c) != null ? list.equals(cVar.f12357c) : cVar.f12357c == null) && ((list2 = this.f12358d) != null ? list2.equals(cVar.f12358d) : cVar.f12358d == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12355a.hashCode() ^ 1000003) * 1000003;
        String str = this.f12356b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f12357c;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f12358d;
        return hashCode3 ^ (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapMatchingResponse{code=");
        sb2.append(this.f12355a);
        sb2.append(", message=");
        sb2.append(this.f12356b);
        sb2.append(", matchings=");
        sb2.append(this.f12357c);
        sb2.append(", tracepoints=");
        return E1.a.l("}", sb2, this.f12358d);
    }
}
