package org.bouncycastle.jcajce.provider.asymmetric.dh;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DHUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, DHParameters dHParameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        BigInteger modPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        stringBuffer.append(str);
        stringBuffer.append(StubApp.getString2(30493));
        stringBuffer.append(generateKeyFingerprint(modPow, dHParameters));
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30494));
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, DHParameters dHParameters) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(StubApp.getString2(30495));
        stringBuffer.append(generateKeyFingerprint(bigInteger, dHParameters));
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30496));
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }
}
