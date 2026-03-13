package Lc;

import Kc.C0101h;
import Kc.C0104k;
import Kc.y;
import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0104k f4399a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0104k f4400b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0104k f4401c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0104k f4402d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0104k f4403e;

    static {
        C0104k c0104k = C0104k.f3820d;
        f4399a = u5.d.r(StubApp.getString2(601));
        f4400b = u5.d.r(StubApp.getString2(639));
        f4401c = u5.d.r(StubApp.getString2(25019));
        f4402d = u5.d.r(StubApp.getString2(1));
        f4403e = u5.d.r(StubApp.getString2(15721));
    }

    public static final int a(y yVar) {
        if (yVar.f3859a.e() != 0) {
            C0104k c0104k = yVar.f3859a;
            if (c0104k.j(0) != 47) {
                if (c0104k.j(0) == 92) {
                    if (c0104k.e() > 2 && c0104k.j(1) == 92) {
                        C0104k other = f4400b;
                        Intrinsics.checkNotNullParameter(other, "other");
                        int g10 = c0104k.g(2, other.f3821a);
                        return g10 == -1 ? c0104k.e() : g10;
                    }
                } else if (c0104k.e() > 2 && c0104k.j(1) == 58 && c0104k.j(2) == 92) {
                    char j = (char) c0104k.j(0);
                    if ('a' <= j && j < '{') {
                        return 3;
                    }
                    if ('A' <= j && j < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final y b(y yVar, y child, boolean z2) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        C0104k c10 = c(yVar);
        if (c10 == null && (c10 = c(child)) == null) {
            c10 = f(y.f3858b);
        }
        C0101h c0101h = new C0101h();
        c0101h.N(yVar.f3859a);
        if (c0101h.f3819b > 0) {
            c0101h.N(c10);
        }
        c0101h.N(child.f3859a);
        return d(c0101h, z2);
    }

    public static final C0104k c(y yVar) {
        C0104k c0104k = yVar.f3859a;
        C0104k c0104k2 = f4399a;
        if (C0104k.h(c0104k, c0104k2) != -1) {
            return c0104k2;
        }
        C0104k c0104k3 = f4400b;
        if (C0104k.h(yVar.f3859a, c0104k3) != -1) {
            return c0104k3;
        }
        return null;
    }

    public static final y d(C0101h c0101h, boolean z2) {
        long j;
        C0104k c0104k;
        C0104k c0104k2;
        char h2;
        C0104k c0104k3;
        C0104k f10;
        Intrinsics.checkNotNullParameter(c0101h, "<this>");
        C0101h c0101h2 = new C0101h();
        C0104k c0104k4 = null;
        int i3 = 0;
        while (true) {
            j = 0;
            if (!c0101h.p(0L, f4399a)) {
                c0104k = f4400b;
                if (!c0101h.p(0L, c0104k)) {
                    break;
                }
            }
            byte readByte = c0101h.readByte();
            if (c0104k4 == null) {
                c0104k4 = e(readByte);
            }
            i3++;
        }
        boolean z10 = i3 >= 2 && Intrinsics.areEqual(c0104k4, c0104k);
        C0104k c0104k5 = f4401c;
        if (z10) {
            Intrinsics.checkNotNull(c0104k4);
            c0101h2.N(c0104k4);
            c0101h2.N(c0104k4);
        } else if (i3 > 0) {
            Intrinsics.checkNotNull(c0104k4);
            c0101h2.N(c0104k4);
        } else {
            long k3 = c0101h.k(c0104k5);
            if (c0104k4 == null) {
                c0104k4 = k3 == -1 ? f(y.f3858b) : e(c0101h.h(k3));
            }
            if (Intrinsics.areEqual(c0104k4, c0104k)) {
                c0104k2 = c0104k4;
                if (c0101h.f3819b >= 2 && c0101h.h(1L) == 58 && (('a' <= (h2 = (char) c0101h.h(0L)) && h2 < '{') || ('A' <= h2 && h2 < '['))) {
                    if (k3 == 2) {
                        c0101h2.E(3L, c0101h);
                    } else {
                        c0101h2.E(2L, c0101h);
                    }
                }
            } else {
                c0104k2 = c0104k4;
            }
            c0104k4 = c0104k2;
        }
        boolean z11 = c0101h2.f3819b > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean e10 = c0101h.e();
            c0104k3 = f4402d;
            if (e10) {
                break;
            }
            long j3 = j;
            long k4 = c0101h.k(c0104k5);
            if (k4 == -1) {
                f10 = c0101h.f(c0101h.f3819b);
            } else {
                f10 = c0101h.f(k4);
                c0101h.readByte();
            }
            C0104k c0104k6 = f4403e;
            if (Intrinsics.areEqual(f10, c0104k6)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z2 || (!z11 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), c0104k6)))) {
                        arrayList.add(f10);
                    } else if (!z10 || arrayList.size() != 1) {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!Intrinsics.areEqual(f10, c0104k3) && !Intrinsics.areEqual(f10, C0104k.f3820d)) {
                arrayList.add(f10);
            }
            j = j3;
        }
        long j10 = j;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c0101h2.N(c0104k4);
            }
            c0101h2.N((C0104k) arrayList.get(i10));
        }
        if (c0101h2.f3819b == j10) {
            c0101h2.N(c0104k3);
        }
        return new y(c0101h2.f(c0101h2.f3819b));
    }

    public static final C0104k e(byte b2) {
        if (b2 == 47) {
            return f4399a;
        }
        if (b2 == 92) {
            return f4400b;
        }
        throw new IllegalArgumentException(u.p(b2, StubApp.getString2(25392)));
    }

    public static final C0104k f(String str) {
        if (Intrinsics.areEqual(str, "/")) {
            return f4399a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return f4400b;
        }
        throw new IllegalArgumentException(E1.a.j(StubApp.getString2(25392), str));
    }
}
