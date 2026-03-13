package H0;

import com.stub.StubApp;
import java.util.regex.Pattern;
import o0.C1406C;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0059b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2531b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2532c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2533d;

    public C0059b(int i3, int i10, int i11, String str) {
        this.f2530a = i3;
        this.f2531b = str;
        this.f2532c = i10;
        this.f2533d = i11;
    }

    public static C0059b a(String str) {
        int i3 = AbstractC1560u.f20190a;
        String[] split = str.split(StubApp.getString2(397), 2);
        AbstractC1550k.c(split.length == 2);
        String str2 = split[0];
        Pattern pattern = B.f2470a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i10 = -1;
            String[] split2 = split[1].trim().split(StubApp.getString2(601), -1);
            AbstractC1550k.c(split2.length >= 2);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i10 = Integer.parseInt(str4);
                    } catch (NumberFormatException e10) {
                        throw C1406C.b(str4, e10);
                    }
                }
                return new C0059b(parseInt, parseInt2, i10, split2[0]);
            } catch (NumberFormatException e11) {
                throw C1406C.b(str3, e11);
            }
        } catch (NumberFormatException e12) {
            throw C1406C.b(str2, e12);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0059b.class == obj.getClass()) {
            C0059b c0059b = (C0059b) obj;
            if (this.f2530a == c0059b.f2530a && this.f2531b.equals(c0059b.f2531b) && this.f2532c == c0059b.f2532c && this.f2533d == c0059b.f2533d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((i2.u.d((217 + this.f2530a) * 31, 31, this.f2531b) + this.f2532c) * 31) + this.f2533d;
    }
}
