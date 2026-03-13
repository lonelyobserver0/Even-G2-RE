package org.bouncycastle.tsp.cms;

import java.net.URI;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.cms.Attributes;
import org.bouncycastle.asn1.cms.MetaData;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSTimeStampedGenerator {
    protected URI dataUri;
    protected MetaData metaData;

    public void initialiseMessageImprintDigestCalculator(DigestCalculator digestCalculator) throws CMSException {
        new MetaDataUtil(this.metaData).initialiseMessageImprintDigestCalculator(digestCalculator);
    }

    public void setDataUri(URI uri) {
        this.dataUri = uri;
    }

    public void setMetaData(boolean z2, String str, String str2) {
        setMetaData(z2, str, str2, (Attributes) null);
    }

    public void setMetaData(boolean z2, String str, String str2, Attributes attributes) {
        setMetaData(z2, str != null ? new DERUTF8String(str) : null, str2 != null ? new DERIA5String(str2) : null, attributes);
    }

    private void setMetaData(boolean z2, ASN1UTF8String aSN1UTF8String, ASN1IA5String aSN1IA5String, Attributes attributes) {
        this.metaData = new MetaData(ASN1Boolean.getInstance(z2), aSN1UTF8String, aSN1IA5String, attributes);
    }
}
