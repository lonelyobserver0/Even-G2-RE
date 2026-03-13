package org.bouncycastle.asn1.anssi;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ANSSINamedCurves {
    static X9ECParametersHolder FRP256v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.anssi.ANSSINamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ANSSINamedCurves.configureCurve(new ECCurve.Fp(ANSSINamedCurves.fromHex(StubApp.getString2(26855)), ANSSINamedCurves.fromHex(StubApp.getString2(26856)), ANSSINamedCurves.fromHex(StubApp.getString2(26857)), ANSSINamedCurves.fromHex(StubApp.getString2(26858)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve createCurve = createCurve();
            return new X9ECParameters(createCurve, ANSSINamedCurves.configureBasepoint(createCurve, StubApp.getString2(26859)), createCurve.getOrder(), createCurve.getCofactor(), null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(26860), ANSSIObjectIdentifiers.FRP256v1, FRP256v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static X9ECPoint configureBasepoint(ECCurve eCCurve, String str) {
        X9ECPoint x9ECPoint = new X9ECPoint(eCCurve, Hex.decodeStrict(str));
        WNafUtil.configureBasepoint(x9ECPoint.getPoint());
        return x9ECPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECCurve configureCurve(ECCurve eCCurve) {
        return eCCurve;
    }

    public static void defineCurve(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        objIds.put(Strings.toLowerCase(str), aSN1ObjectIdentifier);
        names.put(aSN1ObjectIdentifier, str);
        curves.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    public static X9ECParameters getByName(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static X9ECParametersHolder getByNameLazy(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOIDLazy(oid);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder byOIDLazy = getByOIDLazy(aSN1ObjectIdentifier);
        if (byOIDLazy == null) {
            return null;
        }
        return byOIDLazy.getParameters();
    }

    public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (X9ECParametersHolder) curves.get(aSN1ObjectIdentifier);
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) names.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toLowerCase(str));
    }
}
