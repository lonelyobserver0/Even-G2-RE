package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.ParametersWithUKM;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CryptoProWrapEngine extends GOST28147WrapEngine {
    private static boolean bitSet(byte b2, int i3) {
        return (b2 & (1 << i3)) != 0;
    }

    private static byte[] cryptoProDiversify(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i3 = 0; i3 != 8; i3++) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 != 8; i12++) {
                int littleEndianToInt = Pack.littleEndianToInt(bArr, i12 * 4);
                if (bitSet(bArr2[i3], i12)) {
                    i10 += littleEndianToInt;
                } else {
                    i11 += littleEndianToInt;
                }
            }
            byte[] bArr4 = new byte[8];
            Pack.intToLittleEndian(i10, bArr4, 0);
            Pack.intToLittleEndian(i11, bArr4, 4);
            GCFBBlockCipher gCFBBlockCipher = new GCFBBlockCipher(new GOST28147Engine());
            gCFBBlockCipher.init(true, new ParametersWithIV(new ParametersWithSBox(new KeyParameter(bArr), bArr3), bArr4));
            gCFBBlockCipher.processBlock(bArr, 0, bArr, 0);
            gCFBBlockCipher.processBlock(bArr, 8, bArr, 8);
            gCFBBlockCipher.processBlock(bArr, 16, bArr, 16);
            gCFBBlockCipher.processBlock(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.engines.GOST28147WrapEngine, org.bouncycastle.crypto.Wrapper
    public void init(boolean z2, CipherParameters cipherParameters) {
        KeyParameter keyParameter;
        byte[] bArr;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        ParametersWithUKM parametersWithUKM = (ParametersWithUKM) cipherParameters;
        if (parametersWithUKM.getParameters() instanceof ParametersWithSBox) {
            keyParameter = (KeyParameter) ((ParametersWithSBox) parametersWithUKM.getParameters()).getParameters();
            bArr = ((ParametersWithSBox) parametersWithUKM.getParameters()).getSBox();
        } else {
            keyParameter = (KeyParameter) parametersWithUKM.getParameters();
            bArr = null;
        }
        KeyParameter keyParameter2 = new KeyParameter(cryptoProDiversify(keyParameter.getKey(), parametersWithUKM.getUKM(), bArr));
        super.init(z2, bArr != null ? new ParametersWithUKM(new ParametersWithSBox(keyParameter2, bArr), parametersWithUKM.getUKM()) : new ParametersWithUKM(keyParameter2, parametersWithUKM.getUKM()));
    }
}
