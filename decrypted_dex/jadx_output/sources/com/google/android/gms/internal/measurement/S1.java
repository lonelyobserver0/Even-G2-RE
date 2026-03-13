package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import t.C1691d;
import t.C1692e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class S1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1692e f11361a = new C1692e(0);

    public static synchronized void a() {
        synchronized (S1.class) {
            C1692e c1692e = f11361a;
            Iterator it = ((C1691d) c1692e.values()).iterator();
            if (it.hasNext()) {
                ((S1) it.next()).getClass();
                throw null;
            }
            c1692e.clear();
        }
    }
}
