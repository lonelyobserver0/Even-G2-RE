package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRU {
    private static final String PREFIX = StubApp.getString2(34505);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34497), StubApp.getString2(34498));
            configurableProvider.addAlgorithm(StubApp.getString2(34499), StubApp.getString2(34500));
            configurableProvider.addAlgorithm(StubApp.getString2(34501), StubApp.getString2(34502));
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34503), StubApp.getString2(34504), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_ntru;
            String string2 = StubApp.getString2(34404);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntruhps2048509, string2, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntruhps2048677, string2, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntruhps4096821, string2, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntruhrss701, string2, nTRUKeyFactorySpi);
        }
    }
}
