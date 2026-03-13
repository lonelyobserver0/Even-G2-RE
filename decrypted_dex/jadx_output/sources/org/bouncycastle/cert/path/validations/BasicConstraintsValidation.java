package org.bouncycastle.cert.path.validations;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BasicConstraintsValidation implements CertPathValidation {
    private boolean isMandatory;
    private Integer maxPathLength;
    private boolean previousCertWasCA;

    public BasicConstraintsValidation() {
        this(true);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        BasicConstraintsValidation basicConstraintsValidation = new BasicConstraintsValidation();
        basicConstraintsValidation.isMandatory = this.isMandatory;
        basicConstraintsValidation.previousCertWasCA = this.previousCertWasCA;
        basicConstraintsValidation.maxPathLength = this.maxPathLength;
        return basicConstraintsValidation;
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        BasicConstraintsValidation basicConstraintsValidation = (BasicConstraintsValidation) memoable;
        this.isMandatory = basicConstraintsValidation.isMandatory;
        this.previousCertWasCA = basicConstraintsValidation.previousCertWasCA;
        this.maxPathLength = basicConstraintsValidation.maxPathLength;
    }

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        BigInteger pathLenConstraint;
        certPathValidationContext.addHandledExtension(Extension.basicConstraints);
        if (!this.previousCertWasCA) {
            throw new CertPathValidationException(StubApp.getString2(28118));
        }
        BasicConstraints fromExtensions = BasicConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        this.previousCertWasCA = (fromExtensions != null && fromExtensions.isCA()) || (fromExtensions == null && !this.isMandatory);
        if (this.maxPathLength != null && !x509CertificateHolder.getSubject().equals(x509CertificateHolder.getIssuer())) {
            if (this.maxPathLength.intValue() < 0) {
                throw new CertPathValidationException(StubApp.getString2(28117));
            }
            this.maxPathLength = Integers.valueOf(this.maxPathLength.intValue() - 1);
        }
        if (fromExtensions == null || (pathLenConstraint = fromExtensions.getPathLenConstraint()) == null) {
            return;
        }
        int intValueExact = BigIntegers.intValueExact(pathLenConstraint);
        Integer num = this.maxPathLength;
        if (num != null) {
            intValueExact = Math.min(intValueExact, num.intValue());
        }
        this.maxPathLength = Integers.valueOf(intValueExact);
    }

    public BasicConstraintsValidation(boolean z2) {
        this.previousCertWasCA = true;
        this.maxPathLength = null;
        this.isMandatory = z2;
    }
}
