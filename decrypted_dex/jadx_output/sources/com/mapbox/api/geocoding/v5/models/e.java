package com.mapbox.api.geocoding.v5.models;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f12316a;

    /* renamed from: b, reason: collision with root package name */
    public final double[] f12317b;

    public e(String str, double[] dArr) {
        this.f12316a = str;
        this.f12317b = dArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String str = this.f12316a;
            if (str != null ? str.equals(eVar.f12316a) : eVar.f12316a == null) {
                if (Arrays.equals(this.f12317b, eVar instanceof e ? eVar.f12317b : eVar.f12317b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12316a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12317b);
    }

    public final String toString() {
        return StubApp.getString2(13160) + this.f12316a + StubApp.getString2(13161) + Arrays.toString(this.f12317b) + StubApp.getString2(265);
    }
}
