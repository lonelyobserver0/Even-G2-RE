package c2;

import com.stub.StubApp;
import d2.InterfaceC0798a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0550b implements InterfaceC0556h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0550b f10779c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0550b f10780d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0550b f10781e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0550b f10782f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0550b f10783g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0550b f10784h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10785a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10786b;

    static {
        int i3 = 0;
        f10779c = new C0550b(StubApp.getString2(207), i3);
        f10780d = new C0550b(StubApp.getString2(3418), i3);
        int i10 = 1;
        f10781e = new C0550b(StubApp.getString2(9377), i10);
        f10782f = new C0550b(StubApp.getString2(9378), i10);
        int i11 = 2;
        f10783g = new C0550b(StubApp.getString2(9379), i11);
        f10784h = new C0550b(StubApp.getString2(9380), i11);
    }

    public /* synthetic */ C0550b(String str, int i3) {
        this.f10785a = i3;
        this.f10786b = str;
    }

    public String toString() {
        switch (this.f10785a) {
            case 0:
                return (String) this.f10786b;
            case 1:
                return (String) this.f10786b;
            case 2:
                return (String) this.f10786b;
            default:
                return super.toString();
        }
    }

    public C0550b(InterfaceC0798a windowBackend) {
        this.f10785a = 3;
        C0563o windowMetricsCalculator = C0563o.f10811b;
        Intrinsics.checkNotNullParameter(windowMetricsCalculator, "windowMetricsCalculator");
        Intrinsics.checkNotNullParameter(windowBackend, "windowBackend");
        this.f10786b = windowBackend;
    }
}
