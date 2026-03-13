package H0;

import M4.e0;
import com.stub.StubApp;
import java.util.HashMap;
import java.util.Locale;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: H0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0058a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2521a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2523c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2524d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2525e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public int f2526f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f2527g;

    /* renamed from: h, reason: collision with root package name */
    public String f2528h;

    /* renamed from: i, reason: collision with root package name */
    public String f2529i;

    public C0058a(String str, int i3, String str2, int i10) {
        this.f2521a = str;
        this.f2522b = i3;
        this.f2523c = str2;
        this.f2524d = i10;
    }

    public static String b(int i3, int i10, int i11, String str) {
        int i12 = AbstractC1560u.f20190a;
        Locale locale = Locale.US;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append(StubApp.getString2(397));
        sb2.append(str);
        String string2 = StubApp.getString2(601);
        sb2.append(string2);
        sb2.append(i10);
        sb2.append(string2);
        sb2.append(i11);
        return sb2.toString();
    }

    public final C0060c a() {
        String b2;
        C0059b a3;
        String string2 = StubApp.getString2(2386);
        HashMap hashMap = this.f2525e;
        try {
            if (hashMap.containsKey(string2)) {
                String str = (String) hashMap.get(string2);
                int i3 = AbstractC1560u.f20190a;
                a3 = C0059b.a(str);
            } else {
                int i10 = this.f2524d;
                AbstractC1550k.c(i10 < 96);
                if (i10 == 0) {
                    b2 = b(0, 8000, 1, StubApp.getString2("2390"));
                } else if (i10 != 8) {
                    String string22 = StubApp.getString2("2387");
                    if (i10 == 10) {
                        b2 = b(10, 44100, 2, string22);
                    } else {
                        if (i10 != 11) {
                            throw new IllegalStateException(i2.u.p(i10, StubApp.getString2("2388")));
                        }
                        b2 = b(11, 44100, 1, string22);
                    }
                } else {
                    b2 = b(8, 8000, 1, StubApp.getString2("2389"));
                }
                a3 = C0059b.a(b2);
            }
            return new C0060c(this, e0.a(hashMap), a3);
        } catch (C1406C e10) {
            throw new IllegalStateException(e10);
        }
    }
}
