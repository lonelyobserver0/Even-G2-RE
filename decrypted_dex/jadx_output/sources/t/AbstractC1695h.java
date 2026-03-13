package t;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1769a;

/* renamed from: t.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1695h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f21030a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f21031b = new Object();

    public static final void a(C1693f c1693f, int i3) {
        Intrinsics.checkNotNullParameter(c1693f, "<this>");
        int[] iArr = new int[i3];
        c1693f.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        c1693f.f21023a = iArr;
        Object[] objArr = new Object[i3];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        c1693f.f21024b = objArr;
    }

    public static final int b(C1693f c1693f, Object obj, int i3) {
        Intrinsics.checkNotNullParameter(c1693f, "<this>");
        int i10 = c1693f.f21025c;
        if (i10 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(c1693f, "<this>");
        try {
            int a3 = AbstractC1769a.a(c1693f.f21025c, i3, c1693f.f21023a);
            if (a3 < 0 || Intrinsics.areEqual(obj, c1693f.f21024b[a3])) {
                return a3;
            }
            int i11 = a3 + 1;
            while (i11 < i10 && c1693f.f21023a[i11] == i3) {
                if (Intrinsics.areEqual(obj, c1693f.f21024b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a3 - 1; i12 >= 0 && c1693f.f21023a[i12] == i3; i12--) {
                if (Intrinsics.areEqual(obj, c1693f.f21024b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
