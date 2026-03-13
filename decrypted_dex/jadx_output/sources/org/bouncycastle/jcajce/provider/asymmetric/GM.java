package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GM {
    private static final String PREFIX = StubApp.getString2(30049);
    private static final Map<String, String> generalSm2Attributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(30212);
            String string22 = StubApp.getString2(30213);
            String string23 = StubApp.getString2(29795);
            a.z(a.r(configurableProvider, string2, string22, string23), GMObjectIdentifiers.sm2sign_with_sha256, configurableProvider, StubApp.getString2(30214));
            a.z(a.r(configurableProvider, StubApp.getString2(30215), StubApp.getString2(30216), string23), GMObjectIdentifiers.sm2sign_with_sm3, configurableProvider, StubApp.getString2(30217));
            configurableProvider.addAlgorithm(StubApp.getString2(30218), StubApp.getString2(30219));
            String string24 = StubApp.getString2(30220);
            String string25 = StubApp.getString2(28188);
            configurableProvider.addAlgorithm(string24, string25);
            String string26 = StubApp.getString2(30221);
            a.z(new StringBuilder(string26), GMObjectIdentifiers.sm2encrypt_with_sm3, configurableProvider, string25);
            a.z(a.r(configurableProvider, StubApp.getString2(30222), StubApp.getString2(30223), string26), GMObjectIdentifiers.sm2encrypt_with_blake2b512, configurableProvider, StubApp.getString2(30224));
            a.z(a.r(configurableProvider, StubApp.getString2(30225), StubApp.getString2(30226), string26), GMObjectIdentifiers.sm2encrypt_with_blake2s256, configurableProvider, StubApp.getString2(30227));
            a.z(a.r(configurableProvider, StubApp.getString2(30228), StubApp.getString2(30229), string26), GMObjectIdentifiers.sm2encrypt_with_whirlpool, configurableProvider, StubApp.getString2(30230));
            a.z(a.r(configurableProvider, StubApp.getString2(30231), StubApp.getString2(30232), string26), GMObjectIdentifiers.sm2encrypt_with_md5, configurableProvider, StubApp.getString2(30233));
            a.z(a.r(configurableProvider, StubApp.getString2(30234), StubApp.getString2(30235), string26), GMObjectIdentifiers.sm2encrypt_with_rmd160, configurableProvider, StubApp.getString2(30236));
            a.z(a.r(configurableProvider, StubApp.getString2(30237), StubApp.getString2(30238), string26), GMObjectIdentifiers.sm2encrypt_with_sha1, configurableProvider, StubApp.getString2(30239));
            a.z(a.r(configurableProvider, StubApp.getString2(30240), StubApp.getString2(30241), string26), GMObjectIdentifiers.sm2encrypt_with_sha224, configurableProvider, StubApp.getString2(30242));
            a.z(a.r(configurableProvider, StubApp.getString2(30243), StubApp.getString2(30244), string26), GMObjectIdentifiers.sm2encrypt_with_sha256, configurableProvider, StubApp.getString2(30245));
            a.z(a.r(configurableProvider, StubApp.getString2(30246), StubApp.getString2(30247), string26), GMObjectIdentifiers.sm2encrypt_with_sha384, configurableProvider, StubApp.getString2(30248));
            a.z(a.r(configurableProvider, StubApp.getString2(30249), StubApp.getString2(30250), string26), GMObjectIdentifiers.sm2encrypt_with_sha512, configurableProvider, StubApp.getString2(30251));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalSm2Attributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(30048));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(29656));
    }
}
