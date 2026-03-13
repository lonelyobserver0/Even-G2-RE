package org.bouncycastle.crypto.ec;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptlib.CryptlibObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.math.ec.custom.djb.Curve25519;
import org.bouncycastle.math.ec.custom.gm.SM2P256V1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP128R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP160K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Curve;
import org.bouncycastle.math.ec.custom.sec.SecP192K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP192R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP224K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP224R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP256R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP384R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT113R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT113R2Curve;
import org.bouncycastle.math.ec.custom.sec.SecT131R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT131R2Curve;
import org.bouncycastle.math.ec.custom.sec.SecT163K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT163R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT163R2Curve;
import org.bouncycastle.math.ec.custom.sec.SecT193R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT193R2Curve;
import org.bouncycastle.math.ec.custom.sec.SecT233K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT233R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT239K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT283K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT283R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT409K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT409R1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT571K1Curve;
import org.bouncycastle.math.ec.custom.sec.SecT571R1Curve;
import org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.math.ec.endo.ScalarSplitParameters;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CustomNamedCurves {
    static X9ECParametersHolder curve25519 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new Curve25519());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(28526)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp128r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP128R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27300));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27301)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp160k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.3
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger bigInteger = new BigInteger(StubApp.getString2(27309), 16);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27310), 16);
            String string2 = StubApp.getString2(27311);
            return CustomNamedCurves.configureCurveGLV(new SecP160K1Curve(), new GLVTypeBParameters(bigInteger, bigInteger2, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27312), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27313), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27314), 16), new BigInteger(StubApp.getString2(27315), 16), 176)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27316)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp160r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.4
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP160R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27321));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27322)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp160r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.5
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP160R2Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27326));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27327)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp192k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.6
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger bigInteger = new BigInteger(StubApp.getString2(27330), 16);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27331), 16);
            String string2 = StubApp.getString2(27332);
            return CustomNamedCurves.configureCurveGLV(new SecP192K1Curve(), new GLVTypeBParameters(bigInteger, bigInteger2, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27333), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27334), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27335), 16), new BigInteger(StubApp.getString2(27336), 16), 208)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27337)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp192r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.7
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP192R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27342));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27343)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp224k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.8
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger bigInteger = new BigInteger(StubApp.getString2(27176), 16);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27177), 16);
            String string2 = StubApp.getString2(27178);
            return CustomNamedCurves.configureCurveGLV(new SecP224K1Curve(), new GLVTypeBParameters(bigInteger, bigInteger2, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27179), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27180), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27181), 16), new BigInteger(StubApp.getString2(27182), 16), 240)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27183)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp224r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.9
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP224R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27188));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27189)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp256k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.10
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger bigInteger = new BigInteger(StubApp.getString2(27192), 16);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27193), 16);
            String string2 = StubApp.getString2(27194);
            return CustomNamedCurves.configureCurveGLV(new SecP256K1Curve(), new GLVTypeBParameters(bigInteger, bigInteger2, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27195), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27196), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27197), 16), new BigInteger(StubApp.getString2(27198), 16), 272)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27199)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp256r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.11
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP256R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27204));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27205)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp384r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.12
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP384R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27210));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27211)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp521r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.13
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecP521R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27216));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27217)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect113r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.14
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT113R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27221));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27222)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect113r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.15
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT113R2Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27226));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27227)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect131r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.16
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT131R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27231));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27232)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect131r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.17
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT131R2Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27236));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27237)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect163k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.18
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT163K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27245)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect163r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.19
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT163R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27249));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27250)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect163r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.20
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT163R2Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27253));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27254)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect193r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.21
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT193R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27258));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27259)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect193r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.22
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT193R2Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27263));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27264)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect233k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.23
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT233K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27266)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect233r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.24
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT233R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27269));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27270)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect239k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.25
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT239K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27272)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect283k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.26
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT283K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27274)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect283r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.27
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT283R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27277));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27278)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect409k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.28
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT409K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27285)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect409r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.29
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT409R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27288));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27289)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect571k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.30
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT571K1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27291)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect571r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.31
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SecT571R1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27294));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27295)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sm2p256v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.crypto.ec.CustomNamedCurves.32
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return CustomNamedCurves.configureCurve(new SM2P256V1Curve());
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, CustomNamedCurves.configureBasepoint(curve, StubApp.getString2(27108)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static final Hashtable nameToCurve = new Hashtable();
    static final Hashtable nameToOID = new Hashtable();
    static final Hashtable oidToCurve = new Hashtable();
    static final Hashtable oidToName = new Hashtable();
    static final Vector names = new Vector();

    static {
        defineCurveWithOID(StubApp.getString2(27874), CryptlibObjectIdentifiers.curvey25519, curve25519);
        defineCurveWithOID(StubApp.getString2(27346), SECObjectIdentifiers.secp128r1, secp128r1);
        defineCurveWithOID(StubApp.getString2(27348), SECObjectIdentifiers.secp160k1, secp160k1);
        defineCurveWithOID(StubApp.getString2(27349), SECObjectIdentifiers.secp160r1, secp160r1);
        defineCurveWithOID(StubApp.getString2(27350), SECObjectIdentifiers.secp160r2, secp160r2);
        defineCurveWithOID(StubApp.getString2(27351), SECObjectIdentifiers.secp192k1, secp192k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = SECObjectIdentifiers.secp192r1;
        defineCurveWithOID(StubApp.getString2(27352), aSN1ObjectIdentifier, secp192r1);
        defineCurveWithOID(StubApp.getString2(27353), SECObjectIdentifiers.secp224k1, secp224k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = SECObjectIdentifiers.secp224r1;
        defineCurveWithOID(StubApp.getString2(27354), aSN1ObjectIdentifier2, secp224r1);
        defineCurveWithOID(StubApp.getString2(27355), SECObjectIdentifiers.secp256k1, secp256k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = SECObjectIdentifiers.secp256r1;
        defineCurveWithOID(StubApp.getString2(27356), aSN1ObjectIdentifier3, secp256r1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = SECObjectIdentifiers.secp384r1;
        defineCurveWithOID(StubApp.getString2(27357), aSN1ObjectIdentifier4, secp384r1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = SECObjectIdentifiers.secp521r1;
        defineCurveWithOID(StubApp.getString2(27358), aSN1ObjectIdentifier5, secp521r1);
        defineCurveWithOID(StubApp.getString2(27359), SECObjectIdentifiers.sect113r1, sect113r1);
        defineCurveWithOID(StubApp.getString2(27360), SECObjectIdentifiers.sect113r2, sect113r2);
        defineCurveWithOID(StubApp.getString2(27361), SECObjectIdentifiers.sect131r1, sect131r1);
        defineCurveWithOID(StubApp.getString2(27362), SECObjectIdentifiers.sect131r2, sect131r2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = SECObjectIdentifiers.sect163k1;
        defineCurveWithOID(StubApp.getString2(27363), aSN1ObjectIdentifier6, sect163k1);
        defineCurveWithOID(StubApp.getString2(27364), SECObjectIdentifiers.sect163r1, sect163r1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = SECObjectIdentifiers.sect163r2;
        defineCurveWithOID(StubApp.getString2(27365), aSN1ObjectIdentifier7, sect163r2);
        defineCurveWithOID(StubApp.getString2(27366), SECObjectIdentifiers.sect193r1, sect193r1);
        defineCurveWithOID(StubApp.getString2(27367), SECObjectIdentifiers.sect193r2, sect193r2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = SECObjectIdentifiers.sect233k1;
        defineCurveWithOID(StubApp.getString2(27368), aSN1ObjectIdentifier8, sect233k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = SECObjectIdentifiers.sect233r1;
        defineCurveWithOID(StubApp.getString2(27369), aSN1ObjectIdentifier9, sect233r1);
        defineCurveWithOID(StubApp.getString2(27370), SECObjectIdentifiers.sect239k1, sect239k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = SECObjectIdentifiers.sect283k1;
        defineCurveWithOID(StubApp.getString2(27371), aSN1ObjectIdentifier10, sect283k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = SECObjectIdentifiers.sect283r1;
        defineCurveWithOID(StubApp.getString2(27372), aSN1ObjectIdentifier11, sect283r1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = SECObjectIdentifiers.sect409k1;
        defineCurveWithOID(StubApp.getString2(27373), aSN1ObjectIdentifier12, sect409k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = SECObjectIdentifiers.sect409r1;
        defineCurveWithOID(StubApp.getString2(27374), aSN1ObjectIdentifier13, sect409r1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = SECObjectIdentifiers.sect571k1;
        defineCurveWithOID(StubApp.getString2(27375), aSN1ObjectIdentifier14, sect571k1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = SECObjectIdentifiers.sect571r1;
        defineCurveWithOID(StubApp.getString2(27376), aSN1ObjectIdentifier15, sect571r1);
        defineCurveWithOID(StubApp.getString2(27115), GMObjectIdentifiers.sm2p256v1, sm2p256v1);
        defineCurveAlias(StubApp.getString2(27153), aSN1ObjectIdentifier7);
        defineCurveAlias(StubApp.getString2(27152), aSN1ObjectIdentifier9);
        defineCurveAlias(StubApp.getString2(27151), aSN1ObjectIdentifier11);
        defineCurveAlias(StubApp.getString2(27150), aSN1ObjectIdentifier13);
        defineCurveAlias(StubApp.getString2(27149), aSN1ObjectIdentifier15);
        defineCurveAlias(StubApp.getString2(27158), aSN1ObjectIdentifier6);
        defineCurveAlias(StubApp.getString2(27157), aSN1ObjectIdentifier8);
        defineCurveAlias(StubApp.getString2(27156), aSN1ObjectIdentifier10);
        defineCurveAlias(StubApp.getString2(27155), aSN1ObjectIdentifier12);
        defineCurveAlias(StubApp.getString2(27154), aSN1ObjectIdentifier14);
        defineCurveAlias(StubApp.getString2(27163), aSN1ObjectIdentifier);
        defineCurveAlias(StubApp.getString2(27162), aSN1ObjectIdentifier2);
        defineCurveAlias(StubApp.getString2(27161), aSN1ObjectIdentifier3);
        defineCurveAlias(StubApp.getString2(27160), aSN1ObjectIdentifier4);
        defineCurveAlias(StubApp.getString2(27159), aSN1ObjectIdentifier5);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static ECCurve configureCurveGLV(ECCurve eCCurve, GLVTypeBParameters gLVTypeBParameters) {
        return eCCurve.configure().setEndomorphism(new GLVTypeBEndomorphism(eCCurve, gLVTypeBParameters)).create();
    }

    public static void defineCurve(String str, X9ECParametersHolder x9ECParametersHolder) {
        names.addElement(str);
        nameToCurve.put(Strings.toLowerCase(str), x9ECParametersHolder);
    }

    public static void defineCurveAlias(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Object obj = oidToCurve.get(aSN1ObjectIdentifier);
        if (obj == null) {
            throw new IllegalStateException();
        }
        String lowerCase = Strings.toLowerCase(str);
        nameToOID.put(lowerCase, aSN1ObjectIdentifier);
        nameToCurve.put(lowerCase, obj);
    }

    public static void defineCurveWithOID(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        names.addElement(str);
        oidToName.put(aSN1ObjectIdentifier, str);
        oidToCurve.put(aSN1ObjectIdentifier, x9ECParametersHolder);
        String lowerCase = Strings.toLowerCase(str);
        nameToOID.put(lowerCase, aSN1ObjectIdentifier);
        nameToCurve.put(lowerCase, x9ECParametersHolder);
    }

    public static X9ECParameters getByName(String str) {
        X9ECParametersHolder byNameLazy = getByNameLazy(str);
        if (byNameLazy == null) {
            return null;
        }
        return byNameLazy.getParameters();
    }

    public static X9ECParametersHolder getByNameLazy(String str) {
        return (X9ECParametersHolder) nameToCurve.get(Strings.toLowerCase(str));
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder byOIDLazy = getByOIDLazy(aSN1ObjectIdentifier);
        if (byOIDLazy == null) {
            return null;
        }
        return byOIDLazy.getParameters();
    }

    public static X9ECParametersHolder getByOIDLazy(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (X9ECParametersHolder) oidToCurve.get(aSN1ObjectIdentifier);
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) oidToName.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) nameToOID.get(Strings.toLowerCase(str));
    }
}
