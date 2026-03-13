package H5;

import android.os.Build;
import com.stub.StubApp;

/* renamed from: H5.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0071d implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0071d f2848a = new C0071d();

    /* renamed from: b, reason: collision with root package name */
    public static final p5.c f2849b = p5.c.a(StubApp.getString2(2633));

    /* renamed from: c, reason: collision with root package name */
    public static final p5.c f2850c = p5.c.a(StubApp.getString2(2634));

    /* renamed from: d, reason: collision with root package name */
    public static final p5.c f2851d = p5.c.a(StubApp.getString2(2622));

    /* renamed from: e, reason: collision with root package name */
    public static final p5.c f2852e = p5.c.a(StubApp.getString2(2635));

    /* renamed from: f, reason: collision with root package name */
    public static final p5.c f2853f = p5.c.a(StubApp.getString2(2636));

    /* renamed from: g, reason: collision with root package name */
    public static final p5.c f2854g = p5.c.a(StubApp.getString2(2637));

    @Override // p5.InterfaceC1491a
    public final void a(Object obj, Object obj2) {
        C0069b c0069b = (C0069b) obj;
        p5.e eVar = (p5.e) obj2;
        eVar.b(f2849b, c0069b.f2835a);
        eVar.b(f2850c, Build.MODEL);
        eVar.b(f2851d, StubApp.getString2(2638));
        eVar.b(f2852e, Build.VERSION.RELEASE);
        eVar.b(f2853f, C.f2754b);
        eVar.b(f2854g, c0069b.f2836b);
    }
}
