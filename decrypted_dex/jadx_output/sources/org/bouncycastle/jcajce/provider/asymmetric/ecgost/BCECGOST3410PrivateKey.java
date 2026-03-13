package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

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
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCECGOST3410PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d, reason: collision with root package name */
    private transient BigInteger f19133d;
    private transient ECParameterSpec ecSpec;
    private transient ASN1Encodable gostParams;
    private transient ASN1BitString publicKey;
    private boolean withCompression;

    public BCECGOST3410PrivateKey() {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void extractBytes(byte[] bArr, int i3, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i10 = 0; i10 != 32; i10++) {
            bArr[i3 + i10] = byteArray[(byteArray.length - 1) - i10];
        }
    }

    private ASN1BitString getPublicKeyDetails(BCECGOST3410PublicKey bCECGOST3410PublicKey) {
        try {
            return SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECGOST3410PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void populateFromPrivKeyInfo(org.bouncycastle.asn1.pkcs.PrivateKeyInfo r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PrivateKey.populateFromPrivKeyInfo(org.bouncycastle.asn1.pkcs.PrivateKeyInfo):void");
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
        if (!(obj instanceof BCECGOST3410PrivateKey)) {
            return false;
        }
        BCECGOST3410PrivateKey bCECGOST3410PrivateKey = (BCECGOST3410PrivateKey) obj;
        return getD().equals(bCECGOST3410PrivateKey.getD()) && engineGetSpec().equals(bCECGOST3410PrivateKey.engineGetSpec());
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
        return this.f19133d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        int orderBitLength;
        ASN1Encodable aSN1Encodable = this.gostParams;
        String string2 = StubApp.getString2(26791);
        if (aSN1Encodable != null) {
            byte[] bArr = new byte[32];
            extractBytes(bArr, 0, getS());
            try {
                return new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, this.gostParams), new DEROctetString(bArr)).getEncoded(string2);
            } catch (IOException unused) {
                return null;
            }
        }
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.ecSpec).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
            orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
        } else if (eCParameterSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, null, getS());
        } else {
            ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            x962Parameters = new X962Parameters(new X9ECParameters(convertCurve, new X9ECPoint(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            orderBitLength = ECUtil.getOrderBitLength(BouncyCastleProvider.CONFIGURATION, this.ecSpec.getOrder(), getS());
        }
        try {
            return new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), (this.publicKey != null ? new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), this.publicKey, x962Parameters) : new org.bouncycastle.asn1.sec.ECPrivateKey(orderBitLength, getS(), x962Parameters)).toASN1Primitive()).getEncoded(string2);
        } catch (IOException unused2) {
            return null;
        }
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
        return this.f19133d;
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
        return ECUtil.privateKeyToString(this.algorithm, this.f19133d, engineGetSpec());
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19133d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410PublicKey bCECGOST3410PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19133d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECGOST3410PublicKey bCECGOST3410PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19133d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        this.gostParams = bCECGOST3410PublicKey.getGostParams();
        this.publicKey = getPublicKeyDetails(bCECGOST3410PublicKey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19133d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19133d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCECGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECGOST3410PrivateKey(BCECGOST3410PrivateKey bCECGOST3410PrivateKey) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19133d = bCECGOST3410PrivateKey.f19133d;
        this.ecSpec = bCECGOST3410PrivateKey.ecSpec;
        this.withCompression = bCECGOST3410PrivateKey.withCompression;
        this.attrCarrier = bCECGOST3410PrivateKey.attrCarrier;
        this.publicKey = bCECGOST3410PrivateKey.publicKey;
        this.gostParams = bCECGOST3410PrivateKey.gostParams;
    }

    public BCECGOST3410PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(28166);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19133d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
