package org.bouncycastle.asn1;

import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LazyConstructionEnumeration implements Enumeration {
    private ASN1InputStream aIn;
    private Object nextObj = readObject();

    public LazyConstructionEnumeration(byte[] bArr) {
        this.aIn = new ASN1InputStream(bArr, true);
    }

    private Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException e10) {
            throw new ASN1ParsingException(b.h(StubApp.getString2(26853), e10), e10);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.nextObj;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.nextObj = readObject();
        return obj;
    }
}
