package org.bouncycastle.jcajce.provider.asymmetric.ec;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    private String curveName;
    private ECParameterSpec ecParameterSpec;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded(StubApp.getString2(30489));
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (ECParameterSpec.class.isAssignableFrom(cls) || cls == AlgorithmParameterSpec.class) {
            return this.ecParameterSpec;
        }
        if (ECGenParameterSpec.class.isAssignableFrom(cls)) {
            String str = this.curveName;
            if (str != null) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(str);
                return namedCurveOid != null ? new ECGenParameterSpec(namedCurveOid.getId()) : new ECGenParameterSpec(this.curveName);
            }
            ASN1ObjectIdentifier namedCurveOid2 = ECUtil.getNamedCurveOid(EC5Util.convertSpec(this.ecParameterSpec));
            if (namedCurveOid2 != null) {
                return new ECGenParameterSpec(namedCurveOid2.getId());
            }
        }
        throw new InvalidParameterSpecException(StubApp.getString2(30598).concat(cls.getName()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof ECGenParameterSpec)) {
            if (!(algorithmParameterSpec instanceof ECParameterSpec)) {
                throw new InvalidParameterSpecException(StubApp.getString2(30600).concat(algorithmParameterSpec.getClass().getName()));
            }
            this.curveName = algorithmParameterSpec instanceof ECNamedCurveSpec ? ((ECNamedCurveSpec) algorithmParameterSpec).getName() : null;
            this.ecParameterSpec = (ECParameterSpec) algorithmParameterSpec;
            return;
        }
        ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) algorithmParameterSpec;
        X9ECParameters domainParametersFromGenSpec = ECUtils.getDomainParametersFromGenSpec(eCGenParameterSpec, BouncyCastleProvider.CONFIGURATION);
        if (domainParametersFromGenSpec == null) {
            throw new InvalidParameterSpecException(StubApp.getString2(30599) + eCGenParameterSpec.getName());
        }
        this.curveName = eCGenParameterSpec.getName();
        ECParameterSpec convertToSpec = EC5Util.convertToSpec(domainParametersFromGenSpec);
        this.ecParameterSpec = new ECNamedCurveSpec(this.curveName, convertToSpec.getCurve(), convertToSpec.getGenerator(), convertToSpec.getOrder(), BigInteger.valueOf(convertToSpec.getCofactor()));
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return StubApp.getString2(30602);
    }

    public boolean isASN1FormatString(String str) {
        return str == null || str.equals(StubApp.getString2(30489));
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        X962Parameters x962Parameters;
        if (!isASN1FormatString(str)) {
            throw new IOException(a.j(StubApp.getString2(30597), str));
        }
        ECParameterSpec eCParameterSpec = this.ecParameterSpec;
        if (eCParameterSpec == null) {
            x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
        } else {
            String str2 = this.curveName;
            if (str2 != null) {
                x962Parameters = new X962Parameters(ECUtil.getNamedCurveOid(str2));
            } else {
                org.bouncycastle.jce.spec.ECParameterSpec convertSpec = EC5Util.convertSpec(eCParameterSpec);
                x962Parameters = new X962Parameters(new X9ECParameters(convertSpec.getCurve(), new X9ECPoint(convertSpec.getG(), false), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
            }
        }
        return x962Parameters.getEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, StubApp.getString2(30489));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (!isASN1FormatString(str)) {
            throw new IOException(a.j(StubApp.getString2(30601), str));
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(bArr);
        ECCurve curve = EC5Util.getCurve(BouncyCastleProvider.CONFIGURATION, x962Parameters);
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            String name = ECNamedCurveTable.getName(aSN1ObjectIdentifier);
            this.curveName = name;
            if (name == null) {
                this.curveName = aSN1ObjectIdentifier.getId();
            }
        }
        this.ecParameterSpec = EC5Util.convertToSpec(x962Parameters, curve);
    }
}
