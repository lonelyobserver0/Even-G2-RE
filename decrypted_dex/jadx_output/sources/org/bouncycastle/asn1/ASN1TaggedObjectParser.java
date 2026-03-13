package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    ASN1Encodable getObjectParser(int i3, boolean z2) throws IOException;

    int getTagClass();

    int getTagNo();

    boolean hasContextTag(int i3);

    boolean hasTag(int i3, int i10);

    ASN1Encodable parseBaseUniversal(boolean z2, int i3) throws IOException;

    ASN1Encodable parseExplicitBaseObject() throws IOException;

    ASN1TaggedObjectParser parseExplicitBaseTagged() throws IOException;

    ASN1TaggedObjectParser parseImplicitBaseTagged(int i3, int i10) throws IOException;
}
