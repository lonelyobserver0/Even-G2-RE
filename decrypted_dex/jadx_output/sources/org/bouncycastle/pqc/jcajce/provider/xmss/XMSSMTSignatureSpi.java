package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.stub.StubApp;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTSigner;
import org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTSignatureSpi extends Signature implements StateAwareSignature {
    private Digest digest;
    private SecureRandom random;
    private XMSSMTSigner signer;
    private ASN1ObjectIdentifier treeDigest;

    public static class generic extends XMSSMTSignatureSpi {
        public generic() {
            super(StubApp.getString2(32735), new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha256 extends XMSSMTSignatureSpi {
        public withSha256() {
            super(StubApp.getString2(33819), new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha256andPrehash extends XMSSMTSignatureSpi {
        public withSha256andPrehash() {
            super(StubApp.getString2(34728), new SHA256Digest(), new XMSSMTSigner());
        }
    }

    public static class withSha512 extends XMSSMTSignatureSpi {
        public withSha512() {
            super(StubApp.getString2(33820), new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withSha512andPrehash extends XMSSMTSignatureSpi {
        public withSha512andPrehash() {
            super(StubApp.getString2(34729), new SHA512Digest(), new XMSSMTSigner());
        }
    }

    public static class withShake128 extends XMSSMTSignatureSpi {
        public withShake128() {
            super(StubApp.getString2(33821), new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withShake128andPrehash extends XMSSMTSignatureSpi {
        public withShake128andPrehash() {
            super(StubApp.getString2(34730), new SHAKEDigest(128), new XMSSMTSigner());
        }
    }

    public static class withShake256 extends XMSSMTSignatureSpi {
        public withShake256() {
            super(StubApp.getString2(33822), new NullDigest(), new XMSSMTSigner());
        }
    }

    public static class withShake256andPrehash extends XMSSMTSignatureSpi {
        public withShake256andPrehash() {
            super(StubApp.getString2(34731), new SHAKEDigest(256), new XMSSMTSigner());
        }
    }

    public XMSSMTSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCXMSSMTPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34732));
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) privateKey;
        CipherParameters keyParams = bCXMSSMTPrivateKey.getKeyParams();
        this.treeDigest = bCXMSSMTPrivateKey.getTreeDigestOID();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            keyParams = new ParametersWithRandom(keyParams, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCXMSSMTPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34733));
        }
        CipherParameters keyParams = ((BCXMSSMTPublicKey) publicKey).getKeyParams();
        this.treeDigest = null;
        this.digest.reset();
        this.signer.init(false, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.generateSignature(DigestUtil.getDigestResult(this.digest));
        } catch (Exception e10) {
            if (e10 instanceof IllegalStateException) {
                throw new SignatureException(e10.getMessage(), e10);
            }
            throw new SignatureException(e10.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b2) throws SignatureException {
        this.digest.update(b2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.verifySignature(DigestUtil.getDigestResult(this.digest), bArr);
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public PrivateKey getUpdatedPrivateKey() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.treeDigest;
        if (aSN1ObjectIdentifier == null) {
            throw new IllegalStateException(StubApp.getString2(34734));
        }
        BCXMSSMTPrivateKey bCXMSSMTPrivateKey = new BCXMSSMTPrivateKey(aSN1ObjectIdentifier, (XMSSMTPrivateKeyParameters) this.signer.getUpdatedPrivateKey());
        this.treeDigest = null;
        return bCXMSSMTPrivateKey;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.treeDigest == null || this.signer.getUsagesRemaining() == 0) ? false : true;
    }

    public XMSSMTSignatureSpi(String str, Digest digest, XMSSMTSigner xMSSMTSigner) {
        super(str);
        this.digest = digest;
        this.signer = xMSSMTSigner;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) throws SignatureException {
        this.digest.update(bArr, i3, i10);
    }
}
