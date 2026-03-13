package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* renamed from: a, reason: collision with root package name */
    private int f18949a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f18950b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18951c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i3;
        int i10;
        int i11 = this.f18950b;
        int i12 = this.f18951c + 1;
        this.f18951c = i12;
        this.f18950b = i11 + i12;
        for (int i13 = 0; i13 < 256; i13++) {
            int[] iArr = this.engineState;
            int i14 = iArr[i13];
            int i15 = i13 & 3;
            if (i15 == 0) {
                i3 = this.f18949a;
                i10 = i3 << 13;
            } else if (i15 == 1) {
                i3 = this.f18949a;
                i10 = i3 >>> 6;
            } else if (i15 == 2) {
                i3 = this.f18949a;
                i10 = i3 << 2;
            } else if (i15 != 3) {
                int i16 = this.f18949a + iArr[(i13 + 128) & 255];
                this.f18949a = i16;
                int i17 = iArr[(i14 >>> 2) & 255] + i16 + this.f18950b;
                iArr[i13] = i17;
                int[] iArr2 = this.results;
                int i18 = iArr[(i17 >>> 10) & 255] + i14;
                this.f18950b = i18;
                iArr2[i13] = i18;
            } else {
                i3 = this.f18949a;
                i10 = i3 >>> 16;
            }
            this.f18949a = i3 ^ i10;
            int i162 = this.f18949a + iArr[(i13 + 128) & 255];
            this.f18949a = i162;
            int i172 = iArr[(i14 >>> 2) & 255] + i162 + this.f18950b;
            iArr[i13] = i172;
            int[] iArr22 = this.results;
            int i182 = iArr[(i172 >>> 10) & 255] + i14;
            this.f18950b = i182;
            iArr22[i13] = i182;
        }
    }

    private void mix(int[] iArr) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = i3 ^ (i10 << 11);
        iArr[0] = i11;
        int i12 = iArr[3] + i11;
        iArr[3] = i12;
        int i13 = iArr[2];
        int i14 = i10 + i13;
        iArr[1] = i14;
        int i15 = i14 ^ (i13 >>> 2);
        iArr[1] = i15;
        int i16 = iArr[4] + i15;
        iArr[4] = i16;
        int i17 = i13 + i12;
        iArr[2] = i17;
        int i18 = i17 ^ (i12 << 8);
        iArr[2] = i18;
        int i19 = iArr[5] + i18;
        iArr[5] = i19;
        int i20 = i12 + i16;
        iArr[3] = i20;
        int i21 = i20 ^ (i16 >>> 16);
        iArr[3] = i21;
        int i22 = iArr[6] + i21;
        iArr[6] = i22;
        int i23 = i16 + i19;
        iArr[4] = i23;
        int i24 = (i19 << 10) ^ i23;
        iArr[4] = i24;
        int i25 = iArr[7] + i24;
        iArr[7] = i25;
        int i26 = i19 + i22;
        iArr[5] = i26;
        int i27 = (i22 >>> 4) ^ i26;
        iArr[5] = i27;
        int i28 = i11 + i27;
        iArr[0] = i28;
        int i29 = i22 + i25;
        iArr[6] = i29;
        int i30 = (i25 << 8) ^ i29;
        iArr[6] = i30;
        int i31 = i15 + i30;
        iArr[1] = i31;
        int i32 = i25 + i28;
        iArr[7] = i32;
        int i33 = (i28 >>> 9) ^ i32;
        iArr[7] = i33;
        iArr[2] = i18 + i33;
        iArr[0] = i28 + i31;
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i3 = 0; i3 < 256; i3++) {
            int[] iArr = this.engineState;
            this.results[i3] = 0;
            iArr[i3] = 0;
        }
        this.f18951c = 0;
        this.f18950b = 0;
        this.f18949a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i10 = 0; i10 < length; i10 += 4) {
            this.results[i10 >>> 2] = Pack.littleEndianToInt(bArr2, i10);
        }
        int[] iArr2 = new int[8];
        for (int i11 = 0; i11 < 8; i11++) {
            iArr2[i11] = -1640531527;
        }
        for (int i12 = 0; i12 < 4; i12++) {
            mix(iArr2);
        }
        int i13 = 0;
        while (i13 < 2) {
            for (int i14 = 0; i14 < 256; i14 += 8) {
                for (int i15 = 0; i15 < 8; i15++) {
                    iArr2[i15] = iArr2[i15] + (i13 < 1 ? this.results[i14 + i15] : this.engineState[i14 + i15]);
                }
                mix(iArr2);
                for (int i16 = 0; i16 < 8; i16++) {
                    this.engineState[i14 + i16] = iArr2[i16];
                }
            }
            i13++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28671);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28672), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length < 32 ? key.length * 8 : 256, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.index == 0) {
                isaac();
                this.keyStream = Pack.intToBigEndian(this.results);
            }
            byte[] bArr3 = this.keyStream;
            int i13 = this.index;
            bArr2[i12 + i11] = (byte) (bArr3[i13] ^ bArr[i12 + i3]);
            this.index = (i13 + 1) & 1023;
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i3 = this.index;
        byte b10 = (byte) (b2 ^ bArr[i3]);
        this.index = (i3 + 1) & 1023;
        return b10;
    }
}
