package o0;

import java.util.Arrays;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.S, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1421S {

    /* renamed from: a, reason: collision with root package name */
    public final int f18105a;

    /* renamed from: b, reason: collision with root package name */
    public final C1417N f18106b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18107c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18108d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f18109e;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
    }

    public C1421S(C1417N c1417n, boolean z2, int[] iArr, boolean[] zArr) {
        int i3 = c1417n.f18067a;
        this.f18105a = i3;
        boolean z10 = false;
        AbstractC1550k.c(i3 == iArr.length && i3 == zArr.length);
        this.f18106b = c1417n;
        if (z2 && i3 > 1) {
            z10 = true;
        }
        this.f18107c = z10;
        this.f18108d = (int[]) iArr.clone();
        this.f18109e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1421S.class == obj.getClass()) {
            C1421S c1421s = (C1421S) obj;
            if (this.f18107c == c1421s.f18107c && this.f18106b.equals(c1421s.f18106b) && Arrays.equals(this.f18108d, c1421s.f18108d) && Arrays.equals(this.f18109e, c1421s.f18109e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18109e) + ((Arrays.hashCode(this.f18108d) + (((this.f18106b.hashCode() * 31) + (this.f18107c ? 1 : 0)) * 31)) * 31);
    }
}
