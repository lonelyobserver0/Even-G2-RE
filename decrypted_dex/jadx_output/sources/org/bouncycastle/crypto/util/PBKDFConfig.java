package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class PBKDFConfig {
    private final ASN1ObjectIdentifier algorithm;

    public PBKDFConfig(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.algorithm = aSN1ObjectIdentifier;
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }
}
