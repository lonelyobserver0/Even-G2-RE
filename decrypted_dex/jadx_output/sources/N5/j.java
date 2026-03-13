package N5;

import com.stub.StubApp;
import i2.u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends g {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4904d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4905e;

    public j(byte[] bArr, int i3, int i10, int i11, int i12) {
        super(i11, i12);
        if (i11 > i3 || i12 > i10) {
            throw new IllegalArgumentException(StubApp.getString2(3763));
        }
        this.f4903c = bArr;
        this.f4904d = i3;
        this.f4905e = i10;
    }

    @Override // N5.g
    public final byte[] a() {
        byte[] bArr = this.f4903c;
        int i3 = this.f4904d;
        int i10 = this.f4897a;
        int i11 = this.f4898b;
        if (i10 == i3 && i11 == this.f4905e) {
            return bArr;
        }
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        if (i10 == i3) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i10, i10);
            i13 += i3;
        }
        return bArr2;
    }

    @Override // N5.g
    public final byte[] b(int i3, byte[] bArr) {
        if (i3 < 0 || i3 >= this.f4898b) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(3764)));
        }
        int i10 = this.f4897a;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(this.f4903c, i3 * this.f4904d, bArr, 0, i10);
        return bArr;
    }
}
