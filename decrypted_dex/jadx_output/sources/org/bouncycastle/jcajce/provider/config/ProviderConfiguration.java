package org.bouncycastle.jcajce.provider.config;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ProviderConfiguration {
    Set getAcceptableNamedCurves();

    Map getAdditionalECParameters();

    DHParameterSpec getDHDefaultParameters(int i3);

    DSAParameterSpec getDSADefaultParameters(int i3);

    ECParameterSpec getEcImplicitlyCa();
}
