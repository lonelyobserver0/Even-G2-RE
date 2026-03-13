package org.bouncycastle.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECNamedDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OpenSSHPublicKeyUtil {
    private static final String DSS = StubApp.getString2(29371);
    private static final String ECDSA = StubApp.getString2(29358);
    private static final String ED_25519 = StubApp.getString2(29353);
    private static final String RSA = StubApp.getString2(29361);

    private OpenSSHPublicKeyUtil() {
    }

    public static byte[] encodePublicKey(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException(StubApp.getString2(29373));
        }
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            if (asymmetricKeyParameter.isPrivate()) {
                throw new IllegalArgumentException(StubApp.getString2(29368));
            }
            RSAKeyParameters rSAKeyParameters = (RSAKeyParameters) asymmetricKeyParameter;
            SSHBuilder sSHBuilder = new SSHBuilder();
            sSHBuilder.writeString(StubApp.getString2(29361));
            sSHBuilder.writeBigNum(rSAKeyParameters.getExponent());
            sSHBuilder.writeBigNum(rSAKeyParameters.getModulus());
            return sSHBuilder.getBytes();
        }
        if (asymmetricKeyParameter instanceof ECPublicKeyParameters) {
            SSHBuilder sSHBuilder2 = new SSHBuilder();
            ECPublicKeyParameters eCPublicKeyParameters = (ECPublicKeyParameters) asymmetricKeyParameter;
            String nameForParameters = SSHNamedCurves.getNameForParameters(eCPublicKeyParameters.getParameters());
            if (nameForParameters == null) {
                throw new IllegalArgumentException(StubApp.getString2(29370).concat(eCPublicKeyParameters.getParameters().getCurve().getClass().getName()));
            }
            sSHBuilder2.writeString(StubApp.getString2(29369).concat(nameForParameters));
            sSHBuilder2.writeString(nameForParameters);
            sSHBuilder2.writeBlock(eCPublicKeyParameters.getQ().getEncoded(false));
            return sSHBuilder2.getBytes();
        }
        if (asymmetricKeyParameter instanceof DSAPublicKeyParameters) {
            DSAPublicKeyParameters dSAPublicKeyParameters = (DSAPublicKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPublicKeyParameters.getParameters();
            SSHBuilder sSHBuilder3 = new SSHBuilder();
            sSHBuilder3.writeString(StubApp.getString2(29371));
            sSHBuilder3.writeBigNum(parameters.getP());
            sSHBuilder3.writeBigNum(parameters.getQ());
            sSHBuilder3.writeBigNum(parameters.getG());
            sSHBuilder3.writeBigNum(dSAPublicKeyParameters.getY());
            return sSHBuilder3.getBytes();
        }
        if (asymmetricKeyParameter instanceof Ed25519PublicKeyParameters) {
            SSHBuilder sSHBuilder4 = new SSHBuilder();
            sSHBuilder4.writeString(StubApp.getString2(29353));
            sSHBuilder4.writeBlock(((Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded());
            return sSHBuilder4.getBytes();
        }
        throw new IllegalArgumentException(StubApp.getString2(29354) + asymmetricKeyParameter.getClass().getName() + StubApp.getString2(29372));
    }

    public static AsymmetricKeyParameter parsePublicKey(SSHBuffer sSHBuffer) {
        AsymmetricKeyParameter asymmetricKeyParameter;
        AsymmetricKeyParameter eCPublicKeyParameters;
        String readString = sSHBuffer.readString();
        if (StubApp.getString2(29361).equals(readString)) {
            asymmetricKeyParameter = new RSAKeyParameters(false, sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive());
        } else {
            if (StubApp.getString2(29371).equals(readString)) {
                eCPublicKeyParameters = new DSAPublicKeyParameters(sSHBuffer.readBigNumPositive(), new DSAParameters(sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive(), sSHBuffer.readBigNumPositive()));
            } else if (readString.startsWith(StubApp.getString2(29358))) {
                String readString2 = sSHBuffer.readString();
                ASN1ObjectIdentifier byName = SSHNamedCurves.getByName(readString2);
                X9ECParameters parameters = SSHNamedCurves.getParameters(byName);
                if (parameters == null) {
                    throw new IllegalStateException(AbstractC1482f.i(StubApp.getString2(29374), readString, StubApp.getString2(29375), readString2));
                }
                eCPublicKeyParameters = new ECPublicKeyParameters(parameters.getCurve().decodePoint(sSHBuffer.readBlock()), new ECNamedDomainParameters(byName, parameters));
            } else if (StubApp.getString2(29353).equals(readString)) {
                byte[] readBlock = sSHBuffer.readBlock();
                if (readBlock.length != 32) {
                    throw new IllegalStateException(StubApp.getString2(29376));
                }
                asymmetricKeyParameter = new Ed25519PublicKeyParameters(readBlock, 0);
            } else {
                asymmetricKeyParameter = null;
            }
            asymmetricKeyParameter = eCPublicKeyParameters;
        }
        if (asymmetricKeyParameter == null) {
            throw new IllegalArgumentException(StubApp.getString2(29362));
        }
        if (sSHBuffer.hasRemaining()) {
            throw new IllegalArgumentException(StubApp.getString2(29365));
        }
        return asymmetricKeyParameter;
    }

    public static AsymmetricKeyParameter parsePublicKey(byte[] bArr) {
        return parsePublicKey(new SSHBuffer(bArr));
    }
}
