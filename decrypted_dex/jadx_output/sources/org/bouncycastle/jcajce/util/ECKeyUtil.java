package org.bouncycastle.jcajce.util;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECCurve;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECKeyUtil {

    public static class ECPublicKeyWithCompression implements ECPublicKey {
        private final ECPublicKey ecPublicKey;

        public ECPublicKeyWithCompression(ECPublicKey eCPublicKey) {
            this.ecPublicKey = eCPublicKey;
        }

        @Override // java.security.Key
        public String getAlgorithm() {
            return this.ecPublicKey.getAlgorithm();
        }

        @Override // java.security.Key
        public byte[] getEncoded() {
            ECCurve curve;
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(this.ecPublicKey.getEncoded());
            X962Parameters x962Parameters = X962Parameters.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
                X9ECParametersHolder byOIDLazy = CustomNamedCurves.getByOIDLazy(aSN1ObjectIdentifier);
                if (byOIDLazy == null) {
                    byOIDLazy = ECNamedCurveTable.getByOIDLazy(aSN1ObjectIdentifier);
                }
                curve = byOIDLazy.getCurve();
            } else {
                if (x962Parameters.isImplicitlyCA()) {
                    throw new IllegalStateException(StubApp.getString2(32452));
                }
                curve = X9ECParameters.getInstance(x962Parameters.getParameters()).getCurve();
            }
            try {
                return new SubjectPublicKeyInfo(subjectPublicKeyInfo.getAlgorithm(), ASN1OctetString.getInstance(new X9ECPoint(curve.decodePoint(subjectPublicKeyInfo.getPublicKeyData().getOctets()), true).toASN1Primitive()).getOctets()).getEncoded();
            } catch (IOException e10) {
                throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(32451))));
            }
        }

        @Override // java.security.Key
        public String getFormat() {
            return this.ecPublicKey.getFormat();
        }

        @Override // java.security.interfaces.ECKey
        public ECParameterSpec getParams() {
            return this.ecPublicKey.getParams();
        }

        @Override // java.security.interfaces.ECPublicKey
        public ECPoint getW() {
            return this.ecPublicKey.getW();
        }
    }

    public static ECPublicKey createKeyWithCompression(ECPublicKey eCPublicKey) {
        return new ECPublicKeyWithCompression(eCPublicKey);
    }
}
