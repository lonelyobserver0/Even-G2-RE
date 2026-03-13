package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ContentVerifierProvider {
    ContentVerifier get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;

    X509CertificateHolder getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
