package org.bouncycastle.eac.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface EACSigner {
    OutputStream getOutputStream();

    byte[] getSignature();

    ASN1ObjectIdentifier getUsageIdentifier();
}
