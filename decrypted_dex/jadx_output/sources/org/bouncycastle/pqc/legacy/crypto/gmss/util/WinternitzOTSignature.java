package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import kotlin.UByte;
import org.bouncycastle.crypto.Digest;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f19515w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i3) {
        this.f19515w = i3;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int v2 = AbstractC1482f.v(digestSize << 3, i3, 1, i3);
        this.messagesize = v2;
        int log = getLog((v2 << i3) + 1);
        this.checksumsize = log;
        int i10 = (((log + i3) - 1) / i3) + this.messagesize;
        this.keysize = i10;
        this.privateKeyOTS = new byte[i10][];
        int i11 = this.mdsize;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        for (int i12 = 0; i12 < this.keysize; i12++) {
            this.privateKeyOTS[i12] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    private void hashPrivateKeyBlock(int i3, int i10, byte[] bArr, int i11) {
        if (i10 < 1) {
            System.arraycopy(this.privateKeyOTS[i3], 0, bArr, i11, this.mdsize);
            return;
        }
        this.messDigestOTS.update(this.privateKeyOTS[i3], 0, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr, i11);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr, i11, this.mdsize);
            }
        }
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

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i3 = this.keysize * this.mdsize;
        byte[] bArr = new byte[i3];
        int i10 = (1 << this.f19515w) - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < this.keysize; i12++) {
            hashPrivateKeyBlock(i12, i10, bArr, i11);
            i11 += this.mdsize;
        }
        this.messDigestOTS.update(bArr, 0, i3);
        byte[] bArr2 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr2, 0);
        return bArr2;
    }

    public byte[] getSignature(byte[] bArr) {
        int i3;
        int i10 = this.keysize;
        int i11 = this.mdsize;
        byte[] bArr2 = new byte[i10 * i11];
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i13 = this.f19515w;
        char c10 = '\b';
        boolean z2 = true;
        if (8 % i13 == 0) {
            int i14 = 8 / i13;
            int i15 = (1 << i13) - 1;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                for (int i19 = 0; i19 < i14; i19++) {
                    int i20 = bArr3[i18] & i15;
                    i16 += i20;
                    hashPrivateKeyBlock(i17, i20, bArr2, this.mdsize * i17);
                    bArr3[i18] = (byte) (bArr3[i18] >>> this.f19515w);
                    i17++;
                }
            }
            int i21 = (this.messagesize << this.f19515w) - i16;
            while (i12 < this.checksumsize) {
                hashPrivateKeyBlock(i17, i21 & i15, bArr2, this.mdsize * i17);
                int i22 = this.f19515w;
                i21 >>>= i22;
                i17++;
                i12 += i22;
            }
        } else if (i13 < 8) {
            int i23 = this.mdsize / i13;
            int i24 = (1 << i13) - 1;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i25 < i23) {
                boolean z10 = z2;
                long j = 0;
                for (int i29 = 0; i29 < this.f19515w; i29++) {
                    j ^= (bArr3[i26] & UByte.MAX_VALUE) << (i29 << 3);
                    i26++;
                }
                long j3 = j;
                for (int i30 = 0; i30 < 8; i30++) {
                    int i31 = ((int) j3) & i24;
                    i28 += i31;
                    hashPrivateKeyBlock(i27, i31, bArr2, this.mdsize * i27);
                    j3 >>>= this.f19515w;
                    i27++;
                }
                i25++;
                z2 = z10;
            }
            int i32 = this.mdsize % this.f19515w;
            long j10 = 0;
            for (int i33 = 0; i33 < i32; i33++) {
                j10 ^= (bArr3[i26] & UByte.MAX_VALUE) << (i33 << 3);
                i26++;
            }
            int i34 = i32 << 3;
            int i35 = 0;
            while (i35 < i34) {
                int i36 = ((int) j10) & i24;
                i28 += i36;
                hashPrivateKeyBlock(i27, i36, bArr2, this.mdsize * i27);
                int i37 = this.f19515w;
                j10 >>>= i37;
                i27++;
                i35 += i37;
            }
            int i38 = (this.messagesize << this.f19515w) - i28;
            while (i12 < this.checksumsize) {
                hashPrivateKeyBlock(i27, i38 & i24, bArr2, this.mdsize * i27);
                int i39 = this.f19515w;
                i38 >>>= i39;
                i27++;
                i12 += i39;
            }
        } else if (i13 < 57) {
            int i40 = this.mdsize;
            int i41 = (i40 << 3) - i13;
            int i42 = (1 << i13) - 1;
            byte[] bArr4 = new byte[i40];
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            while (i43 <= i41) {
                int i46 = i43 % 8;
                char c11 = c10;
                i43 += this.f19515w;
                int i47 = 0;
                long j11 = 0;
                for (int i48 = i43 >>> 3; i48 < ((i43 + 7) >>> 3); i48++) {
                    j11 ^= (bArr3[i48] & UByte.MAX_VALUE) << (i47 << 3);
                    i47++;
                }
                long j12 = (j11 >>> i46) & i42;
                i45 = (int) (i45 + j12);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, this.mdsize);
                while (j12 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j12--;
                }
                int i49 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i49, i49);
                i44++;
                c10 = c11;
            }
            int i50 = i43 >>> 3;
            if (i50 < this.mdsize) {
                int i51 = i43 % 8;
                int i52 = 0;
                long j13 = 0;
                while (true) {
                    i3 = this.mdsize;
                    if (i50 >= i3) {
                        break;
                    }
                    j13 ^= (bArr3[i50] & UByte.MAX_VALUE) << (i52 << 3);
                    i52++;
                    i50++;
                }
                long j14 = (j13 >>> i51) & i42;
                i45 = (int) (i45 + j14);
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, i3);
                while (j14 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j14--;
                }
                int i53 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i53, i53);
                i44++;
            }
            int i54 = (this.messagesize << this.f19515w) - i45;
            int i55 = 0;
            while (i55 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i44], 0, bArr4, 0, this.mdsize);
                for (long j15 = i54 & i42; j15 > 0; j15--) {
                    this.messDigestOTS.update(bArr4, 0, i40);
                    this.messDigestOTS.doFinal(bArr4, 0);
                }
                int i56 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i44 * i56, i56);
                int i57 = this.f19515w;
                i54 >>>= i57;
                i44++;
                i55 += i57;
            }
        }
        return bArr2;
    }
}
