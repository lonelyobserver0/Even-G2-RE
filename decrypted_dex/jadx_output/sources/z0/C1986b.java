package z0;

import f5.u0;
import java.util.Arrays;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1986b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23642a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23643b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23645d;

    public C1986b(String str, int i3, int i10, String str2) {
        this.f23642a = str;
        this.f23643b = str2;
        this.f23644c = i3;
        this.f23645d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1986b)) {
            return false;
        }
        C1986b c1986b = (C1986b) obj;
        return this.f23644c == c1986b.f23644c && this.f23645d == c1986b.f23645d && u0.j(this.f23642a, c1986b.f23642a) && u0.j(this.f23643b, c1986b.f23643b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23642a, this.f23643b, Integer.valueOf(this.f23644c), Integer.valueOf(this.f23645d)});
    }
}
