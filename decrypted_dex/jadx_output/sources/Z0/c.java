package Z0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends Mb.b {

    /* renamed from: b, reason: collision with root package name */
    public long f8935b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f8936c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f8937d;

    public static Serializable l(int i3, C1553n c1553n) {
        if (i3 == 0) {
            return Double.valueOf(Double.longBitsToDouble(c1553n.o()));
        }
        if (i3 == 1) {
            return Boolean.valueOf(c1553n.u() == 1);
        }
        if (i3 == 2) {
            return n(c1553n);
        }
        if (i3 != 3) {
            if (i3 == 8) {
                return m(c1553n);
            }
            if (i3 != 10) {
                if (i3 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c1553n.o()));
                c1553n.H(2);
                return date;
            }
            int y10 = c1553n.y();
            ArrayList arrayList = new ArrayList(y10);
            for (int i10 = 0; i10 < y10; i10++) {
                Serializable l9 = l(c1553n.u(), c1553n);
                if (l9 != null) {
                    arrayList.add(l9);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String n10 = n(c1553n);
            int u2 = c1553n.u();
            if (u2 == 9) {
                return hashMap;
            }
            Serializable l10 = l(u2, c1553n);
            if (l10 != null) {
                hashMap.put(n10, l10);
            }
        }
    }

    public static HashMap m(C1553n c1553n) {
        int y10 = c1553n.y();
        HashMap hashMap = new HashMap(y10);
        for (int i3 = 0; i3 < y10; i3++) {
            String n10 = n(c1553n);
            Serializable l9 = l(c1553n.u(), c1553n);
            if (l9 != null) {
                hashMap.put(n10, l9);
            }
        }
        return hashMap;
    }

    public static String n(C1553n c1553n) {
        int A4 = c1553n.A();
        int i3 = c1553n.f20177b;
        c1553n.H(A4);
        return new String(c1553n.f20176a, i3, A4);
    }
}
