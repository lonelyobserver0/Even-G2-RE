package com.mapbox.api.matching.v5.models;

import java.io.Serializable;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12343a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12344b;

    public a(String str, String str2) {
        this.f12343a = str;
        this.f12344b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            String str = this.f12343a;
            if (str != null ? str.equals(aVar.f12343a) : aVar.f12343a == null) {
                String str2 = this.f12344b;
                if (str2 != null ? str2.equals(aVar.f12344b) : aVar.f12344b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12343a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12344b;
        return (str2 != null ? str2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapMatchingError{code=");
        sb2.append(this.f12343a);
        sb2.append(", message=");
        return AbstractC1482f.k(sb2, this.f12344b, "}");
    }
}
