package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f18946p = new int[1024];

    /* renamed from: q, reason: collision with root package name */
    private int[] f18947q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int step = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (step & 255);
            bArr[1] = (byte) ((step >> 8) & 255);
            bArr[2] = (byte) ((step >> 16) & 255);
            bArr[3] = (byte) ((step >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i3 = this.idx;
        byte b2 = bArr2[i3];
        this.idx = 3 & (i3 + 1);
        return b2;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28663));
        }
        if (this.iv.length < 16) {
            throw new IllegalArgumentException(StubApp.getString2(28664));
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i3 = 0; i3 < 32; i3++) {
            int i10 = i3 >> 2;
            iArr[i10] = iArr[i10] | ((this.key[i3] & UByte.MAX_VALUE) << ((i3 & 3) * 8));
        }
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = (i11 >> 2) + 8;
            iArr[i12] = iArr[i12] | ((this.iv[i11] & UByte.MAX_VALUE) << ((i11 & 3) * 8));
        }
        for (int i13 = 16; i13 < 2560; i13++) {
            int i14 = iArr[i13 - 2];
            int i15 = iArr[i13 - 15];
            iArr[i13] = ((i14 >>> 10) ^ (rotateRight(i14, 17) ^ rotateRight(i14, 19))) + iArr[i13 - 7] + ((i15 >>> 3) ^ (rotateRight(i15, 7) ^ rotateRight(i15, 18))) + iArr[i13 - 16] + i13;
        }
        System.arraycopy(iArr, 512, this.f18946p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f18947q, 0, 1024);
        for (int i16 = 0; i16 < 4096; i16++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i3, int i10) {
        return (i3 << (-i10)) | (i3 >>> i10);
    }

    private int step() {
        int i3;
        int i10;
        int i11 = this.cnt;
        int i12 = i11 & 1023;
        if (i11 < 1024) {
            int[] iArr = this.f18946p;
            int i13 = iArr[(i12 - 3) & 1023];
            int i14 = iArr[(i12 - 1023) & 1023];
            int i15 = iArr[i12];
            int rotateRight = iArr[(i12 - 10) & 1023] + (rotateRight(i14, 23) ^ rotateRight(i13, 10));
            int[] iArr2 = this.f18947q;
            iArr[i12] = rotateRight + iArr2[(i13 ^ i14) & 1023] + i15;
            int[] iArr3 = this.f18946p;
            int i16 = iArr3[(i12 - 12) & 1023];
            i3 = iArr2[i16 & 255] + iArr2[((i16 >> 8) & 255) + 256] + iArr2[((i16 >> 16) & 255) + 512] + iArr2[((i16 >> 24) & 255) + 768];
            i10 = iArr3[i12];
        } else {
            int[] iArr4 = this.f18947q;
            int i17 = iArr4[(i12 - 3) & 1023];
            int i18 = iArr4[(i12 - 1023) & 1023];
            int i19 = iArr4[i12];
            int rotateRight2 = iArr4[(i12 - 10) & 1023] + (rotateRight(i18, 23) ^ rotateRight(i17, 10));
            int[] iArr5 = this.f18946p;
            iArr4[i12] = rotateRight2 + iArr5[(i17 ^ i18) & 1023] + i19;
            int[] iArr6 = this.f18947q;
            int i20 = iArr6[(i12 - 12) & 1023];
            i3 = iArr5[i20 & 255] + iArr5[((i20 >> 8) & 255) + 256] + iArr5[((i20 >> 16) & 255) + 512] + iArr5[((i20 >> 24) & 255) + 768];
            i10 = iArr6[i12];
        }
        int i21 = i10 ^ i3;
        this.cnt = (this.cnt + 1) & 2047;
        return i21;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28665);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
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
            bArr2[i11 + i12] = (byte) (bArr[i3 + i12] ^ getByte());
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        return (byte) (b2 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters cipherParameters2;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.iv = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (!(cipherParameters2 instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28666), cipherParameters));
        }
        this.key = ((KeyParameter) cipherParameters2).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), this.key.length * 8, cipherParameters, Utils.getPurpose(z2)));
        this.initialised = true;
    }
}
