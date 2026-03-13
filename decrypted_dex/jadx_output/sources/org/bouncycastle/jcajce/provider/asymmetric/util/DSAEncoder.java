package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.IOException;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DSAEncoder {
    BigInteger[] decode(byte[] bArr) throws IOException;

    byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException;
}
