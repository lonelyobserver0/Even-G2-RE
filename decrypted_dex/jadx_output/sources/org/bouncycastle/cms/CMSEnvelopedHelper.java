package org.bouncycastle.cms;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.KEKRecipientInfo;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CMSEnvelopedHelper {

    public static class CMSAuthenticatedSecureReadable implements CMSSecureReadable {
        private AlgorithmIdentifier algorithm;
        private final ASN1ObjectIdentifier contentType;
        private CMSReadable readable;

        public CMSAuthenticatedSecureReadable(AlgorithmIdentifier algorithmIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            this.algorithm = algorithmIdentifier;
            this.contentType = aSN1ObjectIdentifier;
            this.readable = cMSReadable;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public ASN1ObjectIdentifier getContentType() {
            return this.contentType;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public InputStream getInputStream() throws IOException, CMSException {
            return this.readable.getInputStream();
        }
    }

    public static class CMSDigestAuthenticatedSecureReadable implements CMSSecureReadable {
        private final ASN1ObjectIdentifier contentType;
        private DigestCalculator digestCalculator;
        private CMSReadable readable;

        public CMSDigestAuthenticatedSecureReadable(DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            this.digestCalculator = digestCalculator;
            this.contentType = aSN1ObjectIdentifier;
            this.readable = cMSReadable;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public ASN1ObjectIdentifier getContentType() {
            return this.contentType;
        }

        public byte[] getDigest() {
            return this.digestCalculator.getDigest();
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public InputStream getInputStream() throws IOException, CMSException {
            return new FilterInputStream(this.readable.getInputStream()) { // from class: org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read() throws IOException {
                    int read = ((FilterInputStream) this).in.read();
                    if (read >= 0) {
                        CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(read);
                    }
                    return read;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read(byte[] bArr, int i3, int i10) throws IOException {
                    int read = ((FilterInputStream) this).in.read(bArr, i3, i10);
                    if (read >= 0) {
                        CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(bArr, i3, read);
                    }
                    return read;
                }
            };
        }
    }

    public static class CMSEnvelopedSecureReadable implements CMSSecureReadable {
        private AlgorithmIdentifier algorithm;
        private final ASN1ObjectIdentifier contentType;
        private CMSReadable readable;

        public CMSEnvelopedSecureReadable(AlgorithmIdentifier algorithmIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            this.algorithm = algorithmIdentifier;
            this.contentType = aSN1ObjectIdentifier;
            this.readable = cMSReadable;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public ASN1ObjectIdentifier getContentType() {
            return this.contentType;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public InputStream getInputStream() throws IOException, CMSException {
            return this.readable.getInputStream();
        }
    }

    public static RecipientInformationStore buildRecipientInformationStore(ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable) {
        return buildRecipientInformationStore(aSN1Set, algorithmIdentifier, cMSSecureReadable, null);
    }

    private static void readRecipientInfo(List list, RecipientInfo recipientInfo, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable, AuthAttributesProvider authAttributesProvider) {
        ASN1Encodable info = recipientInfo.getInfo();
        if (info instanceof KeyTransRecipientInfo) {
            list.add(new KeyTransRecipientInformation((KeyTransRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
            return;
        }
        if (info instanceof KEKRecipientInfo) {
            list.add(new KEKRecipientInformation((KEKRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        } else if (info instanceof KeyAgreeRecipientInfo) {
            KeyAgreeRecipientInformation.readRecipientInfo(list, (KeyAgreeRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        } else if (info instanceof PasswordRecipientInfo) {
            list.add(new PasswordRecipientInformation((PasswordRecipientInfo) info, algorithmIdentifier, cMSSecureReadable, authAttributesProvider));
        }
    }

    public static RecipientInformationStore buildRecipientInformationStore(ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable, AuthAttributesProvider authAttributesProvider) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 != aSN1Set.size(); i3++) {
            readRecipientInfo(arrayList, RecipientInfo.getInstance(aSN1Set.getObjectAt(i3)), algorithmIdentifier, cMSSecureReadable, authAttributesProvider);
        }
        return new RecipientInformationStore(arrayList);
    }
}
