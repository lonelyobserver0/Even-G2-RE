package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST28147Mac implements Mac {
    private static final int BLOCK_SIZE = 8;
    private static final int MAC_SIZE = 4;

    /* renamed from: S, reason: collision with root package name */
    private byte[] f18989S;
    private byte[] buf;
    private int bufOff;
    private boolean firstStep;
    private byte[] mac;
    private byte[] macIV;
    private final CryptoServicePurpose purpose;
    private int[] workingKey;

    public GOST28147Mac() {
        this(CryptoServicePurpose.AUTHENTICATION);
    }

    private static void CM5func(byte[] bArr, int i3, byte[] bArr2, byte[] bArr3) {
        for (int i10 = 0; i10 < 8; i10++) {
            bArr3[i10] = (byte) (bArr[i3 + i10] ^ bArr2[i10]);
        }
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(28633));
        }
        int[] iArr = new int[8];
        for (int i3 = 0; i3 != 8; i3++) {
            iArr[i3] = Pack.littleEndianToInt(bArr, i3 * 4);
        }
        return iArr;
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i3, byte[] bArr2, int i10) {
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i3);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, i3 + 4);
        for (int i11 = 0; i11 < 2; i11++) {
            int i12 = 0;
            while (i12 < 8) {
                int gost28147_mainStep = littleEndianToInt2 ^ gost28147_mainStep(littleEndianToInt, iArr[i12]);
                i12++;
                int i13 = littleEndianToInt;
                littleEndianToInt = gost28147_mainStep;
                littleEndianToInt2 = i13;
            }
        }
        Pack.intToLittleEndian(littleEndianToInt, bArr2, i10);
        Pack.intToLittleEndian(littleEndianToInt2, bArr2, i10 + 4);
    }

    private int gost28147_mainStep(int i3, int i10) {
        int i11 = i10 + i3;
        byte[] bArr = this.f18989S;
        int i12 = bArr[i11 & 15] + (bArr[((i11 >> 4) & 15) + 16] << 4) + (bArr[((i11 >> 8) & 15) + 32] << 8) + (bArr[((i11 >> 12) & 15) + 48] << 12) + (bArr[((i11 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i11 >> 20) & 15) + 80] << 20) + (bArr[((i11 >> 24) & 15) + 96] << 24) + (bArr[((i11 >> 28) & 15) + 112] << 28);
        return (i12 << 11) | (i12 >>> 21);
    }

    private void recursiveInit(CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters == null) {
            return;
        }
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.f18989S, 0, parametersWithSBox.getSBox().length);
            parameters = parametersWithSBox.getParameters();
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
            parameters = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(a.g(StubApp.getString2(28637), cipherParameters));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr = this.mac;
            System.arraycopy(iv, 0, bArr, 0, bArr.length);
            this.macIV = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        }
        recursiveInit(parameters);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        while (true) {
            int i10 = this.bufOff;
            if (i10 >= 8) {
                break;
            }
            this.buf[i10] = 0;
            this.bufOff = i10 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        if (this.firstStep) {
            this.firstStep = false;
            System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        } else {
            CM5func(bArr2, 0, this.mac, bArr3);
        }
        gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        System.arraycopy(bArr4, (bArr4.length / 2) - 4, bArr, i3, 4);
        reset();
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29031);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        reset();
        this.buf = new byte[8];
        this.macIV = null;
        recursiveInit(cipherParameters);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178, cipherParameters, this.purpose));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i3 >= bArr.length) {
                this.bufOff = 0;
                this.firstStep = true;
                return;
            } else {
                bArr[i3] = 0;
                i3++;
            }
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        GOST28147Mac gOST28147Mac;
        int i3 = this.bufOff;
        byte[] bArr = this.buf;
        if (i3 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr3 = this.macIV;
                if (bArr3 != null) {
                    CM5func(bArr, 0, bArr3, bArr2);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
                }
            } else {
                CM5func(bArr, 0, this.mac, bArr2);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr2, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
        } else {
            gOST28147Mac = this;
        }
        byte[] bArr4 = gOST28147Mac.buf;
        int i10 = gOST28147Mac.bufOff;
        gOST28147Mac.bufOff = i10 + 1;
        bArr4[i10] = b2;
    }

    public GOST28147Mac(CryptoServicePurpose cryptoServicePurpose) {
        this.firstStep = true;
        this.workingKey = null;
        this.macIV = null;
        this.f18989S = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
        this.purpose = cryptoServicePurpose;
        this.mac = new byte[8];
        this.buf = new byte[8];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        GOST28147Mac gOST28147Mac;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28301));
        }
        int i11 = this.bufOff;
        int i12 = 8 - i11;
        if (i10 > i12) {
            System.arraycopy(bArr, i3, this.buf, i11, i12);
            byte[] bArr2 = this.buf;
            byte[] bArr3 = new byte[bArr2.length];
            if (this.firstStep) {
                this.firstStep = false;
                byte[] bArr4 = this.macIV;
                if (bArr4 != null) {
                    CM5func(bArr2, 0, bArr4, bArr3);
                } else {
                    System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
                }
            } else {
                CM5func(bArr2, 0, this.mac, bArr3);
            }
            gOST28147Mac = this;
            gOST28147Mac.gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
            gOST28147Mac.bufOff = 0;
            i10 -= i12;
            i3 += i12;
            while (i10 > 8) {
                CM5func(bArr, i3, gOST28147Mac.mac, bArr3);
                gOST28147Mac.gost28147MacFunc(gOST28147Mac.workingKey, bArr3, 0, gOST28147Mac.mac, 0);
                i10 -= 8;
                i3 += 8;
            }
        } else {
            gOST28147Mac = this;
        }
        System.arraycopy(bArr, i3, gOST28147Mac.buf, gOST28147Mac.bufOff, i10);
        gOST28147Mac.bufOff += i10;
    }
}
