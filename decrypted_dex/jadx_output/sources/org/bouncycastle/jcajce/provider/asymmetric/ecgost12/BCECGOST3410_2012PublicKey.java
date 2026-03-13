package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECGOST3410Parameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCECGOST3410_2012PublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {
    static final long serialVersionUID = 7026240464295649314L;
    private String algorithm;
    private transient ECPublicKeyParameters ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private transient GOST3410PublicKeyAlgParameters gostParams;
    private boolean withCompression;

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.algorithm = str;
        this.ecPublicKey = eCPublicKeyParameters;
        this.ecSpec = null;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, ECDomainParameters eCDomainParameters) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(eCDomainParameters.getG()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    }

    private void extractBytes(byte[] bArr, int i3, int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(byteArray, 0, bArr2, i3 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i11 = 0; i11 != i3; i11++) {
            bArr[i10 + i11] = byteArray[(byteArray.length - 1) - i11];
        }
    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        ASN1BitString publicKeyData = subjectPublicKeyInfo.getPublicKeyData();
        this.algorithm = StubApp.getString2(30072);
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(publicKeyData.getBytes())).getOctets();
            int i3 = algorithm.equals((ASN1Primitive) RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512) ? 64 : 32;
            int i10 = i3 * 2;
            byte[] bArr = new byte[i10 + 1];
            bArr[0] = 4;
            for (int i11 = 1; i11 <= i3; i11++) {
                bArr[i11] = octets[i3 - i11];
                bArr[i11 + i3] = octets[i10 - i11];
            }
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            this.gostParams = gOST3410PublicKeyAlgParameters;
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            ECCurve curve = parameterSpec.getCurve();
            EllipticCurve convertCurve = EC5Util.convertCurve(curve, parameterSpec.getSeed());
            this.ecPublicKey = new ECPublicKeyParameters(curve.decodePoint(bArr), ECUtil.getDomainParameters((ProviderConfiguration) null, parameterSpec));
            this.ecSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.gostParams.getPublicKeyParamSet()), convertCurve, EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(29381));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public ECPublicKeyParameters engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PublicKey)) {
            return false;
        }
        BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey = (BCECGOST3410_2012PublicKey) obj;
        return this.ecPublicKey.getQ().equals(bCECGOST3410_2012PublicKey.ecPublicKey.getQ()) && engineGetSpec().equals(bCECGOST3410_2012PublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        int i3;
        BigInteger bigInteger = this.ecPublicKey.getQ().getAffineXCoord().toBigInteger();
        BigInteger bigInteger2 = this.ecPublicKey.getQ().getAffineYCoord().toBigInteger();
        boolean z2 = bigInteger.bitLength() > 256;
        ASN1Encodable gostParams = getGostParams();
        if (gostParams == null) {
            ECParameterSpec eCParameterSpec = this.ecSpec;
            if (eCParameterSpec instanceof ECNamedCurveSpec) {
                ASN1ObjectIdentifier oid = ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName());
                gostParams = z2 ? new GOST3410PublicKeyAlgParameters(oid, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512) : new GOST3410PublicKeyAlgParameters(oid, RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
            } else {
                ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                gostParams = new X962Parameters(new X9ECParameters(convertCurve, new X9ECPoint(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
        }
        int i10 = 64;
        if (z2) {
            aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
            i3 = 64;
            i10 = 128;
        } else {
            aSN1ObjectIdentifier = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
            i3 = 32;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10 / 2;
        extractBytes(bArr, i11, 0, bigInteger);
        extractBytes(bArr, i11, i3, bigInteger2);
        try {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, gostParams), new DEROctetString(bArr)));
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public GOST3410PublicKeyAlgParameters getGostParams() {
        if (this.gostParams == null && (this.ecSpec instanceof ECNamedCurveSpec)) {
            this.gostParams = this.ecPublicKey.getQ().getAffineXCoord().toBigInteger().bitLength() > 256 ? new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) this.ecSpec).getName()), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512) : new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) this.ecSpec).getName()), RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
        }
        return this.gostParams;
    }

    @Override // org.bouncycastle.jce.interfaces.ECKey
    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public ECPoint getQ() {
        return this.ecSpec == null ? this.ecPublicKey.getQ().getDetachedPoint() : this.ecPublicKey.getQ();
    }

    @Override // java.security.interfaces.ECPublicKey
    public java.security.spec.ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.getQ());
    }

    public int hashCode() {
        return this.ecPublicKey.getQ().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.withCompression = !StubApp.getString2(30590).equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString(this.algorithm, this.ecPublicKey.getQ(), engineGetSpec());
    }

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(30072);
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.ecPublicKey = eCPublicKeyParameters;
        if (parameters instanceof ECGOST3410Parameters) {
            ECGOST3410Parameters eCGOST3410Parameters = (ECGOST3410Parameters) parameters;
            this.gostParams = new GOST3410PublicKeyAlgParameters(eCGOST3410Parameters.getPublicKeyParamSet(), eCGOST3410Parameters.getDigestParamSet(), eCGOST3410Parameters.getEncryptionParamSet());
        }
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public BCECGOST3410_2012PublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(30072);
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.ecPublicKey = eCPublicKeyParameters;
        this.ecSpec = eCParameterSpec == null ? createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters) : EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
    }

    public BCECGOST3410_2012PublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = StubApp.getString2(30072);
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(null, eCPublicKey.getParams()));
    }

    public BCECGOST3410_2012PublicKey(ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = StubApp.getString2(30072);
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new ECPublicKeyParameters(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(null, eCPublicKeySpec.getParams()));
    }

    public BCECGOST3410_2012PublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.algorithm = StubApp.getString2(30072);
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    public BCECGOST3410_2012PublicKey(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        this.algorithm = StubApp.getString2(30072);
        this.ecPublicKey = bCECGOST3410_2012PublicKey.ecPublicKey;
        this.ecSpec = bCECGOST3410_2012PublicKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PublicKey.withCompression;
        this.gostParams = bCECGOST3410_2012PublicKey.gostParams;
    }

    public BCECGOST3410_2012PublicKey(org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = StubApp.getString2(30072);
        if (eCPublicKeySpec.getParams() == null) {
            this.ecPublicKey = new ECPublicKeyParameters(providerConfiguration.getEcImplicitlyCa().getCurve().createPoint(eCPublicKeySpec.getQ().getAffineXCoord().toBigInteger(), eCPublicKeySpec.getQ().getAffineYCoord().toBigInteger()), EC5Util.getDomainParameters(providerConfiguration, null));
            this.ecSpec = null;
        } else {
            EllipticCurve convertCurve = EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed());
            this.ecPublicKey = new ECPublicKeyParameters(eCPublicKeySpec.getQ(), ECUtil.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
            this.ecSpec = EC5Util.convertSpec(convertCurve, eCPublicKeySpec.getParams());
        }
    }
}
