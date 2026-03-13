package org.bouncycastle.asn1.gm;

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
public class GMNamedCurves {
    static X9ECParametersHolder sm2p256v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return GMNamedCurves.configureCurve(new ECCurve.Fp(GMNamedCurves.fromHex(StubApp.getString2(27104)), GMNamedCurves.fromHex(StubApp.getString2(27105)), GMNamedCurves.fromHex(StubApp.getString2(27106)), GMNamedCurves.fromHex(StubApp.getString2(27107)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, GMNamedCurves.configureBasepoint(curve, StubApp.getString2(27108)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder wapip192v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.gm.GMNamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return GMNamedCurves.configureCurve(new ECCurve.Fp(GMNamedCurves.fromHex(StubApp.getString2(27109)), GMNamedCurves.fromHex(StubApp.getString2(27110)), GMNamedCurves.fromHex(StubApp.getString2(27111)), GMNamedCurves.fromHex(StubApp.getString2(27112)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, GMNamedCurves.configureBasepoint(curve, StubApp.getString2(27113)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(27114), GMObjectIdentifiers.wapip192v1, wapip192v1);
        defineCurve(StubApp.getString2(27115), GMObjectIdentifiers.sm2p256v1, sm2p256v1);
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
