package org.bouncycastle.pkcs.jcajce;

import com.stub.StubApp;
import i2.u;
import java.io.OutputStream;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PBMAC1Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.io.MacOutputStream;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.DefaultMacAlgorithmIdentifierFinder;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.MacAlgorithmIdentifierFinder;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcePBMac1CalculatorBuilder {
    public static final AlgorithmIdentifier PRF_SHA224;
    public static final AlgorithmIdentifier PRF_SHA256;
    public static final AlgorithmIdentifier PRF_SHA384;
    public static final AlgorithmIdentifier PRF_SHA3_224;
    public static final AlgorithmIdentifier PRF_SHA3_256;
    public static final AlgorithmIdentifier PRF_SHA3_384;
    public static final AlgorithmIdentifier PRF_SHA3_512;
    public static final AlgorithmIdentifier PRF_SHA512;
    private static final DefaultMacAlgorithmIdentifierFinder defaultFinder;
    private JcaJceHelper helper;
    private int iterationCount;
    private int keySize;
    private AlgorithmIdentifier macAlgorithm;
    private PBKDF2Params pbeParams;
    private AlgorithmIdentifier prf;
    private SecureRandom random;
    private byte[] salt;
    private int saltLength;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA224;
        DERNull dERNull = DERNull.INSTANCE;
        PRF_SHA224 = new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull);
        PRF_SHA256 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, dERNull);
        PRF_SHA384 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA384, dERNull);
        PRF_SHA512 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, dERNull);
        PRF_SHA3_224 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_224);
        PRF_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_256);
        PRF_SHA3_384 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_384);
        PRF_SHA3_512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512);
        defaultFinder = new DefaultMacAlgorithmIdentifierFinder();
    }

    public JcePBMac1CalculatorBuilder(String str, int i3) {
        this(str, i3, defaultFinder);
    }

    public MacCalculator build(char[] cArr) throws OperatorCreationException {
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        try {
            final Mac createMac = this.helper.createMac(this.macAlgorithm.getAlgorithm().getId());
            PBKDF2Params pBKDF2Params = this.pbeParams;
            if (pBKDF2Params != null) {
                this.salt = pBKDF2Params.getSalt();
                this.iterationCount = BigIntegers.intValueExact(this.pbeParams.getIterationCount());
                this.keySize = BigIntegers.intValueExact(this.pbeParams.getKeyLength()) * 8;
            } else if (this.salt == null) {
                if (this.saltLength < 0) {
                    this.saltLength = createMac.getMacLength();
                }
                byte[] bArr = new byte[this.saltLength];
                this.salt = bArr;
                this.random.nextBytes(bArr);
            }
            final SecretKey generateSecret = this.helper.createSecretKeyFactory(StubApp.getString2("29643")).generateSecret(new PBKDF2KeySpec(cArr, this.salt, this.iterationCount, this.keySize, this.prf));
            createMac.init(generateSecret);
            return new MacCalculator() { // from class: org.bouncycastle.pkcs.jcajce.JcePBMac1CalculatorBuilder.1
                @Override // org.bouncycastle.operator.MacCalculator
                public AlgorithmIdentifier getAlgorithmIdentifier() {
                    return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBMAC1, new PBMAC1Params(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBKDF2Params(JcePBMac1CalculatorBuilder.this.salt, JcePBMac1CalculatorBuilder.this.iterationCount, (JcePBMac1CalculatorBuilder.this.keySize + 7) / 8, JcePBMac1CalculatorBuilder.this.prf)), JcePBMac1CalculatorBuilder.this.macAlgorithm));
                }

                @Override // org.bouncycastle.operator.MacCalculator
                public GenericKey getKey() {
                    return new GenericKey(getAlgorithmIdentifier(), generateSecret.getEncoded());
                }

                @Override // org.bouncycastle.operator.MacCalculator
                public byte[] getMac() {
                    return createMac.doFinal();
                }

                @Override // org.bouncycastle.operator.MacCalculator
                public OutputStream getOutputStream() {
                    return new MacOutputStream(createMac);
                }
            };
        } catch (Exception e10) {
            throw new OperatorCreationException(u.r(e10, new StringBuilder(StubApp.getString2(33903))), e10);
        }
    }

    public JcePBMac1CalculatorBuilder setHelper(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
        return this;
    }

    public JcePBMac1CalculatorBuilder setIterationCount(int i3) {
        this.iterationCount = i3;
        return this;
    }

    public JcePBMac1CalculatorBuilder setPrf(AlgorithmIdentifier algorithmIdentifier) {
        this.prf = algorithmIdentifier;
        return this;
    }

    public JcePBMac1CalculatorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePBMac1CalculatorBuilder setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JcePBMac1CalculatorBuilder setSalt(byte[] bArr) {
        this.salt = bArr;
        return this;
    }

    public JcePBMac1CalculatorBuilder setSaltLength(int i3) {
        this.saltLength = i3;
        return this;
    }

    public JcePBMac1CalculatorBuilder(String str, int i3, MacAlgorithmIdentifierFinder macAlgorithmIdentifierFinder) {
        this.helper = new DefaultJcaJceHelper();
        this.saltLength = -1;
        this.iterationCount = 8192;
        this.pbeParams = null;
        this.prf = PRF_SHA256;
        this.salt = null;
        this.macAlgorithm = macAlgorithmIdentifierFinder.find(str);
        this.keySize = i3;
    }

    public JcePBMac1CalculatorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    public JcePBMac1CalculatorBuilder(PBMAC1Params pBMAC1Params) {
        this.helper = new DefaultJcaJceHelper();
        this.saltLength = -1;
        this.iterationCount = 8192;
        this.pbeParams = null;
        this.prf = PRF_SHA256;
        this.salt = null;
        this.macAlgorithm = pBMAC1Params.getMessageAuthScheme();
        this.pbeParams = PBKDF2Params.getInstance(pBMAC1Params.getKeyDerivationFunc().getParameters());
    }
}
