package r5;

import java.util.Date;
import java.util.HashMap;
import p5.g;
import q5.InterfaceC1523a;

/* renamed from: r5.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1571d implements InterfaceC1523a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1569b f20346f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1569b f20347g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20349a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20350b;

    /* renamed from: c, reason: collision with root package name */
    public final C1568a f20351c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20352d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1568a f20345e = new C1568a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final C1570c f20348h = new C1570c();

    /* JADX WARN: Type inference failed for: r0v1, types: [r5.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [r5.b] */
    static {
        final int i3 = 0;
        f20346f = new p5.f() { // from class: r5.b
            @Override // p5.InterfaceC1491a
            public final void a(Object obj, Object obj2) {
                switch (i3) {
                    case 0:
                        ((g) obj2).add((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i10 = 1;
        f20347g = new p5.f() { // from class: r5.b
            @Override // p5.InterfaceC1491a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).add((String) obj);
                        break;
                    default:
                        ((g) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public C1571d() {
        HashMap hashMap = new HashMap();
        this.f20349a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f20350b = hashMap2;
        this.f20351c = f20345e;
        this.f20352d = false;
        hashMap2.put(String.class, f20346f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f20347g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f20348h);
        hashMap.remove(Date.class);
    }

    public final InterfaceC1523a a(Class cls, p5.d dVar) {
        this.f20349a.put(cls, dVar);
        this.f20350b.remove(cls);
        return this;
    }
}
