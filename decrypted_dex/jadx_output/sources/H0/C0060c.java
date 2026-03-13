package H0;

import M4.e0;
import java.util.Objects;
import r0.AbstractC1560u;

/* renamed from: H0.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0060c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2535b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2536c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2537d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2538e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2539f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2540g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2541h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f2542i;
    public final C0059b j;

    public C0060c(C0058a c0058a, e0 e0Var, C0059b c0059b) {
        this.f2534a = c0058a.f2521a;
        this.f2535b = c0058a.f2522b;
        this.f2536c = c0058a.f2523c;
        this.f2537d = c0058a.f2524d;
        this.f2539f = c0058a.f2527g;
        this.f2540g = c0058a.f2528h;
        this.f2538e = c0058a.f2526f;
        this.f2541h = c0058a.f2529i;
        this.f2542i = e0Var;
        this.j = c0059b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0060c.class == obj.getClass()) {
            C0060c c0060c = (C0060c) obj;
            if (this.f2534a.equals(c0060c.f2534a) && this.f2535b == c0060c.f2535b && this.f2536c.equals(c0060c.f2536c) && this.f2537d == c0060c.f2537d && this.f2538e == c0060c.f2538e) {
                e0 e0Var = this.f2542i;
                e0Var.getClass();
                if (M4.r.f(e0Var, c0060c.f2542i) && this.j.equals(c0060c.j)) {
                    int i3 = AbstractC1560u.f20190a;
                    if (Objects.equals(this.f2539f, c0060c.f2539f) && Objects.equals(this.f2540g, c0060c.f2540g) && Objects.equals(this.f2541h, c0060c.f2541h)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.f2542i.hashCode() + ((((i2.u.d((i2.u.d(217, 31, this.f2534a) + this.f2535b) * 31, 31, this.f2536c) + this.f2537d) * 31) + this.f2538e) * 31)) * 31)) * 31;
        String str = this.f2539f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2540g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2541h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
