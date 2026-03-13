package E0;

import M4.F;
import M4.I;
import M4.Z;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o0.AbstractC1405B;
import o0.C1438m;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1863a = new HashMap();

    public static void a(ArrayList arrayList, String str) {
        if (StubApp.getString2(76).equals(str)) {
            if (AbstractC1560u.f20190a < 26 && AbstractC1560u.f20191b.equals(StubApp.getString2(1691)) && arrayList.size() == 1 && ((p) arrayList.get(0)).f1777a.equals(StubApp.getString2(1598))) {
                arrayList.add(p.h(StubApp.getString2(1692), StubApp.getString2(76), StubApp.getString2(76), null, false, false));
            }
            Collections.sort(arrayList, new t(new k()));
        }
        if (AbstractC1560u.f20190a >= 32 || arrayList.size() <= 1) {
            return;
        }
        if (StubApp.getString2(1693).equals(((p) arrayList.get(0)).f1777a)) {
            arrayList.add((p) arrayList.remove(0));
        }
    }

    public static String b(C1438m c1438m) {
        Pair d8;
        if (StubApp.getString2(938).equals(c1438m.f18216n)) {
            return StubApp.getString2(935);
        }
        String string2 = StubApp.getString2(1613);
        String str = c1438m.f18216n;
        boolean equals = string2.equals(str);
        String string22 = StubApp.getString2(1610);
        if (equals && (d8 = d(c1438m)) != null) {
            int intValue = ((Integer) d8.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return string22;
            }
            if (intValue == 512) {
                return StubApp.getString2(469);
            }
            if (intValue == 1024) {
                return StubApp.getString2(1683);
            }
        }
        if (StubApp.getString2(1611).equals(str)) {
            return string22;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(StubApp.getString2(1613))) {
            if (StubApp.getString2(1694).equals(str)) {
                return StubApp.getString2(1695);
            }
            if (StubApp.getString2(1696).equals(str) || StubApp.getString2(1697).equals(str)) {
                return StubApp.getString2(1698);
            }
            return null;
        }
        if (str2.equals(StubApp.getString2(1611))) {
            if (StubApp.getString2(1699).equals(str)) {
                return StubApp.getString2(1700);
            }
            return null;
        }
        if (str2.equals(StubApp.getString2(1701)) && StubApp.getString2(1702).equals(str)) {
            return StubApp.getString2(1703);
        }
        if (str2.equals(StubApp.getString2(1627)) && StubApp.getString2(1704).equals(str)) {
            return StubApp.getString2(1705);
        }
        if (str2.equals(StubApp.getString2(1629)) && StubApp.getString2(1706).equals(str)) {
            return StubApp.getString2(1707);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0489 A[Catch: NumberFormatException -> 0x0497, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0497, blocks: (B:218:0x0436, B:220:0x044e, B:231:0x046c, B:234:0x0489), top: B:217:0x0436 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(o0.C1438m r34) {
        /*
            Method dump skipped, instructions count: 1974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.z.d(o0.m):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:4:0x000a, B:9:0x001b, B:14:0x0028, B:16:0x0030, B:18:0x0036, B:20:0x003c, B:22:0x004b, B:23:0x0078), top: B:3:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.List e(java.lang.String r5, boolean r6, boolean r7) {
        /*
            r0 = 1746(0x6d2, float:2.447E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.Class<E0.z> r1 = E0.z.class
            monitor-enter(r1)
            E0.u r2 = new E0.u     // Catch: java.lang.Throwable -> L76
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L76
            java.util.HashMap r3 = E0.z.f1863a     // Catch: java.lang.Throwable -> L76
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L76
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L1b
            monitor-exit(r1)
            return r4
        L1b:
            E0.x r4 = new E0.x     // Catch: java.lang.Throwable -> L76
            r4.<init>()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L27
            if (r7 == 0) goto L25
            goto L27
        L25:
            r7 = 0
            goto L28
        L27:
            r7 = 1
        L28:
            r4.f1861a = r7     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r7 = f(r2, r4)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L78
            boolean r6 = r7.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L78
            int r6 = r0.AbstractC1560u.f20190a     // Catch: java.lang.Throwable -> L76
            r4 = 23
            if (r6 > r4) goto L78
            C2.i r6 = new C2.i     // Catch: java.lang.Throwable -> L76
            r6.<init>()     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r7 = f(r2, r6)     // Catch: java.lang.Throwable -> L76
            boolean r6 = r7.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r6 != 0) goto L78
            java.lang.String r6 = "1747"
            java.lang.String r6 = com.stub.StubApp.getString2(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r4.append(r5)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "1748"
            java.lang.String r0 = com.stub.StubApp.getString2(r0)     // Catch: java.lang.Throwable -> L76
            r4.append(r0)     // Catch: java.lang.Throwable -> L76
            r0 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L76
            E0.p r0 = (E0.p) r0     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.f1777a     // Catch: java.lang.Throwable -> L76
            r4.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L76
            r0.AbstractC1550k.w(r6, r0)     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r5 = move-exception
            goto L84
        L78:
            a(r7, r5)     // Catch: java.lang.Throwable -> L76
            M4.I r5 = M4.I.m(r7)     // Catch: java.lang.Throwable -> L76
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r1)
            return r5
        L84:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L76
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.z.e(java.lang.String, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0117 A[Catch: Exception -> 0x0173, TRY_ENTER, TryCatch #4 {Exception -> 0x0173, blocks: (B:3:0x0012, B:5:0x0025, B:7:0x002f, B:11:0x013e, B:12:0x0037, B:16:0x0043, B:54:0x010a, B:57:0x0117, B:59:0x011d, B:62:0x0144, B:63:0x0171), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(E0.u r17, E0.w r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.z.f(E0.u, E0.w):java.util.ArrayList");
    }

    public static Z g(k kVar, C1438m c1438m, boolean z2, boolean z10) {
        List e10;
        String str = c1438m.f18216n;
        kVar.getClass();
        List e11 = e(str, z2, z10);
        String b2 = b(c1438m);
        if (b2 == null) {
            e10 = Z.f4578e;
        } else {
            kVar.getClass();
            e10 = e(b2, z2, z10);
        }
        F l9 = I.l();
        l9.d(e11);
        l9.d(e10);
        return l9.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z2 && str.endsWith(StubApp.getString2(1752))) {
            return false;
        }
        int i3 = AbstractC1560u.f20190a;
        if (i3 < 24 && ((StubApp.getString2(1757).equals(str) || StubApp.getString2(1758).equals(str)) && StubApp.getString2(1759).equals(AbstractC1560u.f20192c))) {
            String str3 = AbstractC1560u.f20191b;
            if (str3.startsWith(StubApp.getString2(1760)) || str3.startsWith(StubApp.getString2(1761)) || str3.startsWith(StubApp.getString2(1762)) || StubApp.getString2(1763).equals(str3) || StubApp.getString2(1764).equals(str3) || StubApp.getString2(1765).equals(str3) || StubApp.getString2(1766).equals(str3) || StubApp.getString2(1767).equals(str3)) {
                return false;
            }
        }
        return (i3 <= 23 && StubApp.getString2(938).equals(str2) && StubApp.getString2(1768).equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (AbstractC1560u.f20190a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (AbstractC1405B.i(str)) {
            return true;
        }
        String y10 = AbstractC0624h2.y(mediaCodecInfo.getName());
        if (y10.startsWith(StubApp.getString2(1769))) {
            return false;
        }
        if (y10.startsWith(StubApp.getString2(1749)) || y10.startsWith(StubApp.getString2(1770))) {
            return true;
        }
        if ((y10.startsWith(StubApp.getString2(1771)) && y10.contains(StubApp.getString2(1772))) || y10.equals(StubApp.getString2(1773)) || y10.startsWith(StubApp.getString2(1750)) || y10.startsWith(StubApp.getString2(1751))) {
            return true;
        }
        return (y10.startsWith(StubApp.getString2(1774)) || y10.startsWith(StubApp.getString2(1775))) ? false : true;
    }
}
