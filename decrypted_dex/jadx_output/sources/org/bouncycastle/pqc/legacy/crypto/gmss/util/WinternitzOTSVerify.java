package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import kotlin.UByte;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f19514w;

    public WinternitzOTSVerify(Digest digest, int i3) {
        this.f19514w = i3;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (i10 < 1) {
            System.arraycopy(bArr, i3, bArr2, i11, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i3, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i11);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i11, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.mdsize;
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i15 = this.mdsize << 3;
        int i16 = this.f19514w;
        int i17 = ((i16 - 1) + i15) / i16;
        boolean z2 = true;
        int log = getLog((i17 << i16) + 1);
        int i18 = this.f19514w;
        int i19 = this.mdsize;
        int i20 = i19 * ((((log + i18) - 1) / i18) + i17);
        if (i20 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i20];
        char c10 = '\b';
        if (8 % i18 == 0) {
            int i21 = 8 / i18;
            int i22 = (1 << i18) - 1;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            while (i25 < i13) {
                int i26 = i24;
                int i27 = 0;
                while (i27 < i21) {
                    int i28 = bArr3[i25] & i22;
                    int i29 = i23 + i28;
                    int i30 = this.mdsize;
                    hashSignatureBlock(bArr2, i26 * i30, i22 - i28, bArr4, i30 * i26);
                    bArr3[i25] = (byte) (bArr3[i25] >>> this.f19514w);
                    i26++;
                    i27++;
                    i23 = i29;
                }
                i25++;
                i24 = i26;
            }
            int i31 = (i17 << this.f19514w) - i23;
            int i32 = i24;
            int i33 = 0;
            while (i33 < log) {
                int i34 = this.mdsize;
                hashSignatureBlock(bArr2, i32 * i34, i22 - (i31 & i22), bArr4, i32 * i34);
                int i35 = this.f19514w;
                i31 >>>= i35;
                i32++;
                i33 += i35;
            }
        } else if (i18 < 8) {
            int i36 = i19 / i18;
            int i37 = (1 << i18) - 1;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            while (i38 < i36) {
                int i42 = i39;
                boolean z10 = z2;
                long j = 0;
                for (int i43 = 0; i43 < this.f19514w; i43++) {
                    j ^= (bArr3[i42] & UByte.MAX_VALUE) << (i43 << 3);
                    i42++;
                }
                int i44 = 0;
                while (i44 < 8) {
                    int i45 = (int) (j & i37);
                    int i46 = i40 + i45;
                    int i47 = this.mdsize;
                    hashSignatureBlock(bArr2, i41 * i47, i37 - i45, bArr4, i47 * i41);
                    j >>>= this.f19514w;
                    i41++;
                    i44++;
                    i40 = i46;
                    i37 = i37;
                    i38 = i38;
                }
                i38++;
                z2 = z10;
                i39 = i42;
            }
            int i48 = i37;
            int i49 = this.mdsize % this.f19514w;
            long j3 = 0;
            for (int i50 = 0; i50 < i49; i50++) {
                j3 ^= (bArr3[i39] & UByte.MAX_VALUE) << (i50 << 3);
                i39++;
            }
            int i51 = i49 << 3;
            int i52 = 0;
            while (i52 < i51) {
                int i53 = (int) (j3 & i48);
                int i54 = i40 + i53;
                int i55 = this.mdsize;
                hashSignatureBlock(bArr2, i41 * i55, i48 - i53, bArr4, i41 * i55);
                int i56 = this.f19514w;
                j3 >>>= i56;
                i41++;
                i52 += i56;
                i40 = i54;
            }
            int i57 = (i17 << this.f19514w) - i40;
            int i58 = 0;
            while (i58 < log) {
                int i59 = this.mdsize;
                hashSignatureBlock(bArr2, i41 * i59, i48 - (i57 & i48), bArr4, i41 * i59);
                int i60 = this.f19514w;
                i57 >>>= i60;
                i41++;
                i58 += i60;
            }
        } else if (i18 < 57) {
            int i61 = (i19 << 3) - i18;
            int i62 = (1 << i18) - 1;
            byte[] bArr5 = new byte[i19];
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            while (i63 <= i61) {
                int i66 = i63 >>> 3;
                int i67 = i63 % 8;
                char c11 = c10;
                i63 += this.f19514w;
                int i68 = i14;
                int i69 = i66;
                long j10 = 0;
                while (true) {
                    i12 = i61;
                    if (i69 >= ((i63 + 7) >>> 3)) {
                        break;
                    }
                    j10 ^= (bArr3[i69] & UByte.MAX_VALUE) << (i68 << 3);
                    i68++;
                    i69++;
                    i61 = i12;
                    bArr3 = bArr3;
                }
                byte[] bArr6 = bArr3;
                long j11 = i62;
                long j12 = (j10 >>> i67) & j11;
                i64 = (int) (i64 + j12);
                int i70 = this.mdsize;
                System.arraycopy(bArr2, i65 * i70, bArr5, 0, i70);
                while (j12 < j11) {
                    this.messDigestOTS.update(bArr5, 0, i19);
                    this.messDigestOTS.doFinal(bArr5, 0);
                    j12++;
                }
                int i71 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i65 * i71, i71);
                i65++;
                c10 = c11;
                i61 = i12;
                bArr3 = bArr6;
                i14 = 0;
            }
            byte[] bArr7 = bArr3;
            int i72 = i63 >>> 3;
            if (i72 < this.mdsize) {
                int i73 = i63 % 8;
                int i74 = 0;
                long j13 = 0;
                while (true) {
                    i11 = this.mdsize;
                    if (i72 >= i11) {
                        break;
                    }
                    j13 ^= (bArr7[i72] & UByte.MAX_VALUE) << (i74 << 3);
                    i74++;
                    i72++;
                }
                i3 = i17;
                long j14 = i62;
                long j15 = (j13 >>> i73) & j14;
                i64 = (int) (i64 + j15);
                System.arraycopy(bArr2, i65 * i11, bArr5, 0, i11);
                while (j15 < j14) {
                    this.messDigestOTS.update(bArr5, 0, i19);
                    this.messDigestOTS.doFinal(bArr5, 0);
                    j15++;
                }
                int i75 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i65 * i75, i75);
                i65++;
            } else {
                i3 = i17;
            }
            int i76 = (i3 << this.f19514w) - i64;
            int i77 = 0;
            while (i77 < log) {
                int i78 = this.mdsize;
                System.arraycopy(bArr2, i65 * i78, bArr5, 0, i78);
                int i79 = i65;
                for (long j16 = i76 & i62; j16 < i62; j16++) {
                    this.messDigestOTS.update(bArr5, 0, i19);
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i80 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i79 * i80, i80);
                int i81 = this.f19514w;
                i76 >>>= i81;
                i65 = i79 + 1;
                i77 += i81;
            }
            i10 = 0;
            this.messDigestOTS.update(bArr4, i10, i20);
            byte[] bArr8 = new byte[this.mdsize];
            this.messDigestOTS.doFinal(bArr8, i10);
            return bArr8;
        }
        i10 = 0;
        this.messDigestOTS.update(bArr4, i10, i20);
        byte[] bArr82 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr82, i10);
        return bArr82;
    }

    public int getLog(int i3) {
        int i10 = 1;
        int i11 = 2;
        while (i11 < i3) {
            i11 <<= 1;
            i10++;
        }
        return i10;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i3 = this.f19514w;
        int i10 = ((i3 - 1) + (digestSize << 3)) / i3;
        int log = getLog((i10 << i3) + 1);
        return ((((log + r2) - 1) / this.f19514w) + i10) * digestSize;
    }
}
