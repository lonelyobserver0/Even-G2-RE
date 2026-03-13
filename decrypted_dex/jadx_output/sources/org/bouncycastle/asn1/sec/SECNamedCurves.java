package org.bouncycastle.asn1.sec;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.math.ec.endo.GLVTypeBEndomorphism;
import org.bouncycastle.math.ec.endo.GLVTypeBParameters;
import org.bouncycastle.math.ec.endo.ScalarSplitParameters;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SECNamedCurves {
    static X9ECParametersHolder secp112r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27238)), SECNamedCurves.fromHex(StubApp.getString2(27239)), SECNamedCurves.fromHex(StubApp.getString2(27240)), SECNamedCurves.fromHex(StubApp.getString2(27241)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27242));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27243)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp112r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27238)), SECNamedCurves.fromHex(StubApp.getString2(27279)), SECNamedCurves.fromHex(StubApp.getString2(27280)), SECNamedCurves.fromHex(StubApp.getString2(27281)), BigInteger.valueOf(4L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27282));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27283)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp128r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.3
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27296)), SECNamedCurves.fromHex(StubApp.getString2(27297)), SECNamedCurves.fromHex(StubApp.getString2(27298)), SECNamedCurves.fromHex(StubApp.getString2(27299)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27300));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27301)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp128r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.4
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27296)), SECNamedCurves.fromHex(StubApp.getString2(27302)), SECNamedCurves.fromHex(StubApp.getString2(27303)), SECNamedCurves.fromHex(StubApp.getString2(27304)), BigInteger.valueOf(4L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27305));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27306)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp160k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.5
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger fromHex = SECNamedCurves.fromHex(StubApp.getString2(27307));
            BigInteger bigInteger = ECConstants.ZERO;
            BigInteger valueOf = BigInteger.valueOf(7L);
            BigInteger fromHex2 = SECNamedCurves.fromHex(StubApp.getString2(27308));
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27309), 16);
            BigInteger bigInteger3 = new BigInteger(StubApp.getString2(27310), 16);
            String string2 = StubApp.getString2(27311);
            return SECNamedCurves.configureCurveGLV(new ECCurve.Fp(fromHex, bigInteger, valueOf, fromHex2, valueOf2, true), new GLVTypeBParameters(bigInteger2, bigInteger3, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27312), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27313), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27314), 16), new BigInteger(StubApp.getString2(27315), 16), 176)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27316)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp160r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.6
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27317)), SECNamedCurves.fromHex(StubApp.getString2(27318)), SECNamedCurves.fromHex(StubApp.getString2(27319)), SECNamedCurves.fromHex(StubApp.getString2(27320)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27321));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27322)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp160r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.7
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27307)), SECNamedCurves.fromHex(StubApp.getString2(27323)), SECNamedCurves.fromHex(StubApp.getString2(27324)), SECNamedCurves.fromHex(StubApp.getString2(27325)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27326));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27327)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp192k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.8
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger fromHex = SECNamedCurves.fromHex(StubApp.getString2(27328));
            BigInteger bigInteger = ECConstants.ZERO;
            BigInteger valueOf = BigInteger.valueOf(3L);
            BigInteger fromHex2 = SECNamedCurves.fromHex(StubApp.getString2(27329));
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27330), 16);
            BigInteger bigInteger3 = new BigInteger(StubApp.getString2(27331), 16);
            String string2 = StubApp.getString2(27332);
            return SECNamedCurves.configureCurveGLV(new ECCurve.Fp(fromHex, bigInteger, valueOf, fromHex2, valueOf2, true), new GLVTypeBParameters(bigInteger2, bigInteger3, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27333), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27334), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27335), 16), new BigInteger(StubApp.getString2(27336), 16), 208)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27337)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp192r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.9
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27338)), SECNamedCurves.fromHex(StubApp.getString2(27339)), SECNamedCurves.fromHex(StubApp.getString2(27340)), SECNamedCurves.fromHex(StubApp.getString2(27341)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27342));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27343)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp224k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.10
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger fromHex = SECNamedCurves.fromHex(StubApp.getString2(27174));
            BigInteger bigInteger = ECConstants.ZERO;
            BigInteger valueOf = BigInteger.valueOf(5L);
            BigInteger fromHex2 = SECNamedCurves.fromHex(StubApp.getString2(27175));
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27176), 16);
            BigInteger bigInteger3 = new BigInteger(StubApp.getString2(27177), 16);
            String string2 = StubApp.getString2(27178);
            return SECNamedCurves.configureCurveGLV(new ECCurve.Fp(fromHex, bigInteger, valueOf, fromHex2, valueOf2, true), new GLVTypeBParameters(bigInteger2, bigInteger3, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27179), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27180), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27181), 16), new BigInteger(StubApp.getString2(27182), 16), 240)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27183)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp224r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.11
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27184)), SECNamedCurves.fromHex(StubApp.getString2(27185)), SECNamedCurves.fromHex(StubApp.getString2(27186)), SECNamedCurves.fromHex(StubApp.getString2(27187)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27188));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27189)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp256k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.12
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            BigInteger fromHex = SECNamedCurves.fromHex(StubApp.getString2(27190));
            BigInteger bigInteger = ECConstants.ZERO;
            BigInteger valueOf = BigInteger.valueOf(7L);
            BigInteger fromHex2 = SECNamedCurves.fromHex(StubApp.getString2(27191));
            BigInteger valueOf2 = BigInteger.valueOf(1L);
            BigInteger bigInteger2 = new BigInteger(StubApp.getString2(27192), 16);
            BigInteger bigInteger3 = new BigInteger(StubApp.getString2(27193), 16);
            String string2 = StubApp.getString2(27194);
            return SECNamedCurves.configureCurveGLV(new ECCurve.Fp(fromHex, bigInteger, valueOf, fromHex2, valueOf2, true), new GLVTypeBParameters(bigInteger2, bigInteger3, new ScalarSplitParameters(new BigInteger[]{new BigInteger(string2, 16), new BigInteger(StubApp.getString2(27195), 16)}, new BigInteger[]{new BigInteger(StubApp.getString2(27196), 16), new BigInteger(string2, 16)}, new BigInteger(StubApp.getString2(27197), 16), new BigInteger(StubApp.getString2(27198), 16), 272)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27199)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder secp256r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.13
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27200)), SECNamedCurves.fromHex(StubApp.getString2(27201)), SECNamedCurves.fromHex(StubApp.getString2(27202)), SECNamedCurves.fromHex(StubApp.getString2(27203)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27204));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27205)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp384r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.14
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27206)), SECNamedCurves.fromHex(StubApp.getString2(27207)), SECNamedCurves.fromHex(StubApp.getString2(27208)), SECNamedCurves.fromHex(StubApp.getString2(27209)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27210));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27211)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder secp521r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.15
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.Fp(SECNamedCurves.fromHex(StubApp.getString2(27212)), SECNamedCurves.fromHex(StubApp.getString2(27213)), SECNamedCurves.fromHex(StubApp.getString2(27214)), SECNamedCurves.fromHex(StubApp.getString2(27215)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27216));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27217)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect113r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.16
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(113, 9, SECNamedCurves.fromHex(StubApp.getString2(27218)), SECNamedCurves.fromHex(StubApp.getString2(27219)), SECNamedCurves.fromHex(StubApp.getString2(27220)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27221));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27222)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect113r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.17
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(113, 9, SECNamedCurves.fromHex(StubApp.getString2(27223)), SECNamedCurves.fromHex(StubApp.getString2(27224)), SECNamedCurves.fromHex(StubApp.getString2(27225)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27226));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27227)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect131r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.18
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(131, 2, 3, 8, SECNamedCurves.fromHex(StubApp.getString2(27228)), SECNamedCurves.fromHex(StubApp.getString2(27229)), SECNamedCurves.fromHex(StubApp.getString2(27230)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27231));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27232)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect131r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.19
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(131, 2, 3, 8, SECNamedCurves.fromHex(StubApp.getString2(27233)), SECNamedCurves.fromHex(StubApp.getString2(27234)), SECNamedCurves.fromHex(StubApp.getString2(27235)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27236));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27237)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect163k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.20
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(163, 3, 6, 7, BigInteger.valueOf(1L), BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27244)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27245)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect163r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.21
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(163, 3, 6, 7, SECNamedCurves.fromHex(StubApp.getString2(27246)), SECNamedCurves.fromHex(StubApp.getString2(27247)), SECNamedCurves.fromHex(StubApp.getString2(27248)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27249));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27250)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect163r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.22
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(163, 3, 6, 7, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27251)), SECNamedCurves.fromHex(StubApp.getString2(27252)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27253));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27254)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect193r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.23
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(193, 15, SECNamedCurves.fromHex(StubApp.getString2(27255)), SECNamedCurves.fromHex(StubApp.getString2(27256)), SECNamedCurves.fromHex(StubApp.getString2(27257)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27258));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27259)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect193r2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.24
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(193, 15, SECNamedCurves.fromHex(StubApp.getString2(27260)), SECNamedCurves.fromHex(StubApp.getString2(27261)), SECNamedCurves.fromHex(StubApp.getString2(27262)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27263));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27264)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect233k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.25
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(233, 74, ECConstants.ZERO, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27265)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27266)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect233r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.26
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(233, 74, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27267)), SECNamedCurves.fromHex(StubApp.getString2(27268)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27269));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27270)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect239k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.27
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(239, 158, ECConstants.ZERO, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27271)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27272)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect283k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.28
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(DfuBaseService.NOTIFICATION_ID, 5, 7, 12, ECConstants.ZERO, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27273)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27274)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect283r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.29
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(DfuBaseService.NOTIFICATION_ID, 5, 7, 12, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27275)), SECNamedCurves.fromHex(StubApp.getString2(27276)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27277));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27278)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect409k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.30
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(409, 87, ECConstants.ZERO, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27284)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27285)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect409r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.31
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(409, 87, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27286)), SECNamedCurves.fromHex(StubApp.getString2(27287)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27288));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27289)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder sect571k1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.32
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(571, 2, 5, 10, ECConstants.ZERO, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27290)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27291)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder sect571r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.sec.SECNamedCurves.33
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return SECNamedCurves.configureCurve(new ECCurve.F2m(571, 2, 5, 10, BigInteger.valueOf(1L), SECNamedCurves.fromHex(StubApp.getString2(27292)), SECNamedCurves.fromHex(StubApp.getString2(27293)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27294));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, SECNamedCurves.configureBasepoint(curve, StubApp.getString2(27295)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(27344), SECObjectIdentifiers.secp112r1, secp112r1);
        defineCurve(StubApp.getString2(27345), SECObjectIdentifiers.secp112r2, secp112r2);
        defineCurve(StubApp.getString2(27346), SECObjectIdentifiers.secp128r1, secp128r1);
        defineCurve(StubApp.getString2(27347), SECObjectIdentifiers.secp128r2, secp128r2);
        defineCurve(StubApp.getString2(27348), SECObjectIdentifiers.secp160k1, secp160k1);
        defineCurve(StubApp.getString2(27349), SECObjectIdentifiers.secp160r1, secp160r1);
        defineCurve(StubApp.getString2(27350), SECObjectIdentifiers.secp160r2, secp160r2);
        defineCurve(StubApp.getString2(27351), SECObjectIdentifiers.secp192k1, secp192k1);
        defineCurve(StubApp.getString2(27352), SECObjectIdentifiers.secp192r1, secp192r1);
        defineCurve(StubApp.getString2(27353), SECObjectIdentifiers.secp224k1, secp224k1);
        defineCurve(StubApp.getString2(27354), SECObjectIdentifiers.secp224r1, secp224r1);
        defineCurve(StubApp.getString2(27355), SECObjectIdentifiers.secp256k1, secp256k1);
        defineCurve(StubApp.getString2(27356), SECObjectIdentifiers.secp256r1, secp256r1);
        defineCurve(StubApp.getString2(27357), SECObjectIdentifiers.secp384r1, secp384r1);
        defineCurve(StubApp.getString2(27358), SECObjectIdentifiers.secp521r1, secp521r1);
        defineCurve(StubApp.getString2(27359), SECObjectIdentifiers.sect113r1, sect113r1);
        defineCurve(StubApp.getString2(27360), SECObjectIdentifiers.sect113r2, sect113r2);
        defineCurve(StubApp.getString2(27361), SECObjectIdentifiers.sect131r1, sect131r1);
        defineCurve(StubApp.getString2(27362), SECObjectIdentifiers.sect131r2, sect131r2);
        defineCurve(StubApp.getString2(27363), SECObjectIdentifiers.sect163k1, sect163k1);
        defineCurve(StubApp.getString2(27364), SECObjectIdentifiers.sect163r1, sect163r1);
        defineCurve(StubApp.getString2(27365), SECObjectIdentifiers.sect163r2, sect163r2);
        defineCurve(StubApp.getString2(27366), SECObjectIdentifiers.sect193r1, sect193r1);
        defineCurve(StubApp.getString2(27367), SECObjectIdentifiers.sect193r2, sect193r2);
        defineCurve(StubApp.getString2(27368), SECObjectIdentifiers.sect233k1, sect233k1);
        defineCurve(StubApp.getString2(27369), SECObjectIdentifiers.sect233r1, sect233r1);
        defineCurve(StubApp.getString2(27370), SECObjectIdentifiers.sect239k1, sect239k1);
        defineCurve(StubApp.getString2(27371), SECObjectIdentifiers.sect283k1, sect283k1);
        defineCurve(StubApp.getString2(27372), SECObjectIdentifiers.sect283r1, sect283r1);
        defineCurve(StubApp.getString2(27373), SECObjectIdentifiers.sect409k1, sect409k1);
        defineCurve(StubApp.getString2(27374), SECObjectIdentifiers.sect409r1, sect409r1);
        defineCurve(StubApp.getString2(27375), SECObjectIdentifiers.sect571k1, sect571k1);
        defineCurve(StubApp.getString2(27376), SECObjectIdentifiers.sect571r1, sect571r1);
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

    public static void defineCurve(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        objIds.put(str, aSN1ObjectIdentifier);
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
