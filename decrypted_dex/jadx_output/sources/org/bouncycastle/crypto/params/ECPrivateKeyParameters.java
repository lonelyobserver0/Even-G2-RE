package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* renamed from: d, reason: collision with root package name */
    private final BigInteger f19085d;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f19085d = eCDomainParameters.validatePrivateScalar(bigInteger);
    }

    public BigInteger getD() {
        return this.f19085d;
    }
}
