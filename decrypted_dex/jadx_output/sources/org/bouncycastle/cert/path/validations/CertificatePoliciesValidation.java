package org.bouncycastle.cert.path.validations;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.PolicyConstraints;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidation;
import org.bouncycastle.cert.path.CertPathValidationContext;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificatePoliciesValidation implements CertPathValidation {
    private int explicitPolicy;
    private int inhibitAnyPolicy;
    private int policyMapping;

    public CertificatePoliciesValidation(int i3) {
        this(i3, false, false, false);
    }

    private int countDown(int i3) {
        if (i3 != 0) {
            return i3 - 1;
        }
        return 0;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new CertificatePoliciesValidation(0);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
    }

    @Override // org.bouncycastle.cert.path.CertPathValidation
    public void validate(CertPathValidationContext certPathValidationContext, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        int intValueExact;
        certPathValidationContext.addHandledExtension(Extension.policyConstraints);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = Extension.inhibitAnyPolicy;
        certPathValidationContext.addHandledExtension(aSN1ObjectIdentifier);
        if (certPathValidationContext.isEndEntity() || ValidationUtils.isSelfIssued(x509CertificateHolder)) {
            return;
        }
        this.explicitPolicy = countDown(this.explicitPolicy);
        this.policyMapping = countDown(this.policyMapping);
        this.inhibitAnyPolicy = countDown(this.inhibitAnyPolicy);
        PolicyConstraints fromExtensions = PolicyConstraints.fromExtensions(x509CertificateHolder.getExtensions());
        if (fromExtensions != null) {
            BigInteger requireExplicitPolicyMapping = fromExtensions.getRequireExplicitPolicyMapping();
            if (requireExplicitPolicyMapping != null && requireExplicitPolicyMapping.intValue() < this.explicitPolicy) {
                this.explicitPolicy = requireExplicitPolicyMapping.intValue();
            }
            BigInteger inhibitPolicyMapping = fromExtensions.getInhibitPolicyMapping();
            if (inhibitPolicyMapping != null && inhibitPolicyMapping.intValue() < this.policyMapping) {
                this.policyMapping = inhibitPolicyMapping.intValue();
            }
        }
        Extension extension = x509CertificateHolder.getExtension(aSN1ObjectIdentifier);
        if (extension == null || (intValueExact = ASN1Integer.getInstance(extension.getParsedValue()).intValueExact()) >= this.inhibitAnyPolicy) {
            return;
        }
        this.inhibitAnyPolicy = intValueExact;
    }

    public CertificatePoliciesValidation(int i3, boolean z2, boolean z10, boolean z11) {
        if (z2) {
            this.explicitPolicy = 0;
        } else {
            this.explicitPolicy = i3 + 1;
        }
        if (z10) {
            this.inhibitAnyPolicy = 0;
        } else {
            this.inhibitAnyPolicy = i3 + 1;
        }
        if (z11) {
            this.policyMapping = 0;
        } else {
            this.policyMapping = i3 + 1;
        }
    }
}
