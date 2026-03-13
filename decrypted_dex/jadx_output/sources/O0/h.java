package O0;

import M4.AbstractC0154z;
import o0.C1438m;
import v0.AbstractC1810e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5121b;

    public h(C1438m c1438m, int i3) {
        this.f5120a = (c1438m.f18208e & 1) != 0;
        this.f5121b = AbstractC1810e.m(i3, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return AbstractC0154z.f4667a.c(this.f5121b, hVar.f5121b).c(this.f5120a, hVar.f5120a).e();
    }
}
