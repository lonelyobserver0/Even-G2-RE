package N5;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends g {

    /* renamed from: c, reason: collision with root package name */
    public final g f4896c;

    public f(g gVar) {
        super(gVar.f4897a, gVar.f4898b);
        this.f4896c = gVar;
    }

    @Override // N5.g
    public final byte[] a() {
        byte[] a3 = this.f4896c.a();
        int i3 = this.f4897a * this.f4898b;
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) (255 - (a3[i10] & UByte.MAX_VALUE));
        }
        return bArr;
    }

    @Override // N5.g
    public final byte[] b(int i3, byte[] bArr) {
        byte[] b2 = this.f4896c.b(i3, bArr);
        for (int i10 = 0; i10 < this.f4897a; i10++) {
            b2[i10] = (byte) (255 - (b2[i10] & UByte.MAX_VALUE));
        }
        return b2;
    }

    @Override // N5.g
    public final boolean c() {
        return this.f4896c.c();
    }

    @Override // N5.g
    public final g d() {
        return new f(this.f4896c.d());
    }
}
