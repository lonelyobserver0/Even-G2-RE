package org.bouncycastle.jcajce.provider.asymmetric.util;

import com.stub.StubApp;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.jce.spec.IESParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESUtil {
    public static IESParameterSpec guessParameterSpec(BufferedBlockCipher bufferedBlockCipher, byte[] bArr) {
        if (bufferedBlockCipher == null) {
            return new IESParameterSpec(null, null, 128);
        }
        BlockCipher underlyingCipher = bufferedBlockCipher.getUnderlyingCipher();
        return (underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28171)) || underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28256)) || underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28717)) || underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28719))) ? new IESParameterSpec(null, null, 64, 64, bArr) : underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28773)) ? new IESParameterSpec(null, null, 80, 80, bArr) : underlyingCipher.getAlgorithmName().equals(StubApp.getString2(28261)) ? new IESParameterSpec(null, null, 256, 256, bArr) : new IESParameterSpec(null, null, 128, 128, bArr);
    }
}
