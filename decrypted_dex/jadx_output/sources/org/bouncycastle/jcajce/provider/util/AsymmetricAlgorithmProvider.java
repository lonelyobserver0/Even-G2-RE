package org.bouncycastle.jcajce.provider.util;

import com.stub.StubApp;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AsymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }

    public void addSignatureAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(StubApp.getString2(29795) + aSN1ObjectIdentifier, str);
        a.z(new StringBuilder(StubApp.getString2(30294)), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm(StubApp.getString2(30280) + aSN1ObjectIdentifier, str);
        a.z(new StringBuilder(StubApp.getString2(30283)), aSN1ObjectIdentifier, configurableProvider, str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    public void registerOidAlgorithmParameterGenerator(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm(StubApp.getString2(31474) + aSN1ObjectIdentifier, str);
        a.z(new StringBuilder(StubApp.getString2(31464)), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void registerOidAlgorithmParameters(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm(StubApp.getString2(31464) + aSN1ObjectIdentifier, str);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String h2 = AbstractC1482f.h(str, StubApp.getString2(32434), str2);
        String h4 = AbstractC1482f.h(str, StubApp.getString2(28203), str2);
        String h5 = AbstractC1482f.h(str, StubApp.getString2(32435), str2);
        String h9 = AbstractC1482f.h(str, StubApp.getString2(601), str2);
        configurableProvider.addAlgorithm(StubApp.getString2(30293) + h2, str3);
        String string2 = StubApp.getString2(29795);
        configurableProvider.addAlgorithm(string2 + h4, h2);
        configurableProvider.addAlgorithm(string2 + h5, h2);
        configurableProvider.addAlgorithm(string2 + h9, h2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm(string2 + aSN1ObjectIdentifier, h2);
            a.z(new StringBuilder(StubApp.getString2(30294)), aSN1ObjectIdentifier, configurableProvider, h2);
        }
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map<String, String> map) {
        String h2 = AbstractC1482f.h(str, StubApp.getString2(32434), str2);
        String h4 = AbstractC1482f.h(str, StubApp.getString2(28203), str2);
        String h5 = AbstractC1482f.h(str, StubApp.getString2(32435), str2);
        String h9 = AbstractC1482f.h(str, StubApp.getString2(601), str2);
        String string2 = StubApp.getString2(30293);
        configurableProvider.addAlgorithm(string2 + h2, str3);
        String string22 = StubApp.getString2(29795);
        configurableProvider.addAlgorithm(string22 + h4, h2);
        configurableProvider.addAlgorithm(string22 + h5, h2);
        configurableProvider.addAlgorithm(string22 + h9, h2);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm(string22 + aSN1ObjectIdentifier, h2);
            a.z(new StringBuilder(StubApp.getString2(30294)), aSN1ObjectIdentifier, configurableProvider, h2);
        }
        configurableProvider.addAttributes(string2 + h2, map);
    }

    public void addSignatureAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(StubApp.getString2(30293) + str, str2);
        a.z(a.q(new StringBuilder(StubApp.getString2(29795)), aSN1ObjectIdentifier, configurableProvider, str, StubApp.getString2(30294)), aSN1ObjectIdentifier, configurableProvider, str);
    }
}
