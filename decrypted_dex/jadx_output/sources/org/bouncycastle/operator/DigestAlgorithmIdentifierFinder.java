package org.bouncycastle.operator;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DigestAlgorithmIdentifierFinder {
    AlgorithmIdentifier find(String str);

    AlgorithmIdentifier find(ASN1ObjectIdentifier aSN1ObjectIdentifier);

    AlgorithmIdentifier find(AlgorithmIdentifier algorithmIdentifier);
}
