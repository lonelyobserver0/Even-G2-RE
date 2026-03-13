package org.bouncycastle.its.jcajce;

import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSExplicitCertificateBuilder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaITSExplicitCertificateBuilder extends ITSExplicitCertificateBuilder {
    private JcaJceHelper helper;

    public JcaITSExplicitCertificateBuilder(ITSContentSigner iTSContentSigner, ToBeSignedCertificate.Builder builder) {
        this(iTSContentSigner, builder, new DefaultJcaJceHelper());
    }

    public ITSCertificate build(CertificateId certificateId, ECPublicKey eCPublicKey) {
        return build(certificateId, eCPublicKey, (ECPublicKey) null);
    }

    public JcaITSExplicitCertificateBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    private JcaITSExplicitCertificateBuilder(ITSContentSigner iTSContentSigner, ToBeSignedCertificate.Builder builder, JcaJceHelper jcaJceHelper) {
        super(iTSContentSigner, builder);
        this.helper = jcaJceHelper;
    }

    public ITSCertificate build(CertificateId certificateId, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2) {
        return super.build(certificateId, new JcaITSPublicVerificationKey(eCPublicKey, this.helper), eCPublicKey2 != null ? new JceITSPublicEncryptionKey(eCPublicKey2, this.helper) : null);
    }

    public JcaITSExplicitCertificateBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
