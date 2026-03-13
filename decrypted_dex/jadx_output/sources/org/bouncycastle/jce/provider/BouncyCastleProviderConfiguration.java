package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BouncyCastleProviderConfiguration implements ProviderConfiguration {
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION;
    private static Permission BC_DH_LOCAL_PERMISSION;
    private static Permission BC_DH_PERMISSION;
    private static Permission BC_EC_CURVE_PERMISSION;
    private static Permission BC_EC_LOCAL_PERMISSION;
    private static Permission BC_EC_PERMISSION;
    private volatile Object dhDefaultParams;
    private volatile ECParameterSpec ecImplicitCaParams;
    private ThreadLocal ecThreadSpec = new ThreadLocal();
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();

    static {
        String string2 = StubApp.getString2(32620);
        String string22 = StubApp.getString2(21668);
        BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(string22, string2);
        BC_EC_PERMISSION = new ProviderConfigurationPermission(string22, StubApp.getString2(32621));
        BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(string22, StubApp.getString2(32622));
        BC_DH_PERMISSION = new ProviderConfigurationPermission(string22, StubApp.getString2(32623));
        BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(string22, StubApp.getString2(32624));
        BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(string22, StubApp.getString2(32625));
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.acceptableNamedCurves);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.additionalECParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DHParameterSpec getDHDefaultParameters(int i3) {
        Object obj = this.dhThreadSpec.get();
        if (obj == null) {
            obj = this.dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i3) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i10 = 0; i10 != dHParameterSpecArr.length; i10++) {
                if (dHParameterSpecArr[i10].getP().bitLength() == i3) {
                    return dHParameterSpecArr[i10];
                }
            }
        }
        DHParameters dHParameters = (DHParameters) CryptoServicesRegistrar.getSizedProperty(CryptoServicesRegistrar.Property.DH_DEFAULT_PARAMS, i3);
        if (dHParameters != null) {
            return new DHDomainParameterSpec(dHParameters);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DSAParameterSpec getDSADefaultParameters(int i3) {
        DSAParameters dSAParameters = (DSAParameters) CryptoServicesRegistrar.getSizedProperty(CryptoServicesRegistrar.Property.DSA_DEFAULT_PARAMS, i3);
        if (dSAParameters != null) {
            return new DSAParameterSpec(dSAParameters.getP(), dSAParameters.getQ(), dSAParameters.getG());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public ECParameterSpec getEcImplicitlyCa() {
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.ecThreadSpec.get();
        return eCParameterSpec != null ? eCParameterSpec : this.ecImplicitCaParams;
    }

    public void setParameter(String str, Object obj) {
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(StubApp.getString2(32620))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            ECParameterSpec convertSpec = ((obj instanceof ECParameterSpec) || obj == null) ? (ECParameterSpec) obj : EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
            if (convertSpec == null) {
                this.ecThreadSpec.remove();
                return;
            } else {
                this.ecThreadSpec.set(convertSpec);
                return;
            }
        }
        if (str.equals(StubApp.getString2(32621))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof ECParameterSpec) || obj == null) {
                this.ecImplicitCaParams = (ECParameterSpec) obj;
                return;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
                return;
            }
        }
        if (str.equals(StubApp.getString2(32622))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException(StubApp.getString2(32626));
            }
            ThreadLocal threadLocal = this.dhThreadSpec;
            if (obj == null) {
                threadLocal.remove();
                return;
            } else {
                threadLocal.set(obj);
                return;
            }
        }
        if (str.equals(StubApp.getString2(32623))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException(StubApp.getString2(32627));
            }
            this.dhDefaultParams = obj;
            return;
        }
        if (str.equals(StubApp.getString2(32624))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
            }
            this.acceptableNamedCurves = (Set) obj;
        } else if (str.equals(StubApp.getString2(32625))) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
            }
            this.additionalECParameters = (Map) obj;
        }
    }
}
