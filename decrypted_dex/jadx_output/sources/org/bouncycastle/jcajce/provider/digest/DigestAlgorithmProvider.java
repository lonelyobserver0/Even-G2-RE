package org.bouncycastle.jcajce.provider.digest;

import E1.a;
import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String j = a.j(StubApp.getString2(30996), str);
        configurableProvider.addAlgorithm(StubApp.getString2(30997) + j, str2);
        configurableProvider.addAlgorithm(StubApp.getString2(30998) + str, j);
        configurableProvider.addAlgorithm(StubApp.getString2(30999) + str, j);
        configurableProvider.addAlgorithm(StubApp.getString2(31000) + j, str3);
        configurableProvider.addAlgorithm(StubApp.getString2(31001) + str, j);
        configurableProvider.addAlgorithm(StubApp.getString2(31002) + str, j);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String j = a.j(StubApp.getString2(30996), str);
        configurableProvider.addAlgorithm(StubApp.getString2(31003) + aSN1ObjectIdentifier, j);
        org.bouncycastle.asn1.a.z(new StringBuilder(StubApp.getString2(31004)), aSN1ObjectIdentifier, configurableProvider, j);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String j = a.j(StubApp.getString2(29040), str);
        configurableProvider.addAlgorithm(StubApp.getString2(30997) + j, str2);
        configurableProvider.addAlgorithm(StubApp.getString2(31000) + j, str3);
        configurableProvider.addAlgorithm(StubApp.getString2(31005) + str, j);
    }
}
