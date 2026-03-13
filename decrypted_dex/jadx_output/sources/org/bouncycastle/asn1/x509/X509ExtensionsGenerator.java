package org.bouncycastle.asn1.x509;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509ExtensionsGenerator {
    private Hashtable extensions = new Hashtable();
    private Vector extOrdering = new Vector();

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) {
        try {
            addExtension(aSN1ObjectIdentifier, z2, aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2("26791")));
        } catch (IOException e10) {
            throw new IllegalArgumentException(b.h(StubApp.getString2(27856), e10));
        }
    }

    public X509Extensions generate() {
        return new X509Extensions(this.extOrdering, this.extensions);
    }

    public boolean isEmpty() {
        return this.extOrdering.isEmpty();
    }

    public void reset() {
        this.extensions = new Hashtable();
        this.extOrdering = new Vector();
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, byte[] bArr) {
        if (this.extensions.containsKey(aSN1ObjectIdentifier)) {
            throw new IllegalArgumentException(a.f(StubApp.getString2(27782), aSN1ObjectIdentifier, StubApp.getString2(27783)));
        }
        this.extOrdering.addElement(aSN1ObjectIdentifier);
        this.extensions.put(aSN1ObjectIdentifier, new X509Extension(z2, new DEROctetString(bArr)));
    }
}
