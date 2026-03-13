package T5;

import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7187a;

    /* renamed from: b, reason: collision with root package name */
    public int f7188b;

    /* renamed from: c, reason: collision with root package name */
    public int f7189c;

    public c(byte[] bArr, int i3, int i10) {
        this.f7187a = bArr;
        this.f7188b = i3;
        this.f7189c = i10;
    }

    public int a() {
        return ((this.f7187a.length - this.f7188b) * 8) - this.f7189c;
    }

    public int b(int i3) {
        if (i3 < 1 || i3 > 32 || i3 > a()) {
            throw new IllegalArgumentException(String.valueOf(i3));
        }
        int i10 = this.f7189c;
        int i11 = 0;
        byte[] bArr = this.f7187a;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int min = Math.min(i3, i12);
            int i13 = i12 - min;
            int i14 = this.f7188b;
            int i15 = (((255 >> (8 - min)) << i13) & bArr[i14]) >> i13;
            i3 -= min;
            int i16 = this.f7189c + min;
            this.f7189c = i16;
            if (i16 == 8) {
                this.f7189c = 0;
                this.f7188b = i14 + 1;
            }
            i11 = i15;
        }
        if (i3 > 0) {
            while (i3 >= 8) {
                int i17 = i11 << 8;
                int i18 = this.f7188b;
                int i19 = i17 | (bArr[i18] & UByte.MAX_VALUE);
                this.f7188b = i18 + 1;
                i3 -= 8;
                i11 = i19;
            }
            if (i3 > 0) {
                int i20 = 8 - i3;
                int i21 = ((((255 >> i20) << i20) & bArr[this.f7188b]) >> i20) | (i11 << i3);
                this.f7189c += i3;
                return i21;
            }
        }
        return i11;
    }

    public c(byte[] bArr) {
        this.f7187a = bArr;
    }
}
