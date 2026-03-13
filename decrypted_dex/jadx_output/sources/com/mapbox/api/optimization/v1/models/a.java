package com.mapbox.api.optimization.v1.models;

import java.io.Serializable;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12364a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12365b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12366c;

    public a(String str, List list, List list2) {
        this.f12364a = str;
        this.f12365b = list;
        this.f12366c = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f12364a;
            if (str != null ? str.equals(aVar.f12364a) : aVar.f12364a == null) {
                List list = this.f12365b;
                if (list != null ? list.equals(aVar.f12365b) : aVar.f12365b == null) {
                    List list2 = this.f12366c;
                    if (list2 != null ? list2.equals(aVar.f12366c) : aVar.f12366c == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12364a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        List list = this.f12365b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f12366c;
        return (list2 != null ? list2.hashCode() : 0) ^ hashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OptimizationResponse{code=");
        sb2.append(this.f12364a);
        sb2.append(", waypoints=");
        sb2.append(this.f12365b);
        sb2.append(", trips=");
        return E1.a.l("}", sb2, this.f12366c);
    }
}
