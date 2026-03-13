package com.mapbox.api.optimization.v1.models;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f12367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12368b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12369c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f12370d;

    public b(int i3, int i10, String str, double[] dArr) {
        this.f12367a = i3;
        this.f12368b = i10;
        this.f12369c = str;
        this.f12370d = dArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f12367a == bVar.f12367a && this.f12368b == bVar.f12368b) {
                String str = bVar.f12369c;
                String str2 = this.f12369c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    boolean z2 = bVar instanceof b;
                    if (Arrays.equals(this.f12370d, bVar.f12370d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((this.f12367a ^ 1000003) * 1000003) ^ this.f12368b) * 1000003;
        String str = this.f12369c;
        return ((i3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ Arrays.hashCode(this.f12370d);
    }

    public final String toString() {
        return "OptimizationWaypoint{waypointIndex=" + this.f12367a + ", tripsIndex=" + this.f12368b + ", name=" + this.f12369c + ", rawLocation=" + Arrays.toString(this.f12370d) + "}";
    }
}
