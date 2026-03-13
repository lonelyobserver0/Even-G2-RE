package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class OldPKCS12ParametersGenerator extends PBEParametersGenerator {
    public static final int IV_MATERIAL = 2;
    public static final int KEY_MATERIAL = 1;
    public static final int MAC_MATERIAL = 3;
    private Digest digest;

    /* renamed from: u, reason: collision with root package name */
    private int f19154u;

    /* renamed from: v, reason: collision with root package name */
    private int f19155v;

    public OldPKCS12ParametersGenerator(Digest digest) {
        this.digest = digest;
        if (digest instanceof MD5Digest) {
            this.f19154u = 16;
        } else {
            if (!(digest instanceof SHA1Digest) && !(digest instanceof RIPEMD160Digest)) {
                throw new IllegalArgumentException(StubApp.getString2(28978) + digest.getAlgorithmName() + StubApp.getString2(28979));
            }
            this.f19154u = 20;
        }
        this.f19155v = 64;
    }

    private void adjust(byte[] bArr, int i3, byte[] bArr2) {
        int i10 = (bArr2[bArr2.length - 1] & UByte.MAX_VALUE) + (bArr[(bArr2.length + i3) - 1] & UByte.MAX_VALUE) + 1;
        bArr[(bArr2.length + i3) - 1] = (byte) i10;
        int i11 = i10 >>> 8;
        for (int length = bArr2.length - 2; length >= 0; length--) {
            int i12 = i3 + length;
            int i13 = (bArr2[length] & UByte.MAX_VALUE) + (bArr[i12] & UByte.MAX_VALUE) + i11;
            bArr[i12] = (byte) i13;
            i11 = i13 >>> 8;
        }
    }

    private byte[] generateDerivedKey(int i3, int i10) {
        byte[] bArr;
        byte[] bArr2;
        int i11;
        int i12 = this.f19155v;
        byte[] bArr3 = new byte[i12];
        byte[] bArr4 = new byte[i10];
        int i13 = 0;
        for (int i14 = 0; i14 != i12; i14++) {
            bArr3[i14] = (byte) i3;
        }
        byte[] bArr5 = this.salt;
        int i15 = 1;
        if (bArr5 == null || bArr5.length == 0) {
            bArr = new byte[0];
        } else {
            int i16 = this.f19155v;
            int length = (((bArr5.length + i16) - 1) / i16) * i16;
            bArr = new byte[length];
            for (int i17 = 0; i17 != length; i17++) {
                byte[] bArr6 = this.salt;
                bArr[i17] = bArr6[i17 % bArr6.length];
            }
        }
        byte[] bArr7 = this.password;
        if (bArr7 == null || bArr7.length == 0) {
            bArr2 = new byte[0];
        } else {
            int i18 = this.f19155v;
            int length2 = (((bArr7.length + i18) - 1) / i18) * i18;
            bArr2 = new byte[length2];
            for (int i19 = 0; i19 != length2; i19++) {
                byte[] bArr8 = this.password;
                bArr2[i19] = bArr8[i19 % bArr8.length];
            }
        }
        int length3 = bArr.length + bArr2.length;
        byte[] bArr9 = new byte[length3];
        System.arraycopy(bArr, 0, bArr9, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr9, bArr.length, bArr2.length);
        int i20 = this.f19155v;
        byte[] bArr10 = new byte[i20];
        int i21 = this.f19154u;
        int v2 = AbstractC1482f.v(i10, i21, 1, i21);
        int i22 = 1;
        while (i22 <= v2) {
            int i23 = this.f19154u;
            byte[] bArr11 = new byte[i23];
            this.digest.update(bArr3, i13, i12);
            this.digest.update(bArr9, i13, length3);
            this.digest.doFinal(bArr11, i13);
            for (int i24 = i15; i24 != this.iterationCount; i24++) {
                this.digest.update(bArr11, i13, i23);
                this.digest.doFinal(bArr11, i13);
            }
            for (int i25 = i13; i25 != i20; i25++) {
                bArr10[i22] = bArr11[i25 % i23];
            }
            int i26 = i13;
            while (true) {
                int i27 = this.f19155v;
                if (i26 == length3 / i27) {
                    break;
                }
                adjust(bArr9, i27 * i26, bArr10);
                i26++;
            }
            if (i22 == v2) {
                int i28 = i22 - 1;
                int i29 = this.f19154u;
                int i30 = i28 * i29;
                int i31 = i10 - (i28 * i29);
                i11 = 0;
                System.arraycopy(bArr11, 0, bArr4, i30, i31);
            } else {
                i11 = 0;
                System.arraycopy(bArr11, 0, bArr4, (i22 - 1) * this.f19154u, i23);
            }
            i22++;
            i13 = i11;
            i15 = 1;
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i3) {
        int i10 = i3 / 8;
        return new KeyParameter(generateDerivedKey(3, i10), 0, i10);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3) {
        int i10 = i3 / 8;
        return new KeyParameter(generateDerivedKey(1, i10), 0, i10);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3, int i10) {
        int i11 = i3 / 8;
        int i12 = i10 / 8;
        byte[] generateDerivedKey = generateDerivedKey(1, i11);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i11), generateDerivedKey(2, i12), 0, i12);
    }
}
