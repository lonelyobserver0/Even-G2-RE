package org.bouncycastle.pqc.legacy.crypto.gmss;

import Xa.h;
import com.stub.StubApp;
import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;
    private int ii;

    /* renamed from: k, reason: collision with root package name */
    private int f19511k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* renamed from: r, reason: collision with root package name */
    private int f19512r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* renamed from: w, reason: collision with root package name */
    private int f19513w;

    public GMSSRootSig(Digest digest, int i3, int i10) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.f19513w = i3;
        this.height = i10;
        this.f19511k = (1 << i3) - 1;
        this.messagesize = (int) Math.ceil((r3 << 3) / i3);
    }

    private void oneStep() {
        long j;
        int i3 = this.f19513w;
        if (8 % i3 == 0) {
            int i10 = this.test;
            if (i10 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i11 = this.ii;
                if (i11 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b2 = bArr[i11];
                    this.test = this.f19511k & b2;
                    bArr[i11] = (byte) (b2 >>> this.f19513w);
                } else {
                    int i12 = this.checksum;
                    this.test = this.f19511k & i12;
                    this.checksum = i12 >>> this.f19513w;
                }
            } else if (i10 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i13 = this.counter;
                int i14 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i13 * i14, i14);
                int i15 = this.counter + 1;
                this.counter = i15;
                if (i15 % (8 / this.f19513w) == 0) {
                    this.ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i3 < 8) {
            int i16 = this.test;
            if (i16 == 0) {
                int i17 = this.counter;
                if (i17 % 8 == 0) {
                    int i18 = this.ii;
                    int i19 = this.mdsize;
                    if (i18 < i19) {
                        this.big8 = 0L;
                        if (i17 < ((i19 / i3) << 3)) {
                            for (int i20 = 0; i20 < this.f19513w; i20++) {
                                long j3 = this.big8;
                                byte[] bArr6 = this.hash;
                                int i21 = this.ii;
                                this.big8 = j3 ^ ((bArr6[i21] & UByte.MAX_VALUE) << (i20 << 3));
                                this.ii = i21 + 1;
                            }
                        } else {
                            for (int i22 = 0; i22 < this.mdsize % this.f19513w; i22++) {
                                long j10 = this.big8;
                                byte[] bArr7 = this.hash;
                                int i23 = this.ii;
                                this.big8 = j10 ^ ((bArr7[i23] & UByte.MAX_VALUE) << (i22 << 3));
                                this.ii = i23 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.f19511k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i16 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr10 = this.privateKeyOTS;
                byte[] bArr11 = this.sign;
                int i24 = this.counter;
                int i25 = this.mdsize;
                System.arraycopy(bArr10, 0, bArr11, i24 * i25, i25);
                this.big8 >>>= this.f19513w;
                this.counter++;
                return;
            }
            return;
        }
        if (i3 < 57) {
            long j11 = this.test8;
            if (j11 == 0) {
                this.big8 = 0L;
                this.ii = 0;
                int i26 = this.f19512r;
                int i27 = i26 % 8;
                int i28 = i26 >>> 3;
                int i29 = this.mdsize;
                if (i28 < i29) {
                    if (i26 <= (i29 << 3) - i3) {
                        int i30 = i26 + i3;
                        this.f19512r = i30;
                        i29 = (i30 + 7) >>> 3;
                    } else {
                        this.f19512r = i26 + i3;
                    }
                    while (true) {
                        j = this.big8;
                        if (i28 >= i29) {
                            break;
                        }
                        int i31 = this.hash[i28] & UByte.MAX_VALUE;
                        int i32 = this.ii;
                        this.big8 = j ^ (i31 << (i32 << 3));
                        this.ii = i32 + 1;
                        i28++;
                    }
                    long j12 = j >>> i27;
                    this.big8 = j12;
                    this.test8 = j12 & this.f19511k;
                } else {
                    int i33 = this.checksum;
                    this.test8 = this.f19511k & i33;
                    this.checksum = i33 >>> i3;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (j11 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i34 = this.counter;
                int i35 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i34 * i35, i35);
                this.counter++;
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

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.ii, this.f19512r, this.steps, this.keysize, this.height, this.f19513w, this.checksum};
    }

    public byte[] getStatLong() {
        long j = this.test8;
        long j3 = this.big8;
        return new byte[]{(byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 56) & 255), (byte) (j3 & 255), (byte) ((j3 >> 8) & 255), (byte) ((j3 >> 16) & 255), (byte) ((j3 >> 24) & 255), (byte) ((j3 >> 32) & 255), (byte) ((j3 >> 40) & 255), (byte) ((j3 >> 48) & 255), (byte) ((j3 >> 56) & 255)};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i3;
        int i10;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i11 = this.mdsize;
        byte[] bArr4 = new byte[i11];
        System.arraycopy(this.hash, 0, bArr4, 0, i11);
        int log = getLog((this.messagesize << this.f19513w) + 1);
        int i12 = this.f19513w;
        int i13 = 8;
        if (8 % i12 == 0) {
            int i14 = 8 / i12;
            i3 = 0;
            for (int i15 = 0; i15 < this.mdsize; i15++) {
                for (int i16 = 0; i16 < i14; i16++) {
                    byte b2 = bArr4[i15];
                    i3 += this.f19511k & b2;
                    bArr4[i15] = (byte) (b2 >>> this.f19513w);
                }
            }
            int i17 = (this.messagesize << this.f19513w) - i3;
            this.checksum = i17;
            int i18 = 0;
            while (i18 < log) {
                i3 += this.f19511k & i17;
                int i19 = this.f19513w;
                i17 >>>= i19;
                i18 += i19;
            }
        } else if (i12 < 8) {
            int i20 = this.mdsize / i12;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < i20; i23++) {
                long j = 0;
                for (int i24 = 0; i24 < this.f19513w; i24++) {
                    j ^= (bArr4[i21] & UByte.MAX_VALUE) << (i24 << 3);
                    i21++;
                }
                int i25 = 0;
                while (i25 < i13) {
                    i22 += (int) (this.f19511k & j);
                    j >>>= this.f19513w;
                    i25++;
                    i13 = i13;
                    i20 = i20;
                }
            }
            int i26 = this.mdsize % this.f19513w;
            long j3 = 0;
            for (int i27 = 0; i27 < i26; i27++) {
                j3 ^= (bArr4[i21] & UByte.MAX_VALUE) << (i27 << 3);
                i21++;
            }
            int i28 = i26 << 3;
            int i29 = 0;
            while (i29 < i28) {
                i22 += (int) (this.f19511k & j3);
                int i30 = this.f19513w;
                j3 >>>= i30;
                i29 += i30;
            }
            int i31 = (this.messagesize << this.f19513w) - i22;
            this.checksum = i31;
            int i32 = 0;
            i3 = i22;
            while (i32 < log) {
                i3 += this.f19511k & i31;
                int i33 = this.f19513w;
                i31 >>>= i33;
                i32 += i33;
            }
        } else if (i12 < 57) {
            int i34 = 0;
            int i35 = 0;
            while (true) {
                i10 = this.mdsize;
                int i36 = this.f19513w;
                if (i34 > (i10 << 3) - i36) {
                    break;
                }
                int i37 = i34 % 8;
                i34 += i36;
                int i38 = 0;
                long j10 = 0;
                for (int i39 = i34 >>> 3; i39 < ((i34 + 7) >>> 3); i39++) {
                    j10 ^= (bArr4[i39] & UByte.MAX_VALUE) << (i38 << 3);
                    i38++;
                }
                i35 = (int) (i35 + ((j10 >>> i37) & this.f19511k));
            }
            int i40 = i34 >>> 3;
            if (i40 < i10) {
                int i41 = i34 % 8;
                int i42 = 0;
                long j11 = 0;
                while (i40 < this.mdsize) {
                    j11 ^= (bArr4[i40] & UByte.MAX_VALUE) << (i42 << 3);
                    i42++;
                    i40++;
                }
                i35 = (int) (i35 + ((j11 >>> i41) & this.f19511k));
            }
            int i43 = (this.messagesize << this.f19513w) - i35;
            this.checksum = i43;
            int i44 = 0;
            i3 = i35;
            while (i44 < log) {
                i3 += this.f19511k & i43;
                int i45 = this.f19513w;
                i43 >>>= i45;
                i44 += i45;
            }
        } else {
            i3 = 0;
        }
        this.keysize = this.messagesize + ((int) Math.ceil(log / this.f19513w));
        this.steps = (int) Math.ceil((r2 + i3) / (1 << this.height));
        int i46 = this.keysize;
        int i47 = this.mdsize;
        this.sign = new byte[i46 * i47];
        this.counter = 0;
        this.test = 0;
        this.ii = 0;
        this.test8 = 0L;
        this.f19512r = 0;
        this.privateKeyOTS = new byte[i47];
        byte[] bArr5 = new byte[i47];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i47);
    }

    public String toString() {
        String string2;
        String q10 = h.q(new StringBuilder(""), this.big8, StubApp.getString2(6127));
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        int i3 = 0;
        while (true) {
            string2 = StubApp.getString2(397);
            if (i3 >= 9) {
                break;
            }
            q10 = AbstractC1482f.f(statInt[i3], string2, AbstractC1856e.b(q10));
            i3++;
        }
        for (int i10 = 0; i10 < 5; i10++) {
            q10 = AbstractC1482f.k(AbstractC1856e.b(q10), new String(Hex.encode(statByte[i10])), string2);
        }
        return q10;
    }

    public boolean updateSign() {
        for (int i3 = 0; i3 < this.steps; i3++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.ii = iArr[2];
        this.f19512r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f19513w = iArr[7];
        this.checksum = iArr[8];
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i3 = this.f19513w;
        this.f19511k = (1 << i3) - 1;
        this.messagesize = (int) Math.ceil((r8 << 3) / i3);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        this.test8 = ((bArr2[2] & UByte.MAX_VALUE) << 16) | (bArr2[0] & UByte.MAX_VALUE) | ((bArr2[1] & UByte.MAX_VALUE) << 8) | ((bArr2[3] & UByte.MAX_VALUE) << 24) | ((bArr2[4] & UByte.MAX_VALUE) << 32) | ((bArr2[5] & UByte.MAX_VALUE) << 40) | ((bArr2[6] & UByte.MAX_VALUE) << 48) | ((bArr2[7] & UByte.MAX_VALUE) << 56);
        this.big8 = ((bArr2[15] & UByte.MAX_VALUE) << 56) | (bArr2[8] & UByte.MAX_VALUE) | ((bArr2[9] & UByte.MAX_VALUE) << 8) | ((bArr2[10] & UByte.MAX_VALUE) << 16) | ((bArr2[11] & UByte.MAX_VALUE) << 24) | ((bArr2[12] & UByte.MAX_VALUE) << 32) | ((bArr2[13] & UByte.MAX_VALUE) << 40) | ((bArr2[14] & UByte.MAX_VALUE) << 48);
    }
}
