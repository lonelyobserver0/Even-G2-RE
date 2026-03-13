package l4;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.EnumMap;
import java.util.Iterator;

/* renamed from: l4.z0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1224z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1224z0 f16709c = new C1224z0(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f16710a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16711b;

    public C1224z0(int i3) {
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        this.f16710a = enumMap;
        EnumC1222y0 enumC1222y0 = EnumC1222y0.f16684b;
        EnumC1218w0 enumC1218w0 = EnumC1218w0.f16645b;
        enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) enumC1218w0);
        enumMap.put((EnumMap) EnumC1222y0.f16685c, (EnumC1222y0) enumC1218w0);
        this.f16711b = i3;
    }

    public static String a(int i3) {
        return i3 != -30 ? i3 != -20 ? i3 != -10 ? i3 != 0 ? i3 != 30 ? i3 != 90 ? i3 != 100 ? StubApp.getString2(3750) : StubApp.getString2(343) : StubApp.getString2(20927) : StubApp.getString2(20928) : StubApp.getString2(20929) : StubApp.getString2(20468) : StubApp.getString2(9589) : StubApp.getString2(20470);
    }

    public static C1224z0 b(int i3, Bundle bundle) {
        if (bundle == null) {
            return new C1224z0(i3);
        }
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) d(bundle.getString(enumC1222y0.f16689a)));
        }
        return new C1224z0(enumMap, i3);
    }

    public static C1224z0 c(int i3, String str) {
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        EnumC1220x0 enumC1220x0 = EnumC1220x0.f16655b;
        int i10 = 0;
        while (true) {
            EnumC1222y0[] enumC1222y0Arr = enumC1220x0.f16658a;
            if (i10 >= enumC1222y0Arr.length) {
                return new C1224z0(enumMap, i3);
            }
            String str2 = str == null ? "" : str;
            EnumC1222y0 enumC1222y0 = enumC1222y0Arr[i10];
            int i11 = i10 + 2;
            if (i11 < str2.length()) {
                enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) e(str2.charAt(i11)));
            } else {
                enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) EnumC1218w0.f16645b);
            }
            i10++;
        }
    }

    public static EnumC1218w0 d(String str) {
        EnumC1218w0 enumC1218w0 = EnumC1218w0.f16645b;
        return str == null ? enumC1218w0 : str.equals(StubApp.getString2(12542)) ? EnumC1218w0.f16648e : str.equals(StubApp.getString2(12543)) ? EnumC1218w0.f16647d : enumC1218w0;
    }

    public static EnumC1218w0 e(char c10) {
        return c10 != '+' ? c10 != '0' ? c10 != '1' ? EnumC1218w0.f16645b : EnumC1218w0.f16648e : EnumC1218w0.f16647d : EnumC1218w0.f16646c;
    }

    public static char h(EnumC1218w0 enumC1218w0) {
        if (enumC1218w0 == null) {
            return '-';
        }
        int ordinal = enumC1218w0.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal != 2) {
            return ordinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i3, int i10) {
        int i11 = -30;
        if (i3 == -20) {
            if (i10 == -30) {
                return true;
            }
            i3 = -20;
        }
        if (i3 != -30) {
            i11 = i3;
        } else if (i10 == -20) {
            return true;
        }
        return i11 == i10 || i3 < i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1224z0)) {
            return false;
        }
        C1224z0 c1224z0 = (C1224z0) obj;
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            if (this.f16710a.get(enumC1222y0) != c1224z0.f16710a.get(enumC1222y0)) {
                return false;
            }
        }
        return this.f16711b == c1224z0.f16711b;
    }

    public final String f() {
        int ordinal;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20343));
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            EnumC1218w0 enumC1218w0 = (EnumC1218w0) this.f16710a.get(enumC1222y0);
            char c10 = '-';
            if (enumC1218w0 != null && (ordinal = enumC1218w0.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c10 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20343));
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            sb2.append(h((EnumC1218w0) this.f16710a.get(enumC1222y0)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f16710a.values().iterator();
        int i3 = this.f16711b * 17;
        while (it.hasNext()) {
            i3 = (i3 * 31) + ((EnumC1218w0) it.next()).hashCode();
        }
        return i3;
    }

    public final boolean i(EnumC1222y0 enumC1222y0) {
        return ((EnumC1218w0) this.f16710a.get(enumC1222y0)) != EnumC1218w0.f16647d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.C1224z0 j(l4.C1224z0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<l4.y0> r1 = l4.EnumC1222y0.class
            r0.<init>(r1)
            l4.x0 r1 = l4.EnumC1220x0.f16655b
            l4.y0[] r1 = r1.f16658a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f16710a
            java.lang.Object r5 = r5.get(r4)
            l4.w0 r5 = (l4.EnumC1218w0) r5
            java.util.EnumMap r6 = r9.f16710a
            java.lang.Object r6 = r6.get(r4)
            l4.w0 r6 = (l4.EnumC1218w0) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            l4.w0 r7 = l4.EnumC1218w0.f16645b
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            l4.w0 r7 = l4.EnumC1218w0.f16646c
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            l4.w0 r7 = l4.EnumC1218w0.f16647d
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            l4.w0 r5 = l4.EnumC1218w0.f16648e
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            l4.z0 r9 = new l4.z0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1224z0.j(l4.z0):l4.z0");
    }

    public final C1224z0 k(C1224z0 c1224z0) {
        EnumMap enumMap = new EnumMap(EnumC1222y0.class);
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            EnumC1218w0 enumC1218w0 = (EnumC1218w0) this.f16710a.get(enumC1222y0);
            if (enumC1218w0 == EnumC1218w0.f16645b) {
                enumC1218w0 = (EnumC1218w0) c1224z0.f16710a.get(enumC1222y0);
            }
            if (enumC1218w0 != null) {
                enumMap.put((EnumMap) enumC1222y0, (EnumC1222y0) enumC1218w0);
            }
        }
        return new C1224z0(enumMap, this.f16711b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(20872));
        sb2.append(a(this.f16711b));
        for (EnumC1222y0 enumC1222y0 : EnumC1220x0.f16655b.f16658a) {
            sb2.append(StubApp.getString2(321));
            sb2.append(enumC1222y0.f16689a);
            sb2.append(StubApp.getString2(2359));
            EnumC1218w0 enumC1218w0 = (EnumC1218w0) this.f16710a.get(enumC1222y0);
            if (enumC1218w0 == null) {
                enumC1218w0 = EnumC1218w0.f16645b;
            }
            sb2.append(enumC1218w0);
        }
        return sb2.toString();
    }

    public C1224z0(EnumMap enumMap, int i3) {
        EnumMap enumMap2 = new EnumMap(EnumC1222y0.class);
        this.f16710a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16711b = i3;
    }
}
