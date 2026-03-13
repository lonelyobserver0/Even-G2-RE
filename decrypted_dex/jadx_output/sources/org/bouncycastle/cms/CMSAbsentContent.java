package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSAbsentContent implements CMSTypedData, CMSReadable {
    private final ASN1ObjectIdentifier type;

    public CMSAbsentContent() {
        this(CMSObjectIdentifiers.data);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException, CMSException {
    }

    public CMSAbsentContent(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.type = aSN1ObjectIdentifier;
    }
}
