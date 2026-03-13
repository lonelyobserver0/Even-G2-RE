package r1;

import q1.i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends i implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public long f20283l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (k(4) != gVar.k(4)) {
            return k(4) ? 1 : -1;
        }
        long j = this.f21398g - gVar.f21398g;
        if (j == 0) {
            j = this.f20283l - gVar.f20283l;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
