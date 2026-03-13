package Z9;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9135a;

    /* renamed from: b, reason: collision with root package name */
    public int f9136b;

    /* renamed from: c, reason: collision with root package name */
    public int f9137c;

    public /* synthetic */ n(int i3) {
        this.f9135a = i3;
    }

    public String toString() {
        switch (this.f9135a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                Xa.h.w(n.class, sb2, StubApp.getString2(8184));
                sb2.append(this.f9136b);
                sb2.append(StubApp.getString2(8185));
                return AbstractC1482f.f(this.f9137c, StubApp.getString2(511), sb2);
            case 5:
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(8182));
                sb3.append(this.f9136b);
                sb3.append(StubApp.getString2(8183));
                return com.mapbox.common.b.j(sb3, this.f9137c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n(int i3, int i10, int i11) {
        this.f9135a = i11;
        this.f9136b = i3;
        this.f9137c = i10;
    }
}
