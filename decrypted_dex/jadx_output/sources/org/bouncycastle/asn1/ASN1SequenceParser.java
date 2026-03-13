package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ASN1SequenceParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable readObject() throws IOException;
}
