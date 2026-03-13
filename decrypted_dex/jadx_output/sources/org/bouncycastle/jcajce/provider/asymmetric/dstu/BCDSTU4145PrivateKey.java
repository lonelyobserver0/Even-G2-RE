package org.bouncycastle.jcajce.provider.asymmetric.dstu;

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
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.ua.DSTU4145BinaryField;
import org.bouncycastle.asn1.ua.DSTU4145ECBinary;
import org.bouncycastle.asn1.ua.DSTU4145NamedCurves;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.asn1.ua.DSTU4145PointEncoder;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCDSTU4145PrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    static final long serialVersionUID = 7245981689601667138L;
    private String algorithm;
    private transient PKCS12BagAttributeCarrierImpl attrCarrier;

    /* renamed from: d, reason: collision with root package name */
    private transient BigInteger f19131d;
    private transient ECParameterSpec ecSpec;
    private transient ASN1BitString publicKey;
    private boolean withCompression;

    public BCDSTU4145PrivateKey() {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private ASN1BitString getPublicKeyDetails(BCDSTU4145PublicKey bCDSTU4145PublicKey) {
        try {
            return SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCDSTU4145PublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec;
        ECNamedCurveSpec eCNamedCurveSpec;
        X962Parameters x962Parameters = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                ECDomainParameters byOID = DSTU4145NamedCurves.getByOID(aSN1ObjectIdentifier);
                eCNamedCurveSpec = new ECNamedCurveSpec(aSN1ObjectIdentifier.getId(), EC5Util.convertCurve(byOID.getCurve(), byOID.getSeed()), EC5Util.convertPoint(byOID.getG()), byOID.getN(), byOID.getH());
            } else {
                eCNamedCurveSpec = new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), EC5Util.convertCurve(namedCurveByOid.getCurve(), namedCurveByOid.getSeed()), EC5Util.convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
            }
            this.ecSpec = eCNamedCurveSpec;
        } else if (x962Parameters.isImplicitlyCA()) {
            this.ecSpec = null;
        } else {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(x962Parameters.getParameters());
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1Integer) {
                X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
                this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(x9ECParameters.getCurve(), x9ECParameters.getSeed()), EC5Util.convertPoint(x9ECParameters.getG()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
            } else {
                DSTU4145Params dSTU4145Params = DSTU4145Params.getInstance(aSN1Sequence);
                if (dSTU4145Params.isNamedCurve()) {
                    ASN1ObjectIdentifier namedCurve = dSTU4145Params.getNamedCurve();
                    ECDomainParameters byOID2 = DSTU4145NamedCurves.getByOID(namedCurve);
                    eCParameterSpec = new ECNamedCurveParameterSpec(namedCurve.getId(), byOID2.getCurve(), byOID2.getG(), byOID2.getN(), byOID2.getH(), byOID2.getSeed());
                } else {
                    DSTU4145ECBinary eCBinary = dSTU4145Params.getECBinary();
                    byte[] b2 = eCBinary.getB();
                    ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
                    ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu4145le;
                    if (algorithm.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        reverseBytes(b2);
                    }
                    DSTU4145BinaryField field = eCBinary.getField();
                    ECCurve.F2m f2m = new ECCurve.F2m(field.getM(), field.getK1(), field.getK2(), field.getK3(), eCBinary.getA(), new BigInteger(1, b2));
                    byte[] g10 = eCBinary.getG();
                    if (privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm().equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                        reverseBytes(g10);
                    }
                    eCParameterSpec = new org.bouncycastle.jce.spec.ECParameterSpec(f2m, DSTU4145PointEncoder.decodePoint(f2m, g10), eCBinary.getN());
                }
                this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
            }
        }
        ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof ASN1Integer) {
            this.f19131d = ASN1Integer.getInstance(parsePrivateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey eCPrivateKey = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey);
        this.f19131d = eCPrivateKey.getKey();
        this.publicKey = eCPrivateKey.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void reverseBytes(byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            byte b2 = bArr[i3];
            bArr[i3] = bArr[(bArr.length - 1) - i3];
            bArr[(bArr.length - 1) - i3] = b2;
        }
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
        if (!(obj instanceof BCDSTU4145PrivateKey)) {
            return false;
        }
        BCDSTU4145PrivateKey bCDSTU4145PrivateKey = (BCDSTU4145PrivateKey) obj;
        return getD().equals(bCDSTU4145PrivateKey.getD()) && engineGetSpec().equals(bCDSTU4145PrivateKey.engineGetSpec());
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
        return this.f19131d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: IOException -> 0x00e4, TryCatch #0 {IOException -> 0x00e4, blocks: (B:12:0x00a2, B:14:0x00b0, B:15:0x00d9, B:19:0x00c5), top: B:11:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[Catch: IOException -> 0x00e4, TryCatch #0 {IOException -> 0x00e4, blocks: (B:12:0x00a2, B:14:0x00b0, B:15:0x00d9, B:19:0x00c5), top: B:11:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    @Override // java.security.Key
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] getEncoded() {
        /*
            r9 = this;
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            boolean r1 = r0 instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec
            r2 = 0
            if (r1 == 0) goto L36
            org.bouncycastle.jce.spec.ECNamedCurveSpec r0 = (org.bouncycastle.jce.spec.ECNamedCurveSpec) r0
            java.lang.String r0 = r0.getName()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid(r0)
            if (r0 != 0) goto L20
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = new org.bouncycastle.asn1.ASN1ObjectIdentifier
            java.security.spec.ECParameterSpec r1 = r9.ecSpec
            org.bouncycastle.jce.spec.ECNamedCurveSpec r1 = (org.bouncycastle.jce.spec.ECNamedCurveSpec) r1
            java.lang.String r1 = r1.getName()
            r0.<init>(r1)
        L20:
            org.bouncycastle.asn1.x9.X962Parameters r1 = new org.bouncycastle.asn1.x9.X962Parameters
            r1.<init>(r0)
        L25:
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.security.spec.ECParameterSpec r3 = r9.ecSpec
            java.math.BigInteger r3 = r3.getOrder()
            java.math.BigInteger r4 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3, r4)
            goto L89
        L36:
            if (r0 != 0) goto L4a
            org.bouncycastle.asn1.x9.X962Parameters r1 = new org.bouncycastle.asn1.x9.X962Parameters
            org.bouncycastle.asn1.DERNull r0 = org.bouncycastle.asn1.DERNull.INSTANCE
            r1.<init>(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            java.math.BigInteger r3 = r9.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r2, r3)
            goto L89
        L4a:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            org.bouncycastle.math.ec.ECCurve r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            org.bouncycastle.asn1.x9.X9ECParameters r3 = new org.bouncycastle.asn1.x9.X9ECParameters
            org.bouncycastle.asn1.x9.X9ECPoint r5 = new org.bouncycastle.asn1.x9.X9ECPoint
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            java.security.spec.ECPoint r0 = r0.getGenerator()
            org.bouncycastle.math.ec.ECPoint r0 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint(r4, r0)
            boolean r1 = r9.withCompression
            r5.<init>(r0, r1)
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            java.math.BigInteger r6 = r0.getOrder()
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            int r0 = r0.getCofactor()
            long r0 = (long) r0
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            java.security.spec.ECParameterSpec r0 = r9.ecSpec
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            byte[] r8 = r0.getSeed()
            r3.<init>(r4, r5, r6, r7, r8)
            org.bouncycastle.asn1.x9.X962Parameters r1 = new org.bouncycastle.asn1.x9.X962Parameters
            r1.<init>(r3)
            goto L25
        L89:
            org.bouncycastle.asn1.ASN1BitString r3 = r9.publicKey
            if (r3 == 0) goto L99
            org.bouncycastle.asn1.sec.ECPrivateKey r3 = new org.bouncycastle.asn1.sec.ECPrivateKey
            java.math.BigInteger r4 = r9.getS()
            org.bouncycastle.asn1.ASN1BitString r5 = r9.publicKey
            r3.<init>(r0, r4, r5, r1)
            goto La2
        L99:
            org.bouncycastle.asn1.sec.ECPrivateKey r3 = new org.bouncycastle.asn1.sec.ECPrivateKey
            java.math.BigInteger r4 = r9.getS()
            r3.<init>(r0, r4, r1)
        La2:
            java.lang.String r0 = r9.algorithm     // Catch: java.io.IOException -> Le4
            java.lang.String r4 = "29292"
            java.lang.String r4 = com.stub.StubApp.getString2(r4)     // Catch: java.io.IOException -> Le4
            boolean r0 = r0.equals(r4)     // Catch: java.io.IOException -> Le4
            if (r0 == 0) goto Lc5
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r4 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1ObjectIdentifier r5 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu4145be     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()     // Catch: java.io.IOException -> Le4
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1Primitive r1 = r3.toASN1Primitive()     // Catch: java.io.IOException -> Le4
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Le4
            goto Ld9
        Lc5:
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo r0 = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r4 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1ObjectIdentifier r5 = org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_ecPublicKey     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()     // Catch: java.io.IOException -> Le4
            r4.<init>(r5, r1)     // Catch: java.io.IOException -> Le4
            org.bouncycastle.asn1.ASN1Primitive r1 = r3.toASN1Primitive()     // Catch: java.io.IOException -> Le4
            r0.<init>(r4, r1)     // Catch: java.io.IOException -> Le4
        Ld9:
            java.lang.String r1 = "26791"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.io.IOException -> Le4
            byte[] r0 = r0.getEncoded(r1)     // Catch: java.io.IOException -> Le4
            return r0
        Le4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey.getEncoded():byte[]");
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
        return this.f19131d;
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
        return ECUtil.privateKeyToString(this.algorithm, this.f19131d, engineGetSpec());
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.algorithm = str;
        this.f19131d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f19131d = eCPrivateKeyParameters.getD();
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCDSTU4145PublicKey bCDSTU4145PublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f19131d = eCPrivateKeyParameters.getD();
        this.ecSpec = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), EC5Util.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue()) : new ECParameterSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), EC5Util.convertPoint(eCParameterSpec.getG()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
        this.publicKey = getPublicKeyDetails(bCDSTU4145PublicKey);
    }

    public BCDSTU4145PrivateKey(ECPrivateKey eCPrivateKey) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19131d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
    }

    public BCDSTU4145PrivateKey(ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19131d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
    }

    public BCDSTU4145PrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCDSTU4145PrivateKey(BCDSTU4145PrivateKey bCDSTU4145PrivateKey) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19131d = bCDSTU4145PrivateKey.f19131d;
        this.ecSpec = bCDSTU4145PrivateKey.ecSpec;
        this.withCompression = bCDSTU4145PrivateKey.withCompression;
        this.attrCarrier = bCDSTU4145PrivateKey.attrCarrier;
        this.publicKey = bCDSTU4145PrivateKey.publicKey;
    }

    public BCDSTU4145PrivateKey(org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec) {
        this.algorithm = StubApp.getString2(29292);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.f19131d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
    }
}
