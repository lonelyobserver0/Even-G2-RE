package z5;

import com.stub.StubApp;
import w.AbstractC1856e;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2010a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24109c;

    /* renamed from: d, reason: collision with root package name */
    public final b f24110d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24111e;

    public C2010a(String str, String str2, String str3, b bVar, int i3) {
        this.f24107a = str;
        this.f24108b = str2;
        this.f24109c = str3;
        this.f24110d = bVar;
        this.f24111e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2010a)) {
            return false;
        }
        C2010a c2010a = (C2010a) obj;
        String str = this.f24107a;
        if (str == null) {
            if (c2010a.f24107a != null) {
                return false;
            }
        } else if (!str.equals(c2010a.f24107a)) {
            return false;
        }
        String str2 = this.f24108b;
        if (str2 == null) {
            if (c2010a.f24108b != null) {
                return false;
            }
        } else if (!str2.equals(c2010a.f24108b)) {
            return false;
        }
        String str3 = this.f24109c;
        if (str3 == null) {
            if (c2010a.f24109c != null) {
                return false;
            }
        } else if (!str3.equals(c2010a.f24109c)) {
            return false;
        }
        b bVar = this.f24110d;
        if (bVar == null) {
            if (c2010a.f24110d != null) {
                return false;
            }
        } else if (!bVar.equals(c2010a.f24110d)) {
            return false;
        }
        int i3 = this.f24111e;
        return i3 == 0 ? c2010a.f24111e == 0 : AbstractC1856e.a(i3, c2010a.f24111e);
    }

    public final int hashCode() {
        String str = this.f24107a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f24108b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f24109c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f24110d;
        int hashCode4 = (hashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        int i3 = this.f24111e;
        return (i3 != 0 ? AbstractC1856e.c(i3) : 0) ^ hashCode4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24901));
        sb2.append(this.f24107a);
        sb2.append(StubApp.getString2(24902));
        sb2.append(this.f24108b);
        sb2.append(StubApp.getString2(24651));
        sb2.append(this.f24109c);
        sb2.append(StubApp.getString2(9598));
        sb2.append(this.f24110d);
        sb2.append(StubApp.getString2(24903));
        int i3 = this.f24111e;
        sb2.append(i3 != 1 ? i3 != 2 ? StubApp.getString2(1116) : StubApp.getString2(24904) : StubApp.getString2(421));
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
