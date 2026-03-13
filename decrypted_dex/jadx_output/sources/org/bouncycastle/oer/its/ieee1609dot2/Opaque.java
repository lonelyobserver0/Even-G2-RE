package org.bouncycastle.oer.its.ieee1609dot2;

import com.stub.StubApp;
import i2.u;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OERInputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Opaque extends ASN1Object {
    private final byte[] content;

    private Opaque(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static Opaque getInstance(Object obj) {
        if (obj instanceof Opaque) {
            return (Opaque) obj;
        }
        if (obj != null) {
            return new Opaque(ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public static <T> T getValue(final Class<T> cls, final Element element, Opaque opaque) {
        return (T) AccessController.doPrivileged(new PrivilegedAction<T>() { // from class: org.bouncycastle.oer.its.ieee1609dot2.Opaque.1
            @Override // java.security.PrivilegedAction
            public T run() {
                try {
                    ASN1Encodable parse = OERInputStream.parse(Opaque.this.content, element);
                    return (T) cls.cast(cls.getMethod(StubApp.getString2("2877"), Object.class).invoke(null, parse));
                } catch (Exception e10) {
                    throw new IllegalStateException(u.r(e10, new StringBuilder(StubApp.getString2(33157))), e10);
                }
            }
        });
    }

    public byte[] getContent() {
        return this.content;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.content);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(this.content);
    }

    public Opaque(byte[] bArr) {
        this.content = Arrays.clone(bArr);
    }
}
