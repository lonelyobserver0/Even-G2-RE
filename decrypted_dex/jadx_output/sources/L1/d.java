package L1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4164b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4165c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4166d;

    public d(String from, int i3, int i10, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f4163a = i3;
        this.f4164b = i10;
        this.f4165c = from;
        this.f4166d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i3 = this.f4163a - other.f4163a;
        return i3 == 0 ? this.f4164b - other.f4164b : i3;
    }
}
