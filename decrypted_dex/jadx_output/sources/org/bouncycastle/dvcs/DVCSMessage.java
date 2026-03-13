package org.bouncycastle.dvcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.ContentInfo;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DVCSMessage {
    private final ContentInfo contentInfo;

    public DVCSMessage(ContentInfo contentInfo) {
        this.contentInfo = contentInfo;
    }

    public abstract ASN1Encodable getContent();

    public ASN1ObjectIdentifier getContentType() {
        return this.contentInfo.getContentType();
    }
}
