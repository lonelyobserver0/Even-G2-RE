package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSPlus {
    private static final String PREFIX = StubApp.getString2(30475);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30466), StubApp.getString2(30467));
            configurableProvider.addAlgorithm(StubApp.getString2(30468), StubApp.getString2(30469));
            String string2 = StubApp.getString2(30470);
            String string22 = StubApp.getString2(30471);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30472), string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.sphincsPlus;
            addSignatureAlgorithm(configurableProvider, string22, StubApp.getString2(30473), aSN1ObjectIdentifier);
            String string23 = StubApp.getString2(29795);
            StringBuilder sb2 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.sphincsPlus_shake_256;
            sb2.append(aSN1ObjectIdentifier2.getId());
            configurableProvider.addAlgorithm(sb2.toString(), string22);
            StringBuilder sb3 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.sphincsPlus_sha_256;
            sb3.append(aSN1ObjectIdentifier3.getId());
            configurableProvider.addAlgorithm(sb3.toString(), string22);
            StringBuilder sb4 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.sphincsPlus_sha_512;
            sb4.append(aSN1ObjectIdentifier4.getId());
            configurableProvider.addAlgorithm(sb4.toString(), string22);
            StringBuilder sb5 = new StringBuilder(string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.sphincsPlus_haraka;
            sb5.append(aSN1ObjectIdentifier5.getId());
            configurableProvider.addAlgorithm(sb5.toString(), string22);
            String string24 = StubApp.getString2(30294);
            configurableProvider.addAlgorithm(string24 + aSN1ObjectIdentifier2.getId(), string22);
            configurableProvider.addAlgorithm(string24 + aSN1ObjectIdentifier3.getId(), string22);
            configurableProvider.addAlgorithm(string24 + aSN1ObjectIdentifier4.getId(), string22);
            configurableProvider.addAlgorithm(string24 + aSN1ObjectIdentifier5.getId(), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30474), string22);
            SPHINCSPlusKeyFactorySpi sPHINCSPlusKeyFactorySpi = new SPHINCSPlusKeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier, string22, sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string22, sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string22, sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, string22, sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, string22, sPHINCSPlusKeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string22);
        }
    }
}
