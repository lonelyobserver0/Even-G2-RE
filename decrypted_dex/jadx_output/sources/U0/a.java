package U0;

import E0.x;
import T0.B;
import T0.H;
import T0.l;
import T0.n;
import T0.o;
import T0.p;
import T0.q;
import T0.y;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m1.C1265a;
import o0.C1406C;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements o {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f7427q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f7428r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f7429s;

    /* renamed from: t, reason: collision with root package name */
    public static final byte[] f7430t;

    /* renamed from: b, reason: collision with root package name */
    public final n f7432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7433c;

    /* renamed from: d, reason: collision with root package name */
    public long f7434d;

    /* renamed from: e, reason: collision with root package name */
    public int f7435e;

    /* renamed from: f, reason: collision with root package name */
    public int f7436f;

    /* renamed from: h, reason: collision with root package name */
    public int f7438h;

    /* renamed from: i, reason: collision with root package name */
    public long f7439i;
    public q j;

    /* renamed from: k, reason: collision with root package name */
    public H f7440k;

    /* renamed from: l, reason: collision with root package name */
    public H f7441l;

    /* renamed from: m, reason: collision with root package name */
    public B f7442m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7443n;

    /* renamed from: o, reason: collision with root package name */
    public long f7444o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7445p;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7431a = new byte[1];

    /* renamed from: g, reason: collision with root package name */
    public int f7437g = -1;

    static {
        int i3 = AbstractC1560u.f20190a;
        Charset charset = StandardCharsets.UTF_8;
        f7429s = StubApp.getString2(6293).getBytes(charset);
        f7430t = StubApp.getString2(6294).getBytes(charset);
    }

    public a() {
        n nVar = new n();
        this.f7432b = nVar;
        this.f7441l = nVar;
    }

    public final int a(l lVar) {
        boolean z2;
        lVar.f7032f = 0;
        byte[] bArr = this.f7431a;
        lVar.i(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) > 0) {
            throw C1406C.a(StubApp.getString2(6295) + ((int) b2), null);
        }
        int i3 = (b2 >> 3) & 15;
        if (i3 >= 0 && i3 <= 15 && (((z2 = this.f7433c) && (i3 < 10 || i3 > 13)) || (!z2 && (i3 < 12 || i3 > 14)))) {
            return z2 ? f7428r[i3] : f7427q[i3];
        }
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(2781));
        sb2.append(this.f7433c ? StubApp.getString2(2782) : StubApp.getString2(2783));
        sb2.append(StubApp.getString2(2784));
        sb2.append(i3);
        throw C1406C.a(sb2.toString(), null);
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f7434d = 0L;
        this.f7435e = 0;
        this.f7436f = 0;
        this.f7444o = j3;
        B b2 = this.f7442m;
        if (!(b2 instanceof y)) {
            if (j == 0 || !(b2 instanceof C1265a)) {
                this.f7439i = 0L;
                return;
            } else {
                this.f7439i = (Math.max(0L, j - ((C1265a) b2).f17006b) * 8000000) / r7.f17009e;
                return;
            }
        }
        y yVar = (y) b2;
        x xVar = yVar.f7074b;
        long f10 = xVar.f1861a == 0 ? -9223372036854775807L : xVar.f(AbstractC1560u.b(yVar.f7073a, j));
        this.f7439i = f10;
        if (Math.abs(this.f7444o - f10) < 20000) {
            return;
        }
        this.f7443n = true;
        this.f7441l = this.f7432b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013e  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r25, T0.s r26) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.a.c(T0.p, T0.s):int");
    }

    public final boolean d(l lVar) {
        lVar.f7032f = 0;
        byte[] bArr = f7429s;
        byte[] bArr2 = new byte[bArr.length];
        lVar.i(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f7433c = false;
            lVar.u(bArr.length);
            return true;
        }
        lVar.f7032f = 0;
        byte[] bArr3 = f7430t;
        byte[] bArr4 = new byte[bArr3.length];
        lVar.i(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f7433c = true;
        lVar.u(bArr3.length);
        return true;
    }

    @Override // T0.o
    public final void f(q qVar) {
        this.j = qVar;
        H w10 = qVar.w(0, 1);
        this.f7440k = w10;
        this.f7441l = w10;
        qVar.q();
    }

    @Override // T0.o
    public final boolean h(p pVar) {
        return d((l) pVar);
    }

    @Override // T0.o
    public final void release() {
    }
}
