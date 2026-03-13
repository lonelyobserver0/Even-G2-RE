package org.bouncycastle.cert.path;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Set;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertPathValidationResult {
    private final CertPathValidationException cause;
    private CertPathValidationException[] causes;
    private final int certIndex;
    private int[] certIndexes;
    private final boolean isValid;
    private final int ruleIndex;
    private int[] ruleIndexes;
    private final Set unhandledCriticalExtensionOIDs;

    public CertPathValidationResult(CertPathValidationContext certPathValidationContext) {
        Set unmodifiableSet = Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.unhandledCriticalExtensionOIDs = unmodifiableSet;
        this.isValid = unmodifiableSet.isEmpty();
        this.certIndex = -1;
        this.ruleIndex = -1;
        this.cause = null;
    }

    public CertPathValidationException getCause() {
        CertPathValidationException certPathValidationException = this.cause;
        if (certPathValidationException != null) {
            return certPathValidationException;
        }
        if (this.unhandledCriticalExtensionOIDs.isEmpty()) {
            return null;
        }
        return new CertPathValidationException(StubApp.getString2(28116));
    }

    public CertPathValidationException[] getCauses() {
        CertPathValidationException[] certPathValidationExceptionArr = this.causes;
        if (certPathValidationExceptionArr != null) {
            CertPathValidationException[] certPathValidationExceptionArr2 = new CertPathValidationException[certPathValidationExceptionArr.length];
            System.arraycopy(certPathValidationExceptionArr, 0, certPathValidationExceptionArr2, 0, certPathValidationExceptionArr.length);
            return certPathValidationExceptionArr2;
        }
        if (this.unhandledCriticalExtensionOIDs.isEmpty()) {
            return null;
        }
        return new CertPathValidationException[]{new CertPathValidationException(StubApp.getString2(28116))};
    }

    public int getFailingCertIndex() {
        return this.certIndex;
    }

    public int[] getFailingCertIndexes() {
        return Arrays.clone(this.certIndexes);
    }

    public int getFailingRuleIndex() {
        return this.ruleIndex;
    }

    public int[] getFailingRuleIndexes() {
        return Arrays.clone(this.ruleIndexes);
    }

    public Set getUnhandledCriticalExtensionOIDs() {
        return this.unhandledCriticalExtensionOIDs;
    }

    public boolean isDetailed() {
        return this.certIndexes != null;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public CertPathValidationResult(CertPathValidationContext certPathValidationContext, int i3, int i10, CertPathValidationException certPathValidationException) {
        this.unhandledCriticalExtensionOIDs = Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.isValid = false;
        this.certIndex = i3;
        this.ruleIndex = i10;
        this.cause = certPathValidationException;
    }

    public CertPathValidationResult(CertPathValidationContext certPathValidationContext, int[] iArr, int[] iArr2, CertPathValidationException[] certPathValidationExceptionArr) {
        this.unhandledCriticalExtensionOIDs = Collections.unmodifiableSet(certPathValidationContext.getUnhandledCriticalExtensionOIDs());
        this.isValid = false;
        this.cause = certPathValidationExceptionArr[0];
        this.certIndex = iArr[0];
        this.ruleIndex = iArr2[0];
        this.causes = certPathValidationExceptionArr;
        this.certIndexes = iArr;
        this.ruleIndexes = iArr2;
    }
}
