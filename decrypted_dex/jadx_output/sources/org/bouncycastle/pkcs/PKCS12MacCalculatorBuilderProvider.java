package org.bouncycastle.pkcs;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PKCS12MacCalculatorBuilderProvider {
    PKCS12MacCalculatorBuilder get(AlgorithmIdentifier algorithmIdentifier);
}
