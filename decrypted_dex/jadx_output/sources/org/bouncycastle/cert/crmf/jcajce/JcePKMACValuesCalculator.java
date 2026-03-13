package org.bouncycastle.cert.crmf.jcajce;

import com.stub.StubApp;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cert.crmf.PKMACValuesCalculator;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcePKMACValuesCalculator implements PKMACValuesCalculator {
    private MessageDigest digest;
    private CRMFHelper helper = new CRMFHelper(new DefaultJcaJceHelper());
    private Mac mac;

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public byte[] calculateDigest(byte[] bArr) {
        return this.digest.digest(bArr);
    }

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public byte[] calculateMac(byte[] bArr, byte[] bArr2) throws CRMFException {
        try {
            this.mac.init(new SecretKeySpec(bArr, this.mac.getAlgorithm()));
            return this.mac.doFinal(bArr2);
        } catch (GeneralSecurityException e10) {
            throw new CRMFException(a.h(e10, new StringBuilder(StubApp.getString2(28077))), e10);
        }
    }

    public JcePKMACValuesCalculator setProvider(String str) {
        this.helper = new CRMFHelper(new NamedJcaJceHelper(str));
        return this;
    }

    @Override // org.bouncycastle.cert.crmf.PKMACValuesCalculator
    public void setup(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) throws CRMFException {
        this.digest = this.helper.createDigest(algorithmIdentifier.getAlgorithm());
        this.mac = this.helper.createMac(algorithmIdentifier2.getAlgorithm());
    }

    public JcePKMACValuesCalculator setProvider(Provider provider) {
        this.helper = new CRMFHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
