package com.google.protobuf;

import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Y extends Z {
    @Override // com.google.protobuf.Z
    public final void a(long j, Object obj) {
        AbstractC0721d abstractC0721d = (AbstractC0721d) ((P) G0.f12099c.k(j, obj));
        if (abstractC0721d.f12144a) {
            abstractC0721d.f12144a = false;
        }
    }

    @Override // com.google.protobuf.Z
    public final void b(Object obj, long j, Object obj2) {
        F0 f02 = G0.f12099c;
        P p8 = (P) f02.k(j, obj);
        P p9 = (P) f02.k(j, obj2);
        int size = p8.size();
        int size2 = p9.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0721d) p8).f12144a) {
                p8 = p8.e(size2 + size);
            }
            p8.addAll(p9);
        }
        if (size > 0) {
            p9 = p8;
        }
        G0.p(obj, j, p9);
    }

    @Override // com.google.protobuf.Z
    public final List c(long j, Object obj) {
        P p8 = (P) G0.f12099c.k(j, obj);
        if (((AbstractC0721d) p8).f12144a) {
            return p8;
        }
        int size = p8.size();
        P e10 = p8.e(size == 0 ? 10 : size * 2);
        G0.p(obj, j, e10);
        return e10;
    }
}
