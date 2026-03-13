package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i3, int[] iArr, int[] iArr2) {
        int i10 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i3 % 2 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(28577));
        }
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        char c10 = 3;
        int i14 = iArr[3];
        char c11 = 4;
        int i15 = iArr[4];
        char c12 = 5;
        int i16 = iArr[5];
        char c13 = 6;
        int i17 = iArr[6];
        int i18 = 7;
        int i19 = iArr[7];
        int i20 = 8;
        int i21 = iArr[8];
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = 12;
        int i26 = iArr[12];
        int i27 = iArr[13];
        int i28 = iArr[14];
        int i29 = iArr[15];
        int i30 = i28;
        int i31 = i27;
        int i32 = i26;
        int i33 = i24;
        int i34 = i23;
        int i35 = i22;
        int i36 = i21;
        int i37 = i19;
        int i38 = i17;
        int i39 = i16;
        int i40 = i15;
        int i41 = i14;
        int i42 = i13;
        int i43 = i12;
        int i44 = i11;
        int i45 = i3;
        while (i45 > 0) {
            int i46 = i44 + i40;
            char c14 = c10;
            int rotateLeft = Integers.rotateLeft(i32 ^ i46, i10);
            int i47 = i36 + rotateLeft;
            int rotateLeft2 = Integers.rotateLeft(i40 ^ i47, i25);
            int i48 = i46 + rotateLeft2;
            int rotateLeft3 = Integers.rotateLeft(rotateLeft ^ i48, i20);
            int i49 = i47 + rotateLeft3;
            int rotateLeft4 = Integers.rotateLeft(rotateLeft2 ^ i49, i18);
            int i50 = i43 + i39;
            char c15 = c11;
            int rotateLeft5 = Integers.rotateLeft(i31 ^ i50, i10);
            int i51 = i35 + rotateLeft5;
            char c16 = c12;
            int rotateLeft6 = Integers.rotateLeft(i39 ^ i51, i25);
            int i52 = i50 + rotateLeft6;
            int rotateLeft7 = Integers.rotateLeft(rotateLeft5 ^ i52, i20);
            int i53 = i51 + rotateLeft7;
            int rotateLeft8 = Integers.rotateLeft(rotateLeft6 ^ i53, i18);
            int i54 = i42 + i38;
            char c17 = c13;
            int rotateLeft9 = Integers.rotateLeft(i30 ^ i54, i10);
            int i55 = i34 + rotateLeft9;
            int rotateLeft10 = Integers.rotateLeft(i38 ^ i55, i25);
            int i56 = i54 + rotateLeft10;
            int rotateLeft11 = Integers.rotateLeft(rotateLeft9 ^ i56, i20);
            int i57 = i55 + rotateLeft11;
            int rotateLeft12 = Integers.rotateLeft(rotateLeft10 ^ i57, i18);
            int i58 = i41 + i37;
            int rotateLeft13 = Integers.rotateLeft(i29 ^ i58, 16);
            int i59 = i33 + rotateLeft13;
            int rotateLeft14 = Integers.rotateLeft(i37 ^ i59, i25);
            int i60 = i58 + rotateLeft14;
            int rotateLeft15 = Integers.rotateLeft(rotateLeft13 ^ i60, 8);
            int i61 = i59 + rotateLeft15;
            int rotateLeft16 = Integers.rotateLeft(rotateLeft14 ^ i61, 7);
            int i62 = i48 + rotateLeft8;
            int rotateLeft17 = Integers.rotateLeft(rotateLeft15 ^ i62, 16);
            int i63 = i57 + rotateLeft17;
            int rotateLeft18 = Integers.rotateLeft(rotateLeft8 ^ i63, 12);
            i44 = i62 + rotateLeft18;
            i29 = Integers.rotateLeft(rotateLeft17 ^ i44, 8);
            i34 = i63 + i29;
            i39 = Integers.rotateLeft(rotateLeft18 ^ i34, 7);
            int i64 = i52 + rotateLeft12;
            int rotateLeft19 = Integers.rotateLeft(rotateLeft3 ^ i64, 16);
            int i65 = i61 + rotateLeft19;
            int rotateLeft20 = Integers.rotateLeft(rotateLeft12 ^ i65, 12);
            i43 = i64 + rotateLeft20;
            i32 = Integers.rotateLeft(rotateLeft19 ^ i43, 8);
            i33 = i65 + i32;
            i38 = Integers.rotateLeft(rotateLeft20 ^ i33, 7);
            int i66 = i56 + rotateLeft16;
            int rotateLeft21 = Integers.rotateLeft(rotateLeft7 ^ i66, 16);
            int i67 = i49 + rotateLeft21;
            int rotateLeft22 = Integers.rotateLeft(rotateLeft16 ^ i67, 12);
            i42 = i66 + rotateLeft22;
            i31 = Integers.rotateLeft(rotateLeft21 ^ i42, 8);
            i36 = i67 + i31;
            i37 = Integers.rotateLeft(rotateLeft22 ^ i36, 7);
            int i68 = i60 + rotateLeft4;
            int rotateLeft23 = Integers.rotateLeft(rotateLeft11 ^ i68, 16);
            int i69 = i53 + rotateLeft23;
            int rotateLeft24 = Integers.rotateLeft(rotateLeft4 ^ i69, 12);
            i41 = i68 + rotateLeft24;
            i30 = Integers.rotateLeft(rotateLeft23 ^ i41, 8);
            i35 = i69 + i30;
            i40 = Integers.rotateLeft(rotateLeft24 ^ i35, 7);
            i45 -= 2;
            i10 = 16;
            c10 = c14;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            i18 = 7;
            i20 = 8;
            i25 = 12;
        }
        char c18 = c10;
        char c19 = c11;
        char c20 = c12;
        char c21 = c13;
        iArr2[0] = i44 + iArr[0];
        iArr2[1] = i43 + iArr[1];
        iArr2[2] = i42 + iArr[2];
        iArr2[c18] = i41 + iArr[c18];
        iArr2[c19] = i40 + iArr[c19];
        iArr2[c20] = i39 + iArr[c20];
        iArr2[c21] = i38 + iArr[c21];
        iArr2[7] = i37 + iArr[7];
        iArr2[8] = i36 + iArr[8];
        iArr2[9] = i35 + iArr[9];
        iArr2[10] = i34 + iArr[10];
        iArr2[11] = i33 + iArr[11];
        iArr2[12] = i32 + iArr[12];
        iArr2[13] = i31 + iArr[13];
        iArr2[14] = i30 + iArr[14];
        iArr2[15] = i29 + iArr[15];
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[12] + 1;
        iArr[12] = i3;
        if (i3 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f18961x);
        Pack.intToLittleEndian(this.f18961x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28578) + this.rounds;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[13] << 32) | (iArr[12] & BodyPartID.bodyIdMax);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter() {
        int[] iArr = this.engineState;
        int i3 = iArr[12];
        if (i3 == 0 && iArr[13] == 0) {
            throw new IllegalStateException(StubApp.getString2(28575));
        }
        int i10 = i3 - 1;
        iArr[12] = i10;
        if (i10 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + StubApp.getString2(28579));
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i3) {
        super(i3);
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void advanceCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        if (i3 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i3;
        }
        int[] iArr2 = this.engineState;
        int i11 = iArr2[12];
        int i12 = i10 + i11;
        iArr2[12] = i12;
        if (i11 == 0 || i12 >= i11) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.bouncycastle.crypto.engines.Salsa20Engine
    public void retreatCounter(long j) {
        int i3 = (int) (j >>> 32);
        int i10 = (int) j;
        String string2 = StubApp.getString2(28575);
        if (i3 != 0) {
            int[] iArr = this.engineState;
            int i11 = iArr[13];
            if ((i11 & BodyPartID.bodyIdMax) < (i3 & BodyPartID.bodyIdMax)) {
                throw new IllegalStateException(string2);
            }
            iArr[13] = i11 - i3;
        }
        int[] iArr2 = this.engineState;
        int i12 = iArr2[12];
        if ((i12 & BodyPartID.bodyIdMax) >= (BodyPartID.bodyIdMax & i10)) {
            iArr2[12] = i12 - i10;
            return;
        }
        int i13 = iArr2[13];
        if (i13 == 0) {
            throw new IllegalStateException(string2);
        }
        iArr2[13] = i13 - 1;
        iArr2[12] = i12 - i10;
    }
}
