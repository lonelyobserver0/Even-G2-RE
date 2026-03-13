package org.bouncycastle.jcajce;

import com.stub.StubApp;
import java.security.InvalidParameterException;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jcajce.PKIXExtendedParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXExtendedBuilderParameters implements CertPathParameters {
    private final PKIXExtendedParameters baseParameters;
    private final Set<X509Certificate> excludedCerts;
    private final int maxPathLength;

    /* renamed from: org.bouncycastle.jcajce.PKIXExtendedBuilderParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final PKIXExtendedParameters baseParameters;
        private Set<X509Certificate> excludedCerts;
        private int maxPathLength;

        public Builder(PKIXBuilderParameters pKIXBuilderParameters) {
            this.maxPathLength = 5;
            this.excludedCerts = new HashSet();
            this.baseParameters = new PKIXExtendedParameters.Builder(pKIXBuilderParameters).build();
            this.maxPathLength = pKIXBuilderParameters.getMaxPathLength();
        }

        public Builder addExcludedCerts(Set<X509Certificate> set) {
            this.excludedCerts.addAll(set);
            return this;
        }

        public PKIXExtendedBuilderParameters build() {
            return new PKIXExtendedBuilderParameters(this, null);
        }

        public Builder setMaxPathLength(int i3) {
            if (i3 < -1) {
                throw new InvalidParameterException(StubApp.getString2(29645));
            }
            this.maxPathLength = i3;
            return this;
        }

        public Builder(PKIXExtendedParameters pKIXExtendedParameters) {
            this.maxPathLength = 5;
            this.excludedCerts = new HashSet();
            this.baseParameters = pKIXExtendedParameters;
        }
    }

    private PKIXExtendedBuilderParameters(Builder builder) {
        this.baseParameters = builder.baseParameters;
        this.excludedCerts = Collections.unmodifiableSet(builder.excludedCerts);
        this.maxPathLength = builder.maxPathLength;
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public PKIXExtendedParameters getBaseParameters() {
        return this.baseParameters;
    }

    public Set getExcludedCerts() {
        return this.excludedCerts;
    }

    public int getMaxPathLength() {
        return this.maxPathLength;
    }

    public /* synthetic */ PKIXExtendedBuilderParameters(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
