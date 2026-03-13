package Cc;

import S3.D;
import T0.B;
import T0.H;
import T0.k;
import T0.l;
import T0.p;
import T0.q;
import com.stub.StubApp;
import f4.C0879c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import wc.s;
import z0.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements p, q, q4.e, y0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1187a;

    /* renamed from: b, reason: collision with root package name */
    public long f1188b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1189c;

    public /* synthetic */ a(long j, Object obj, int i3) {
        this.f1187a = i3;
        this.f1188b = j;
        this.f1189c = obj;
    }

    @Override // y0.h
    public long A(long j) {
        return ((k) this.f1189c).f7021a;
    }

    @Override // y0.h
    public long B(long j, long j3) {
        return ((k) this.f1189c).f7021a;
    }

    @Override // q4.e
    public /* synthetic */ void C(Exception exc) {
        ((AtomicLong) ((a5.c) this.f1189c).f9284d).set(this.f1188b);
    }

    @Override // T0.q
    public void D(B b2) {
        ((q) this.f1189c).D(new b1.c(this, b2, b2));
    }

    public int E(InputStream inputStream, int i3) {
        if (i3 <= 0) {
            return 0;
        }
        long j = this.f1188b;
        long j3 = i3 + j;
        ArrayList arrayList = (ArrayList) this.f1189c;
        int size = (((int) ((j3 - 1) >> 9)) - arrayList.size()) + 1;
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new byte[512]);
        }
        this.f1188b = j3;
        int i11 = (int) (j >> 9);
        int i12 = (int) (j & 511);
        int i13 = 0;
        while (i3 > 0) {
            byte[] bArr = (byte[]) arrayList.get(i11);
            int min = Math.min(512 - i12, i3);
            i3 -= min;
            i13 += min;
            while (min > 0) {
                int read = inputStream.read(bArr, i12, min);
                if (read < 0) {
                    this.f1188b -= i3 - i13;
                    return i13;
                }
                min -= read;
                i12 += read;
            }
            i11++;
            i12 = 0;
        }
        return i13;
    }

    public void F(int i3) {
        if (i3 < 64) {
            this.f1188b &= ~(1 << i3);
            return;
        }
        a aVar = (a) this.f1189c;
        if (aVar != null) {
            aVar.F(i3 - 64);
        }
    }

    public int G(int i3) {
        a aVar = (a) this.f1189c;
        if (aVar == null) {
            return i3 >= 64 ? Long.bitCount(this.f1188b) : Long.bitCount(this.f1188b & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.f1188b & ((1 << i3) - 1));
        }
        return Long.bitCount(this.f1188b) + aVar.G(i3 - 64);
    }

    public void H() {
        if (((a) this.f1189c) == null) {
            this.f1189c = new a(2);
        }
    }

    public boolean I(int i3) {
        if (i3 < 64) {
            return (this.f1188b & (1 << i3)) != 0;
        }
        H();
        return ((a) this.f1189c).I(i3 - 64);
    }

    public void J(int i3, boolean z2) {
        if (i3 >= 64) {
            H();
            ((a) this.f1189c).J(i3 - 64, z2);
            return;
        }
        long j = this.f1188b;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j3 = (1 << i3) - 1;
        this.f1188b = ((j & (~j3)) << 1) | (j & j3);
        if (z2) {
            N(i3);
        } else {
            F(i3);
        }
        if (z10 || ((a) this.f1189c) != null) {
            H();
            ((a) this.f1189c).J(0, z10);
        }
    }

    public s K() {
        int indexOf$default;
        C0879c c0879c = new C0879c(22);
        while (true) {
            String line = ((Kc.B) this.f1189c).C(this.f1188b);
            this.f1188b -= line.length();
            if (line.length() == 0) {
                return c0879c.q();
            }
            Intrinsics.checkNotNullParameter(line, "line");
            indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            String string2 = StubApp.getString2(633);
            if (indexOf$default != -1) {
                String substring = line.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, string2);
                c0879c.k(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring3, string2);
                c0879c.k("", substring3);
            } else {
                c0879c.k("", line);
            }
        }
    }

    public boolean L(int i3) {
        if (i3 >= 64) {
            H();
            return ((a) this.f1189c).L(i3 - 64);
        }
        long j = 1 << i3;
        long j3 = this.f1188b;
        boolean z2 = (j3 & j) != 0;
        long j10 = j3 & (~j);
        this.f1188b = j10;
        long j11 = j - 1;
        this.f1188b = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        a aVar = (a) this.f1189c;
        if (aVar != null) {
            if (aVar.I(0)) {
                N(63);
            }
            ((a) this.f1189c).L(0);
        }
        return z2;
    }

    public void M() {
        this.f1188b = 0L;
        a aVar = (a) this.f1189c;
        if (aVar != null) {
            aVar.M();
        }
    }

    public void N(int i3) {
        if (i3 < 64) {
            this.f1188b |= 1 << i3;
        } else {
            H();
            ((a) this.f1189c).N(i3 - 64);
        }
    }

    @Override // y0.h
    public long a(long j) {
        return ((k) this.f1189c).f7025e[(int) j] - this.f1188b;
    }

    @Override // T0.p
    public void b(int i3, int i10, byte[] bArr) {
        ((l) this.f1189c).i(bArr, i3, i10, false);
    }

    @Override // y0.h
    public long d(long j, long j3) {
        return ((k) this.f1189c).f7024d[(int) j];
    }

    @Override // T0.p
    public boolean e(byte[] bArr, int i3, int i10, boolean z2) {
        return ((l) this.f1189c).e(bArr, 0, i10, z2);
    }

    @Override // y0.h
    public long g(long j, long j3) {
        return 0L;
    }

    @Override // T0.p
    public long getPosition() {
        return ((l) this.f1189c).f7030d - this.f1188b;
    }

    @Override // T0.p
    public boolean i(byte[] bArr, int i3, int i10, boolean z2) {
        return ((l) this.f1189c).i(bArr, i3, i10, z2);
    }

    @Override // y0.h
    public long j(long j, long j3) {
        return -9223372036854775807L;
    }

    @Override // y0.h
    public j k(long j) {
        return new j(((k) this.f1189c).f7023c[(int) j], null, r1.f7022b[r7]);
    }

    @Override // T0.p
    public long l() {
        return ((l) this.f1189c).l() - this.f1188b;
    }

    @Override // T0.p
    public void o(int i3) {
        ((l) this.f1189c).a(i3, false);
    }

    @Override // y0.h
    public long p(long j, long j3) {
        return AbstractC1560u.e(((k) this.f1189c).f7025e, j + this.f1188b, true);
    }

    @Override // T0.q
    public void q() {
        ((q) this.f1189c).q();
    }

    @Override // T0.p
    public long r() {
        return ((l) this.f1189c).f7029c - this.f1188b;
    }

    @Override // o0.InterfaceC1432g
    public int read(byte[] bArr, int i3, int i10) {
        return ((l) this.f1189c).read(bArr, i3, i10);
    }

    @Override // T0.p
    public void readFully(byte[] bArr, int i3, int i10) {
        ((l) this.f1189c).e(bArr, i3, i10, false);
    }

    @Override // T0.p
    public void t() {
        ((l) this.f1189c).f7032f = 0;
    }

    public String toString() {
        switch (this.f1187a) {
            case 2:
                if (((a) this.f1189c) == null) {
                    return Long.toBinaryString(this.f1188b);
                }
                return ((a) this.f1189c).toString() + StubApp.getString2(25078) + Long.toBinaryString(this.f1188b);
            default:
                return super.toString();
        }
    }

    @Override // T0.p
    public void u(int i3) {
        ((l) this.f1189c).u(i3);
    }

    @Override // y0.h
    public boolean v() {
        return true;
    }

    @Override // T0.q
    public H w(int i3, int i10) {
        return ((q) this.f1189c).w(i3, i10);
    }

    @Override // y0.h
    public long x() {
        return 0L;
    }

    public /* synthetic */ a(Object obj, long j, int i3) {
        this.f1187a = i3;
        this.f1189c = obj;
        this.f1188b = j;
    }

    public a(W3.a aVar) {
        this.f1187a = 8;
        D.h(aVar);
        this.f1189c = aVar;
    }

    public a(Kc.B source) {
        this.f1187a = 0;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f1189c = source;
        this.f1188b = 262144L;
    }

    public a(l lVar, long j) {
        this.f1187a = 4;
        this.f1189c = lVar;
        AbstractC1550k.c(lVar.f7030d >= j);
        this.f1188b = j;
    }

    public a(int i3) {
        this.f1187a = i3;
        switch (i3) {
            case 6:
                break;
            default:
                this.f1188b = 0L;
                break;
        }
    }
}
