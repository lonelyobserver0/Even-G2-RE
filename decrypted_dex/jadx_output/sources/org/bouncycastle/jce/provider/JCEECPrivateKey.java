package org.bouncycastle.jce.provider;

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
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JCEECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    private String algorithm;
    private PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f19148d;
    private ECParameterSpec ecSpec;
    private ASN1BitString publicKey;
    private boolean withCompression;

    public JCEECPrivateKey() {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private ASN1BitString getPublicKeyDetails(JCEECPublicKey jCEECPublicKey) {
        try {
            return SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(jCEECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid != null) {
                this.ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
        } else if (x962Parameters.isImplicitlyCA()) {
            this.ecSpec = null;
        } else {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
        }
        ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof ASN1Integer) {
            this.f19148d = ASN1Integer.getInstance(parsePrivateKey).getValue();
            return;
        }
        ECPrivateKeyStructure eCPrivateKeyStructure = new ECPrivateKeyStructure((ASN1Sequence) parsePrivateKey);
        this.f19148d = eCPrivateKeyStructure.getKey();
        this.publicKey = eCPrivateKeyStructure.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
        PKCS12BagAttributeCarrierImpl pKCS12BagAttributeCarrierImpl = new PKCS12BagAttributeCarrierImpl();
        this.attrCarrier = pKCS12BagAttributeCarrierImpl;
        pKCS12BagAttributeCarrierImpl.readObject(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
        this.attrCarrier.writeObject(objectOutputStream);
    }

    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPrivateKey)) {
            return false;
        }
        JCEECPrivateKey jCEECPrivateKey = (JCEECPrivateKey) obj;
        return getD().equals(jCEECPrivateKey.getD()) && engineGetSpec().equals(jCEECPrivateKey.engineGetSpec());
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
        return this.f19148d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        X962Parameters x962Parameters;
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec).getName());
            if (namedCurveOid == null) {
                namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.ecSpec).getName());
            }
            x962Parameters = new X962Parameters(namedCurveOid);
        } else if (eCParameterSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            x962Parameters = new X962Parameters(new X9ECParameters(convertCurve, new X9ECPoint(EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator()), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf(this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
        }
        ECPrivateKeyStructure eCPrivateKeyStructure = this.publicKey != null ? new ECPrivateKeyStructure(getS(), this.publicKey, x962Parameters) : new ECPrivateKeyStructure(getS(), x962Parameters);
        try {
            return (this.algorithm.equals(StubApp.getString2("28166")) ? new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive()) : new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters.toASN1Primitive()), eCPrivateKeyStructure.toASN1Primitive())).getEncoded(StubApp.getString2("26791"));
        } catch (IOException unused) {
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
        return this.f19148d;
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
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(32668));
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(32669));
        stringBuffer.append(this.f19148d.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public JCEECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, JCEECPublicKey jCEECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        }
        this.publicKey = getPublicKeyDetails(jCEECPublicKey);
    }

    public JCEECPrivateKey(String str, JCEECPrivateKey jCEECPrivateKey) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = jCEECPrivateKey.f19148d;
        this.ecSpec = jCEECPrivateKey.ecSpec;
        this.withCompression = jCEECPrivateKey.withCompression;
        this.attrCarrier = jCEECPrivateKey.attrCarrier;
        this.publicKey = jCEECPrivateKey.publicKey;
    }

    public JCEECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19148d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }

    public JCEECPrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19148d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public JCEECPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = StubApp.getString2(4707);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }
}
