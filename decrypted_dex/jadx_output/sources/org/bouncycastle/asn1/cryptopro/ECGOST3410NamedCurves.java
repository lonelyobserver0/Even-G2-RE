package org.bouncycastle.asn1.cryptopro;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECGOST3410NamedCurves {
    static X9ECParametersHolder gostR3410_2001_CryptoPro_A = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26948)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26950)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26951)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26949)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.ONE, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26952))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder gostR3410_2001_CryptoPro_B = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26953)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26955)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26956)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26954)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.ONE, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26957))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder gostR3410_2001_CryptoPro_C = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.3
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26958)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26960)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26961)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26959)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.ZERO, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26962))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder gostR3410_2001_CryptoPro_XchB = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.4
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26958)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26960)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26961)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26959)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.ZERO, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26962))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder id_tc26_gost_3410_12_256_paramSetA = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.5
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26948)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26964)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26965)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26963)), ECConstants.FOUR, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26966)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26967))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetA = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.6
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26968)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26970)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26971)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26969)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.THREE, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26972))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetB = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.7
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26973)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26975)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26976)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26974)), ECConstants.ONE, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECConstants.TWO, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26977))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder id_tc26_gost_3410_12_512_paramSetC = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.8
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return ECGOST3410NamedCurves.configureCurve(new ECCurve.Fp(ECGOST3410NamedCurves.fromHex(StubApp.getString2(26968)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26979)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26980)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26978)), ECConstants.FOUR, true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, ECGOST3410NamedCurves.configureBasepoint(curve, ECGOST3410NamedCurves.fromHex(StubApp.getString2(26981)), ECGOST3410NamedCurves.fromHex(StubApp.getString2(26982))), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(26983), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_A, gostR3410_2001_CryptoPro_A);
        defineCurve(StubApp.getString2(26984), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_B, gostR3410_2001_CryptoPro_B);
        defineCurve(StubApp.getString2(26985), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_C, gostR3410_2001_CryptoPro_C);
        defineCurve(StubApp.getString2(26986), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchA, gostR3410_2001_CryptoPro_A);
        defineCurve(StubApp.getString2(26987), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_XchB, gostR3410_2001_CryptoPro_XchB);
        defineCurve(StubApp.getString2(26988), RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256_paramSetA, id_tc26_gost_3410_12_256_paramSetA);
        defineCurve(StubApp.getString2(26989), RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetA, id_tc26_gost_3410_12_512_paramSetA);
        defineCurve(StubApp.getString2(26990), RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetB, id_tc26_gost_3410_12_512_paramSetB);
        defineCurve(StubApp.getString2(26991), RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512_paramSetC, id_tc26_gost_3410_12_512_paramSetC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static X9ECPoint configureBasepoint(ECCurve eCCurve, BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint createPoint = eCCurve.createPoint(bigInteger, bigInteger2);
        WNafUtil.configureBasepoint(createPoint);
        return new X9ECPoint(createPoint, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECCurve configureCurve(ECCurve eCCurve) {
        return eCCurve;
    }

    public static void defineCurve(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        objIds.put(str, aSN1ObjectIdentifier);
        names.put(aSN1ObjectIdentifier, str);
        curves.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, Hex.decodeStrict(str));
    }

    public static X9ECParametersHolder getByNameLazy(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOIDLazy(oid);
    }

    public static X9ECParameters getByNameX9(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOIDX9(oid);
    }

    public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (X9ECParametersHolder) curves.get(aSN1ObjectIdentifier);
    }

    public static X9ECParameters getByOIDX9(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder byOIDLazy = getByOIDLazy(aSN1ObjectIdentifier);
        if (byOIDLazy == null) {
            return null;
        }
        return byOIDLazy.getParameters();
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) names.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(str);
    }
}
