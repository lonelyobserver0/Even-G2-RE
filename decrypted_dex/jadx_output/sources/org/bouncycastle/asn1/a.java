package org.bouncycastle.asn1;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract /* synthetic */ class a {
    public static void A(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str3, aSN1ObjectIdentifier, str + str2);
    }

    public static byte[] B(ASN1Sequence aSN1Sequence, int i3) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i3)).getOctets());
    }

    public static StringBuilder C(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        return sb3;
    }

    public static byte[] D(ASN1Sequence aSN1Sequence, int i3) {
        return ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i3)).getOctets();
    }

    public static int a(ASN1Sequence aSN1Sequence, int i3) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i3)).intValueExact();
    }

    public static String b(Exception exc, StringBuilder sb2) {
        sb2.append(exc.toString());
        return sb2.toString();
    }

    public static String c(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static String d(String str, KeySpec keySpec, String str2) {
        return str + keySpec + str2;
    }

    public static String e(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return str + aSN1ObjectIdentifier;
    }

    public static String f(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String g(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String h(GeneralSecurityException generalSecurityException, StringBuilder sb2) {
        sb2.append(generalSecurityException.getMessage());
        return sb2.toString();
    }

    public static String i(Key key, StringBuilder sb2, String str) {
        sb2.append(key.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    public static String j(KeySpec keySpec, StringBuilder sb2, String str) {
        sb2.append(keySpec.getClass());
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(ASN1Sequence aSN1Sequence, StringBuilder sb2) {
        sb2.append(aSN1Sequence.size());
        return sb2.toString();
    }

    public static String l(ASN1TaggedObject aSN1TaggedObject, StringBuilder sb2) {
        sb2.append(aSN1TaggedObject.getTagNo());
        return sb2.toString();
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str3, str + str2);
        return new StringBuilder(str4);
    }

    public static StringBuilder n(StringBuilder sb2, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
        return new StringBuilder();
    }

    public static StringBuilder o(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2, String str3) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        return sb3;
    }

    public static StringBuilder p(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb2.toString());
        return new StringBuilder();
    }

    public static StringBuilder q(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str, String str2) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
        return new StringBuilder(str2);
    }

    public static StringBuilder r(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        configurableProvider.addAlgorithm(str, str2);
        return new StringBuilder(str3);
    }

    public static StringBuilder s(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static Map t(String str, String str2, String str3, String str4, ConfigurableProvider configurableProvider) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static ASN1ObjectIdentifier u(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static ECFieldElement v(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }

    public static void w(int i3, int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap hashMap, Integer num) {
        hashMap.put(num, new XMSSMTParameters(i3, i10, aSN1ObjectIdentifier));
    }

    public static void x(StringBuilder sb2, String str, String str2, ConfigurableProvider configurableProvider, String str3) {
        sb2.append(str);
        sb2.append(str2);
        configurableProvider.addAlgorithm(str3, sb2.toString());
    }

    public static void y(StringBuilder sb2, String str, ConfigurableProvider configurableProvider, String str2) {
        sb2.append(str);
        configurableProvider.addAlgorithm(str2, sb2.toString());
    }

    public static void z(StringBuilder sb2, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider, String str) {
        sb2.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb2.toString(), str);
    }
}
