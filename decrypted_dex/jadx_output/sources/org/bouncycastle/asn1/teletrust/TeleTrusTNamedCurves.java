package org.bouncycastle.asn1.teletrust;

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
public class TeleTrusTNamedCurves {
    static X9ECParametersHolder brainpoolP160r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27403)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27404)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27405)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27402)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27406)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP160t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27403)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27407)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27408)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27402)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27409)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP192r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.3
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27411)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27412)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27413)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27410)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27414)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP192t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.4
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27411)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27415)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27416)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27410)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27417)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP224r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.5
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27419)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27420)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27421)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27418)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27422)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP224t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.6
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27419)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27423)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27424)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27418)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27425)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP256r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.7
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27427)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27428)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27429)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27426)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27430)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP256t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.8
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27427)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27431)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27432)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27426)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27433)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP320r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.9
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27382)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27434)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27435)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27381)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27436)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP320t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.10
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27382)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27383)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27384)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27381)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27385)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP384r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.11
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27387)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27388)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27389)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27386)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27390)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP384t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.12
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27387)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27391)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27392)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27386)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27393)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP512r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.13
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27395)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27396)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27397)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27394)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27398)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder brainpoolP512t1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves.14
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return TeleTrusTNamedCurves.configureCurve(new ECCurve.Fp(TeleTrusTNamedCurves.fromHex(StubApp.getString2(27395)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27399)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27400)), TeleTrusTNamedCurves.fromHex(StubApp.getString2(27394)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, TeleTrusTNamedCurves.configureBasepoint(curve, StubApp.getString2(27401)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(27437), TeleTrusTObjectIdentifiers.brainpoolP160r1, brainpoolP160r1);
        defineCurve(StubApp.getString2(27438), TeleTrusTObjectIdentifiers.brainpoolP160t1, brainpoolP160t1);
        defineCurve(StubApp.getString2(27439), TeleTrusTObjectIdentifiers.brainpoolP192r1, brainpoolP192r1);
        defineCurve(StubApp.getString2(27440), TeleTrusTObjectIdentifiers.brainpoolP192t1, brainpoolP192t1);
        defineCurve(StubApp.getString2(27441), TeleTrusTObjectIdentifiers.brainpoolP224r1, brainpoolP224r1);
        defineCurve(StubApp.getString2(27442), TeleTrusTObjectIdentifiers.brainpoolP224t1, brainpoolP224t1);
        defineCurve(StubApp.getString2(27443), TeleTrusTObjectIdentifiers.brainpoolP256r1, brainpoolP256r1);
        defineCurve(StubApp.getString2(27444), TeleTrusTObjectIdentifiers.brainpoolP256t1, brainpoolP256t1);
        defineCurve(StubApp.getString2(27445), TeleTrusTObjectIdentifiers.brainpoolP320r1, brainpoolP320r1);
        defineCurve(StubApp.getString2(27446), TeleTrusTObjectIdentifiers.brainpoolP320t1, brainpoolP320t1);
        defineCurve(StubApp.getString2(27447), TeleTrusTObjectIdentifiers.brainpoolP384r1, brainpoolP384r1);
        defineCurve(StubApp.getString2(27448), TeleTrusTObjectIdentifiers.brainpoolP384t1, brainpoolP384t1);
        defineCurve(StubApp.getString2(27449), TeleTrusTObjectIdentifiers.brainpoolP512r1, brainpoolP512r1);
        defineCurve(StubApp.getString2(27450), TeleTrusTObjectIdentifiers.brainpoolP512t1, brainpoolP512t1);
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

    public static ASN1ObjectIdentifier getOID(short s10, boolean z2) {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(27451));
        sb2.append((int) s10);
        sb2.append(z2 ? StubApp.getString2(1310) : StubApp.getString2(1269));
        sb2.append(StubApp.getString2(878));
        return getOID(sb2.toString());
    }
}
