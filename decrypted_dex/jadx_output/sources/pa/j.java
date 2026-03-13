package pa;

import com.stub.StubApp;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f19757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19760d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19761e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19762f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f19763g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f19764h;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19765k;

    public j(OutputStream outputStream, int i3, int i10, int i11, int i12) {
        super(outputStream);
        this.j = 0;
        this.f19765k = false;
        this.f19757a = i3;
        this.f19758b = i10;
        this.f19759c = i11;
        this.f19760d = i12;
        int i13 = (((i10 * i11) * i12) + 7) / 8;
        this.f19761e = i13;
        this.f19762f = i3 >= 10;
        this.f19763g = new byte[i13];
        this.f19764h = new byte[i13];
    }

    public final void a() {
        int i3 = this.f19757a;
        byte[] bArr = this.f19763g;
        byte[] bArr2 = this.f19764h;
        if (i3 != 1) {
            int i10 = this.f19758b;
            int i11 = this.f19759c;
            int i12 = ((i10 * i11) + 7) / 8;
            int length = bArr.length;
            if (i3 != 2) {
                switch (i3) {
                    case 11:
                        for (int i13 = i12; i13 < length; i13++) {
                            bArr[i13] = (byte) (bArr[i13] + bArr[i13 - i12]);
                        }
                        break;
                    case 12:
                        for (int i14 = 0; i14 < length; i14++) {
                            bArr[i14] = (byte) (((bArr[i14] & 255) + (bArr2[i14] & UByte.MAX_VALUE)) & 255);
                        }
                        break;
                    case 13:
                        for (int i15 = 0; i15 < length; i15++) {
                            int i16 = i15 - i12;
                            bArr[i15] = (byte) (((((i16 >= 0 ? bArr[i16] & 255 : 0) + (bArr2[i15] & UByte.MAX_VALUE)) / 2) + (bArr[i15] & 255)) & 255);
                        }
                        break;
                    case 14:
                        for (int i17 = 0; i17 < length; i17++) {
                            int i18 = bArr[i17] & 255;
                            int i19 = i17 - i12;
                            int i20 = i19 >= 0 ? bArr[i19] & 255 : 0;
                            int i21 = bArr2[i17] & UByte.MAX_VALUE;
                            int i22 = i19 >= 0 ? bArr2[i19] & UByte.MAX_VALUE : 0;
                            int i23 = (i20 + i21) - i22;
                            int abs = Math.abs(i23 - i20);
                            int abs2 = Math.abs(i23 - i21);
                            int abs3 = Math.abs(i23 - i22);
                            if (abs <= abs2 && abs <= abs3) {
                                bArr[i17] = (byte) ((i18 + i20) & 255);
                            } else if (abs2 <= abs3) {
                                bArr[i17] = (byte) ((i18 + i21) & 255);
                            } else {
                                bArr[i17] = (byte) ((i18 + i22) & 255);
                            }
                        }
                        break;
                }
            } else if (i11 == 8) {
                for (int i24 = i12; i24 < length; i24++) {
                    bArr[i24] = (byte) ((bArr[i24] & 255) + (bArr[i24 - i12] & 255));
                }
            } else if (i11 == 16) {
                for (int i25 = i12; i25 < length - 1; i25 += 2) {
                    int i26 = i25 + 1;
                    int i27 = i25 - i12;
                    int i28 = ((bArr[i27] & 255) << 8) + (bArr[i27 + 1] & 255) + ((bArr[i25] & 255) << 8) + (bArr[i26] & 255);
                    bArr[i25] = (byte) ((i28 >> 8) & 255);
                    bArr[i26] = (byte) (i28 & 255);
                }
            } else if (i11 == 1 && i10 == 1) {
                for (int i29 = 0; i29 < length; i29++) {
                    int i30 = 7;
                    while (i30 >= 0) {
                        int i31 = bArr[i29];
                        int i32 = (i31 >> i30) & 1;
                        if (i29 != 0 || i30 != 7) {
                            if (((i32 + ((i30 == 7 ? bArr[i29 - 1] : i31 >> (i30 + 1)) & 1)) & 1) == 0) {
                                bArr[i29] = (byte) (i31 & (~(1 << i30)));
                            } else {
                                bArr[i29] = (byte) (i31 | (1 << i30));
                            }
                        }
                        i30--;
                    }
                }
            } else {
                int i33 = this.f19760d * i10;
                for (int i34 = i10; i34 < i33; i34++) {
                    int i35 = i34 * i11;
                    int i36 = i35 / 8;
                    int i37 = (8 - (i35 % 8)) - i11;
                    int i38 = (i34 - i10) * i11;
                    int i39 = bArr[i36];
                    int i40 = (1 << i11) - 1;
                    bArr[i36] = (byte) ((((((i39 >>> i37) & i40) + ((bArr[i38 / 8] >>> ((8 - (i38 % 8)) - i11)) & i40)) & i40) << i37) | ((~(i40 << i37)) & i39));
                }
            }
        }
        ((FilterOutputStream) this).out.write(this.f19763g);
        byte[] bArr3 = this.f19764h;
        this.f19764h = this.f19763g;
        this.f19763g = bArr3;
        this.j = 0;
        this.f19765k = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i3 = this.j;
        if (i3 > 0) {
            Arrays.fill(this.f19763g, i3, this.f19761e, (byte) 0);
            a();
        }
        super.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i10) {
        int i11 = i10 + i3;
        while (i3 < i11) {
            if (this.f19762f && this.j == 0 && !this.f19765k) {
                this.f19757a = bArr[i3] + 10;
                i3++;
                this.f19765k = true;
            } else {
                int min = Math.min(this.f19761e - this.j, i11 - i3);
                System.arraycopy(bArr, i3, this.f19763g, this.j, min);
                int i12 = this.j + min;
                this.j = i12;
                i3 += min;
                if (i12 == this.f19763g.length) {
                    a();
                }
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(22151));
    }
}
