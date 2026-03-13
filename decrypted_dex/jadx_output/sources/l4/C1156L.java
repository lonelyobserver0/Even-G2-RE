package l4;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: l4.L, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1156L extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public String f16132c;

    /* renamed from: d, reason: collision with root package name */
    public String f16133d;

    /* renamed from: e, reason: collision with root package name */
    public int f16134e;

    /* renamed from: f, reason: collision with root package name */
    public String f16135f;

    /* renamed from: g, reason: collision with root package name */
    public String f16136g;

    /* renamed from: h, reason: collision with root package name */
    public long f16137h;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final long f16138k;

    /* renamed from: l, reason: collision with root package name */
    public List f16139l;

    /* renamed from: m, reason: collision with root package name */
    public String f16140m;

    /* renamed from: n, reason: collision with root package name */
    public int f16141n;

    /* renamed from: p, reason: collision with root package name */
    public String f16142p;

    /* renamed from: q, reason: collision with root package name */
    public String f16143q;

    /* renamed from: r, reason: collision with root package name */
    public long f16144r;

    /* renamed from: s, reason: collision with root package name */
    public String f16145s;

    public C1156L(C1200n0 c1200n0, long j, long j3) {
        super(c1200n0);
        this.f16144r = 0L;
        this.f16145s = null;
        this.j = j;
        this.f16138k = j3;
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l4.M1 o(java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1156L.o(java.lang.String):l4.M1");
    }

    public final void p() {
        String format;
        k();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        C1164b0 c1164b0 = c1200n0.f16540e;
        C1200n0.j(c1164b0);
        boolean i3 = c1164b0.r().i(EnumC1222y0.f16685c);
        T t3 = c1200n0.f16541f;
        if (i3) {
            byte[] bArr = new byte[16];
            K1 k12 = c1200n0.j;
            C1200n0.j(k12);
            k12.h0().nextBytes(bArr);
            format = String.format(Locale.US, StubApp.getString2(19866), new BigInteger(1, bArr));
        } else {
            C1200n0.l(t3);
            t3.f16248n.b(StubApp.getString2(20020));
            format = null;
        }
        C1200n0.l(t3);
        t3.f16248n.b(StubApp.getString2(20022).concat(format == null ? StubApp.getString2(1116) : StubApp.getString2(20021)));
        this.f16143q = format;
        c1200n0.f16545l.getClass();
        this.f16144r = System.currentTimeMillis();
    }

    public final String q() {
        l();
        S3.D.h(this.f16132c);
        return this.f16132c;
    }

    public final String r() {
        k();
        l();
        S3.D.h(this.f16142p);
        return this.f16142p;
    }
}
