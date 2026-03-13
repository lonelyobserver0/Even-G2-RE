package com.mapbox.api.matching.v5.models;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12359a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f12360b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12361c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12362d;

    /* renamed from: e, reason: collision with root package name */
    public final double[] f12363e;

    public d(Integer num, Integer num2, Integer num3, String str, double[] dArr) {
        this.f12359a = num;
        this.f12360b = num2;
        this.f12361c = num3;
        this.f12362d = str;
        this.f12363e = dArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f12359a;
            if (num != null ? num.equals(dVar.f12359a) : dVar.f12359a == null) {
                Integer num2 = this.f12360b;
                if (num2 != null ? num2.equals(dVar.f12360b) : dVar.f12360b == null) {
                    Integer num3 = this.f12361c;
                    if (num3 != null ? num3.equals(dVar.f12361c) : dVar.f12361c == null) {
                        String str = this.f12362d;
                        if (str != null ? str.equals(dVar.f12362d) : dVar.f12362d == null) {
                            if (Arrays.equals(this.f12363e, dVar instanceof d ? dVar.f12363e : dVar.f12363e)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f12359a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        Integer num2 = this.f12360b;
        int hashCode2 = (hashCode ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Integer num3 = this.f12361c;
        int hashCode3 = (hashCode2 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        String str = this.f12362d;
        return (((str != null ? str.hashCode() : 0) ^ hashCode3) * 1000003) ^ Arrays.hashCode(this.f12363e);
    }

    public final String toString() {
        return "MapMatchingTracepoint{matchingsIndex=" + this.f12359a + ", alternativesCount=" + this.f12360b + ", waypointIndex=" + this.f12361c + ", name=" + this.f12362d + ", rawLocation=" + Arrays.toString(this.f12363e) + "}";
    }
}
