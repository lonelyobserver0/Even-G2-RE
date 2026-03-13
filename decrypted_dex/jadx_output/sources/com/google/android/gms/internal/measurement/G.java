package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G extends AbstractBinderC0700x implements L {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f11270e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11271f;

    public G() {
        super(StubApp.getString2(11676));
        this.f11270e = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get(com.stub.StubApp.getString2(1269));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(android.os.Bundle r3, java.lang.Class r4) {
        /*
            if (r3 == 0) goto L3e
            r0 = 1269(0x4f5, float:1.778E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L14
            return r3
        L14:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1 = 11677(0x2d9d, float:1.6363E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r2 = 81
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r3 = p0.AbstractC1482f.i(r1, r4, r2, r3)
            r4 = 2981(0xba5, float:4.177E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            android.util.Log.w(r4, r3, r0)
            throw r0
        L3e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.G.K(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0700x
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC0705y.a(parcel, Bundle.CREATOR);
        AbstractC0705y.d(parcel);
        y(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final String f(long j) {
        return (String) K(g(j), String.class);
    }

    public final Bundle g(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f11270e;
        synchronized (atomicReference) {
            if (!this.f11271f) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f11270e.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void y(Bundle bundle) {
        AtomicReference atomicReference = this.f11270e;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f11271f = true;
                } finally {
                    this.f11270e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
