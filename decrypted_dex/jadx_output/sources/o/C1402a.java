package o;

import G1.c;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1402a extends hc.b {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1402a f18011d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f18012e = new c(2);

    /* renamed from: c, reason: collision with root package name */
    public final C1403b f18013c;

    public C1402a() {
        super(14);
        this.f18013c = new C1403b();
    }

    public static C1402a Y() {
        if (f18011d != null) {
            return f18011d;
        }
        synchronized (C1402a.class) {
            try {
                if (f18011d == null) {
                    f18011d = new C1402a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f18011d;
    }
}
