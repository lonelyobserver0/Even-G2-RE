package org.bouncycastle.cms;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface PasswordRecipient extends Recipient {
    public static final int PKCS5_SCHEME2 = 0;
    public static final int PKCS5_SCHEME2_UTF8 = 1;

    public static final class PRF {
        public static final PRF HMacSHA1;
        public static final PRF HMacSHA224;
        public static final PRF HMacSHA256;
        public static final PRF HMacSHA384;
        public static final PRF HMacSHA512;
        private final String hmac;
        final AlgorithmIdentifier prfAlgID;

        static {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA1;
            DERNull dERNull = DERNull.INSTANCE;
            HMacSHA1 = new PRF(StubApp.getString2(28208), new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
            HMacSHA224 = new PRF(StubApp.getString2(28209), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA224, dERNull));
            HMacSHA256 = new PRF(StubApp.getString2(28210), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, dERNull));
            HMacSHA384 = new PRF(StubApp.getString2(28211), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA384, dERNull));
            HMacSHA512 = new PRF(StubApp.getString2(28212), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA512, dERNull));
        }

        private PRF(String str, AlgorithmIdentifier algorithmIdentifier) {
            this.hmac = str;
            this.prfAlgID = algorithmIdentifier;
        }

        public AlgorithmIdentifier getAlgorithmID() {
            return this.prfAlgID;
        }

        public String getName() {
            return this.hmac;
        }
    }

    byte[] calculateDerivedKey(int i3, AlgorithmIdentifier algorithmIdentifier, int i10) throws CMSException;

    char[] getPassword();

    int getPasswordConversionScheme();

    RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws CMSException;
}
