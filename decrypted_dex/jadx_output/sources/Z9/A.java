package Z9;

import com.stub.StubApp;
import kotlin.text.Typography;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9068a;

    /* renamed from: b, reason: collision with root package name */
    public int f9069b;

    /* renamed from: c, reason: collision with root package name */
    public int f9070c;

    public /* synthetic */ A(int i3) {
        this.f9068a = i3;
    }

    public int a() {
        int i3 = this.f9070c;
        if (i3 == 2) {
            return 10;
        }
        if (i3 == 5) {
            return 11;
        }
        if (i3 == 29) {
            return 12;
        }
        if (i3 == 42) {
            return 16;
        }
        if (i3 != 22) {
            return i3 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public N5.o b() {
        return new N5.o(this.f9069b, this.f9070c);
    }

    public String toString() {
        switch (this.f9068a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                Xa.h.w(A.class, sb2, StubApp.getString2(7671));
                sb2.append(this.f9069b);
                sb2.append(StubApp.getString2(7672));
                return AbstractC1482f.f(this.f9070c, StubApp.getString2(511), sb2);
            case 1:
                StringBuilder sb3 = new StringBuilder(StubApp.getString2(2041));
                sb3.append(this.f9069b);
                sb3.append(' ');
                return com.mapbox.common.b.j(sb3, this.f9070c, Typography.greater);
            case 5:
                StringBuilder sb4 = new StringBuilder(StubApp.getString2(7669));
                sb4.append(this.f9069b);
                sb4.append(StubApp.getString2(7670));
                return com.mapbox.common.b.j(sb4, this.f9070c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ A(int i3, int i10, int i11) {
        this.f9068a = i11;
        this.f9069b = i3;
        this.f9070c = i10;
    }
}
