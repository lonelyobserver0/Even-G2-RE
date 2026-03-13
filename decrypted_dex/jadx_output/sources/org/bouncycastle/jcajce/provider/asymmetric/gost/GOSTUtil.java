package org.bouncycastle.jcajce.provider.asymmetric.gost;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Fingerprint;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class GOSTUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        return new Fingerprint(Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        BigInteger modPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        stringBuffer.append(str);
        stringBuffer.append(StubApp.getString2(30493));
        stringBuffer.append(generateKeyFingerprint(modPow, gOST3410Parameters));
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30768));
        stringBuffer.append(modPow.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(StubApp.getString2(30495));
        stringBuffer.append(generateKeyFingerprint(bigInteger, gOST3410Parameters));
        stringBuffer.append(StubApp.getString2(511));
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(30769));
        stringBuffer.append(bigInteger.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }
}
