package org.bouncycastle.its.bc;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.its.ITSPublicVerificationKey;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point256;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Point384;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcITSPublicVerificationKey extends ITSPublicVerificationKey {
    public BcITSPublicVerificationKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        super(fromKeyParameters((ECPublicKeyParameters) asymmetricKeyParameter));
    }

    public static PublicVerificationKey fromKeyParameters(ECPublicKeyParameters eCPublicKeyParameters) {
        ASN1ObjectIdentifier name = ((ECNamedDomainParameters) eCPublicKeyParameters.getParameters()).getName();
        ECPoint q10 = eCPublicKeyParameters.getQ();
        if (name.equals((ASN1Primitive) SECObjectIdentifiers.secp256r1)) {
            return new PublicVerificationKey(0, EccP256CurvePoint.uncompressedP256(Point256.builder().setX(q10.getAffineXCoord().toBigInteger()).setY(q10.getAffineYCoord().toBigInteger()).createPoint256()));
        }
        if (name.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            return new PublicVerificationKey(1, EccP256CurvePoint.uncompressedP256(Point256.builder().setX(q10.getAffineXCoord().toBigInteger()).setY(q10.getAffineYCoord().toBigInteger()).createPoint256()));
        }
        if (name.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP384r1)) {
            return new PublicVerificationKey(2, EccP384CurvePoint.uncompressedP384(Point384.builder().setX(q10.getAffineXCoord().toBigInteger()).setY(q10.getAffineYCoord().toBigInteger()).createPoint384()));
        }
        throw new IllegalArgumentException(StubApp.getString2(29613));
    }

    public AsymmetricKeyParameter getKey() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        X9ECParameters byOID;
        int choice = this.verificationKey.getChoice();
        String string2 = StubApp.getString2(29600);
        if (choice != 0) {
            if (choice == 1) {
                aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP256r1;
            } else {
                if (choice != 2) {
                    throw new IllegalStateException(string2);
                }
                aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP384r1;
            }
            byOID = TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier);
        } else {
            aSN1ObjectIdentifier = SECObjectIdentifiers.secp256r1;
            byOID = NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        ECCurve curve = byOID.getCurve();
        if (!(this.verificationKey.getPublicVerificationKey() instanceof EccCurvePoint)) {
            throw new IllegalStateException(StubApp.getString2(29614));
        }
        EccCurvePoint eccCurvePoint = (EccCurvePoint) this.verificationKey.getPublicVerificationKey();
        if ((eccCurvePoint instanceof EccP256CurvePoint) || (eccCurvePoint instanceof EccP384CurvePoint)) {
            return new ECPublicKeyParameters(curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize(), new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID));
        }
        throw new IllegalStateException(string2);
    }

    public BcITSPublicVerificationKey(PublicVerificationKey publicVerificationKey) {
        super(publicVerificationKey);
    }
}
