package org.bouncycastle.jcajce.provider.symmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class SymmetricAlgorithmProvider extends AlgorithmProvider {
    public void addCMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(30997));
        sb2.append(str);
        String string2 = StubApp.getString2(32252);
        sb2.append(string2);
        configurableProvider.addAlgorithm(sb2.toString(), str2);
        String string22 = StubApp.getString2(31003);
        String string23 = StubApp.getString2(32253);
        StringBuilder m4 = a.m(str, string2, E1.a.k(string22, str, string23), StubApp.getString2(31000), configurableProvider);
        m4.append(str);
        m4.append(string2);
        configurableProvider.addAlgorithm(m4.toString(), str3);
        configurableProvider.addAlgorithm(E1.a.k(StubApp.getString2(31004), str, string23), str + string2);
    }

    public void addGMacAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(30997));
        sb2.append(str);
        String string2 = StubApp.getString2(29029);
        sb2.append(string2);
        configurableProvider.addAlgorithm(sb2.toString(), str2);
        String string22 = StubApp.getString2(31003);
        String string23 = StubApp.getString2(32254);
        StringBuilder m4 = a.m(str, string2, E1.a.k(string22, str, string23), StubApp.getString2(31000), configurableProvider);
        m4.append(str);
        m4.append(string2);
        configurableProvider.addAlgorithm(m4.toString(), str3);
        configurableProvider.addAlgorithm(E1.a.k(StubApp.getString2(31004), str, string23), str + string2);
    }

    public void addPoly1305Algorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(StubApp.getString2(32255) + str, str2);
        String str4 = StubApp.getString2(32256) + str;
        String string2 = StubApp.getString2(32257);
        configurableProvider.addAlgorithm(str4, string2 + str);
        configurableProvider.addAlgorithm(StubApp.getString2(32258) + str, str3);
        configurableProvider.addAlgorithm(StubApp.getString2(32259) + str, string2 + str);
    }
}
