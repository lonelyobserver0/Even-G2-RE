package ta;

import com.stub.StubApp;
import fa.C0935a;
import java.util.Arrays;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1473f;
import oa.l;

/* renamed from: ta.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1747g implements InterfaceC1743c {

    /* renamed from: b, reason: collision with root package name */
    public static final C1747g f21254b = new C1747g(612.0f, 792.0f);

    /* renamed from: a, reason: collision with root package name */
    public final C1468a f21255a;

    static {
        new C1747g(612.0f, 1008.0f);
        new C1747g(2383.937f, 3370.3938f);
        new C1747g(1683.7795f, 2383.937f);
        new C1747g(1190.5513f, 1683.7795f);
        new C1747g(841.8898f, 1190.5513f);
        new C1747g(595.27563f, 841.8898f);
        new C1747g(419.52756f, 595.27563f);
        new C1747g(297.63782f, 419.52756f);
    }

    public C1747g(float f10, float f11) {
        this(0.0f, 0.0f, f10, f11);
    }

    public final float a() {
        return ((l) this.f21255a.d(0)).a();
    }

    public final float b() {
        return ((l) this.f21255a.d(1)).a();
    }

    public final float c() {
        return ((l) this.f21255a.d(2)).a();
    }

    public final float d() {
        return ((l) this.f21255a.d(3)).a();
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f21255a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        sb2.append(a());
        String string2 = StubApp.getString2(321);
        sb2.append(string2);
        sb2.append(b());
        sb2.append(string2);
        sb2.append(c());
        sb2.append(string2);
        sb2.append(d());
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    public C1747g(float f10, float f11, float f12, float f13) {
        C1468a c1468a = new C1468a();
        this.f21255a = c1468a;
        c1468a.a(new C1473f(f10));
        c1468a.a(new C1473f(f11));
        c1468a.a(new C1473f(f10 + f12));
        c1468a.a(new C1473f(f11 + f13));
    }

    public C1747g(C0935a c0935a) {
        C1468a c1468a = new C1468a();
        this.f21255a = c1468a;
        c1468a.a(new C1473f(c0935a.f14184a));
        c1468a.a(new C1473f(c0935a.f14185b));
        c1468a.a(new C1473f(c0935a.f14186c));
        c1468a.a(new C1473f(c0935a.f14187d));
    }

    public C1747g(C1468a c1468a) {
        float[] copyOf = Arrays.copyOf(c1468a.K(), 4);
        C1468a c1468a2 = new C1468a();
        this.f21255a = c1468a2;
        c1468a2.a(new C1473f(Math.min(copyOf[0], copyOf[2])));
        c1468a2.a(new C1473f(Math.min(copyOf[1], copyOf[3])));
        c1468a2.a(new C1473f(Math.max(copyOf[0], copyOf[2])));
        c1468a2.a(new C1473f(Math.max(copyOf[1], copyOf[3])));
    }
}
