package org.bouncycastle.oer;

import org.bouncycastle.asn1.ASN1Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Switch {
    ASN1Encodable[] keys();

    Element result(SwitchIndexer switchIndexer);
}
