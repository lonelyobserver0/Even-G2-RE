package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRUPrime {
    private static final String PREFIX = StubApp.getString2(34524);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34506), StubApp.getString2(34507));
            configurableProvider.addAlgorithm(StubApp.getString2(34508), StubApp.getString2(34509));
            configurableProvider.addAlgorithm(StubApp.getString2(34510), StubApp.getString2(34511));
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            String string2 = StubApp.getString2(34512);
            String string22 = StubApp.getString2(34513);
            String string23 = StubApp.getString2(30221);
            StringBuilder r8 = a.r(configurableProvider, string2, string22, string23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_ntrulprime;
            String string24 = StubApp.getString2(34404);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string24);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.ntrulpr653;
            String string25 = StubApp.getString2(34514);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string25, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr761, string25, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr857, string25, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr953, string25, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr1013, string25, nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr1277, string25, nTRUKeyFactorySpi);
            configurableProvider.addAlgorithm(StubApp.getString2(34515), StubApp.getString2(34516));
            configurableProvider.addAlgorithm(StubApp.getString2(34517), StubApp.getString2(34518));
            configurableProvider.addAlgorithm(StubApp.getString2(34519), StubApp.getString2(34520));
            NTRUKeyFactorySpi nTRUKeyFactorySpi2 = new NTRUKeyFactorySpi();
            a.z(a.r(configurableProvider, StubApp.getString2(34521), StubApp.getString2(34522), string23), BCObjectIdentifiers.pqc_kem_sntruprime, configurableProvider, string24);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.sntrup653;
            String string26 = StubApp.getString2(34523);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string26, nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup761, string26, nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup857, string26, nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup953, string26, nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup1013, string26, nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup1277, string26, nTRUKeyFactorySpi2);
        }
    }
}
