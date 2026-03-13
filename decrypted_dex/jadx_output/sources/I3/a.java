package I3;

import com.stub.StubApp;
import org.bouncycastle.asn1.x509.DisplayText;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f3104f = new a(10485760, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3107c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3108d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3109e;

    public a(long j, int i3, int i10, long j3, int i11) {
        this.f3105a = j;
        this.f3106b = i3;
        this.f3107c = i10;
        this.f3108d = j3;
        this.f3109e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3105a == aVar.f3105a && this.f3106b == aVar.f3106b && this.f3107c == aVar.f3107c && this.f3108d == aVar.f3108d && this.f3109e == aVar.f3109e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3105a;
        int i3 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3106b) * 1000003) ^ this.f3107c) * 1000003;
        long j3 = this.f3108d;
        return ((i3 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f3109e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2818));
        sb2.append(this.f3105a);
        sb2.append(StubApp.getString2(2819));
        sb2.append(this.f3106b);
        sb2.append(StubApp.getString2(2820));
        sb2.append(this.f3107c);
        sb2.append(StubApp.getString2(2821));
        sb2.append(this.f3108d);
        sb2.append(StubApp.getString2(2822));
        return AbstractC1482f.f(this.f3109e, StubApp.getString2(265), sb2);
    }
}
