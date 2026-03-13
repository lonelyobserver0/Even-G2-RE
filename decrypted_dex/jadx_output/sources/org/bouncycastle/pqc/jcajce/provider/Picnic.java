package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.picnic.PicnicKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Picnic {
    private static final String PREFIX = StubApp.getString2(34535);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34525), StubApp.getString2(34526));
            configurableProvider.addAlgorithm(StubApp.getString2(34527), StubApp.getString2(34528));
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33831), StubApp.getString2(34529), BCObjectIdentifiers.picnic_signature);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28184), StubApp.getString2(33831), StubApp.getString2(34530), BCObjectIdentifiers.picnic_with_shake256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(33831), StubApp.getString2(34531), BCObjectIdentifiers.picnic_with_sha512);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28177), StubApp.getString2(33831), StubApp.getString2(34532), BCObjectIdentifiers.picnic_with_sha3_512);
            configurableProvider.addAlgorithm(StubApp.getString2(34533), StubApp.getString2(34534));
            PicnicKeyFactorySpi picnicKeyFactorySpi = new PicnicKeyFactorySpi();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.picnic_key;
            String string2 = StubApp.getString2(28191);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl1fs, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl1ur, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl3fs, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl3ur, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl5fs, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl5ur, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnic3l1, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnic3l3, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnic3l5, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl1full, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl3full, string2, picnicKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.picnicl5full, string2, picnicKeyFactorySpi);
        }
    }
}
