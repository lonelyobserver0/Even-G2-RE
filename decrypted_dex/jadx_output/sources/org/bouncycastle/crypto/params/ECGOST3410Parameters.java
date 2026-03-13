package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECGOST3410Parameters extends ECNamedDomainParameters {
    private final ASN1ObjectIdentifier digestParamSet;
    private final ASN1ObjectIdentifier encryptionParamSet;
    private final ASN1ObjectIdentifier publicKeyParamSet;

    public ECGOST3410Parameters(ECDomainParameters eCDomainParameters, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this(eCDomainParameters, aSN1ObjectIdentifier, aSN1ObjectIdentifier2, null);
    }

    public ASN1ObjectIdentifier getDigestParamSet() {
        return this.digestParamSet;
    }

    public ASN1ObjectIdentifier getEncryptionParamSet() {
        return this.encryptionParamSet;
    }

    public ASN1ObjectIdentifier getPublicKeyParamSet() {
        return this.publicKeyParamSet;
    }

    public ECGOST3410Parameters(ECDomainParameters eCDomainParameters, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2, ASN1ObjectIdentifier aSN1ObjectIdentifier3) {
        super(aSN1ObjectIdentifier, eCDomainParameters);
        if ((eCDomainParameters instanceof ECNamedDomainParameters) && !aSN1ObjectIdentifier.equals((ASN1Primitive) ((ECNamedDomainParameters) eCDomainParameters).getName())) {
            throw new IllegalArgumentException(StubApp.getString2(29207));
        }
        this.publicKeyParamSet = aSN1ObjectIdentifier;
        this.digestParamSet = aSN1ObjectIdentifier2;
        this.encryptionParamSet = aSN1ObjectIdentifier3;
    }
}
