package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JDKDSAPublicKey implements DSAPublicKey {
    private static final long serialVersionUID = 1752452449903495175L;
    private DSAParams dsaSpec;

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19153y;

    public JDKDSAPublicKey(BigInteger bigInteger, DSAParameterSpec dSAParameterSpec) {
        this.f19153y = bigInteger;
        this.dsaSpec = dSAParameterSpec;
    }

    private boolean isNotNull(ASN1Encodable aSN1Encodable) {
        return (aSN1Encodable == null || DERNull.INSTANCE.equals(aSN1Encodable)) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f19153y = (BigInteger) objectInputStream.readObject();
        this.dsaSpec = new DSAParameterSpec((BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject(), (BigInteger) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f19153y);
        objectOutputStream.writeObject(this.dsaSpec.getP());
        objectOutputStream.writeObject(this.dsaSpec.getQ());
        objectOutputStream.writeObject(this.dsaSpec.getG());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAPublicKey)) {
            return false;
        }
        DSAPublicKey dSAPublicKey = (DSAPublicKey) obj;
        return getY().equals(dSAPublicKey.getY()) && getParams().getG().equals(dSAPublicKey.getParams().getG()) && getParams().getP().equals(dSAPublicKey.getParams().getP()) && getParams().getQ().equals(dSAPublicKey.getParams().getQ());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(28060);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            DSAParams dSAParams = this.dsaSpec;
            return dSAParams == null ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new ASN1Integer(this.f19153y)).getEncoded(ASN1Encoding.DER) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(dSAParams.getP(), this.dsaSpec.getQ(), this.dsaSpec.getG())), new ASN1Integer(this.f19153y)).getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    @Override // java.security.interfaces.DSAKey
    public DSAParams getParams() {
        return this.dsaSpec;
    }

    @Override // java.security.interfaces.DSAPublicKey
    public BigInteger getY() {
        return this.f19153y;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getQ().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(StubApp.getString2(32680));
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(lineSeparator);
        stringBuffer.append(StubApp.getString2(32681));
        stringBuffer.append(getY().toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public JDKDSAPublicKey(DSAPublicKey dSAPublicKey) {
        this.f19153y = dSAPublicKey.getY();
        this.dsaSpec = dSAPublicKey.getParams();
    }

    public JDKDSAPublicKey(DSAPublicKeySpec dSAPublicKeySpec) {
        this.f19153y = dSAPublicKeySpec.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    public JDKDSAPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            this.f19153y = ((ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue();
            if (isNotNull(subjectPublicKeyInfo.getAlgorithm().getParameters())) {
                DSAParameter dSAParameter = DSAParameter.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
                this.dsaSpec = new DSAParameterSpec(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(30576));
        }
    }

    public JDKDSAPublicKey(DSAPublicKeyParameters dSAPublicKeyParameters) {
        this.f19153y = dSAPublicKeyParameters.getY();
        this.dsaSpec = new DSAParameterSpec(dSAPublicKeyParameters.getParameters().getP(), dSAPublicKeyParameters.getParameters().getQ(), dSAPublicKeyParameters.getParameters().getG());
    }
}
