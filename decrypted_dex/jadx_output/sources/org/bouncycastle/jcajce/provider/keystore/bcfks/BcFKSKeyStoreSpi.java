package org.bouncycastle.jcajce.provider.keystore.bcfks;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.EncryptedObjectStoreData;
import org.bouncycastle.asn1.bc.EncryptedPrivateKeyData;
import org.bouncycastle.asn1.bc.EncryptedSecretKeyData;
import org.bouncycastle.asn1.bc.ObjectData;
import org.bouncycastle.asn1.bc.ObjectDataSequence;
import org.bouncycastle.asn1.bc.ObjectStore;
import org.bouncycastle.asn1.bc.ObjectStoreData;
import org.bouncycastle.asn1.bc.ObjectStoreIntegrityCheck;
import org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.bouncycastle.asn1.bc.SecretKeyData;
import org.bouncycastle.asn1.bc.SignatureCheck;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.misc.ScryptParams;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.nsri.NSRIObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.generators.SCrypt;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.PBKDF2Config;
import org.bouncycastle.crypto.util.PBKDFConfig;
import org.bouncycastle.crypto.util.ScryptConfig;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import org.bouncycastle.jcajce.BCFKSStoreParameter;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {
    private static final BigInteger CERTIFICATE;
    private static final BigInteger PRIVATE_KEY;
    private static final BigInteger PROTECTED_PRIVATE_KEY;
    private static final BigInteger PROTECTED_SECRET_KEY;
    private static final BigInteger SECRET_KEY;
    private static final Map<String, ASN1ObjectIdentifier> oidMap;
    private static final Map<ASN1ObjectIdentifier, String> publicAlgMap;
    private Date creationDate;
    private final JcaJceHelper helper;
    private AlgorithmIdentifier hmacAlgorithm;
    private KeyDerivationFunc hmacPkbdAlgorithm;
    private Date lastModifiedDate;
    private AlgorithmIdentifier signatureAlgorithm;
    private BCFKSLoadStoreParameter.CertChainValidator validator;
    private PublicKey verificationKey;
    private final Map<String, ObjectData> entries = new HashMap();
    private final Map<String, PrivateKey> privateKeyCache = new HashMap();
    private ASN1ObjectIdentifier storeEncryptionAlgorithm = NISTObjectIdentifiers.id_aes256_CCM;

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefCompat extends AdaptingKeyStoreSpi {
        public DefCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new DefaultJcaJceHelper()));
        }
    }

    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefSharedCompat extends AdaptingKeyStoreSpi {
        public DefSharedCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new DefaultJcaJceHelper()));
        }
    }

    public static class ExtKeyStoreException extends KeyStoreException {
        private final Throwable cause;

        public ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers {
        private final Map<String, byte[]> cache;
        private final byte[] seedKey;

        public SharedKeyStoreSpi(JcaJceHelper jcaJceHelper) {
            super(jcaJceHelper);
            try {
                byte[] bArr = new byte[32];
                this.seedKey = bArr;
                jcaJceHelper.createSecureRandom(StubApp.getString2("208")).nextBytes(bArr);
                this.cache = new HashMap();
            } catch (GeneralSecurityException e10) {
                throw new IllegalArgumentException(StubApp.getString2(31352) + e10.toString());
            }
        }

        private byte[] calculateMac(String str, char[] cArr) throws NoSuchAlgorithmException, InvalidKeyException {
            return SCrypt.generate(cArr != null ? Arrays.concatenate(Strings.toUTF8ByteArray(cArr), Strings.toUTF8ByteArray(str)) : Arrays.concatenate(this.seedKey, Strings.toUTF8ByteArray(str)), this.seedKey, 16384, 8, 1, 32);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException(StubApp.getString2(31353));
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            String string2 = StubApp.getString2(31354);
            try {
                byte[] calculateMac = calculateMac(str, cArr);
                if (this.cache.containsKey(str) && !Arrays.constantTimeAreEqual(this.cache.get(str), calculateMac)) {
                    throw new UnrecoverableKeyException(a.k(string2, str, StubApp.getString2(74)));
                }
                Key engineGetKey = super.engineGetKey(str, cArr);
                if (engineGetKey != null && !this.cache.containsKey(str)) {
                    this.cache.put(str, calculateMac);
                }
                return engineGetKey;
            } catch (InvalidKeyException e10) {
                StringBuilder l9 = b.l(string2, str, StubApp.getString2(3055));
                l9.append(e10.getMessage());
                throw new UnrecoverableKeyException(l9.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException(StubApp.getString2(31355));
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException(StubApp.getString2(31355));
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException(StubApp.getString2(31355));
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdCompat extends AdaptingKeyStoreSpi {
        public StdCompat() {
            super(new DefaultJcaJceHelper(), new BcFKSKeyStoreSpi(new BCJcaJceHelper()));
        }
    }

    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
            super(new BCJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
            super.engineDeleteEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
            return super.engineGetCertificate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
            return super.engineGetCertificateAlias(certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
            return super.engineGetCertificateChain(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
            return super.engineGetCreationDate(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
            return super.engineGetKey(str, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
            return super.engineIsCertificateEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
            return super.engineIsKeyEntry(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdSharedCompat extends AdaptingKeyStoreSpi {
        public StdSharedCompat() {
            super(new BCJcaJceHelper(), new BcFKSKeyStoreSpi(new BCJcaJceHelper()));
        }
    }

    static {
        HashMap hashMap = new HashMap();
        oidMap = hashMap;
        HashMap hashMap2 = new HashMap();
        publicAlgMap = hashMap2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.desEDE;
        hashMap.put(StubApp.getString2(28051), aSN1ObjectIdentifier);
        hashMap.put(StubApp.getString2(31356), aSN1ObjectIdentifier);
        hashMap.put(StubApp.getString2(29264), aSN1ObjectIdentifier);
        hashMap.put(StubApp.getString2(28055), PKCSObjectIdentifiers.id_hmacWithSHA1);
        hashMap.put(StubApp.getString2(28056), PKCSObjectIdentifiers.id_hmacWithSHA224);
        hashMap.put(StubApp.getString2(28057), PKCSObjectIdentifiers.id_hmacWithSHA256);
        hashMap.put(StubApp.getString2(28058), PKCSObjectIdentifiers.id_hmacWithSHA384);
        hashMap.put(StubApp.getString2(28059), PKCSObjectIdentifiers.id_hmacWithSHA512);
        hashMap.put(StubApp.getString2(28259), KISAObjectIdentifiers.id_seedCBC);
        hashMap.put(StubApp.getString2(31357), NTTObjectIdentifiers.id_camellia128_cbc);
        hashMap.put(StubApp.getString2(31358), NTTObjectIdentifiers.id_camellia192_cbc);
        hashMap.put(StubApp.getString2(31359), NTTObjectIdentifiers.id_camellia256_cbc);
        hashMap.put(StubApp.getString2(31360), NSRIObjectIdentifiers.id_aria128_cbc);
        hashMap.put(StubApp.getString2(31361), NSRIObjectIdentifiers.id_aria192_cbc);
        hashMap.put(StubApp.getString2(31362), NSRIObjectIdentifiers.id_aria256_cbc);
        hashMap2.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(24659));
        hashMap2.put(X9ObjectIdentifiers.id_ecPublicKey, StubApp.getString2(4707));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.elGamalAlgorithm;
        String string2 = StubApp.getString2(28348);
        hashMap2.put(aSN1ObjectIdentifier2, string2);
        hashMap2.put(PKCSObjectIdentifiers.dhKeyAgreement, string2);
        hashMap2.put(X9ObjectIdentifiers.id_dsa, StubApp.getString2(28060));
        CERTIFICATE = BigInteger.valueOf(0L);
        PRIVATE_KEY = BigInteger.valueOf(1L);
        SECRET_KEY = BigInteger.valueOf(2L);
        PROTECTED_PRIVATE_KEY = BigInteger.valueOf(3L);
        PROTECTED_SECRET_KEY = BigInteger.valueOf(4L);
    }

    public BcFKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.helper = jcaJceHelper;
    }

    private byte[] calculateMac(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, KeyDerivationFunc keyDerivationFunc, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        String id = algorithmIdentifier.getAlgorithm().getId();
        Mac createMac = this.helper.createMac(id);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            createMac.init(new SecretKeySpec(generateKey(keyDerivationFunc, "INTEGRITY_CHECK", cArr, -1), id));
            return createMac.doFinal(bArr);
        } catch (InvalidKeyException e10) {
            throw new IOException(StubApp.getString2(31363) + e10.getMessage());
        }
    }

    private Cipher createCipher(String str, byte[] bArr) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, NoSuchProviderException {
        Cipher createCipher = this.helper.createCipher(str);
        createCipher.init(1, new SecretKeySpec(bArr, StubApp.getString2(461)));
        return createCipher;
    }

    private EncryptedPrivateKeyData createPrivateKeySequence(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Certificate[] certificateArr) throws CertificateEncodingException {
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[certificateArr.length];
        for (int i3 = 0; i3 != certificateArr.length; i3++) {
            certificateArr2[i3] = org.bouncycastle.asn1.x509.Certificate.getInstance(certificateArr[i3].getEncoded());
        }
        return new EncryptedPrivateKeyData(encryptedPrivateKeyInfo, certificateArr2);
    }

    private Certificate decodeCertificate(Object obj) {
        JcaJceHelper jcaJceHelper = this.helper;
        String string2 = StubApp.getString2(19963);
        if (jcaJceHelper != null) {
            try {
                return jcaJceHelper.createCertificateFactory(string2).generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance(string2).generateCertificate(new ByteArrayInputStream(org.bouncycastle.asn1.x509.Certificate.getInstance(obj).getEncoded()));
        } catch (Exception unused2) {
            return null;
        }
    }

    private byte[] decryptData(String str, AlgorithmIdentifier algorithmIdentifier, char[] cArr, byte[] bArr) throws IOException {
        Cipher createCipher;
        AlgorithmParameters algorithmParameters;
        if (!algorithmIdentifier.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
            throw new IOException(StubApp.getString2(31367));
        }
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        EncryptionScheme encryptionScheme = pBES2Parameters.getEncryptionScheme();
        try {
            if (encryptionScheme.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CCM)) {
                createCipher = this.helper.createCipher(StubApp.getString2("31364"));
                algorithmParameters = this.helper.createAlgorithmParameters(StubApp.getString2("29619"));
                algorithmParameters.init(CCMParameters.getInstance(encryptionScheme.getParameters()).getEncoded());
            } else {
                if (!encryptionScheme.getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_wrap_pad)) {
                    throw new IOException(StubApp.getString2("31366"));
                }
                createCipher = this.helper.createCipher(StubApp.getString2("31365"));
                algorithmParameters = null;
            }
            KeyDerivationFunc keyDerivationFunc = pBES2Parameters.getKeyDerivationFunc();
            if (cArr == null) {
                cArr = new char[0];
            }
            createCipher.init(2, new SecretKeySpec(generateKey(keyDerivationFunc, str, cArr, 32), StubApp.getString2("461")), algorithmParameters);
            return createCipher.doFinal(bArr);
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IOException(e11.toString());
        }
    }

    private Date extractCreationDate(ObjectData objectData, Date date) {
        try {
            return objectData.getCreationDate().getDate();
        } catch (ParseException unused) {
            return date;
        }
    }

    private byte[] generateKey(KeyDerivationFunc keyDerivationFunc, String str, char[] cArr, int i3) throws IOException {
        byte[] PKCS12PasswordToBytes = PBEParametersGenerator.PKCS12PasswordToBytes(cArr);
        byte[] PKCS12PasswordToBytes2 = PBEParametersGenerator.PKCS12PasswordToBytes(str.toCharArray());
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
            if (scryptParams.getKeyLength() != null) {
                i3 = scryptParams.getKeyLength().intValue();
            } else if (i3 == -1) {
                throw new IOException(StubApp.getString2(31368));
            }
            return SCrypt.generate(Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), scryptParams.getSalt(), scryptParams.getCostParameter().intValue(), scryptParams.getBlockSize().intValue(), scryptParams.getBlockSize().intValue(), i3);
        }
        if (!keyDerivationFunc.getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBKDF2)) {
            throw new IOException(StubApp.getString2(31371));
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        if (pBKDF2Params.getKeyLength() != null) {
            i3 = pBKDF2Params.getKeyLength().intValue();
        } else if (i3 == -1) {
            throw new IOException(StubApp.getString2(31370));
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((ASN1Primitive) PKCSObjectIdentifiers.id_hmacWithSHA512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA512Digest());
            pKCS5S2ParametersGenerator.init(Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(i3 * 8)).getKey();
        }
        if (pBKDF2Params.getPrf().getAlgorithm().equals((ASN1Primitive) NISTObjectIdentifiers.id_hmacWithSHA3_512)) {
            PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator2 = new PKCS5S2ParametersGenerator(new SHA3Digest(512));
            pKCS5S2ParametersGenerator2.init(Arrays.concatenate(PKCS12PasswordToBytes, PKCS12PasswordToBytes2), pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue());
            return ((KeyParameter) pKCS5S2ParametersGenerator2.generateDerivedParameters(i3 * 8)).getKey();
        }
        throw new IOException(StubApp.getString2(31369) + pBKDF2Params.getPrf().getAlgorithm());
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3) {
        byte[] bArr = new byte[64];
        getDefaultSecureRandom().nextBytes(bArr);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_PBKDF2;
        if (aSN1ObjectIdentifier2.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return new KeyDerivationFunc(aSN1ObjectIdentifier2, new PBKDF2Params(bArr, 51200, i3, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE)));
        }
        throw new IllegalStateException(org.bouncycastle.asn1.a.e(StubApp.getString2(31372), aSN1ObjectIdentifier));
    }

    private AlgorithmIdentifier generateSignatureAlgId(Key key, BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof ECKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new AlgorithmIdentifier(X9ObjectIdentifiers.ecdsa_with_SHA512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_ecdsa_with_sha3_512);
            }
        }
        if (key instanceof DSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.dsa_with_sha512);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_dsa_with_sha3_512);
            }
        }
        if (key instanceof RSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new AlgorithmIdentifier(PKCSObjectIdentifiers.sha512WithRSAEncryption, DERNull.INSTANCE);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new AlgorithmIdentifier(NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512, DERNull.INSTANCE);
            }
        }
        throw new IOException(StubApp.getString2(31373));
    }

    private SecureRandom getDefaultSecureRandom() {
        return CryptoServicesRegistrar.getSecureRandom();
    }

    private EncryptedObjectStoreData getEncryptedObjectStoreData(AlgorithmIdentifier algorithmIdentifier, char[] cArr) throws IOException, NoSuchAlgorithmException {
        ObjectData[] objectDataArr = (ObjectData[]) this.entries.values().toArray(new ObjectData[this.entries.size()]);
        KeyDerivationFunc generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(this.hmacPkbdAlgorithm, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, StubApp.getString2(31374), cArr, 32);
        ObjectStoreData objectStoreData = new ObjectStoreData(algorithmIdentifier, this.creationDate, this.lastModifiedDate, new ObjectDataSequence(objectDataArr), null);
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = this.storeEncryptionAlgorithm;
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
            if (!aSN1ObjectIdentifier.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                return new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(StubApp.getString2("31365"), generateKey).doFinal(objectStoreData.getEncoded()));
            }
            Cipher createCipher = createCipher(StubApp.getString2("31364"), generateKey);
            return new EncryptedObjectStoreData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(createCipher.getParameters().getEncoded())))), createCipher.doFinal(objectStoreData.getEncoded()));
        } catch (InvalidKeyException e10) {
            throw new IOException(e10.toString());
        } catch (NoSuchProviderException e11) {
            throw new IOException(e11.toString());
        } catch (BadPaddingException e12) {
            throw new IOException(e12.toString());
        } catch (IllegalBlockSizeException e13) {
            throw new IOException(e13.toString());
        } catch (NoSuchPaddingException e14) {
            throw new NoSuchAlgorithmException(e14.toString());
        }
    }

    private static String getPublicKeyAlg(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = publicAlgMap.get(aSN1ObjectIdentifier);
        return str != null ? str : aSN1ObjectIdentifier.getId();
    }

    private boolean isSimilarHmacPbkd(PBKDFConfig pBKDFConfig, KeyDerivationFunc keyDerivationFunc) {
        if (!pBKDFConfig.getAlgorithm().equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            return false;
        }
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm())) {
            if (!(pBKDFConfig instanceof ScryptConfig)) {
                return false;
            }
            ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfig;
            ScryptParams scryptParams = ScryptParams.getInstance(keyDerivationFunc.getParameters());
            return scryptConfig.getSaltLength() == scryptParams.getSalt().length && scryptConfig.getBlockSize() == scryptParams.getBlockSize().intValue() && scryptConfig.getCostParameter() == scryptParams.getCostParameter().intValue() && scryptConfig.getParallelizationParameter() == scryptParams.getParallelizationParameter().intValue();
        }
        if (!(pBKDFConfig instanceof PBKDF2Config)) {
            return false;
        }
        PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfig;
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(keyDerivationFunc.getParameters());
        return pBKDF2Config.getSaltLength() == pBKDF2Params.getSalt().length && pBKDF2Config.getIterationCount() == pBKDF2Params.getIterationCount().intValue();
    }

    private void verifyMac(byte[] bArr, PbkdMacIntegrityCheck pbkdMacIntegrityCheck, char[] cArr) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        if (!Arrays.constantTimeAreEqual(calculateMac(bArr, pbkdMacIntegrityCheck.getMacAlgorithm(), pbkdMacIntegrityCheck.getPbkdAlgorithm(), cArr), pbkdMacIntegrityCheck.getMac())) {
            throw new IOException(StubApp.getString2(31375));
        }
    }

    private void verifySig(ASN1Encodable aSN1Encodable, SignatureCheck signatureCheck, PublicKey publicKey) throws GeneralSecurityException, IOException {
        Signature createSignature = this.helper.createSignature(signatureCheck.getSignatureAlgorithm().getAlgorithm().getId());
        createSignature.initVerify(publicKey);
        createSignature.update(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)));
        if (!createSignature.verify(signatureCheck.getSignature().getOctets())) {
            throw new IOException(StubApp.getString2(31376));
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.entries.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str != null) {
            return this.entries.containsKey(str);
        }
        throw new NullPointerException(StubApp.getString2(31377));
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) throws KeyStoreException {
        if (this.entries.get(str) == null) {
            return;
        }
        this.privateKeyCache.remove(str);
        this.entries.remove(str);
        this.lastModifiedDate = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            return decodeCertificate(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0]);
        }
        if (objectData.getType().equals(CERTIFICATE)) {
            return decodeCertificate(objectData.getData());
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.entries.keySet()) {
                ObjectData objectData = this.entries.get(str);
                if (objectData.getType().equals(CERTIFICATE)) {
                    if (Arrays.areEqual(objectData.getData(), encoded)) {
                    }
                } else if (objectData.getType().equals(PRIVATE_KEY) || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
                    try {
                        if (Arrays.areEqual(EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain()[0].toASN1Primitive().getEncoded(), encoded)) {
                        }
                    } catch (IOException unused) {
                        continue;
                    }
                }
                return str;
            }
        } catch (CertificateEncodingException unused2) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        if (!objectData.getType().equals(PRIVATE_KEY) && !objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            return null;
        }
        org.bouncycastle.asn1.x509.Certificate[] certificateChain = EncryptedPrivateKeyData.getInstance(objectData.getData()).getCertificateChain();
        int length = certificateChain.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i3 = 0; i3 != length; i3++) {
            x509CertificateArr[i3] = decodeCertificate(certificateChain[i3]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        try {
            return objectData.getLastModifiedDate().getDate();
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return null;
        }
        boolean equals = objectData.getType().equals(PRIVATE_KEY);
        String string2 = StubApp.getString2(3055);
        if (equals || objectData.getType().equals(PROTECTED_PRIVATE_KEY)) {
            PrivateKey privateKey = this.privateKeyCache.get(str);
            if (privateKey != null) {
                return privateKey;
            }
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(EncryptedPrivateKeyData.getInstance(objectData.getData()).getEncryptedPrivateKeyInfo());
            try {
                PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(decryptData(StubApp.getString2("31381"), encryptedPrivateKeyInfo.getEncryptionAlgorithm(), cArr, encryptedPrivateKeyInfo.getEncryptedData()));
                PrivateKey generatePrivate = this.helper.createKeyFactory(getPublicKeyAlg(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())).generatePrivate(new PKCS8EncodedKeySpec(privateKeyInfo.getEncoded()));
                this.privateKeyCache.put(str, generatePrivate);
                return generatePrivate;
            } catch (Exception e10) {
                throw new UnrecoverableKeyException(u.r(e10, b.l(StubApp.getString2(31382), str, string2)));
            }
        }
        boolean equals2 = objectData.getType().equals(SECRET_KEY);
        String string22 = StubApp.getString2(31378);
        if (!equals2 && !objectData.getType().equals(PROTECTED_SECRET_KEY)) {
            throw new UnrecoverableKeyException(a.k(string22, str, StubApp.getString2(31379)));
        }
        EncryptedSecretKeyData encryptedSecretKeyData = EncryptedSecretKeyData.getInstance(objectData.getData());
        try {
            SecretKeyData secretKeyData = SecretKeyData.getInstance(decryptData(StubApp.getString2("31380"), encryptedSecretKeyData.getKeyEncryptionAlgorithm(), cArr, encryptedSecretKeyData.getEncryptedKeyData()));
            return this.helper.createSecretKeyFactory(secretKeyData.getKeyAlgorithm().getId()).generateSecret(new SecretKeySpec(secretKeyData.getKeyBytes(), secretKeyData.getKeyAlgorithm().getId()));
        } catch (Exception e11) {
            throw new UnrecoverableKeyException(u.r(e11, b.l(string22, str, string2)));
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData != null) {
            return objectData.getType().equals(CERTIFICATE);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        ObjectData objectData = this.entries.get(str);
        if (objectData == null) {
            return false;
        }
        BigInteger type = objectData.getType();
        return type.equals(PRIVATE_KEY) || type.equals(SECRET_KEY) || type.equals(PROTECTED_PRIVATE_KEY) || type.equals(PROTECTED_SECRET_KEY);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        AlgorithmIdentifier signatureAlgorithm;
        ASN1Encodable storeData;
        PublicKey publicKey;
        ObjectStoreData objectStoreData;
        this.entries.clear();
        this.privateKeyCache.clear();
        this.creationDate = null;
        this.lastModifiedDate = null;
        this.hmacAlgorithm = null;
        if (inputStream == null) {
            Date date = new Date();
            this.creationDate = date;
            this.lastModifiedDate = date;
            this.verificationKey = null;
            this.validator = null;
            this.hmacAlgorithm = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 64);
            return;
        }
        try {
            ObjectStore objectStore = ObjectStore.getInstance(new ASN1InputStream(inputStream).readObject());
            ObjectStoreIntegrityCheck integrityCheck = objectStore.getIntegrityCheck();
            if (integrityCheck.getType() == 0) {
                PbkdMacIntegrityCheck pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(integrityCheck.getIntegrityCheck());
                this.hmacAlgorithm = pbkdMacIntegrityCheck.getMacAlgorithm();
                this.hmacPkbdAlgorithm = pbkdMacIntegrityCheck.getPbkdAlgorithm();
                signatureAlgorithm = this.hmacAlgorithm;
                try {
                    verifyMac(objectStore.getStoreData().toASN1Primitive().getEncoded(), pbkdMacIntegrityCheck, cArr);
                } catch (NoSuchProviderException e10) {
                    throw new IOException(e10.getMessage());
                }
            } else {
                if (integrityCheck.getType() != 1) {
                    throw new IOException(StubApp.getString2(31388));
                }
                SignatureCheck signatureCheck = SignatureCheck.getInstance(integrityCheck.getIntegrityCheck());
                signatureAlgorithm = signatureCheck.getSignatureAlgorithm();
                try {
                    org.bouncycastle.asn1.x509.Certificate[] certificates = signatureCheck.getCertificates();
                    if (this.validator == null) {
                        storeData = objectStore.getStoreData();
                        publicKey = this.verificationKey;
                    } else {
                        if (certificates == null) {
                            throw new IOException(StubApp.getString2("31384"));
                        }
                        CertificateFactory createCertificateFactory = this.helper.createCertificateFactory(StubApp.getString2("19963"));
                        int length = certificates.length;
                        X509Certificate[] x509CertificateArr = new X509Certificate[length];
                        for (int i3 = 0; i3 != length; i3++) {
                            x509CertificateArr[i3] = (X509Certificate) createCertificateFactory.generateCertificate(new ByteArrayInputStream(certificates[i3].getEncoded()));
                        }
                        if (!this.validator.isValid(x509CertificateArr)) {
                            throw new IOException(StubApp.getString2("31383"));
                        }
                        storeData = objectStore.getStoreData();
                        publicKey = x509CertificateArr[0].getPublicKey();
                    }
                    verifySig(storeData, signatureCheck, publicKey);
                } catch (GeneralSecurityException e11) {
                    throw new IOException(org.bouncycastle.asn1.a.h(e11, new StringBuilder(StubApp.getString2(31387))), e11);
                }
            }
            ASN1Encodable storeData2 = objectStore.getStoreData();
            if (storeData2 instanceof EncryptedObjectStoreData) {
                EncryptedObjectStoreData encryptedObjectStoreData = (EncryptedObjectStoreData) storeData2;
                objectStoreData = ObjectStoreData.getInstance(decryptData(StubApp.getString2(31374), encryptedObjectStoreData.getEncryptionAlgorithm(), cArr, encryptedObjectStoreData.getEncryptedContent().getOctets()));
            } else {
                objectStoreData = ObjectStoreData.getInstance(storeData2);
            }
            try {
                this.creationDate = objectStoreData.getCreationDate().getDate();
                this.lastModifiedDate = objectStoreData.getLastModifiedDate().getDate();
                if (!objectStoreData.getIntegrityAlgorithm().equals(signatureAlgorithm)) {
                    throw new IOException(StubApp.getString2(31385));
                }
                Iterator<ASN1Encodable> it = objectStoreData.getObjectDataSequence().iterator();
                while (it.hasNext()) {
                    ObjectData objectData = ObjectData.getInstance(it.next());
                    this.entries.put(objectData.getIdentifier(), objectData);
                }
            } catch (ParseException unused) {
                throw new IOException(StubApp.getString2(31386));
            }
        } catch (Exception e12) {
            throw new IOException(e12.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date date;
        ObjectData objectData = this.entries.get(str);
        Date date2 = new Date();
        if (objectData == null) {
            date = date2;
        } else {
            if (!objectData.getType().equals(CERTIFICATE)) {
                throw new KeyStoreException(a.j(StubApp.getString2(31391), str));
            }
            date = extractCreationDate(objectData, date2);
        }
        try {
            this.entries.put(str, new ObjectData(CERTIFICATE, str, date, date2, certificate.getEncoded(), null));
            this.lastModifiedDate = date2;
        } catch (CertificateEncodingException e10) {
            throw new ExtKeyStoreException(StubApp.getString2(31392) + e10.getMessage(), e10);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        SecretKeyData secretKeyData;
        EncryptedSecretKeyData encryptedSecretKeyData;
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo;
        String string2 = StubApp.getString2(31393);
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date extractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        this.privateKeyCache.remove(str);
        boolean z2 = key instanceof PrivateKey;
        String string22 = StubApp.getString2(31394);
        String string23 = StubApp.getString2(31365);
        String string24 = StubApp.getString2(31364);
        if (z2) {
            if (certificateArr == null) {
                throw new KeyStoreException(StubApp.getString2(31395));
            }
            try {
                byte[] encoded = key.getEncoded();
                KeyDerivationFunc generatePkbdAlgorithmIdentifier = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey = generateKey(generatePkbdAlgorithmIdentifier, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = this.storeEncryptionAlgorithm;
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) aSN1ObjectIdentifier2)) {
                    Cipher createCipher = createCipher(string24, generateKey);
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(aSN1ObjectIdentifier2, CCMParameters.getInstance(createCipher.getParameters().getEncoded())))), createCipher.doFinal(encoded));
                } else {
                    encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(string23, generateKey).doFinal(encoded));
                }
                this.entries.put(str, new ObjectData(PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
            } catch (Exception e10) {
                throw new ExtKeyStoreException(org.bouncycastle.asn1.a.b(e10, new StringBuilder(string22)), e10);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException(StubApp.getString2(31398));
            }
            if (certificateArr != null) {
                throw new KeyStoreException(StubApp.getString2(31397));
            }
            try {
                byte[] encoded2 = key.getEncoded();
                KeyDerivationFunc generatePkbdAlgorithmIdentifier2 = generatePkbdAlgorithmIdentifier(PKCSObjectIdentifiers.id_PBKDF2, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] generateKey2 = generateKey(generatePkbdAlgorithmIdentifier2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String upperCase = Strings.toUpperCase(key.getAlgorithm());
                if (upperCase.indexOf(StubApp.getString2("461")) > -1) {
                    secretKeyData = new SecretKeyData(NISTObjectIdentifiers.aes, encoded2);
                } else {
                    Map<String, ASN1ObjectIdentifier> map = oidMap;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier3 = map.get(upperCase);
                    if (aSN1ObjectIdentifier3 != null) {
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier3, encoded2);
                    } else {
                        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = map.get(upperCase + StubApp.getString2("1") + (encoded2.length * 8));
                        if (aSN1ObjectIdentifier4 == null) {
                            throw new KeyStoreException(string2 + upperCase + StubApp.getString2("31396"));
                        }
                        secretKeyData = new SecretKeyData(aSN1ObjectIdentifier4, encoded2);
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier5 = this.storeEncryptionAlgorithm;
                ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_CCM;
                if (aSN1ObjectIdentifier5.equals((ASN1Primitive) aSN1ObjectIdentifier6)) {
                    Cipher createCipher2 = createCipher(string24, generateKey2);
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier2, new EncryptionScheme(aSN1ObjectIdentifier6, CCMParameters.getInstance(createCipher2.getParameters().getEncoded())))), createCipher2.doFinal(secretKeyData.getEncoded()));
                } else {
                    encryptedSecretKeyData = new EncryptedSecretKeyData(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(generatePkbdAlgorithmIdentifier2, new EncryptionScheme(NISTObjectIdentifiers.id_aes256_wrap_pad))), createCipher(string23, generateKey2).doFinal(secretKeyData.getEncoded()));
                }
                this.entries.put(str, new ObjectData(SECRET_KEY, str, extractCreationDate, date, encryptedSecretKeyData.getEncoded(), null));
            } catch (Exception e11) {
                throw new ExtKeyStoreException(org.bouncycastle.asn1.a.b(e11, new StringBuilder(string22)), e11);
            }
        }
        this.lastModifiedDate = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.entries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws IOException, NoSuchAlgorithmException, CertificateException {
        KeyDerivationFunc keyDerivationFunc;
        BigInteger keyLength;
        if (this.creationDate == null) {
            throw new IOException(StubApp.getString2(31402));
        }
        EncryptedObjectStoreData encryptedObjectStoreData = getEncryptedObjectStoreData(this.hmacAlgorithm, cArr);
        if (MiscObjectIdentifiers.id_scrypt.equals((ASN1Primitive) this.hmacPkbdAlgorithm.getAlgorithm())) {
            ScryptParams scryptParams = ScryptParams.getInstance(this.hmacPkbdAlgorithm.getParameters());
            keyDerivationFunc = this.hmacPkbdAlgorithm;
            keyLength = scryptParams.getKeyLength();
        } else {
            PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(this.hmacPkbdAlgorithm.getParameters());
            keyDerivationFunc = this.hmacPkbdAlgorithm;
            keyLength = pBKDF2Params.getKeyLength();
        }
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(keyDerivationFunc, keyLength.intValue());
        try {
            outputStream.write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(new PbkdMacIntegrityCheck(this.hmacAlgorithm, this.hmacPkbdAlgorithm, calculateMac(encryptedObjectStoreData.getEncoded(), this.hmacAlgorithm, this.hmacPkbdAlgorithm, cArr)))).getEncoded());
            outputStream.flush();
        } catch (NoSuchProviderException e10) {
            throw new IOException(StubApp.getString2(31401) + e10.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        SignatureCheck signatureCheck;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException(StubApp.getString2(31404));
        }
        if (loadStoreParameter instanceof BCFKSStoreParameter) {
            BCFKSStoreParameter bCFKSStoreParameter = (BCFKSStoreParameter) loadStoreParameter;
            char[] extractPassword = ParameterUtil.extractPassword(loadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSStoreParameter.getStorePBKDFConfig(), 64);
            engineStore(bCFKSStoreParameter.getOutputStream(), extractPassword);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException(StubApp.getString2(31390).concat(loadStoreParameter.getClass().getName()));
            }
            engineStore(((BCLoadStoreParameter) loadStoreParameter).getOutputStream(), ParameterUtil.extractPassword(loadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        if (bCFKSLoadStoreParameter.getStoreSignatureKey() == null) {
            char[] extractPassword2 = ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
            this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
            this.storeEncryptionAlgorithm = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
            this.hmacAlgorithm = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
            engineStore(bCFKSLoadStoreParameter.getOutputStream(), extractPassword2);
            return;
        }
        this.signatureAlgorithm = generateSignatureAlgId(bCFKSLoadStoreParameter.getStoreSignatureKey(), bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
        this.storeEncryptionAlgorithm = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.hmacAlgorithm = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
        EncryptedObjectStoreData encryptedObjectStoreData = getEncryptedObjectStoreData(this.signatureAlgorithm, ParameterUtil.extractPassword(bCFKSLoadStoreParameter));
        try {
            Signature createSignature = this.helper.createSignature(this.signatureAlgorithm.getAlgorithm().getId());
            createSignature.initSign((PrivateKey) bCFKSLoadStoreParameter.getStoreSignatureKey());
            createSignature.update(encryptedObjectStoreData.getEncoded());
            X509Certificate[] storeCertificates = bCFKSLoadStoreParameter.getStoreCertificates();
            if (storeCertificates != null) {
                int length = storeCertificates.length;
                org.bouncycastle.asn1.x509.Certificate[] certificateArr = new org.bouncycastle.asn1.x509.Certificate[length];
                for (int i3 = 0; i3 != length; i3++) {
                    certificateArr[i3] = org.bouncycastle.asn1.x509.Certificate.getInstance(storeCertificates[i3].getEncoded());
                }
                signatureCheck = new SignatureCheck(this.signatureAlgorithm, certificateArr, createSignature.sign());
            } else {
                signatureCheck = new SignatureCheck(this.signatureAlgorithm, createSignature.sign());
            }
            bCFKSLoadStoreParameter.getOutputStream().write(new ObjectStore(encryptedObjectStoreData, new ObjectStoreIntegrityCheck(signatureCheck)).getEncoded());
            bCFKSLoadStoreParameter.getOutputStream().flush();
        } catch (GeneralSecurityException e10) {
            throw new IOException(org.bouncycastle.asn1.a.h(e10, new StringBuilder(StubApp.getString2(31403))), e10);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException(StubApp.getString2(31390).concat(loadStoreParameter.getClass().getName()));
            }
            engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        char[] extractPassword = ParameterUtil.extractPassword(bCFKSLoadStoreParameter);
        this.hmacPkbdAlgorithm = generatePkbdAlgorithmIdentifier(bCFKSLoadStoreParameter.getStorePBKDFConfig(), 64);
        this.storeEncryptionAlgorithm = bCFKSLoadStoreParameter.getStoreEncryptionAlgorithm() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM ? NISTObjectIdentifiers.id_aes256_CCM : NISTObjectIdentifiers.id_aes256_wrap_pad;
        this.hmacAlgorithm = bCFKSLoadStoreParameter.getStoreMacAlgorithm() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512 ? new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, DERNull.INSTANCE) : new AlgorithmIdentifier(NISTObjectIdentifiers.id_hmacWithSHA3_512, DERNull.INSTANCE);
        this.verificationKey = (PublicKey) bCFKSLoadStoreParameter.getStoreSignatureKey();
        this.validator = bCFKSLoadStoreParameter.getCertChainValidator();
        this.signatureAlgorithm = generateSignatureAlgId(this.verificationKey, bCFKSLoadStoreParameter.getStoreSignatureAlgorithm());
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.storeEncryptionAlgorithm;
        InputStream inputStream = bCFKSLoadStoreParameter.getInputStream();
        engineLoad(inputStream, extractPassword);
        if (inputStream != null) {
            if (!isSimilarHmacPbkd(bCFKSLoadStoreParameter.getStorePBKDFConfig(), this.hmacPkbdAlgorithm) || !aSN1ObjectIdentifier.equals((ASN1Primitive) this.storeEncryptionAlgorithm)) {
                throw new IOException(StubApp.getString2(31389));
            }
        }
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(KeyDerivationFunc keyDerivationFunc, int i3) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        boolean equals = aSN1ObjectIdentifier.equals((ASN1Primitive) keyDerivationFunc.getAlgorithm());
        ASN1Encodable parameters = keyDerivationFunc.getParameters();
        if (equals) {
            ScryptParams scryptParams = ScryptParams.getInstance(parameters);
            byte[] bArr = new byte[scryptParams.getSalt().length];
            getDefaultSecureRandom().nextBytes(bArr);
            return new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptParams.getCostParameter(), scryptParams.getBlockSize(), scryptParams.getParallelizationParameter(), BigInteger.valueOf(i3)));
        }
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(parameters);
        byte[] bArr2 = new byte[pBKDF2Params.getSalt().length];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Params.getIterationCount().intValue(), i3, pBKDF2Params.getPrf()));
    }

    private KeyDerivationFunc generatePkbdAlgorithmIdentifier(PBKDFConfig pBKDFConfig, int i3) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_scrypt;
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) pBKDFConfig.getAlgorithm())) {
            ScryptConfig scryptConfig = (ScryptConfig) pBKDFConfig;
            byte[] bArr = new byte[scryptConfig.getSaltLength()];
            getDefaultSecureRandom().nextBytes(bArr);
            return new KeyDerivationFunc(aSN1ObjectIdentifier, new ScryptParams(bArr, scryptConfig.getCostParameter(), scryptConfig.getBlockSize(), scryptConfig.getParallelizationParameter(), i3));
        }
        PBKDF2Config pBKDF2Config = (PBKDF2Config) pBKDFConfig;
        byte[] bArr2 = new byte[pBKDF2Config.getSaltLength()];
        getDefaultSecureRandom().nextBytes(bArr2);
        return new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, new PBKDF2Params(bArr2, pBKDF2Config.getIterationCount(), i3, pBKDF2Config.getPRF()));
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
        Date date = new Date();
        ObjectData objectData = this.entries.get(str);
        Date extractCreationDate = objectData != null ? extractCreationDate(objectData, date) : date;
        String string2 = StubApp.getString2(31399);
        if (certificateArr != null) {
            try {
                EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(bArr);
                try {
                    this.privateKeyCache.remove(str);
                    this.entries.put(str, new ObjectData(PROTECTED_PRIVATE_KEY, str, extractCreationDate, date, createPrivateKeySequence(encryptedPrivateKeyInfo, certificateArr).getEncoded(), null));
                } catch (Exception e10) {
                    throw new ExtKeyStoreException(org.bouncycastle.asn1.a.b(e10, new StringBuilder(string2)), e10);
                }
            } catch (Exception e11) {
                throw new ExtKeyStoreException(StubApp.getString2(31400), e11);
            }
        } else {
            try {
                this.entries.put(str, new ObjectData(PROTECTED_SECRET_KEY, str, extractCreationDate, date, bArr, null));
            } catch (Exception e12) {
                throw new ExtKeyStoreException(org.bouncycastle.asn1.a.b(e12, new StringBuilder(string2)), e12);
            }
        }
        this.lastModifiedDate = date;
    }
}
