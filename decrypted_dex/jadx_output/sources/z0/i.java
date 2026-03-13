package z0;

import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f23682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23683b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23684c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23685d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23686e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f23682a = str;
        this.f23683b = str2;
        this.f23684c = str3;
        this.f23685d = str4;
        this.f23686e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = iVar.f23682a;
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f23682a, str) && Objects.equals(this.f23683b, iVar.f23683b) && Objects.equals(this.f23684c, iVar.f23684c) && Objects.equals(this.f23685d, iVar.f23685d) && Objects.equals(this.f23686e, iVar.f23686e);
    }

    public final int hashCode() {
        String str = this.f23682a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23683b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23684c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f23685d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f23686e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
