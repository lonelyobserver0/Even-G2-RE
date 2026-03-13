package T0;

import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6948a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f6949b;

    /* renamed from: c, reason: collision with root package name */
    public int f6950c;

    /* renamed from: d, reason: collision with root package name */
    public int f6951d;

    /* renamed from: e, reason: collision with root package name */
    public int f6952e;

    public J() {
        this.f6948a = 1;
        this.f6949b = AbstractC1560u.f20195f;
    }

    public void a() {
        int i3;
        int i10;
        switch (this.f6948a) {
            case 1:
                int i11 = this.f6950c;
                AbstractC1550k.g(i11 >= 0 && (i11 < (i3 = this.f6952e) || (i11 == i3 && this.f6951d == 0)));
                break;
            default:
                int i12 = this.f6951d;
                AbstractC1550k.g(i12 >= 0 && (i12 < (i10 = this.f6950c) || (i12 == i10 && this.f6952e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f6952e - this.f6950c) * 8) - this.f6951d;
    }

    public void c() {
        if (this.f6951d == 0) {
            return;
        }
        this.f6951d = 0;
        this.f6950c++;
        a();
    }

    public boolean d(int i3) {
        int i10 = this.f6951d;
        int i11 = i3 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f6952e + i3) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f6950c) {
                break;
            }
            if (r(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f6950c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i3 = this.f6951d;
        int i10 = this.f6952e;
        int i11 = 0;
        while (this.f6951d < this.f6950c && !h()) {
            i11++;
        }
        boolean z2 = this.f6951d == this.f6950c;
        this.f6951d = i3;
        this.f6952e = i10;
        return !z2 && d((i11 * 2) + 1);
    }

    public int f() {
        AbstractC1550k.g(this.f6951d == 0);
        return this.f6950c;
    }

    public int g() {
        return (this.f6950c * 8) + this.f6951d;
    }

    public boolean h() {
        switch (this.f6948a) {
            case 0:
                boolean z2 = (((this.f6949b[this.f6951d] & UByte.MAX_VALUE) >> this.f6952e) & 1) == 1;
                t(1);
                return z2;
            case 1:
                boolean z10 = (this.f6949b[this.f6950c] & (128 >> this.f6951d)) != 0;
                s();
                return z10;
            default:
                boolean z11 = (this.f6949b[this.f6951d] & (128 >> this.f6952e)) != 0;
                s();
                return z11;
        }
    }

    public int i(int i3) {
        switch (this.f6948a) {
            case 0:
                int i10 = this.f6951d;
                int min = Math.min(i3, 8 - this.f6952e);
                int i11 = i10 + 1;
                byte[] bArr = this.f6949b;
                int i12 = ((bArr[i10] & UByte.MAX_VALUE) >> this.f6952e) & (255 >> (8 - min));
                while (min < i3) {
                    i12 |= (bArr[i11] & UByte.MAX_VALUE) << min;
                    min += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i3));
                t(i3);
                return i13;
            case 1:
                if (i3 == 0) {
                    return 0;
                }
                this.f6951d += i3;
                int i14 = 0;
                while (true) {
                    int i15 = this.f6951d;
                    if (i15 <= 8) {
                        byte[] bArr2 = this.f6949b;
                        int i16 = this.f6950c;
                        int i17 = ((-1) >>> (32 - i3)) & (i14 | ((bArr2[i16] & UByte.MAX_VALUE) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f6951d = 0;
                            this.f6950c = i16 + 1;
                        }
                        a();
                        return i17;
                    }
                    int i18 = i15 - 8;
                    this.f6951d = i18;
                    byte[] bArr3 = this.f6949b;
                    int i19 = this.f6950c;
                    this.f6950c = i19 + 1;
                    i14 |= (bArr3[i19] & UByte.MAX_VALUE) << i18;
                }
            default:
                this.f6952e += i3;
                int i20 = 0;
                while (true) {
                    int i21 = this.f6952e;
                    if (i21 <= 8) {
                        byte[] bArr4 = this.f6949b;
                        int i22 = this.f6951d;
                        int i23 = ((-1) >>> (32 - i3)) & (i20 | ((bArr4[i22] & UByte.MAX_VALUE) >> (8 - i21)));
                        if (i21 == 8) {
                            this.f6952e = 0;
                            this.f6951d = i22 + (r(i22 + 1) ? 2 : 1);
                        }
                        a();
                        return i23;
                    }
                    int i24 = i21 - 8;
                    this.f6952e = i24;
                    byte[] bArr5 = this.f6949b;
                    int i25 = this.f6951d;
                    i20 |= (bArr5[i25] & UByte.MAX_VALUE) << i24;
                    if (!r(i25 + 1)) {
                        r3 = 1;
                    }
                    this.f6951d = i25 + r3;
                }
        }
    }

    public void j(int i3, byte[] bArr) {
        int i10 = i3 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f6949b;
            int i12 = this.f6950c;
            int i13 = i12 + 1;
            this.f6950c = i13;
            byte b2 = bArr2[i12];
            int i14 = this.f6951d;
            byte b10 = (byte) (b2 << i14);
            bArr[i11] = b10;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b10);
        }
        int i15 = i3 & 7;
        if (i15 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b11;
        int i16 = this.f6951d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f6949b;
            int i17 = this.f6950c;
            this.f6950c = i17 + 1;
            bArr[i10] = (byte) (b11 | ((bArr3[i17] & UByte.MAX_VALUE) << i16));
            this.f6951d = i16 - 8;
        }
        int i18 = this.f6951d + i15;
        this.f6951d = i18;
        byte[] bArr4 = this.f6949b;
        int i19 = this.f6950c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f6951d = 0;
            this.f6950c = i19 + 1;
        }
        a();
    }

    public long k(int i3) {
        if (i3 <= 32) {
            int i10 = i(i3);
            int i11 = AbstractC1560u.f20190a;
            return BodyPartID.bodyIdMax & i10;
        }
        int i12 = i(i3 - 32);
        int i13 = i(32);
        int i14 = AbstractC1560u.f20190a;
        return (BodyPartID.bodyIdMax & i13) | ((i12 & BodyPartID.bodyIdMax) << 32);
    }

    public void l(int i3, byte[] bArr) {
        AbstractC1550k.g(this.f6951d == 0);
        System.arraycopy(this.f6949b, this.f6950c, bArr, 0, i3);
        this.f6950c += i3;
        a();
    }

    public int m() {
        int i3 = 0;
        while (!h()) {
            i3++;
        }
        return ((1 << i3) - 1) + (i3 > 0 ? i(i3) : 0);
    }

    public int n() {
        int m4 = m();
        return ((m4 + 1) / 2) * (m4 % 2 == 0 ? -1 : 1);
    }

    public void o(int i3, byte[] bArr) {
        this.f6949b = bArr;
        this.f6950c = 0;
        this.f6951d = 0;
        this.f6952e = i3;
    }

    public void p(C1553n c1553n) {
        o(c1553n.f20178c, c1553n.f20176a);
        q(c1553n.f20177b * 8);
    }

    public void q(int i3) {
        int i10 = i3 / 8;
        this.f6950c = i10;
        this.f6951d = i3 - (i10 * 8);
        a();
    }

    public boolean r(int i3) {
        if (2 > i3 || i3 >= this.f6950c) {
            return false;
        }
        byte[] bArr = this.f6949b;
        return bArr[i3] == 3 && bArr[i3 + (-2)] == 0 && bArr[i3 - 1] == 0;
    }

    public void s() {
        switch (this.f6948a) {
            case 1:
                int i3 = this.f6951d + 1;
                this.f6951d = i3;
                if (i3 == 8) {
                    this.f6951d = 0;
                    this.f6950c++;
                }
                a();
                break;
            default:
                int i10 = this.f6952e + 1;
                this.f6952e = i10;
                if (i10 == 8) {
                    this.f6952e = 0;
                    int i11 = this.f6951d;
                    this.f6951d = i11 + (r(i11 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void t(int i3) {
        int i10;
        switch (this.f6948a) {
            case 0:
                int i11 = i3 / 8;
                int i12 = this.f6951d + i11;
                this.f6951d = i12;
                int i13 = (i3 - (i11 * 8)) + this.f6952e;
                this.f6952e = i13;
                boolean z2 = true;
                if (i13 > 7) {
                    this.f6951d = i12 + 1;
                    this.f6952e = i13 - 8;
                }
                int i14 = this.f6951d;
                if (i14 < 0 || (i14 >= (i10 = this.f6950c) && (i14 != i10 || this.f6952e != 0))) {
                    z2 = false;
                }
                AbstractC1550k.g(z2);
                break;
            case 1:
                int i15 = i3 / 8;
                int i16 = this.f6950c + i15;
                this.f6950c = i16;
                int i17 = (i3 - (i15 * 8)) + this.f6951d;
                this.f6951d = i17;
                if (i17 > 7) {
                    this.f6950c = i16 + 1;
                    this.f6951d = i17 - 8;
                }
                a();
                break;
            default:
                int i18 = this.f6951d;
                int i19 = i3 / 8;
                int i20 = i18 + i19;
                this.f6951d = i20;
                int i21 = (i3 - (i19 * 8)) + this.f6952e;
                this.f6952e = i21;
                if (i21 > 7) {
                    this.f6951d = i20 + 1;
                    this.f6952e = i21 - 8;
                }
                while (true) {
                    i18++;
                    if (i18 > this.f6951d) {
                        a();
                        break;
                    } else if (r(i18)) {
                        this.f6951d++;
                        i18 += 2;
                    }
                }
        }
    }

    public void u(int i3) {
        AbstractC1550k.g(this.f6951d == 0);
        this.f6950c += i3;
        a();
    }

    public J(byte[] bArr) {
        this.f6948a = 0;
        this.f6949b = bArr;
        this.f6950c = bArr.length;
    }

    public J(byte[] bArr, int i3, int i10) {
        this.f6948a = 3;
        this.f6949b = bArr;
        this.f6951d = i3;
        this.f6950c = i10;
        this.f6952e = 0;
        a();
    }

    public J(byte[] bArr, int i3) {
        this.f6948a = 1;
        this.f6949b = bArr;
        this.f6952e = i3;
    }

    public J(int i3, int i10) {
        this.f6948a = 2;
        this.f6950c = i3;
        this.f6951d = i10;
        this.f6949b = new byte[(i10 * 2) - 1];
        this.f6952e = 0;
    }
}
