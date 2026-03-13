package org.bouncycastle.operator;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface AlgorithmNameFinder {
    String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier);

    String getAlgorithmName(AlgorithmIdentifier algorithmIdentifier);

    boolean hasAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier);
}
