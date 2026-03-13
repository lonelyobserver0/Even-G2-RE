package x0;

import java.nio.ByteBuffer;
import p0.AbstractC1481e;
import p0.C1478b;
import p0.C1479c;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class z extends AbstractC1481e {

    /* renamed from: i, reason: collision with root package name */
    public int f22825i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22826k;

    /* renamed from: l, reason: collision with root package name */
    public int f22827l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f22828m;

    /* renamed from: n, reason: collision with root package name */
    public int f22829n;

    /* renamed from: o, reason: collision with root package name */
    public long f22830o;

    @Override // p0.AbstractC1481e, p0.InterfaceC1480d
    public final ByteBuffer b() {
        int i3;
        if (super.f() && (i3 = this.f22829n) > 0) {
            k(i3).put(this.f22828m, 0, this.f22829n).flip();
            this.f22829n = 0;
        }
        return super.b();
    }

    @Override // p0.InterfaceC1480d
    public final void c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        if (i3 == 0) {
            return;
        }
        int min = Math.min(i3, this.f22827l);
        this.f22830o += min / this.f19612b.f19610d;
        this.f22827l -= min;
        byteBuffer.position(position + min);
        if (this.f22827l > 0) {
            return;
        }
        int i10 = i3 - min;
        int length = (this.f22829n + i10) - this.f22828m.length;
        ByteBuffer k3 = k(length);
        int i11 = AbstractC1560u.i(length, 0, this.f22829n);
        k3.put(this.f22828m, 0, i11);
        int i12 = AbstractC1560u.i(length - i11, 0, i10);
        byteBuffer.limit(byteBuffer.position() + i12);
        k3.put(byteBuffer);
        byteBuffer.limit(limit);
        int i13 = i10 - i12;
        int i14 = this.f22829n - i11;
        this.f22829n = i14;
        byte[] bArr = this.f22828m;
        System.arraycopy(bArr, i11, bArr, 0, i14);
        byteBuffer.get(this.f22828m, this.f22829n, i13);
        this.f22829n += i13;
        k3.flip();
    }

    @Override // p0.AbstractC1481e, p0.InterfaceC1480d
    public final boolean f() {
        return super.f() && this.f22829n == 0;
    }

    @Override // p0.AbstractC1481e
    public final C1478b g(C1478b c1478b) {
        if (c1478b.f19609c != 2) {
            throw new C1479c(c1478b);
        }
        this.f22826k = true;
        return (this.f22825i == 0 && this.j == 0) ? C1478b.f19606e : c1478b;
    }

    @Override // p0.AbstractC1481e
    public final void h() {
        if (this.f22826k) {
            this.f22826k = false;
            int i3 = this.j;
            int i10 = this.f19612b.f19610d;
            this.f22828m = new byte[i3 * i10];
            this.f22827l = this.f22825i * i10;
        }
        this.f22829n = 0;
    }

    @Override // p0.AbstractC1481e
    public final void i() {
        if (this.f22826k) {
            if (this.f22829n > 0) {
                this.f22830o += r0 / this.f19612b.f19610d;
            }
            this.f22829n = 0;
        }
    }

    @Override // p0.AbstractC1481e
    public final void j() {
        this.f22828m = AbstractC1560u.f20195f;
    }
}
