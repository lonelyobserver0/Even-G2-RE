package B0;

import T0.H;
import android.text.TextUtils;
import com.stub.StubApp;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.C1145A;
import o0.AbstractC1405B;
import o0.C1406C;
import o0.C1437l;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w implements T0.o {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f578i = Pattern.compile(StubApp.getString2(517));
    public static final Pattern j = Pattern.compile(StubApp.getString2(518));

    /* renamed from: a, reason: collision with root package name */
    public final String f579a;

    /* renamed from: b, reason: collision with root package name */
    public final C1558s f580b;

    /* renamed from: d, reason: collision with root package name */
    public final C1145A f582d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f583e;

    /* renamed from: f, reason: collision with root package name */
    public T0.q f584f;

    /* renamed from: h, reason: collision with root package name */
    public int f586h;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f581c = new C1553n();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f585g = new byte[1024];

    public w(String str, C1558s c1558s, C1145A c1145a, boolean z2) {
        this.f579a = str;
        this.f580b = c1558s;
        this.f582d = c1145a;
        this.f583e = z2;
    }

    public final H a(long j3) {
        H w10 = this.f584f.w(0, 3);
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(519));
        c1437l.f18169d = this.f579a;
        c1437l.f18182r = j3;
        E1.a.w(c1437l, w10);
        this.f584f.q();
        return w10;
    }

    @Override // T0.o
    public final void b(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override // T0.o
    public final int c(T0.p pVar, T0.s sVar) {
        String i3;
        this.f584f.getClass();
        int i10 = (int) ((T0.l) pVar).f7029c;
        int i11 = this.f586h;
        byte[] bArr = this.f585g;
        if (i11 == bArr.length) {
            this.f585g = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f585g;
        int i12 = this.f586h;
        int read = ((T0.l) pVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f586h + read;
            this.f586h = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        C1553n c1553n = new C1553n(this.f585g);
        y1.i.d(c1553n);
        String i14 = c1553n.i(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(i14)) {
                while (true) {
                    String i15 = c1553n.i(StandardCharsets.UTF_8);
                    if (i15 == null) {
                        break;
                    }
                    if (y1.i.f23488a.matcher(i15).matches()) {
                        do {
                            i3 = c1553n.i(StandardCharsets.UTF_8);
                            if (i3 != null) {
                            }
                        } while (!i3.isEmpty());
                    } else {
                        Matcher matcher2 = y1.h.f23484a.matcher(i15);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group = matcher.group(1);
                group.getClass();
                long c10 = y1.i.c(group);
                int i16 = AbstractC1560u.f20190a;
                long b2 = this.f580b.b(AbstractC1560u.R((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                H a3 = a(b2 - c10);
                byte[] bArr3 = this.f585g;
                int i17 = this.f586h;
                C1553n c1553n2 = this.f581c;
                c1553n2.E(i17, bArr3);
                a3.a(c1553n2, this.f586h, 0);
                a3.c(b2, 1, this.f586h, 0, null);
                return -1;
            }
            if (i14.startsWith(StubApp.getString2(520))) {
                Matcher matcher3 = f578i.matcher(i14);
                if (!matcher3.find()) {
                    throw C1406C.a(StubApp.getString2(522).concat(i14), null);
                }
                Matcher matcher4 = j.matcher(i14);
                if (!matcher4.find()) {
                    throw C1406C.a(StubApp.getString2(521).concat(i14), null);
                }
                String group2 = matcher3.group(1);
                group2.getClass();
                j10 = y1.i.c(group2);
                String group3 = matcher4.group(1);
                group3.getClass();
                long parseLong = Long.parseLong(group3);
                int i18 = AbstractC1560u.f20190a;
                j3 = AbstractC1560u.R(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
            }
            i14 = c1553n.i(StandardCharsets.UTF_8);
        }
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        if (this.f583e) {
            qVar = new a5.c(qVar, this.f582d);
        }
        this.f584f = qVar;
        qVar.D(new T0.t(-9223372036854775807L));
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        T0.l lVar = (T0.l) pVar;
        lVar.i(this.f585g, 0, 6, false);
        byte[] bArr = this.f585g;
        C1553n c1553n = this.f581c;
        c1553n.E(6, bArr);
        if (y1.i.a(c1553n)) {
            return true;
        }
        lVar.i(this.f585g, 6, 3, false);
        c1553n.E(9, this.f585g);
        return y1.i.a(c1553n);
    }

    @Override // T0.o
    public final void release() {
    }
}
