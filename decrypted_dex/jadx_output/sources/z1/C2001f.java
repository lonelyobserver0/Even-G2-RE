package z1;

import T0.H;
import T0.J;
import com.stub.StubApp;
import java.util.Arrays;
import o0.AbstractC1405B;
import o0.C1437l;
import r0.C1553n;

/* renamed from: z1.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2001f implements InterfaceC2004i {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f23785w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23786a;

    /* renamed from: d, reason: collision with root package name */
    public final String f23789d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23790e;

    /* renamed from: f, reason: collision with root package name */
    public String f23791f;

    /* renamed from: g, reason: collision with root package name */
    public H f23792g;

    /* renamed from: h, reason: collision with root package name */
    public H f23793h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23796l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23797m;

    /* renamed from: p, reason: collision with root package name */
    public int f23800p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23801q;

    /* renamed from: s, reason: collision with root package name */
    public int f23803s;

    /* renamed from: u, reason: collision with root package name */
    public H f23805u;

    /* renamed from: v, reason: collision with root package name */
    public long f23806v;

    /* renamed from: b, reason: collision with root package name */
    public final J f23787b = new J(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f23788c = new C1553n(Arrays.copyOf(f23785w, 10));

    /* renamed from: i, reason: collision with root package name */
    public int f23794i = 0;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f23795k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f23798n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f23799o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f23802r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f23804t = -9223372036854775807L;

    public C2001f(int i3, String str, boolean z2) {
        this.f23786a = z2;
        this.f23789d = str;
        this.f23790e = i3;
    }

    @Override // z1.InterfaceC2004i
    public final void a() {
        this.f23804t = -9223372036854775807L;
        this.f23797m = false;
        this.f23794i = 0;
        this.j = 0;
        this.f23795k = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0231, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z1.InterfaceC2004i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r0.C1553n r24) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C2001f.c(r0.n):void");
    }

    @Override // z1.InterfaceC2004i
    public final void d(boolean z2) {
    }

    @Override // z1.InterfaceC2004i
    public final void e(int i3, long j) {
        this.f23804t = j;
    }

    @Override // z1.InterfaceC2004i
    public final void f(T0.q qVar, C1994F c1994f) {
        c1994f.a();
        c1994f.b();
        this.f23791f = c1994f.f23755e;
        c1994f.b();
        H w10 = qVar.w(c1994f.f23754d, 1);
        this.f23792g = w10;
        this.f23805u = w10;
        if (!this.f23786a) {
            this.f23793h = new T0.n();
            return;
        }
        c1994f.a();
        c1994f.b();
        H w11 = qVar.w(c1994f.f23754d, 5);
        this.f23793h = w11;
        C1437l c1437l = new C1437l();
        c1994f.b();
        c1437l.f18166a = c1994f.f23755e;
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(474));
        E1.a.w(c1437l, w11);
    }
}
