package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VMPCMac implements Mac {

    /* renamed from: T, reason: collision with root package name */
    private byte[] f19013T;

    /* renamed from: g, reason: collision with root package name */
    private byte f19014g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* renamed from: x1, reason: collision with root package name */
    private byte f19017x1;

    /* renamed from: x2, reason: collision with root package name */
    private byte f19018x2;

    /* renamed from: x3, reason: collision with root package name */
    private byte f19019x3;

    /* renamed from: x4, reason: collision with root package name */
    private byte f19020x4;

    /* renamed from: n, reason: collision with root package name */
    private byte f19015n = 0;

    /* renamed from: P, reason: collision with root package name */
    private byte[] f19012P = null;

    /* renamed from: s, reason: collision with root package name */
    private byte f19016s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f19016s = (byte) 0;
        this.f19012P = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            this.f19012P[i3] = (byte) i3;
        }
        for (int i10 = 0; i10 < 768; i10++) {
            byte[] bArr3 = this.f19012P;
            byte b2 = this.f19016s;
            int i11 = i10 & 255;
            byte b10 = bArr3[i11];
            byte b11 = bArr3[(b2 + b10 + bArr[i10 % bArr.length]) & 255];
            this.f19016s = b11;
            bArr3[i11] = bArr3[b11 & UByte.MAX_VALUE];
            bArr3[b11 & UByte.MAX_VALUE] = b10;
        }
        for (int i12 = 0; i12 < 768; i12++) {
            byte[] bArr4 = this.f19012P;
            byte b12 = this.f19016s;
            int i13 = i12 & 255;
            byte b13 = bArr4[i13];
            byte b14 = bArr4[(b12 + b13 + bArr2[i12 % bArr2.length]) & 255];
            this.f19016s = b14;
            bArr4[i13] = bArr4[b14 & UByte.MAX_VALUE];
            bArr4[b14 & UByte.MAX_VALUE] = b13;
        }
        this.f19015n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        for (int i10 = 1; i10 < 25; i10++) {
            byte[] bArr2 = this.f19012P;
            byte b2 = this.f19016s;
            byte b10 = this.f19015n;
            byte b11 = bArr2[(b2 + bArr2[b10 & UByte.MAX_VALUE]) & 255];
            this.f19016s = b11;
            byte b12 = this.f19020x4;
            byte b13 = this.f19019x3;
            byte b14 = bArr2[(b12 + b13 + i10) & 255];
            this.f19020x4 = b14;
            byte b15 = this.f19018x2;
            byte b16 = bArr2[(b13 + b15 + i10) & 255];
            this.f19019x3 = b16;
            byte b17 = this.f19017x1;
            byte b18 = bArr2[(b15 + b17 + i10) & 255];
            this.f19018x2 = b18;
            byte b19 = bArr2[(b17 + b11 + i10) & 255];
            this.f19017x1 = b19;
            byte[] bArr3 = this.f19013T;
            byte b20 = this.f19014g;
            bArr3[b20 & 31] = (byte) (b19 ^ bArr3[b20 & 31]);
            bArr3[(b20 + 1) & 31] = (byte) (b18 ^ bArr3[(b20 + 1) & 31]);
            bArr3[(b20 + 2) & 31] = (byte) (b16 ^ bArr3[(b20 + 2) & 31]);
            bArr3[(b20 + 3) & 31] = (byte) (b14 ^ bArr3[(b20 + 3) & 31]);
            this.f19014g = (byte) ((b20 + 4) & 31);
            byte b21 = bArr2[b10 & UByte.MAX_VALUE];
            bArr2[b10 & UByte.MAX_VALUE] = bArr2[b11 & UByte.MAX_VALUE];
            bArr2[b11 & UByte.MAX_VALUE] = b21;
            this.f19015n = (byte) ((b10 + 1) & 255);
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr4 = this.f19012P;
            byte b22 = this.f19016s;
            int i12 = i11 & 255;
            byte b23 = bArr4[i12];
            byte b24 = bArr4[(b22 + b23 + this.f19013T[i11 & 31]) & 255];
            this.f19016s = b24;
            bArr4[i12] = bArr4[b24 & UByte.MAX_VALUE];
            bArr4[b24 & UByte.MAX_VALUE] = b23;
        }
        byte[] bArr5 = new byte[20];
        for (int i13 = 0; i13 < 20; i13++) {
            byte[] bArr6 = this.f19012P;
            int i14 = i13 & 255;
            byte b25 = bArr6[(this.f19016s + bArr6[i14]) & 255];
            this.f19016s = b25;
            bArr5[i13] = bArr6[(bArr6[bArr6[b25 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255];
            byte b26 = bArr6[i14];
            bArr6[i14] = bArr6[b25 & UByte.MAX_VALUE];
            bArr6[b25 & UByte.MAX_VALUE] = b26;
        }
        System.arraycopy(bArr5, 0, bArr, i3, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29058);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(StubApp.getString2(29061));
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29060));
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException(StubApp.getString2(29059));
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f19015n = (byte) 0;
        this.f19020x4 = (byte) 0;
        this.f19019x3 = (byte) 0;
        this.f19018x2 = (byte) 0;
        this.f19017x1 = (byte) 0;
        this.f19014g = (byte) 0;
        this.f19013T = new byte[32];
        for (int i3 = 0; i3 < 32; i3++) {
            this.f19013T[i3] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.f19012P;
        byte b10 = this.f19016s;
        byte b11 = this.f19015n;
        byte b12 = bArr[(b10 + bArr[b11 & UByte.MAX_VALUE]) & 255];
        this.f19016s = b12;
        byte b13 = (byte) (b2 ^ bArr[(bArr[bArr[b12 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255]);
        byte b14 = this.f19020x4;
        byte b15 = this.f19019x3;
        byte b16 = bArr[(b14 + b15) & 255];
        this.f19020x4 = b16;
        byte b17 = this.f19018x2;
        byte b18 = bArr[(b15 + b17) & 255];
        this.f19019x3 = b18;
        byte b19 = this.f19017x1;
        byte b20 = bArr[(b17 + b19) & 255];
        this.f19018x2 = b20;
        byte b21 = bArr[(b19 + b12 + b13) & 255];
        this.f19017x1 = b21;
        byte[] bArr2 = this.f19013T;
        byte b22 = this.f19014g;
        bArr2[b22 & 31] = (byte) (b21 ^ bArr2[b22 & 31]);
        bArr2[(b22 + 1) & 31] = (byte) (b20 ^ bArr2[(b22 + 1) & 31]);
        bArr2[(b22 + 2) & 31] = (byte) (b18 ^ bArr2[(b22 + 2) & 31]);
        bArr2[(b22 + 3) & 31] = (byte) (b16 ^ bArr2[(b22 + 3) & 31]);
        this.f19014g = (byte) ((b22 + 4) & 31);
        byte b23 = bArr[b11 & UByte.MAX_VALUE];
        bArr[b11 & UByte.MAX_VALUE] = bArr[b12 & UByte.MAX_VALUE];
        bArr[b12 & UByte.MAX_VALUE] = b23;
        this.f19015n = (byte) ((b11 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        for (int i11 = 0; i11 < i10; i11++) {
            update(bArr[i3 + i11]);
        }
    }
}
