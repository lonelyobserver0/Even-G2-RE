package org.bouncycastle.cert.path.validations;

import com.stub.StubApp;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyUsageValidation implements CertPathValidation {
    private boolean isMandatory;

    public KeyUsageValidation() {
        this(true);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new KeyUsageValidation(this.isMandatory);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        this.isMandatory = ((KeyUsageValidation) memoable).isMandatory;
    }

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        certPathValidationContext.addHandledExtension(Extension.keyUsage);
        if (certPathValidationContext.isEndEntity()) {
            return;
        }
        KeyUsage fromExtensions = KeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            if (!fromExtensions.hasUsages(4)) {
                throw new CertPathValidationException(StubApp.getString2(28121));
            }
        } else if (this.isMandatory) {
            throw new CertPathValidationException(StubApp.getString2(28122));
        }
    }

    public KeyUsageValidation(boolean z2) {
        this.isMandatory = z2;
    }
}
