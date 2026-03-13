package org.bouncycastle.asn1.x9;

import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X962NamedCurves {
    static X9ECParametersHolder prime192v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.1
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(X962NamedCurves.fromHex(StubApp.getString2(27338)), X962NamedCurves.fromHex(StubApp.getString2(27916)), X962NamedCurves.fromHex(StubApp.getString2(27917)), X962NamedCurves.fromHex(StubApp.getString2(27915)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27918));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27919)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime192v2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.2
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(X962NamedCurves.fromHex(StubApp.getString2(27338)), X962NamedCurves.fromHex(StubApp.getString2(27916)), X962NamedCurves.fromHex(StubApp.getString2(27937)), X962NamedCurves.fromHex(StubApp.getString2(27936)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27938));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27939)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime192v3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.3
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(X962NamedCurves.fromHex(StubApp.getString2(27338)), X962NamedCurves.fromHex(StubApp.getString2(27916)), X962NamedCurves.fromHex(StubApp.getString2(27941)), X962NamedCurves.fromHex(StubApp.getString2(27940)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27942));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27943)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime239v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.4
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(new BigInteger(StubApp.getString2(27945)), X962NamedCurves.fromHex(StubApp.getString2(27946)), X962NamedCurves.fromHex(StubApp.getString2(27947)), X962NamedCurves.fromHex(StubApp.getString2(27944)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27948));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27949)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime239v2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.5
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(new BigInteger(StubApp.getString2(27945)), X962NamedCurves.fromHex(StubApp.getString2(27946)), X962NamedCurves.fromHex(StubApp.getString2(27951)), X962NamedCurves.fromHex(StubApp.getString2(27950)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27952));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27953)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime239v3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.6
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(new BigInteger(StubApp.getString2(27945)), X962NamedCurves.fromHex(StubApp.getString2(27946)), X962NamedCurves.fromHex(StubApp.getString2(27955)), X962NamedCurves.fromHex(StubApp.getString2(27954)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27956));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27957)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder prime256v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.7
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.Fp(new BigInteger(StubApp.getString2(27959)), X962NamedCurves.fromHex(StubApp.getString2(27960)), X962NamedCurves.fromHex(StubApp.getString2(27961)), X962NamedCurves.fromHex(StubApp.getString2(27958)), BigInteger.valueOf(1L), true));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27962));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27963)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder c2pnb163v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.8
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(163, 1, 2, 8, X962NamedCurves.fromHex(StubApp.getString2(27965)), X962NamedCurves.fromHex(StubApp.getString2(27966)), X962NamedCurves.fromHex(StubApp.getString2(27964)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27967));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27968)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder c2pnb163v2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.9
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(163, 1, 2, 8, X962NamedCurves.fromHex(StubApp.getString2(27970)), X962NamedCurves.fromHex(StubApp.getString2(27971)), X962NamedCurves.fromHex(StubApp.getString2(27969)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27972)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb163v3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.10
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(163, 1, 2, 8, X962NamedCurves.fromHex(StubApp.getString2(27876)), X962NamedCurves.fromHex(StubApp.getString2(27877)), X962NamedCurves.fromHex(StubApp.getString2(27875)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27878)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb176w1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.11
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(176, 1, 2, 43, X962NamedCurves.fromHex(StubApp.getString2(27880)), X962NamedCurves.fromHex(StubApp.getString2(27881)), X962NamedCurves.fromHex(StubApp.getString2(27879)), BigInteger.valueOf(65390L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27882)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb191v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.12
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(191, 9, X962NamedCurves.fromHex(StubApp.getString2(27884)), X962NamedCurves.fromHex(StubApp.getString2(27885)), X962NamedCurves.fromHex(StubApp.getString2(27883)), BigInteger.valueOf(2L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            byte[] decodeStrict = Hex.decodeStrict(StubApp.getString2(27886));
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27887)), curve.getOrder(), curve.getCofactor(), decodeStrict);
        }
    };
    static X9ECParametersHolder c2tnb191v2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.13
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(191, 9, X962NamedCurves.fromHex(StubApp.getString2(27889)), X962NamedCurves.fromHex(StubApp.getString2(27890)), X962NamedCurves.fromHex(StubApp.getString2(27888)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27891)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb191v3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.14
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(191, 9, X962NamedCurves.fromHex(StubApp.getString2(27893)), X962NamedCurves.fromHex(StubApp.getString2(27894)), X962NamedCurves.fromHex(StubApp.getString2(27892)), BigInteger.valueOf(6L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27895)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb208w1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.15
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(208, 1, 2, 83, BigInteger.valueOf(0L), X962NamedCurves.fromHex(StubApp.getString2(27897)), X962NamedCurves.fromHex(StubApp.getString2(27896)), BigInteger.valueOf(65096L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27898)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb239v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.16
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(239, 36, X962NamedCurves.fromHex(StubApp.getString2(27900)), X962NamedCurves.fromHex(StubApp.getString2(27901)), X962NamedCurves.fromHex(StubApp.getString2(27899)), BigInteger.valueOf(4L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27902)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb239v2 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.17
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(239, 36, X962NamedCurves.fromHex(StubApp.getString2(27904)), X962NamedCurves.fromHex(StubApp.getString2(27905)), X962NamedCurves.fromHex(StubApp.getString2(27903)), BigInteger.valueOf(6L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27906)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb239v3 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.18
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(239, 36, X962NamedCurves.fromHex(StubApp.getString2(27908)), X962NamedCurves.fromHex(StubApp.getString2(27909)), X962NamedCurves.fromHex(StubApp.getString2(27907)), BigInteger.valueOf(10L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27910)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb272w1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.19
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(272, 1, 3, 56, X962NamedCurves.fromHex(StubApp.getString2(27912)), X962NamedCurves.fromHex(StubApp.getString2(27913)), X962NamedCurves.fromHex(StubApp.getString2(27911)), BigInteger.valueOf(65286L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27914)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb304w1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.20
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(304, 1, 2, 11, X962NamedCurves.fromHex(StubApp.getString2(27921)), X962NamedCurves.fromHex(StubApp.getString2(27922)), X962NamedCurves.fromHex(StubApp.getString2(27920)), BigInteger.valueOf(65070L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27923)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb359v1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.21
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(359, 68, X962NamedCurves.fromHex(StubApp.getString2(27925)), X962NamedCurves.fromHex(StubApp.getString2(27926)), X962NamedCurves.fromHex(StubApp.getString2(27924)), BigInteger.valueOf(76L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27927)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2pnb368w1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.22
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(368, 1, 2, 85, X962NamedCurves.fromHex(StubApp.getString2(27929)), X962NamedCurves.fromHex(StubApp.getString2(27930)), X962NamedCurves.fromHex(StubApp.getString2(27928)), BigInteger.valueOf(65392L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27931)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static X9ECParametersHolder c2tnb431r1 = new X9ECParametersHolder() { // from class: org.bouncycastle.asn1.x9.X962NamedCurves.23
        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public ECCurve createCurve() {
            return X962NamedCurves.configureCurve(new ECCurve.F2m(431, 120, X962NamedCurves.fromHex(StubApp.getString2(27933)), X962NamedCurves.fromHex(StubApp.getString2(27934)), X962NamedCurves.fromHex(StubApp.getString2(27932)), BigInteger.valueOf(10080L)));
        }

        @Override // org.bouncycastle.asn1.x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            ECCurve curve = getCurve();
            return new X9ECParameters(curve, X962NamedCurves.configureBasepoint(curve, StubApp.getString2(27935)), curve.getOrder(), curve.getCofactor(), null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve(StubApp.getString2(27973), X9ObjectIdentifiers.prime192v1, prime192v1);
        defineCurve(StubApp.getString2(27974), X9ObjectIdentifiers.prime192v2, prime192v2);
        defineCurve(StubApp.getString2(27975), X9ObjectIdentifiers.prime192v3, prime192v3);
        defineCurve(StubApp.getString2(27976), X9ObjectIdentifiers.prime239v1, prime239v1);
        defineCurve(StubApp.getString2(27977), X9ObjectIdentifiers.prime239v2, prime239v2);
        defineCurve(StubApp.getString2(27978), X9ObjectIdentifiers.prime239v3, prime239v3);
        defineCurve(StubApp.getString2(27979), X9ObjectIdentifiers.prime256v1, prime256v1);
        defineCurve(StubApp.getString2(27980), X9ObjectIdentifiers.c2pnb163v1, c2pnb163v1);
        defineCurve(StubApp.getString2(27981), X9ObjectIdentifiers.c2pnb163v2, c2pnb163v2);
        defineCurve(StubApp.getString2(27982), X9ObjectIdentifiers.c2pnb163v3, c2pnb163v3);
        defineCurve(StubApp.getString2(27983), X9ObjectIdentifiers.c2pnb176w1, c2pnb176w1);
        defineCurve(StubApp.getString2(27984), X9ObjectIdentifiers.c2tnb191v1, c2tnb191v1);
        defineCurve(StubApp.getString2(27985), X9ObjectIdentifiers.c2tnb191v2, c2tnb191v2);
        defineCurve(StubApp.getString2(27986), X9ObjectIdentifiers.c2tnb191v3, c2tnb191v3);
        defineCurve(StubApp.getString2(27987), X9ObjectIdentifiers.c2pnb208w1, c2pnb208w1);
        defineCurve(StubApp.getString2(27988), X9ObjectIdentifiers.c2tnb239v1, c2tnb239v1);
        defineCurve(StubApp.getString2(27989), X9ObjectIdentifiers.c2tnb239v2, c2tnb239v2);
        defineCurve(StubApp.getString2(27990), X9ObjectIdentifiers.c2tnb239v3, c2tnb239v3);
        defineCurve(StubApp.getString2(27991), X9ObjectIdentifiers.c2pnb272w1, c2pnb272w1);
        defineCurve(StubApp.getString2(27992), X9ObjectIdentifiers.c2pnb304w1, c2pnb304w1);
        defineCurve(StubApp.getString2(27993), X9ObjectIdentifiers.c2tnb359v1, c2tnb359v1);
        defineCurve(StubApp.getString2(27994), X9ObjectIdentifiers.c2pnb368w1, c2pnb368w1);
        defineCurve(StubApp.getString2(27995), X9ObjectIdentifiers.c2tnb431r1, c2tnb431r1);
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
        return objIds.keys();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toLowerCase(str));
    }
}
