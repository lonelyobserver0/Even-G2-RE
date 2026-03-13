package H5;

import android.os.Build;
import com.stub.StubApp;

/* renamed from: H5.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0070c implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0070c f2840a = new C0070c();

    /* renamed from: b, reason: collision with root package name */
    public static final p5.c f2841b = p5.c.a(StubApp.getString2(1415));

    /* renamed from: c, reason: collision with root package name */
    public static final p5.c f2842c = p5.c.a(StubApp.getString2(2628));

    /* renamed from: d, reason: collision with root package name */
    public static final p5.c f2843d = p5.c.a(StubApp.getString2(2629));

    /* renamed from: e, reason: collision with root package name */
    public static final p5.c f2844e = p5.c.a(StubApp.getString2(2630));

    /* renamed from: f, reason: collision with root package name */
    public static final p5.c f2845f = p5.c.a(StubApp.getString2(2631));

    /* renamed from: g, reason: collision with root package name */
    public static final p5.c f2846g = p5.c.a(StubApp.getString2(2632));

    @Override // p5.InterfaceC1491a
    public final void a(Object obj, Object obj2) {
        C0068a c0068a = (C0068a) obj;
        p5.e eVar = (p5.e) obj2;
        eVar.b(f2841b, c0068a.f2827a);
        eVar.b(f2842c, c0068a.f2828b);
        eVar.b(f2843d, c0068a.f2829c);
        eVar.b(f2844e, Build.MANUFACTURER);
        eVar.b(f2845f, c0068a.f2830d);
        eVar.b(f2846g, c0068a.f2831e);
    }
}
