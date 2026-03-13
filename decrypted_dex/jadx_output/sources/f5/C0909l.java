package f5;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;

/* renamed from: f5.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0909l implements p5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0909l f14063a = new C0909l();

    /* renamed from: b, reason: collision with root package name */
    public static final p5.c f14064b = p5.c.a(StubApp.getString2(17667));

    /* renamed from: c, reason: collision with root package name */
    public static final p5.c f14065c = p5.c.a(StubApp.getString2(4473));

    /* renamed from: d, reason: collision with root package name */
    public static final p5.c f14066d = p5.c.a(StubApp.getString2(ModuleDescriptor.MODULE_VERSION));

    /* renamed from: e, reason: collision with root package name */
    public static final p5.c f14067e = p5.c.a(StubApp.getString2(11240));

    @Override // p5.InterfaceC1491a
    public final void a(Object obj, Object obj2) {
        p5.e eVar = (p5.e) obj2;
        T t3 = (T) ((x0) obj);
        eVar.d(f14064b, t3.f13920a);
        eVar.d(f14065c, t3.f13921b);
        eVar.b(f14066d, t3.f13922c);
        String str = t3.f13923d;
        eVar.b(f14067e, str != null ? str.getBytes(O0.f13901a) : null);
    }
}
