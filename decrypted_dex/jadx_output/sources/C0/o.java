package C0;

import android.util.Base64;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.AbstractC1430e;
import o0.C1406C;
import o0.C1434i;
import o0.C1435j;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements P0.q {

    /* renamed from: a, reason: collision with root package name */
    public final l f1033a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1034b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f1001c = Pattern.compile(StubApp.getString2(826));

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f1002d = Pattern.compile(StubApp.getString2(827));

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f1003e = Pattern.compile(StubApp.getString2(828));

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f1004f = Pattern.compile(StubApp.getString2(829));

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f1005g = Pattern.compile(StubApp.getString2(830));

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f1006h = Pattern.compile(StubApp.getString2(831));
    public static final Pattern j = Pattern.compile(StubApp.getString2(832));

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f1007k = Pattern.compile(StubApp.getString2(833));

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f1009l = Pattern.compile(StubApp.getString2(834));

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f1011m = Pattern.compile(StubApp.getString2(835));

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f1013n = Pattern.compile(StubApp.getString2(836));

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f1016p = Pattern.compile(StubApp.getString2(837));

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f1018q = Pattern.compile(StubApp.getString2(838));

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f1020r = Pattern.compile(StubApp.getString2(839));

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f1022s = Pattern.compile(StubApp.getString2(840));

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f1024t = Pattern.compile(StubApp.getString2(841));

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f1027v = a(StubApp.getString2(842));

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f1029w = Pattern.compile(StubApp.getString2(843));

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f1030x = Pattern.compile(StubApp.getString2(844));

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f1031y = Pattern.compile(StubApp.getString2(845));

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f1032z = a(StubApp.getString2(846));

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f983A = Pattern.compile(StubApp.getString2(847));

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f984B = Pattern.compile(StubApp.getString2(848));

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f985C = Pattern.compile(StubApp.getString2(849));

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f986D = Pattern.compile(StubApp.getString2(850));

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f987E = Pattern.compile(StubApp.getString2(851));

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f988F = Pattern.compile(StubApp.getString2(852));

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f989G = Pattern.compile(StubApp.getString2(853));

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f990H = Pattern.compile(StubApp.getString2(854));

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f991I = Pattern.compile(StubApp.getString2(855));

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f992K = Pattern.compile(StubApp.getString2(856));

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f993L = Pattern.compile(StubApp.getString2(857));

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f994O = Pattern.compile(StubApp.getString2(858));

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f995P = Pattern.compile(StubApp.getString2(859));

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f996R = Pattern.compile(StubApp.getString2(860));

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f997T = Pattern.compile(StubApp.getString2(861));

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f998X = Pattern.compile(StubApp.getString2(862));

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f999Y = Pattern.compile(StubApp.getString2(863));

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f1000Z = Pattern.compile(StubApp.getString2(864));
    public static final Pattern h0 = Pattern.compile(StubApp.getString2(865));

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f1008k0 = Pattern.compile(StubApp.getString2(866));

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f1010l0 = Pattern.compile(StubApp.getString2(867));

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f1012m0 = Pattern.compile(StubApp.getString2(868));

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f1014n0 = a(StubApp.getString2(869));

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f1015o0 = a(StubApp.getString2(208));

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f1017p0 = a(StubApp.getString2(870));

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f1019q0 = a(StubApp.getString2(871));

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f1021r0 = a(StubApp.getString2(872));

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f1023s0 = a(StubApp.getString2(873));

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f1025t0 = Pattern.compile(StubApp.getString2(874));

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f1026u0 = Pattern.compile(StubApp.getString2(875));

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f1028v0 = Pattern.compile(StubApp.getString2(876));

    public o(l lVar, i iVar) {
        this.f1033a = lVar;
        this.f1034b = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat(StubApp.getString2(877)));
    }

    public static C1435j b(String str, C1434i[] c1434iArr) {
        C1434i[] c1434iArr2 = new C1434i[c1434iArr.length];
        for (int i3 = 0; i3 < c1434iArr.length; i3++) {
            C1434i c1434i = c1434iArr[i3];
            c1434iArr2[i3] = new C1434i(c1434i.f18146b, c1434i.f18147c, c1434i.f18148d, null);
        }
        return new C1435j(str, true, c1434iArr2);
    }

    public static C1434i c(String str, String str2, HashMap hashMap) {
        Pattern pattern = f995P;
        String string2 = StubApp.getString2(878);
        String j3 = j(str, pattern, string2, hashMap);
        boolean equals = StubApp.getString2(879).equals(str2);
        String string22 = StubApp.getString2(880);
        Pattern pattern2 = f996R;
        if (equals) {
            String k3 = k(str, pattern2, hashMap);
            return new C1434i(AbstractC1430e.f18133d, null, string22, Base64.decode(k3.substring(k3.indexOf(44)), 0));
        }
        if (StubApp.getString2(881).equals(str2)) {
            UUID uuid = AbstractC1430e.f18133d;
            int i3 = AbstractC1560u.f20190a;
            return new C1434i(uuid, null, StubApp.getString2(882), str.getBytes(StandardCharsets.UTF_8));
        }
        if (!StubApp.getString2(883).equals(str2) || !string2.equals(j3)) {
            return null;
        }
        String k4 = k(str, pattern2, hashMap);
        byte[] decode = Base64.decode(k4.substring(k4.indexOf(44)), 0);
        UUID uuid2 = AbstractC1430e.f18134e;
        return new C1434i(uuid2, null, string22, n1.n.a(uuid2, null, decode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x085b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C0.i e(C0.l r110, C0.i r111, Q2.g r112, java.lang.String r113) {
        /*
            Method dump skipped, instructions count: 2393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.o.e(C0.l, C0.i, Q2.g, java.lang.String):C0.i");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a1, code lost:
    
        if (r13 > 0) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C0.l f(Q2.g r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.o.f(Q2.g, java.lang.String):C0.l");
    }

    public static boolean g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        return StubApp.getString2(821).equals(matcher.group(1));
    }

    public static double h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String k(String str, Pattern pattern, Map map) {
        String j3 = j(str, pattern, null, map);
        if (j3 != null) {
            return j3;
        }
        throw C1406C.b(StubApp.getString2(942) + pattern.pattern() + StubApp.getString2(943) + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f1028v0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[Catch: all -> 0x009e, LOOP:0: B:13:0x006d->B:38:0x006d, LOOP_START, TryCatch #0 {all -> 0x009e, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006d, B:15:0x0073, B:18:0x007e, B:53:0x008a, B:20:0x00a1, B:22:0x00ad, B:24:0x00b9, B:26:0x00c5, B:28:0x00d1, B:30:0x00dd, B:32:0x00e9, B:34:0x00f5, B:36:0x0102, B:41:0x0107, B:62:0x012e, B:63:0x0138, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x004c, B:81:0x0055, B:83:0x005b, B:85:0x0061, B:87:0x0066), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #0 {all -> 0x009e, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x006d, B:15:0x0073, B:18:0x007e, B:53:0x008a, B:20:0x00a1, B:22:0x00ad, B:24:0x00b9, B:26:0x00c5, B:28:0x00d1, B:30:0x00dd, B:32:0x00e9, B:34:0x00f5, B:36:0x0102, B:41:0x0107, B:62:0x012e, B:63:0x0138, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x004c, B:81:0x0055, B:83:0x005b, B:85:0x0061, B:87:0x0066), top: B:2:0x000f }] */
    @Override // P0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.net.Uri r7, t0.C1710j r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.o.d(android.net.Uri, t0.j):java.lang.Object");
    }
}
