package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface AuthAttributesProvider {
    ASN1Set getAuthAttributes();

    boolean isAead();
}
