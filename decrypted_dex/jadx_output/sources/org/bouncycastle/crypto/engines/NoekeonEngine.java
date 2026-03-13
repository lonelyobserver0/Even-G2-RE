package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {ByteCompanionObject.MIN_VALUE, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f18952k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i3);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i3 + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i3 + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i3 + 12);
        int[] iArr = this.f18952k;
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = 16;
        while (true) {
            int i16 = bigEndianToInt ^ bigEndianToInt3;
            int rotateLeft = i16 ^ (Integers.rotateLeft(i16, 8) ^ Integers.rotateLeft(i16, 24));
            int i17 = bigEndianToInt2 ^ i12;
            int i18 = bigEndianToInt4 ^ i14;
            int i19 = i17 ^ i18;
            int rotateLeft2 = i19 ^ (Integers.rotateLeft(i19, 24) ^ Integers.rotateLeft(i19, 8));
            int i20 = i17 ^ rotateLeft;
            int i21 = (bigEndianToInt3 ^ i13) ^ rotateLeft2;
            int i22 = i18 ^ rotateLeft;
            int i23 = ((bigEndianToInt ^ i11) ^ rotateLeft2) ^ (roundConstants[i15] & UByte.MAX_VALUE);
            i15--;
            if (i15 < 0) {
                Pack.intToBigEndian(i23, bArr2, i10);
                Pack.intToBigEndian(i20, bArr2, i10 + 4);
                Pack.intToBigEndian(i21, bArr2, i10 + 8);
                Pack.intToBigEndian(i22, bArr2, i10 + 12);
                return 16;
            }
            int rotateLeft3 = Integers.rotateLeft(i20, 1);
            int rotateLeft4 = Integers.rotateLeft(i21, 5);
            int rotateLeft5 = Integers.rotateLeft(i22, 2);
            int i24 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
            int i25 = ~i24;
            int i26 = i23 ^ (rotateLeft4 & i25);
            int i27 = (rotateLeft4 ^ (i25 ^ rotateLeft5)) ^ i26;
            int i28 = i24 ^ (i26 | i27);
            int i29 = rotateLeft5 ^ (i27 & i28);
            bigEndianToInt2 = Integers.rotateLeft(i28, 31);
            bigEndianToInt3 = Integers.rotateLeft(i27, 27);
            int rotateLeft6 = Integers.rotateLeft(i26, 30);
            bigEndianToInt = i29;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, i3);
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i3 + 4);
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, i3 + 8);
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i3 + 12);
        int[] iArr = this.f18952k;
        int i11 = 0;
        int i12 = iArr[0];
        int i13 = 1;
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        while (true) {
            int i17 = bigEndianToInt ^ (roundConstants[i11] & UByte.MAX_VALUE);
            int i18 = i17 ^ bigEndianToInt3;
            int rotateLeft = i18 ^ (Integers.rotateLeft(i18, 8) ^ Integers.rotateLeft(i18, 24));
            int i19 = bigEndianToInt2 ^ i14;
            int i20 = bigEndianToInt4 ^ i16;
            int i21 = i13;
            int i22 = i19 ^ i20;
            int rotateLeft2 = i22 ^ (Integers.rotateLeft(i22, 24) ^ Integers.rotateLeft(i22, 8));
            int i23 = (i17 ^ i12) ^ rotateLeft2;
            int i24 = i19 ^ rotateLeft;
            int i25 = (bigEndianToInt3 ^ i15) ^ rotateLeft2;
            int i26 = i20 ^ rotateLeft;
            i11++;
            if (i11 > 16) {
                Pack.intToBigEndian(i23, bArr2, i10);
                Pack.intToBigEndian(i24, bArr2, i10 + 4);
                Pack.intToBigEndian(i25, bArr2, i10 + 8);
                Pack.intToBigEndian(i26, bArr2, i10 + 12);
                return 16;
            }
            i13 = i21;
            int rotateLeft3 = Integers.rotateLeft(i24, i13);
            int rotateLeft4 = Integers.rotateLeft(i25, 5);
            int rotateLeft5 = Integers.rotateLeft(i26, 2);
            int i27 = rotateLeft3 ^ (rotateLeft5 | rotateLeft4);
            int i28 = ~i27;
            int i29 = i23 ^ (rotateLeft4 & i28);
            int i30 = (rotateLeft4 ^ (i28 ^ rotateLeft5)) ^ i29;
            int i31 = i27 ^ (i29 | i30);
            int i32 = rotateLeft5 ^ (i30 & i31);
            bigEndianToInt2 = Integers.rotateLeft(i31, 31);
            bigEndianToInt3 = Integers.rotateLeft(i30, 27);
            int rotateLeft6 = Integers.rotateLeft(i29, 30);
            bigEndianToInt = i32;
            bigEndianToInt4 = rotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28708);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28710), cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28709));
        }
        Pack.bigEndianToInt(key, 0, this.f18952k, 0, 4);
        if (!z2) {
            int[] iArr = this.f18952k;
            int i3 = iArr[0];
            int i10 = iArr[1];
            int i11 = iArr[2];
            int i12 = iArr[3];
            int i13 = i3 ^ i11;
            int rotateLeft = i13 ^ (Integers.rotateLeft(i13, 8) ^ Integers.rotateLeft(i13, 24));
            int i14 = i10 ^ i12;
            int rotateLeft2 = (Integers.rotateLeft(i14, 8) ^ Integers.rotateLeft(i14, 24)) ^ i14;
            int i15 = i10 ^ rotateLeft;
            int i16 = i12 ^ rotateLeft;
            int[] iArr2 = this.f18952k;
            iArr2[0] = i3 ^ rotateLeft2;
            iArr2[1] = i15;
            iArr2[2] = i11 ^ rotateLeft2;
            iArr2[3] = i16;
        }
        this._forEncryption = z2;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z2)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i3, byte[] bArr2, int i10) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 > bArr.length - 16) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i10 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i3, bArr2, i10) : decryptBlock(bArr, i3, bArr2, i10);
        }
        throw new OutputLengthException(StubApp.getString2(28306));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
