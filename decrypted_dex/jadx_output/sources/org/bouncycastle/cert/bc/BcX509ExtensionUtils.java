package org.bouncycastle.cert.bc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.cert.X509ExtensionUtils;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcX509ExtensionUtils extends X509ExtensionUtils {

    /* renamed from: org.bouncycastle.cert.bc.BcX509ExtensionUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class SHA1DigestCalculator implements DigestCalculator {
        private ByteArrayOutputStream bOut;

        private SHA1DigestCalculator() {
            this.bOut = new ByteArrayOutputStream();
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public AlgorithmIdentifier getAlgorithmIdentifier() {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1);
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public byte[] getDigest() {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            SHA1Digest sHA1Digest = new SHA1Digest();
            sHA1Digest.update(byteArray, 0, byteArray.length);
            byte[] bArr = new byte[sHA1Digest.getDigestSize()];
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public OutputStream getOutputStream() {
            return this.bOut;
        }

        public /* synthetic */ SHA1DigestCalculator(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public BcX509ExtensionUtils() {
        super(new SHA1DigestCalculator(null));
    }

    public AuthorityKeyIdentifier createAuthorityKeyIdentifier(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        return super.createAuthorityKeyIdentifier(SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }

    public SubjectKeyIdentifier createSubjectKeyIdentifier(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        return super.createSubjectKeyIdentifier(SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }

    public BcX509ExtensionUtils(DigestCalculator digestCalculator) {
        super(digestCalculator);
    }
}
