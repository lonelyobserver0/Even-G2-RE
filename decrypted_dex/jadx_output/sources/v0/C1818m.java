package v0;

import android.content.Context;
import android.os.Looper;
import o0.C1428c;
import r0.AbstractC1560u;
import r0.C1555p;

/* renamed from: v0.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1818m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21780a;

    /* renamed from: b, reason: collision with root package name */
    public final C1555p f21781b;

    /* renamed from: c, reason: collision with root package name */
    public final C1807b f21782c;

    /* renamed from: d, reason: collision with root package name */
    public L4.k f21783d;

    /* renamed from: e, reason: collision with root package name */
    public final C1807b f21784e;

    /* renamed from: f, reason: collision with root package name */
    public final C1807b f21785f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f21786g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21787h;

    /* renamed from: i, reason: collision with root package name */
    public final C1428c f21788i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21789k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f21790l;

    /* renamed from: m, reason: collision with root package name */
    public final C1813h f21791m;

    /* renamed from: n, reason: collision with root package name */
    public final long f21792n;

    /* renamed from: o, reason: collision with root package name */
    public final long f21793o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f21794p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21795q;

    /* renamed from: r, reason: collision with root package name */
    public final String f21796r;

    public C1818m(Context context) {
        C1807b c1807b = new C1807b(context, 1);
        C1807b c1807b2 = new C1807b(context, 2);
        C1807b c1807b3 = new C1807b(context, 3);
        C1807b c1807b4 = new C1807b(context, 4);
        context.getClass();
        this.f21780a = context;
        this.f21782c = c1807b;
        this.f21783d = c1807b2;
        this.f21784e = c1807b3;
        this.f21785f = c1807b4;
        int i3 = AbstractC1560u.f20190a;
        Looper myLooper = Looper.myLooper();
        this.f21786g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f21788i = C1428c.f18127c;
        this.j = 1;
        this.f21789k = true;
        this.f21790l = c0.f21705c;
        this.f21791m = new C1813h(AbstractC1560u.J(20L), AbstractC1560u.J(500L));
        this.f21781b = C1555p.f20182a;
        this.f21792n = 500L;
        this.f21793o = 2000L;
        this.f21794p = true;
        this.f21796r = "";
        this.f21787h = -1000;
    }
}
