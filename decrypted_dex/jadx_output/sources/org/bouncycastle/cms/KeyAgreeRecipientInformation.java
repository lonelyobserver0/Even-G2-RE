package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo;
import org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;
import org.bouncycastle.asn1.cms.RecipientEncryptedKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyAgreeRecipientInformation extends RecipientInformation {
    private ASN1OctetString encryptedKey;
    private KeyAgreeRecipientInfo info;

    public KeyAgreeRecipientInformation(KeyAgreeRecipientInfo keyAgreeRecipientInfo, RecipientId recipientId, ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable, AuthAttributesProvider authAttributesProvider) {
        super(keyAgreeRecipientInfo.getKeyEncryptionAlgorithm(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        this.info = keyAgreeRecipientInfo;
        this.rid = recipientId;
        this.encryptedKey = aSN1OctetString;
    }

    private SubjectPublicKeyInfo getPublicKeyInfoFromOriginatorId(OriginatorId originatorId) throws CMSException {
        throw new CMSException(StubApp.getString2(28206));
    }

    private SubjectPublicKeyInfo getPublicKeyInfoFromOriginatorPublicKey(AlgorithmIdentifier algorithmIdentifier, OriginatorPublicKey originatorPublicKey) {
        return new SubjectPublicKeyInfo(algorithmIdentifier, originatorPublicKey.getPublicKey().getBytes());
    }

    private SubjectPublicKeyInfo getSenderPublicKeyInfo(AlgorithmIdentifier algorithmIdentifier, OriginatorIdentifierOrKey originatorIdentifierOrKey) throws CMSException, IOException {
        OriginatorPublicKey originatorKey = originatorIdentifierOrKey.getOriginatorKey();
        if (originatorKey != null) {
            return getPublicKeyInfoFromOriginatorPublicKey(algorithmIdentifier, originatorKey);
        }
        IssuerAndSerialNumber issuerAndSerialNumber = originatorIdentifierOrKey.getIssuerAndSerialNumber();
        return getPublicKeyInfoFromOriginatorId(issuerAndSerialNumber != null ? new OriginatorId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue()) : new OriginatorId(originatorIdentifierOrKey.getSubjectKeyIdentifier().getKeyIdentifier()));
    }

    public static void readRecipientInfo(List list, KeyAgreeRecipientInfo keyAgreeRecipientInfo, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable, AuthAttributesProvider authAttributesProvider) {
        ASN1Sequence recipientEncryptedKeys = keyAgreeRecipientInfo.getRecipientEncryptedKeys();
        for (int i3 = 0; i3 < recipientEncryptedKeys.size(); i3++) {
            RecipientEncryptedKey recipientEncryptedKey = RecipientEncryptedKey.getInstance(recipientEncryptedKeys.getObjectAt(i3));
            KeyAgreeRecipientIdentifier identifier = recipientEncryptedKey.getIdentifier();
            IssuerAndSerialNumber issuerAndSerialNumber = identifier.getIssuerAndSerialNumber();
            list.add(new KeyAgreeRecipientInformation(keyAgreeRecipientInfo, issuerAndSerialNumber != null ? new KeyAgreeRecipientId(issuerAndSerialNumber.getName(), issuerAndSerialNumber.getSerialNumber().getValue()) : new KeyAgreeRecipientId(identifier.getRKeyID().getSubjectKeyIdentifier().getOctets()), recipientEncryptedKey.getEncryptedKey(), algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        }
    }

    public OriginatorIdentifierOrKey getOriginator() {
        return this.info.getOriginator();
    }

    @Override // org.bouncycastle.cms.RecipientInformation
    public RecipientOperator getRecipientOperator(Recipient recipient) throws CMSException, IOException {
        KeyAgreeRecipient keyAgreeRecipient = (KeyAgreeRecipient) recipient;
        return keyAgreeRecipient.getRecipientOperator(this.keyEncAlg, this.messageAlgorithm, getSenderPublicKeyInfo(keyAgreeRecipient.getPrivateKeyAlgorithmIdentifier(), this.info.getOriginator()), this.info.getUserKeyingMaterial(), this.encryptedKey.getOctets());
    }

    public byte[] getUserKeyingMaterial() {
        ASN1OctetString userKeyingMaterial = this.info.getUserKeyingMaterial();
        if (userKeyingMaterial != null) {
            return Arrays.clone(userKeyingMaterial.getOctets());
        }
        return null;
    }
}
