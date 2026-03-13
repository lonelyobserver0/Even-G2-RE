package org.bouncycastle.operator.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaAlgorithmParametersConverter {
    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        try {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, ASN1Primitive.fromByteArray(algorithmParameters.getEncoded()));
        } catch (IOException e10) {
            throw new InvalidAlgorithmParameterException(u.q(e10, new StringBuilder(StubApp.getString2(33844))));
        }
    }

    public AlgorithmIdentifier getAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(33847));
        }
        OAEPParameterSpec oAEPParameterSpec = OAEPParameterSpec.DEFAULT;
        if (algorithmParameterSpec.equals(oAEPParameterSpec)) {
            return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RSAESOAEPparams(RSAESOAEPparams.DEFAULT_HASH_ALGORITHM, RSAESOAEPparams.DEFAULT_MASK_GEN_FUNCTION, RSAESOAEPparams.DEFAULT_P_SOURCE_ALGORITHM));
        }
        OAEPParameterSpec oAEPParameterSpec2 = (OAEPParameterSpec) algorithmParameterSpec;
        PSource pSource = oAEPParameterSpec2.getPSource();
        if (!oAEPParameterSpec2.getMGFAlgorithm().equals(oAEPParameterSpec.getMGFAlgorithm())) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(33845) + oAEPParameterSpec.getMGFAlgorithm() + StubApp.getString2(33846));
        }
        AlgorithmIdentifier find = new DefaultDigestAlgorithmIdentifierFinder().find(oAEPParameterSpec2.getDigestAlgorithm());
        if (find.getParameters() == null) {
            find = new AlgorithmIdentifier(find.getAlgorithm(), DERNull.INSTANCE);
        }
        AlgorithmIdentifier find2 = new DefaultDigestAlgorithmIdentifierFinder().find(((MGF1ParameterSpec) oAEPParameterSpec2.getMGFParameters()).getDigestAlgorithm());
        if (find2.getParameters() == null) {
            find2 = new AlgorithmIdentifier(find2.getAlgorithm(), DERNull.INSTANCE);
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier, new RSAESOAEPparams(find, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, find2), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(((PSource.PSpecified) pSource).getValue()))));
    }
}
