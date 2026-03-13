package s0;

import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class o implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public long f20652b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20651a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f20652b, ((o) obj).f20652b);
    }
}
