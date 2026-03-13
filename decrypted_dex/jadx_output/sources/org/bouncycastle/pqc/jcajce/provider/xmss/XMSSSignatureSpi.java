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
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSSigner;
import org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSSignatureSpi extends Signature implements StateAwareSignature {
    private Digest digest;
    private SecureRandom random;
    private XMSSSigner signer;
    private ASN1ObjectIdentifier treeDigest;

    public static class generic extends XMSSSignatureSpi {
        public generic() {
            super(StubApp.getString2(32734), new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha256 extends XMSSSignatureSpi {
        public withSha256() {
            super(StubApp.getString2(33815), new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha256andPrehash extends XMSSSignatureSpi {
        public withSha256andPrehash() {
            super(StubApp.getString2(34735), new SHA256Digest(), new XMSSSigner());
        }
    }

    public static class withSha512 extends XMSSSignatureSpi {
        public withSha512() {
            super(StubApp.getString2(33816), new NullDigest(), new XMSSSigner());
        }
    }

    public static class withSha512andPrehash extends XMSSSignatureSpi {
        public withSha512andPrehash() {
            super(StubApp.getString2(34736), new SHA512Digest(), new XMSSSigner());
        }
    }

    public static class withShake128 extends XMSSSignatureSpi {
        public withShake128() {
            super(StubApp.getString2(33817), new NullDigest(), new XMSSSigner());
        }
    }

    public static class withShake128andPrehash extends XMSSSignatureSpi {
        public withShake128andPrehash() {
            super(StubApp.getString2(34730), new SHAKEDigest(128), new XMSSSigner());
        }
    }

    public static class withShake256 extends XMSSSignatureSpi {
        public withShake256() {
            super(StubApp.getString2(33818), new NullDigest(), new XMSSSigner());
        }
    }

    public static class withShake256andPrehash extends XMSSSignatureSpi {
        public withShake256andPrehash() {
            super(StubApp.getString2(34737), new SHAKEDigest(256), new XMSSSigner());
        }
    }

    public XMSSSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException(StubApp.getString2(30579));
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCXMSSPrivateKey)) {
            throw new InvalidKeyException(StubApp.getString2(34738));
        }
        BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) privateKey;
        CipherParameters keyParams = bCXMSSPrivateKey.getKeyParams();
        this.treeDigest = bCXMSSPrivateKey.getTreeDigestOID();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            keyParams = new ParametersWithRandom(keyParams, secureRandom);
        }
        this.digest.reset();
        this.signer.init(true, keyParams);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCXMSSPublicKey)) {
            throw new InvalidKeyException(StubApp.getString2(34668));
        }
        CipherParameters keyParams = ((BCXMSSPublicKey) publicKey).getKeyParams();
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
            throw new SignatureException(e10.toString(), e10);
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
        BCXMSSPrivateKey bCXMSSPrivateKey = new BCXMSSPrivateKey(aSN1ObjectIdentifier, (XMSSPrivateKeyParameters) this.signer.getUpdatedPrivateKey());
        this.treeDigest = null;
        return bCXMSSPrivateKey;
    }

    @Override // org.bouncycastle.pqc.jcajce.interfaces.StateAwareSignature
    public boolean isSigningCapable() {
        return (this.treeDigest == null || this.signer.getUsagesRemaining() == 0) ? false : true;
    }

    public XMSSSignatureSpi(String str, Digest digest, XMSSSigner xMSSSigner) {
        super(str);
        this.digest = digest;
        this.signer = xMSSSigner;
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
