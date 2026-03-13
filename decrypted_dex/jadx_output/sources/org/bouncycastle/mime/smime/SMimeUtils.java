package org.bouncycastle.mime.smime;

import E1.a;
import com.stub.StubApp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SMimeUtils {
    private static final Map RFC3851_MICALGS;
    private static final Map RFC5751_MICALGS;
    private static final Map STANDARD_MICALGS;
    private static final Map forMic;
    private static final byte[] nl = {13, 10};

    static {
        HashMap hashMap = new HashMap();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CMSAlgorithm.MD5;
        String string2 = StubApp.getString2(33046);
        hashMap.put(aSN1ObjectIdentifier, string2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAlgorithm.SHA1;
        hashMap.put(aSN1ObjectIdentifier2, StubApp.getString2(33047));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAlgorithm.SHA224;
        hashMap.put(aSN1ObjectIdentifier3, StubApp.getString2(33048));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAlgorithm.SHA256;
        hashMap.put(aSN1ObjectIdentifier4, StubApp.getString2(33049));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAlgorithm.SHA384;
        hashMap.put(aSN1ObjectIdentifier5, StubApp.getString2(33050));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSAlgorithm.SHA512;
        hashMap.put(aSN1ObjectIdentifier6, StubApp.getString2(33051));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = CMSAlgorithm.GOST3411;
        String string22 = StubApp.getString2(33052);
        hashMap.put(aSN1ObjectIdentifier7, string22);
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = CMSAlgorithm.GOST3411_2012_256;
        String string23 = StubApp.getString2(33053);
        hashMap.put(aSN1ObjectIdentifier8, string23);
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = CMSAlgorithm.GOST3411_2012_512;
        String string24 = StubApp.getString2(33054);
        hashMap.put(aSN1ObjectIdentifier9, string24);
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        RFC5751_MICALGS = unmodifiableMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aSN1ObjectIdentifier, string2);
        hashMap2.put(aSN1ObjectIdentifier2, StubApp.getString2(33055));
        hashMap2.put(aSN1ObjectIdentifier3, StubApp.getString2(33056));
        hashMap2.put(aSN1ObjectIdentifier4, StubApp.getString2(33057));
        hashMap2.put(aSN1ObjectIdentifier5, StubApp.getString2(33058));
        hashMap2.put(aSN1ObjectIdentifier6, StubApp.getString2(33059));
        hashMap2.put(aSN1ObjectIdentifier7, string22);
        hashMap2.put(aSN1ObjectIdentifier8, string23);
        hashMap2.put(aSN1ObjectIdentifier9, string24);
        RFC3851_MICALGS = Collections.unmodifiableMap(hashMap2);
        STANDARD_MICALGS = unmodifiableMap;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Object obj : unmodifiableMap.keySet()) {
            treeMap.put(STANDARD_MICALGS.get(obj).toString(), (ASN1ObjectIdentifier) obj);
        }
        for (Object obj2 : RFC3851_MICALGS.keySet()) {
            treeMap.put(RFC3851_MICALGS.get(obj2).toString(), (ASN1ObjectIdentifier) obj2);
        }
        forMic = Collections.unmodifiableMap(treeMap);
    }

    public static InputStream autoBuffer(InputStream inputStream) {
        return inputStream instanceof FileInputStream ? new BufferedInputStream(inputStream) : inputStream;
    }

    public static OutputStream createUnclosable(OutputStream outputStream) {
        return new FilterOutputStream(outputStream) { // from class: org.bouncycastle.mime.smime.SMimeUtils.1
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i3, int i10) throws IOException {
                bArr.getClass();
                int i11 = i10 + i3;
                if ((i3 | i10 | (bArr.length - i11) | i11) < 0) {
                    throw new IndexOutOfBoundsException();
                }
                ((FilterOutputStream) this).out.write(bArr, i3, i10);
            }
        };
    }

    public static ASN1ObjectIdentifier getDigestOID(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) forMic.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(a.j(StubApp.getString2(33070), str));
    }

    public static String getParameter(String str, List<String> list) {
        for (String str2 : list) {
            if (str2.startsWith(str)) {
                return str2;
            }
        }
        return null;
    }

    public static String lessQuotes(String str) {
        return (str == null || str.length() <= 1 || str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') ? str : str.substring(1, str.length() - 1);
    }

    public static OutputStream autoBuffer(OutputStream outputStream) {
        return outputStream instanceof FileOutputStream ? new BufferedOutputStream(outputStream) : outputStream;
    }
}
