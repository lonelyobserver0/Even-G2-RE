package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* renamed from: q, reason: collision with root package name */
    private final ECPoint f19086q;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f19086q = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f19086q;
    }
}
