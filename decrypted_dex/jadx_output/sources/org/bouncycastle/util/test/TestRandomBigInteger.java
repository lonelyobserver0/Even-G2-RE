package org.bouncycastle.util.test;

import java.math.BigInteger;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.test.FixedSecureRandom;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class TestRandomBigInteger extends FixedSecureRandom {
    public TestRandomBigInteger(int i3, byte[] bArr) {
        super(new FixedSecureRandom.Source[]{new FixedSecureRandom.BigInteger(i3, bArr)});
    }

    public TestRandomBigInteger(String str) {
        this(str, 10);
    }

    public TestRandomBigInteger(String str, int i3) {
        super(new FixedSecureRandom.Source[]{new FixedSecureRandom.BigInteger(BigIntegers.asUnsignedByteArray(new BigInteger(str, i3)))});
    }

    public TestRandomBigInteger(byte[] bArr) {
        super(new FixedSecureRandom.Source[]{new FixedSecureRandom.BigInteger(bArr)});
    }
}
