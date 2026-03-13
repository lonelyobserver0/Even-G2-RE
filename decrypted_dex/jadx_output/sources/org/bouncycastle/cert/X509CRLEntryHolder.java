package org.bouncycastle.cert;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TBSCertList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509CRLEntryHolder {

    /* renamed from: ca, reason: collision with root package name */
    private GeneralNames f18723ca;
    private TBSCertList.CRLEntry entry;

    public X509CRLEntryHolder(TBSCertList.CRLEntry cRLEntry, boolean z2, GeneralNames generalNames) {
        Extension extension;
        this.entry = cRLEntry;
        this.f18723ca = generalNames;
        if (z2 && cRLEntry.hasExtensions() && (extension = cRLEntry.getExtensions().getExtension(Extension.certificateIssuer)) != null) {
            this.f18723ca = GeneralNames.getInstance(extension.getParsedValue());
        }
    }

    public GeneralNames getCertificateIssuer() {
        return this.f18723ca;
    }

    public Set getCriticalExtensionOIDs() {
        return CertUtils.getCriticalExtensionOIDs(this.entry.getExtensions());
    }

    public Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Extensions extensions = this.entry.getExtensions();
        if (extensions != null) {
            return extensions.getExtension(aSN1ObjectIdentifier);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return CertUtils.getExtensionOIDs(this.entry.getExtensions());
    }

    public Extensions getExtensions() {
        return this.entry.getExtensions();
    }

    public Set getNonCriticalExtensionOIDs() {
        return CertUtils.getNonCriticalExtensionOIDs(this.entry.getExtensions());
    }

    public Date getRevocationDate() {
        return this.entry.getRevocationDate().getDate();
    }

    public BigInteger getSerialNumber() {
        return this.entry.getUserCertificate().getValue();
    }

    public boolean hasExtensions() {
        return this.entry.hasExtensions();
    }
}
