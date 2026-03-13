package com.google.protobuf;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0750u {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0750u f12227b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0750u f12228c = new C0750u();

    /* renamed from: a, reason: collision with root package name */
    public final Map f12229a = Collections.EMPTY_MAP;

    public static C0750u a() {
        C0750u c0750u;
        C0750u c0750u2 = f12227b;
        if (c0750u2 != null) {
            return c0750u2;
        }
        synchronized (C0750u.class) {
            try {
                c0750u = f12227b;
                if (c0750u == null) {
                    String string2 = StubApp.getString2("12661");
                    Class cls = AbstractC0749t.f12222a;
                    C0750u c0750u3 = null;
                    if (cls != null) {
                        try {
                            c0750u3 = (C0750u) cls.getDeclaredMethod(string2, new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c0750u = c0750u3 != null ? c0750u3 : f12228c;
                    f12227b = c0750u;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0750u;
    }
}
