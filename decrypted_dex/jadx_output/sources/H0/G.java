package H0;

import M4.Z;
import M4.e0;
import android.net.Uri;
import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2500a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2501b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2502c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2503d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2504e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2505f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f2506g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2507h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2508i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2509k;

    /* renamed from: l, reason: collision with root package name */
    public final String f2510l;

    public G(F f10) {
        this.f2500a = e0.a(f10.f2489a);
        this.f2501b = f10.f2490b.g();
        String str = f10.f2492d;
        int i3 = AbstractC1560u.f20190a;
        this.f2502c = str;
        this.f2503d = f10.f2493e;
        this.f2504e = f10.f2494f;
        this.f2506g = f10.f2495g;
        this.f2507h = f10.f2496h;
        this.f2505f = f10.f2491c;
        this.f2508i = f10.f2497i;
        this.j = f10.f2498k;
        this.f2509k = f10.f2499l;
        this.f2510l = f10.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f2505f != g10.f2505f) {
            return false;
        }
        e0 e0Var = this.f2500a;
        e0Var.getClass();
        if (!M4.r.f(e0Var, g10.f2500a) || !this.f2501b.equals(g10.f2501b)) {
            return false;
        }
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f2503d, g10.f2503d) && Objects.equals(this.f2502c, g10.f2502c) && Objects.equals(this.f2504e, g10.f2504e) && Objects.equals(this.f2510l, g10.f2510l) && Objects.equals(this.f2506g, g10.f2506g) && Objects.equals(this.j, g10.j) && Objects.equals(this.f2509k, g10.f2509k) && Objects.equals(this.f2507h, g10.f2507h) && Objects.equals(this.f2508i, g10.f2508i);
    }

    public final int hashCode() {
        int hashCode = (this.f2501b.hashCode() + ((this.f2500a.hashCode() + 217) * 31)) * 31;
        String str = this.f2503d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2502c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2504e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f2505f) * 31;
        String str4 = this.f2510l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f2506g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f2509k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f2507h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f2508i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
