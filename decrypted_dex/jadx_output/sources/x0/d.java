package x0;

import k5.C1106a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f22649d = new C1106a().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22650a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22652c;

    public d(C1106a c1106a) {
        this.f22650a = c1106a.f15434a;
        this.f22651b = c1106a.f15435b;
        this.f22652c = c1106a.f15436c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f22650a == dVar.f22650a && this.f22651b == dVar.f22651b && this.f22652c == dVar.f22652c;
    }

    public final int hashCode() {
        return ((this.f22650a ? 1 : 0) << 2) + ((this.f22651b ? 1 : 0) << 1) + (this.f22652c ? 1 : 0);
    }
}
