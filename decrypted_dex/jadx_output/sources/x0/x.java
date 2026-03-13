package x0;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import p0.AbstractC1481e;
import p0.C1478b;
import p0.C1479c;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x extends AbstractC1481e {

    /* renamed from: n, reason: collision with root package name */
    public int f22815n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22816o;

    /* renamed from: p, reason: collision with root package name */
    public int f22817p;

    /* renamed from: q, reason: collision with root package name */
    public long f22818q;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f22820s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f22823v;

    /* renamed from: r, reason: collision with root package name */
    public int f22819r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f22821t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f22822u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f22813l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f22811i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f22814m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f22812k = 10;
    public final short j = 1024;

    public x() {
        byte[] bArr = AbstractC1560u.f20195f;
        this.f22820s = bArr;
        this.f22823v = bArr;
    }

    @Override // p0.AbstractC1481e, p0.InterfaceC1480d
    public final boolean a() {
        return super.a() && this.f22816o;
    }

    @Override // p0.InterfaceC1480d
    public final void c(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f19617g.hasRemaining()) {
            int i3 = this.f22817p;
            short s10 = this.j;
            if (i3 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.f22820s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & UByte.MAX_VALUE)) > s10) {
                        int i10 = this.f22815n;
                        position = ((limit3 / i10) * i10) + i10;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f22817p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException();
                }
                AbstractC1550k.g(this.f22821t < this.f22820s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & UByte.MAX_VALUE)) > s10) {
                        int i11 = this.f22815n;
                        limit = (position2 / i11) * i11;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i12 = this.f22821t;
                int i13 = this.f22822u;
                int i14 = i12 + i13;
                byte[] bArr = this.f22820s;
                if (i14 < bArr.length) {
                    i12 = bArr.length;
                } else {
                    i14 = i13 - (bArr.length - i12);
                }
                int i15 = i12 - i14;
                boolean z2 = limit < limit4;
                int min = Math.min(position3, i15);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f22820s, i14, min);
                int i16 = this.f22822u + min;
                this.f22822u = i16;
                AbstractC1550k.g(i16 <= this.f22820s.length);
                boolean z10 = z2 && position3 < i15;
                m(z10);
                if (z10) {
                    this.f22817p = 0;
                    this.f22819r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // p0.AbstractC1481e
    public final C1478b g(C1478b c1478b) {
        if (c1478b.f19609c == 2) {
            return c1478b.f19607a == -1 ? C1478b.f19606e : c1478b;
        }
        throw new C1479c(c1478b);
    }

    @Override // p0.AbstractC1481e
    public final void h() {
        if (a()) {
            int i3 = this.f19612b.f19608b * 2;
            this.f22815n = i3;
            int i10 = ((((int) ((this.f22813l * r0.f19607a) / 1000000)) / 2) / i3) * i3 * 2;
            if (this.f22820s.length != i10) {
                this.f22820s = new byte[i10];
                this.f22823v = new byte[i10];
            }
        }
        this.f22817p = 0;
        this.f22818q = 0L;
        this.f22819r = 0;
        this.f22821t = 0;
        this.f22822u = 0;
    }

    @Override // p0.AbstractC1481e
    public final void i() {
        if (this.f22822u > 0) {
            m(true);
            this.f22819r = 0;
        }
    }

    @Override // p0.AbstractC1481e
    public final void j() {
        this.f22816o = false;
        byte[] bArr = AbstractC1560u.f20195f;
        this.f22820s = bArr;
        this.f22823v = bArr;
    }

    public final int l(int i3) {
        int length = ((((int) ((this.f22814m * this.f19612b.f19607a) / 1000000)) - this.f22819r) * this.f22815n) - (this.f22820s.length / 2);
        AbstractC1550k.g(length >= 0);
        int min = (int) Math.min((i3 * this.f22811i) + 0.5f, length);
        int i10 = this.f22815n;
        return (min / i10) * i10;
    }

    public final void m(boolean z2) {
        int length;
        int l9;
        int i3 = this.f22822u;
        byte[] bArr = this.f22820s;
        if (i3 == bArr.length || z2) {
            if (this.f22819r == 0) {
                if (z2) {
                    n(i3, 3);
                    length = i3;
                } else {
                    AbstractC1550k.g(i3 >= bArr.length / 2);
                    length = this.f22820s.length / 2;
                    n(length, 0);
                }
                l9 = length;
            } else if (z2) {
                int length2 = i3 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int l10 = l(length2) + (this.f22820s.length / 2);
                n(l10, 2);
                l9 = l10;
                length = length3;
            } else {
                length = i3 - (bArr.length / 2);
                l9 = l(length);
                n(l9, 1);
            }
            AbstractC1550k.f(StubApp.getString2(24144) + length, length % this.f22815n == 0);
            AbstractC1550k.g(i3 >= l9);
            this.f22822u -= length;
            int i10 = this.f22821t + length;
            this.f22821t = i10;
            this.f22821t = i10 % this.f22820s.length;
            this.f22819r = (l9 / this.f22815n) + this.f22819r;
            this.f22818q += (length - l9) / r2;
        }
    }

    public final void n(int i3, int i10) {
        if (i3 == 0) {
            return;
        }
        AbstractC1550k.c(this.f22822u >= i3);
        if (i10 == 2) {
            int i11 = this.f22821t;
            int i12 = this.f22822u;
            int i13 = i11 + i12;
            byte[] bArr = this.f22820s;
            if (i13 <= bArr.length) {
                System.arraycopy(bArr, i13 - i3, this.f22823v, 0, i3);
            } else {
                int length = i12 - (bArr.length - i11);
                if (length >= i3) {
                    System.arraycopy(bArr, length - i3, this.f22823v, 0, i3);
                } else {
                    int i14 = i3 - length;
                    System.arraycopy(bArr, bArr.length - i14, this.f22823v, 0, i14);
                    System.arraycopy(this.f22820s, 0, this.f22823v, i14, length);
                }
            }
        } else {
            int i15 = this.f22821t;
            int i16 = i15 + i3;
            byte[] bArr2 = this.f22820s;
            if (i16 <= bArr2.length) {
                System.arraycopy(bArr2, i15, this.f22823v, 0, i3);
            } else {
                int length2 = bArr2.length - i15;
                System.arraycopy(bArr2, i15, this.f22823v, 0, length2);
                System.arraycopy(this.f22820s, 0, this.f22823v, length2, i3 - length2);
            }
        }
        AbstractC1550k.b(StubApp.getString2(24145) + i3, i3 % this.f22815n == 0);
        AbstractC1550k.g(this.f22821t < this.f22820s.length);
        byte[] bArr3 = this.f22823v;
        AbstractC1550k.b(StubApp.getString2(24146) + i3, i3 % this.f22815n == 0);
        if (i10 != 3) {
            for (int i17 = 0; i17 < i3; i17 += 2) {
                int i18 = i17 + 1;
                int i19 = (bArr3[i18] << 8) | (bArr3[i17] & UByte.MAX_VALUE);
                int i20 = this.f22812k;
                if (i10 == 0) {
                    i20 = ((((i17 * 1000) / (i3 - 1)) * (i20 - 100)) / 1000) + 100;
                } else if (i10 == 2) {
                    i20 += (((i17 * 1000) * (100 - i20)) / (i3 - 1)) / 1000;
                }
                int i21 = (i19 * i20) / 100;
                if (i21 >= 32767) {
                    bArr3[i17] = -1;
                    bArr3[i18] = ByteCompanionObject.MAX_VALUE;
                } else if (i21 <= -32768) {
                    bArr3[i17] = 0;
                    bArr3[i18] = ByteCompanionObject.MIN_VALUE;
                } else {
                    bArr3[i17] = (byte) (i21 & 255);
                    bArr3[i18] = (byte) (i21 >> 8);
                }
            }
        }
        k(i3).put(bArr3, 0, i3).flip();
    }
}
