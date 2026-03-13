package org.bouncycastle.oer.its;

import com.stub.StubApp;
import i2.u;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ItsUtils {
    @Deprecated
    public static <T> List<T> fillList(final Class<T> cls, final ASN1Sequence aSN1Sequence) {
        return (List) AccessController.doPrivileged(new PrivilegedAction<List<T>>() { // from class: org.bouncycastle.oer.its.ItsUtils.1
            @Override // java.security.PrivilegedAction
            public List<T> run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator<ASN1Encodable> it = ASN1Sequence.this.iterator();
                    while (it.hasNext()) {
                        arrayList.add(cls.cast(cls.getMethod(StubApp.getString2("2877"), Object.class).invoke(null, it.next())));
                    }
                    return arrayList;
                } catch (Exception e10) {
                    throw new IllegalStateException(u.r(e10, new StringBuilder(StubApp.getString2(33157))), e10);
                }
            }
        });
    }

    public static byte[] octetStringFixed(byte[] bArr) {
        if (bArr.length < 1 || bArr.length > 32) {
            throw new IllegalArgumentException(StubApp.getString2(33168));
        }
        return Arrays.clone(bArr);
    }

    public static ASN1Sequence toSequence(List list) {
        return new DERSequence((ASN1Encodable[]) list.toArray(new ASN1Encodable[0]));
    }

    public static byte[] octetStringFixed(byte[] bArr, int i3) {
        if (bArr.length == i3) {
            return bArr;
        }
        throw new IllegalArgumentException(StubApp.getString2(33168));
    }

    public static ASN1Sequence toSequence(ASN1Encodable... aSN1EncodableArr) {
        return new DERSequence(aSN1EncodableArr);
    }
}
