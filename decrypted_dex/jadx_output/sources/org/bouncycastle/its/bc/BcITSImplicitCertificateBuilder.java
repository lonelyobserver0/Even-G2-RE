package org.bouncycastle.its.bc;

import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSImplicitCertificateBuilder;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.operator.bc.BcDigestCalculatorProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcITSImplicitCertificateBuilder extends ITSImplicitCertificateBuilder {
    public BcITSImplicitCertificateBuilder(ITSCertificate iTSCertificate, ToBeSignedCertificate.Builder builder) {
        super(iTSCertificate, new BcDigestCalculatorProvider(), builder);
    }
}
