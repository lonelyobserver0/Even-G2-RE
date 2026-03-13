package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CMSTypedData extends CMSProcessable {
    ASN1ObjectIdentifier getContentType();
}
