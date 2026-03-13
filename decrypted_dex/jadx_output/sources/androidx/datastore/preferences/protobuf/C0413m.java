package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0413m {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0413m f9818b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0413m f9819c = new C0413m();

    /* renamed from: a, reason: collision with root package name */
    public final Map f9820a = Collections.EMPTY_MAP;

    public static C0413m a() {
        C0413m c0413m;
        Q q10 = Q.f9734c;
        C0413m c0413m2 = f9818b;
        if (c0413m2 != null) {
            return c0413m2;
        }
        synchronized (C0413m.class) {
            try {
                c0413m = f9818b;
                if (c0413m == null) {
                    Class cls = AbstractC0412l.f9817a;
                    C0413m c0413m3 = null;
                    if (cls != null) {
                        try {
                            c0413m3 = (C0413m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    c0413m = c0413m3 != null ? c0413m3 : f9819c;
                    f9818b = c0413m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0413m;
    }
}
