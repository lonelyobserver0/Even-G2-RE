package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11272a;

    /* renamed from: b, reason: collision with root package name */
    public final L4.k f11273b;

    public G1(Context context, L4.k kVar) {
        this.f11272a = context;
        this.f11273b = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G1) {
            G1 g12 = (G1) obj;
            if (this.f11272a.equals(g12.f11272a)) {
                L4.k kVar = g12.f11273b;
                L4.k kVar2 = this.f11273b;
                if (kVar2 != null ? kVar2.equals(kVar) : kVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11272a.hashCode() ^ 1000003;
        L4.k kVar = this.f11273b;
        return (hashCode * 1000003) ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        String obj = this.f11272a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f11273b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        E1.a.v(sb2, StubApp.getString2(11674), obj, StubApp.getString2(11675), valueOf);
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
