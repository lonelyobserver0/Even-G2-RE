package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.stub.StubApp;
import i5.C1059c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class B1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1059c f11234a;

    static {
        C1059c c1059c;
        Uri uri = C1.f11238a;
        synchronized (D1.class) {
            try {
                if (D1.f11246a == null) {
                    C1059c c1059c2 = new C1059c(6);
                    synchronized (D1.class) {
                        if (D1.f11246a != null) {
                            throw new IllegalStateException(StubApp.getString2("11568"));
                        }
                        D1.f11246a = c1059c2;
                    }
                }
                c1059c = D1.f11246a;
            } catch (Throwable th) {
                throw th;
            }
        }
        f11234a = c1059c;
    }
}
