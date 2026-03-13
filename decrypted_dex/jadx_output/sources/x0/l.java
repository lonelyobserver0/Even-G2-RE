package x0;

import java.nio.ByteBuffer;
import p0.AbstractC1481e;
import p0.C1478b;
import p0.C1479c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends AbstractC1481e {

    /* renamed from: i, reason: collision with root package name */
    public int[] f22708i;
    public int[] j;

    @Override // p0.InterfaceC1480d
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k3 = k(((limit - position) / this.f19612b.f19610d) * this.f19613c.f19610d);
        while (position < limit) {
            for (int i3 : iArr) {
                k3.putShort(byteBuffer.getShort((i3 * 2) + position));
            }
            position += this.f19612b.f19610d;
        }
        byteBuffer.position(limit);
        k3.flip();
    }

    @Override // p0.AbstractC1481e
    public final C1478b g(C1478b c1478b) {
        int[] iArr = this.f22708i;
        if (iArr == null) {
            return C1478b.f19606e;
        }
        if (c1478b.f19609c != 2) {
            throw new C1479c(c1478b);
        }
        int length = iArr.length;
        int i3 = c1478b.f19608b;
        boolean z2 = i3 != length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= i3) {
                throw new C1479c(c1478b);
            }
            z2 |= i11 != i10;
            i10++;
        }
        return z2 ? new C1478b(c1478b.f19607a, iArr.length, 2) : C1478b.f19606e;
    }

    @Override // p0.AbstractC1481e
    public final void h() {
        this.j = this.f22708i;
    }

    @Override // p0.AbstractC1481e
    public final void j() {
        this.j = null;
        this.f22708i = null;
    }
}
