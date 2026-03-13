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
import org.bouncycastle.its.ITSPublicEncryptionKey;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.BasePublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP384CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SymmAlgorithm;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcITSPublicEncryptionKey extends ITSPublicEncryptionKey {
    public BcITSPublicEncryptionKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        super(fromKeyParameters((ECPublicKeyParameters) asymmetricKeyParameter));
    }

    public static PublicEncryptionKey fromKeyParameters(ECPublicKeyParameters eCPublicKeyParameters) {
        ASN1ObjectIdentifier name = ((ECNamedDomainParameters) eCPublicKeyParameters.getParameters()).getName();
        ECPoint q10 = eCPublicKeyParameters.getQ();
        if (name.equals((ASN1Primitive) SECObjectIdentifiers.secp256r1)) {
            return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, new BasePublicEncryptionKey.Builder().setChoice(0).setValue(EccP256CurvePoint.uncompressedP256(q10.getAffineXCoord().toBigInteger(), q10.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey());
        }
        if (name.equals((ASN1Primitive) TeleTrusTObjectIdentifiers.brainpoolP256r1)) {
            return new PublicEncryptionKey(SymmAlgorithm.aes128Ccm, new BasePublicEncryptionKey.Builder().setChoice(1).setValue(EccP256CurvePoint.uncompressedP256(q10.getAffineXCoord().toBigInteger(), q10.getAffineYCoord().toBigInteger())).createBasePublicEncryptionKey());
        }
        throw new IllegalArgumentException(StubApp.getString2(29613));
    }

    public AsymmetricKeyParameter getKey() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        X9ECParameters byOID;
        BasePublicEncryptionKey publicKey = this.encryptionKey.getPublicKey();
        int choice = publicKey.getChoice();
        String string2 = StubApp.getString2(29600);
        if (choice == 0) {
            aSN1ObjectIdentifier = SECObjectIdentifiers.secp256r1;
            byOID = NISTNamedCurves.getByOID(aSN1ObjectIdentifier);
        } else {
            if (choice != 1) {
                throw new IllegalStateException(string2);
            }
            aSN1ObjectIdentifier = TeleTrusTObjectIdentifiers.brainpoolP256r1;
            byOID = TeleTrusTNamedCurves.getByOID(aSN1ObjectIdentifier);
        }
        ECCurve curve = byOID.getCurve();
        if (!(this.encryptionKey.getPublicKey().getBasePublicEncryptionKey() instanceof EccCurvePoint)) {
            throw new IllegalStateException(StubApp.getString2(29614));
        }
        EccCurvePoint eccCurvePoint = (EccCurvePoint) publicKey.getBasePublicEncryptionKey();
        if ((eccCurvePoint instanceof EccP256CurvePoint) || (eccCurvePoint instanceof EccP384CurvePoint)) {
            return new ECPublicKeyParameters(curve.decodePoint(eccCurvePoint.getEncodedPoint()).normalize(), new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID));
        }
        throw new IllegalStateException(string2);
    }

    public BcITSPublicEncryptionKey(PublicEncryptionKey publicEncryptionKey) {
        super(publicEncryptionKey);
    }
}
