package org.bouncycastle.cert.path.validations;

import org.bouncycastle.cert.path.CertPath;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificatePoliciesValidationBuilder {
    private boolean isAnyPolicyInhibited;
    private boolean isExplicitPolicyRequired;
    private boolean isPolicyMappingInhibited;

    public CertificatePoliciesValidation build(int i3) {
        return new CertificatePoliciesValidation(i3, this.isExplicitPolicyRequired, this.isAnyPolicyInhibited, this.isPolicyMappingInhibited);
    }

    public void setAnyPolicyInhibited(boolean z2) {
        this.isAnyPolicyInhibited = z2;
    }

    public void setExplicitPolicyRequired(boolean z2) {
        this.isExplicitPolicyRequired = z2;
    }

    public void setPolicyMappingInhibited(boolean z2) {
        this.isPolicyMappingInhibited = z2;
    }

    public CertificatePoliciesValidation build(CertPath certPath) {
        return build(certPath.length());
    }
}
