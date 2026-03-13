package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SSHNamedCurves {
    private static final Map<String, ASN1ObjectIdentifier> oidMap = Collections.unmodifiableMap(new HashMap<String, ASN1ObjectIdentifier>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.1
        {
            put(StubApp.getString2(29394), SECObjectIdentifiers.secp256r1);
            put(StubApp.getString2(29395), SECObjectIdentifiers.secp384r1);
            put(StubApp.getString2(29396), SECObjectIdentifiers.secp521r1);
            put(StubApp.getString2(29397), SECObjectIdentifiers.sect163k1);
            put(StubApp.getString2(29398), SECObjectIdentifiers.secp192r1);
            put(StubApp.getString2(29399), SECObjectIdentifiers.secp224r1);
            put(StubApp.getString2(29400), SECObjectIdentifiers.sect233k1);
            put(StubApp.getString2(29401), SECObjectIdentifiers.sect233r1);
            put(StubApp.getString2(29402), SECObjectIdentifiers.sect283k1);
            put(StubApp.getString2(29403), SECObjectIdentifiers.sect409k1);
            put(StubApp.getString2(29404), SECObjectIdentifiers.sect409r1);
            put(StubApp.getString2(29405), SECObjectIdentifiers.sect571k1);
        }
    });
    private static final Map<String, String> curveNameToSSHName = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.2
        {
            String[][] strArr = {new String[]{StubApp.getString2(27356), StubApp.getString2(29394)}, new String[]{StubApp.getString2(27357), StubApp.getString2(29395)}, new String[]{StubApp.getString2(27358), StubApp.getString2(29396)}, new String[]{StubApp.getString2(27363), StubApp.getString2(29397)}, new String[]{StubApp.getString2(27352), StubApp.getString2(29398)}, new String[]{StubApp.getString2(27354), StubApp.getString2(29399)}, new String[]{StubApp.getString2(27368), StubApp.getString2(29400)}, new String[]{StubApp.getString2(27369), StubApp.getString2(29401)}, new String[]{StubApp.getString2(27371), StubApp.getString2(29402)}, new String[]{StubApp.getString2(27373), StubApp.getString2(29403)}, new String[]{StubApp.getString2(27374), StubApp.getString2(29404)}, new String[]{StubApp.getString2(27375), StubApp.getString2(29405)}};
            for (int i3 = 0; i3 != 12; i3++) {
                String[] strArr2 = strArr[i3];
                put(strArr2[0], strArr2[1]);
            }
        }
    });
    private static HashMap<ECCurve, String> curveMap = new HashMap<ECCurve, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.3
        {
            Enumeration names = CustomNamedCurves.getNames();
            while (names.hasMoreElements()) {
                String str = (String) names.nextElement();
                put(CustomNamedCurves.getByNameLazy(str).getCurve(), str);
            }
        }
    };
    private static final Map<ASN1ObjectIdentifier, String> oidToName = Collections.unmodifiableMap(new HashMap<ASN1ObjectIdentifier, String>() { // from class: org.bouncycastle.crypto.util.SSHNamedCurves.4
        {
            for (String str : SSHNamedCurves.oidMap.keySet()) {
                put(SSHNamedCurves.oidMap.get(str), str);
            }
        }
    });

    public static ASN1ObjectIdentifier getByName(String str) {
        return oidMap.get(str);
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return oidToName.get(aSN1ObjectIdentifier);
    }

    public static String getNameForParameters(ECDomainParameters eCDomainParameters) {
        return eCDomainParameters instanceof ECNamedDomainParameters ? getName(((ECNamedDomainParameters) eCDomainParameters).getName()) : getNameForParameters(eCDomainParameters.getCurve());
    }

    public static X9ECParameters getParameters(String str) {
        return NISTNamedCurves.getByOID(oidMap.get(Strings.toLowerCase(str)));
    }

    public static String getNameForParameters(ECCurve eCCurve) {
        return curveNameToSSHName.get(curveMap.get(eCCurve));
    }

    public static X9ECParameters getParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
    }
}
