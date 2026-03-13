package c5;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0569b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10863b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10864c;

    public C0569b(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(9444));
        }
        this.f10862a = str;
        this.f10863b = str2;
        this.f10864c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0569b) {
            C0569b c0569b = (C0569b) obj;
            if (this.f10862a.equals(c0569b.f10862a)) {
                String str = c0569b.f10863b;
                String str2 = this.f10863b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c0569b.f10864c;
                    String str4 = this.f10864c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f10862a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10863b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f10864c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(9445));
        sb2.append(this.f10862a);
        sb2.append(StubApp.getString2(2588));
        sb2.append(this.f10863b);
        sb2.append(StubApp.getString2(2589));
        return AbstractC1482f.k(sb2, this.f10864c, StubApp.getString2(265));
    }
}
