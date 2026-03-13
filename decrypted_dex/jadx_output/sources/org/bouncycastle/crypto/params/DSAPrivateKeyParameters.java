package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAPrivateKeyParameters extends DSAKeyParameters {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19080x;

    public DSAPrivateKeyParameters(BigInteger bigInteger, DSAParameters dSAParameters) {
        super(true, dSAParameters);
        this.f19080x = bigInteger;
    }

    public BigInteger getX() {
        return this.f19080x;
    }
}
