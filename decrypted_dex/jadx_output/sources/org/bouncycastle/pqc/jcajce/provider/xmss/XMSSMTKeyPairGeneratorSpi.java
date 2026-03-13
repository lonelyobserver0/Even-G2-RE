package org.bouncycastle.pqc.jcajce.provider.xmss;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTKeyPairGenerator;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.XMSSMTParameterSpec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSMTKeyPairGeneratorSpi extends KeyPairGenerator {
    private XMSSMTKeyPairGenerator engine;
    private boolean initialised;
    private XMSSMTKeyGenerationParameters param;
    private SecureRandom random;
    private ASN1ObjectIdentifier treeDigest;

    public XMSSMTKeyPairGeneratorSpi() {
        super(StubApp.getString2(32735));
        this.engine = new XMSSMTKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(10, 20, new SHA512Digest()), this.random);
            this.param = xMSSMTKeyGenerationParameters;
            this.engine.init(xMSSMTKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCXMSSMTPublicKey(this.treeDigest, (XMSSMTPublicKeyParameters) generateKeyPair.getPublic()), new BCXMSSMTPrivateKey(this.treeDigest, (XMSSMTPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i3, SecureRandom secureRandom) {
        throw new IllegalArgumentException(StubApp.getString2(34638));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        XMSSMTKeyGenerationParameters xMSSMTKeyGenerationParameters;
        if (!(algorithmParameterSpec instanceof XMSSMTParameterSpec)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(34727));
        }
        XMSSMTParameterSpec xMSSMTParameterSpec = (XMSSMTParameterSpec) algorithmParameterSpec;
        if (xMSSMTParameterSpec.getTreeDigest().equals(StubApp.getString2(21749))) {
            this.treeDigest = NISTObjectIdentifiers.id_sha256;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHA256Digest()), secureRandom);
        } else if (xMSSMTParameterSpec.getTreeDigest().equals(StubApp.getString2(21751))) {
            this.treeDigest = NISTObjectIdentifiers.id_sha512;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHA512Digest()), secureRandom);
        } else {
            if (!xMSSMTParameterSpec.getTreeDigest().equals(StubApp.getString2(28183))) {
                if (xMSSMTParameterSpec.getTreeDigest().equals(StubApp.getString2(28184))) {
                    this.treeDigest = NISTObjectIdentifiers.id_shake256;
                    xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHAKEDigest(256)), secureRandom);
                }
                this.engine.init(this.param);
                this.initialised = true;
            }
            this.treeDigest = NISTObjectIdentifiers.id_shake128;
            xMSSMTKeyGenerationParameters = new XMSSMTKeyGenerationParameters(new XMSSMTParameters(xMSSMTParameterSpec.getHeight(), xMSSMTParameterSpec.getLayers(), new SHAKEDigest(128)), secureRandom);
        }
        this.param = xMSSMTKeyGenerationParameters;
        this.engine.init(this.param);
        this.initialised = true;
    }
}
