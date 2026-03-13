package org.bouncycastle.crypto.agreement.jpake;

import com.stub.StubApp;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JPAKEPrimeOrderGroups {
    public static final JPAKEPrimeOrderGroup SUN_JCE_1024 = new JPAKEPrimeOrderGroup(new BigInteger(StubApp.getString2(28332), 16), new BigInteger(StubApp.getString2(28333), 16), new BigInteger(StubApp.getString2(28334), 16), true);
    public static final JPAKEPrimeOrderGroup NIST_2048 = new JPAKEPrimeOrderGroup(new BigInteger(StubApp.getString2(28411), 16), new BigInteger(StubApp.getString2(28412), 16), new BigInteger(StubApp.getString2(28413), 16), true);
    public static final JPAKEPrimeOrderGroup NIST_3072 = new JPAKEPrimeOrderGroup(new BigInteger(StubApp.getString2(28414), 16), new BigInteger(StubApp.getString2(28415), 16), new BigInteger(StubApp.getString2(28416), 16), true);
}
