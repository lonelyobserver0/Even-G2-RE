package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410PrivateKeyParameters extends GOST3410KeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19095x;

    public GOST3410PrivateKeyParameters(BigInteger bigInteger, GOST3410Parameters gOST3410Parameters) {
        super(true, gOST3410Parameters);
        this.f19095x = bigInteger;
    }

    public BigInteger getX() {
        return this.f19095x;
    }
}
