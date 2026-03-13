package Kc;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class y implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final String f3858b;

    /* renamed from: a, reason: collision with root package name */
    public final C0104k f3859a;

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f3858b = separator;
    }

    public y(C0104k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f3859a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a3 = Lc.c.a(this);
        C0104k c0104k = this.f3859a;
        if (a3 == -1) {
            a3 = 0;
        } else if (a3 < c0104k.e() && c0104k.j(a3) == 92) {
            a3++;
        }
        int e10 = c0104k.e();
        int i3 = a3;
        while (a3 < e10) {
            if (c0104k.j(a3) == 47 || c0104k.j(a3) == 92) {
                arrayList.add(c0104k.o(i3, a3));
                i3 = a3 + 1;
            }
            a3++;
        }
        if (i3 < c0104k.e()) {
            arrayList.add(c0104k.o(i3, c0104k.e()));
        }
        return arrayList;
    }

    public final String b() {
        C0104k c0104k = Lc.c.f4399a;
        C0104k c0104k2 = Lc.c.f4399a;
        C0104k c0104k3 = this.f3859a;
        int l9 = C0104k.l(c0104k3, c0104k2);
        if (l9 == -1) {
            l9 = C0104k.l(c0104k3, Lc.c.f4400b);
        }
        if (l9 != -1) {
            c0104k3 = C0104k.p(c0104k3, l9 + 1, 0, 2);
        } else if (g() != null && c0104k3.e() == 2) {
            c0104k3 = C0104k.f3820d;
        }
        return c0104k3.s();
    }

    public final y c() {
        C0104k c0104k = Lc.c.f4402d;
        C0104k c0104k2 = this.f3859a;
        if (Intrinsics.areEqual(c0104k2, c0104k)) {
            return null;
        }
        C0104k c0104k3 = Lc.c.f4399a;
        if (Intrinsics.areEqual(c0104k2, c0104k3)) {
            return null;
        }
        C0104k prefix = Lc.c.f4400b;
        if (Intrinsics.areEqual(c0104k2, prefix)) {
            return null;
        }
        C0104k suffix = Lc.c.f4403e;
        c0104k2.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int e10 = c0104k2.e();
        byte[] bArr = suffix.f3821a;
        if (c0104k2.n(e10 - bArr.length, suffix, bArr.length) && (c0104k2.e() == 2 || c0104k2.n(c0104k2.e() - 3, c0104k3, 1) || c0104k2.n(c0104k2.e() - 3, prefix, 1))) {
            return null;
        }
        int l9 = C0104k.l(c0104k2, c0104k3);
        if (l9 == -1) {
            l9 = C0104k.l(c0104k2, prefix);
        }
        if (l9 == 2 && g() != null) {
            if (c0104k2.e() == 3) {
                return null;
            }
            return new y(C0104k.p(c0104k2, 0, 3, 1));
        }
        if (l9 == 1) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            if (c0104k2.n(0, prefix, prefix.e())) {
                return null;
            }
        }
        if (l9 != -1 || g() == null) {
            return l9 == -1 ? new y(c0104k) : l9 == 0 ? new y(C0104k.p(c0104k2, 0, 1, 1)) : new y(C0104k.p(c0104k2, 0, l9, 1));
        }
        if (c0104k2.e() == 2) {
            return null;
        }
        return new y(C0104k.p(c0104k2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y other = (y) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f3859a.compareTo(other.f3859a);
    }

    public final y d(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        C0101h c0101h = new C0101h();
        c0101h.W(child);
        return Lc.c.b(this, Lc.c.d(c0101h, false), false);
    }

    public final File e() {
        return new File(this.f3859a.s());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && Intrinsics.areEqual(((y) obj).f3859a, this.f3859a);
    }

    public final Path f() {
        Path path = Paths.get(this.f3859a.s(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public final Character g() {
        C0104k c0104k = Lc.c.f4399a;
        C0104k c0104k2 = this.f3859a;
        if (C0104k.h(c0104k2, c0104k) != -1 || c0104k2.e() < 2 || c0104k2.j(1) != 58) {
            return null;
        }
        char j = (char) c0104k2.j(0);
        if (('a' > j || j >= '{') && ('A' > j || j >= '[')) {
            return null;
        }
        return Character.valueOf(j);
    }

    public final int hashCode() {
        return this.f3859a.hashCode();
    }

    public final String toString() {
        return this.f3859a.s();
    }
}
