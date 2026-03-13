package org.bouncycastle.operator.jcajce;

import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyUnwrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceAsymmetricKeyUnwrapper extends AsymmetricKeyUnwrapper {
    private Map extraMappings;
    private OperatorHelper helper;
    private PrivateKey privKey;
    private boolean unwrappedKeyMustBeEncodable;

    public JceAsymmetricKeyUnwrapper(AlgorithmIdentifier algorithmIdentifier, PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.privKey = privateKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r4.length == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // org.bouncycastle.operator.KeyUnwrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier r6, byte[] r7) throws org.bouncycastle.operator.OperatorException {
        /*
            r5 = this;
            org.bouncycastle.operator.jcajce.OperatorHelper r0 = r5.helper     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r1 = r5.getAlgorithmIdentifier()     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r1.getAlgorithm()     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            java.util.Map r2 = r5.extraMappings     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            javax.crypto.Cipher r0 = r0.createAsymmetricWrapper(r1, r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            org.bouncycastle.operator.jcajce.OperatorHelper r1 = r5.helper     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r2 = r5.getAlgorithmIdentifier()     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            java.security.AlgorithmParameters r1 = r1.createAlgorithmParameters(r2)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L24
            java.security.PrivateKey r4 = r5.privKey     // Catch: java.lang.Throwable -> L47
            r0.init(r2, r4, r1)     // Catch: java.lang.Throwable -> L47
            goto L29
        L24:
            java.security.PrivateKey r4 = r5.privKey     // Catch: java.lang.Throwable -> L47
            r0.init(r2, r4)     // Catch: java.lang.Throwable -> L47
        L29:
            org.bouncycastle.operator.jcajce.OperatorHelper r2 = r5.helper     // Catch: java.lang.Throwable -> L47
            org.bouncycastle.asn1.ASN1ObjectIdentifier r4 = r6.getAlgorithm()     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = r2.getKeyAlgorithmName(r4)     // Catch: java.lang.Throwable -> L47
            r4 = 3
            java.security.Key r2 = r0.unwrap(r7, r2, r4)     // Catch: java.lang.Throwable -> L47
            boolean r4 = r5.unwrappedKeyMustBeEncodable     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L46
            byte[] r4 = r2.getEncoded()
            if (r4 == 0) goto L47
            int r4 = r4.length
            if (r4 != 0) goto L46
            goto L47
        L46:
            r3 = r2
        L47:
            if (r3 != 0) goto L70
            r2 = 2
            if (r1 == 0) goto L5a
            java.security.PrivateKey r3 = r5.privKey     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            r0.init(r2, r3, r1)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            goto L5f
        L52:
            r6 = move-exception
            goto L76
        L54:
            r6 = move-exception
            goto L93
        L56:
            r6 = move-exception
            goto Lb0
        L58:
            r6 = move-exception
            goto Lcd
        L5a:
            java.security.PrivateKey r1 = r5.privKey     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            r0.init(r2, r1)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
        L5f:
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            byte[] r7 = r0.doFinal(r7)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r6.getAlgorithm()     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            java.lang.String r0 = r0.getId()     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            r3.<init>(r7, r0)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
        L70:
            org.bouncycastle.operator.jcajce.JceGenericKey r7 = new org.bouncycastle.operator.jcajce.JceGenericKey     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            r7.<init>(r6, r3)     // Catch: java.security.InvalidAlgorithmParameterException -> L52 javax.crypto.BadPaddingException -> L54 javax.crypto.IllegalBlockSizeException -> L56 java.security.InvalidKeyException -> L58
            return r7
        L76:
            org.bouncycastle.operator.OperatorException r7 = new org.bouncycastle.operator.OperatorException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33857(0x8441, float:4.7444E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        L93:
            org.bouncycastle.operator.OperatorException r7 = new org.bouncycastle.operator.OperatorException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33858(0x8442, float:4.7445E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        Lb0:
            org.bouncycastle.operator.OperatorException r7 = new org.bouncycastle.operator.OperatorException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33859(0x8443, float:4.7447E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        Lcd:
            org.bouncycastle.operator.OperatorException r7 = new org.bouncycastle.operator.OperatorException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 33860(0x8444, float:4.7448E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            java.lang.String r1 = r6.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper.generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier, byte[]):org.bouncycastle.operator.GenericKey");
    }

    public JceAsymmetricKeyUnwrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyUnwrapper setMustProduceEncodableUnwrappedKey(boolean z2) {
        this.unwrappedKeyMustBeEncodable = z2;
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyUnwrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
