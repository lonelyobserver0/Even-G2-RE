package z0;

import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f23671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23673c;

    public f(String str, String str2, String str3) {
        this.f23671a = str;
        this.f23672b = str2;
        this.f23673c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            int i3 = AbstractC1560u.f20190a;
            if (Objects.equals(this.f23671a, fVar.f23671a) && Objects.equals(this.f23672b, fVar.f23672b) && Objects.equals(this.f23673c, fVar.f23673c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f23671a.hashCode() * 31;
        String str = this.f23672b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23673c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
