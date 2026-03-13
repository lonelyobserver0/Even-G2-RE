package org.bouncycastle.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.PublicKey;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.bc.ExternalValue;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExternalPublicKey implements PublicKey {
    private final byte[] digest;
    private final AlgorithmIdentifier digestAlg;
    private final GeneralName location;

    public ExternalPublicKey(PublicKey publicKey, GeneralName generalName, MessageDigest messageDigest) {
        this(generalName, MessageDigestUtils.getDigestAlgID(messageDigest.getAlgorithm()), messageDigest.digest(publicKey.getEncoded()));
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(29641);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(BCObjectIdentifiers.external_value), new ExternalValue(this.location, this.digestAlg, this.digest)).getEncoded(StubApp.getString2("26791"));
        } catch (IOException e10) {
            throw new IllegalStateException(u.q(e10, new StringBuilder(StubApp.getString2(29639))));
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(19963);
    }

    public ExternalPublicKey(ExternalValue externalValue) {
        this(externalValue.getLocation(), externalValue.getHashAlg(), externalValue.getHashVal().getBytes());
    }

    public ExternalPublicKey(GeneralName generalName, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.location = generalName;
        this.digestAlg = algorithmIdentifier;
        this.digest = Arrays.clone(bArr);
    }
}
