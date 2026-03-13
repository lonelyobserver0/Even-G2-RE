package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCECGOST3410_2012PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d, reason: collision with root package name */
    private transient BigInteger f19134d;
    private transient ECParameterSpec ecSpec;
    private transient GOST3410PublicKeyAlgParameters gostParams;
    private transient ASN1BitString publicKey;
    private boolean withCompression;

    public BCECGOST3410_2012PrivateKey() {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
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

    private ASN1BitString getPublicKeyDetails(BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey) {
        return SubjectPublicKeyInfo.getInstance(bCECGOST3410_2012PublicKey.getEncoded()).getPublicKeyData();
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECNamedCurveSpec eCNamedCurveSpec;
        ASN1Primitive aSN1Primitive = privateKeyInfo.getPrivateKeyAlgorithm().getParameters().toASN1Primitive();
        if ((aSN1Primitive instanceof ASN1Sequence) && (ASN1Sequence.getInstance(aSN1Primitive).size() == 2 || ASN1Sequence.getInstance(aSN1Primitive).size() == 3)) {
            GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters = GOST3410PublicKeyAlgParameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            this.gostParams = gOST3410PublicKeyAlgParameters;
            ECNamedCurveParameterSpec parameterSpec = ECGOST3410NamedCurveTable.getParameterSpec(ECGOST3410NamedCurves.getName(gOST3410PublicKeyAlgParameters.getPublicKeyParamSet()));
            this.ecSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(this.gostParams.getPublicKeyParamSet()), EC5Util.convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), EC5Util.convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
            ASN1OctetString privateKey = privateKeyInfo.getPrivateKey();
            if (privateKey.getOctets().length == 32 || privateKey.getOctets().length == 64) {
                this.f19134d = new BigInteger(1, Arrays.reverse(privateKey.getOctets()));
                return;
            }
            ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
            if (parsePrivateKey instanceof ASN1Integer) {
                this.f19134d = ASN1Integer.getInstance(parsePrivateKey).getPositiveValue();
                return;
            } else {
                this.f19134d = new BigInteger(1, Arrays.reverse(ASN1OctetString.getInstance(parsePrivateKey).getOctets()));
                return;
            }
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                X9ECParameters byOIDX9 = ECGOST3410NamedCurves.getByOIDX9(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new ECNamedCurveSpec(ECGOST3410NamedCurves.getName(aSN1ObjectIdentifier), EC5Util.convertCurve(byOIDX9.getCurve(), byOIDX9.getSeed()), EC5Util.convertPoint(byOIDX9.getG()), byOIDX9.getN(), byOIDX9.getH());
            } else {
                eCNamedCurveSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.ecSpec = eCNamedCurveSpec;
        } else if (x962Parameters.isImplicitlyCA()) {
            this.ecSpec = null;
        } else {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        ASN1Encodable parsePrivateKey2 = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey2 instanceof ASN1Integer) {
            this.f19134d = ASN1Integer.getInstance(parsePrivateKey2).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey2);
        this.f19134d = eCPrivateKey.getKey();
        this.publicKey = eCPrivateKey.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECGOST3410_2012PrivateKey)) {
            return false;
        }
        BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey = (BCECGOST3410_2012PrivateKey) obj;
        return getD().equals(bCECGOST3410_2012PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410_2012PrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f19134d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PrivateKey.getEncoded():byte[]");
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(29640);
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f19134d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    @Override // org.bouncycastle.jce.interfaces.ECPointEncoder
    public void setPointFormat(String str) {
        this.withCompression = !StubApp.getString2(30590).equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString(this.algorithm, this.f19134d, engineGetSpec());
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19134d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f19134d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410_2012PublicKey bCECGOST3410_2012PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f19134d = eCPrivateKeyParameters.getD();
        this.ecSpec = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.gostParams = bCECGOST3410_2012PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410_2012PublicKey);
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19134d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410_2012PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19134d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410_2012PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECGOST3410_2012PrivateKey(BCECGOST3410_2012PrivateKey bCECGOST3410_2012PrivateKey) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19134d = bCECGOST3410_2012PrivateKey.f19134d;
        this.ecSpec = bCECGOST3410_2012PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410_2012PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410_2012PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410_2012PrivateKey.publicKey;
        this.gostParams = bCECGOST3410_2012PrivateKey.gostParams;
    }

    public BCECGOST3410_2012PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(30072);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19134d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
