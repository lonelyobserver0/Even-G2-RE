package d0;

import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class K implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f13139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f13140b;

    public K(M m4, int i3) {
        this.f13140b = m4;
        this.f13139a = i3;
    }

    @Override // d0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        M m4 = this.f13140b;
        AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = m4.f13182z;
        int i3 = this.f13139a;
        if (abstractComponentCallbacksC0789t == null || i3 >= 0 || !abstractComponentCallbacksC0789t.l().R(-1, 0)) {
            return m4.S(arrayList, arrayList2, i3, 1);
        }
        return false;
    }
}
