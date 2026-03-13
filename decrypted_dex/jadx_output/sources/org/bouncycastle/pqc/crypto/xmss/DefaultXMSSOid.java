package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DefaultXMSSOid implements XMSSOid {
    private static final Map<String, DefaultXMSSOid> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        String string2 = StubApp.getString2(1488);
        hashMap.put(createKey(string2, 32, 16, 67, 10), new DefaultXMSSOid(1, StubApp.getString2(34283)));
        hashMap.put(createKey(string2, 32, 16, 67, 16), new DefaultXMSSOid(2, StubApp.getString2(34284)));
        hashMap.put(createKey(string2, 32, 16, 67, 20), new DefaultXMSSOid(3, StubApp.getString2(34285)));
        String string22 = StubApp.getString2(23705);
        hashMap.put(createKey(string22, 64, 16, 131, 10), new DefaultXMSSOid(4, StubApp.getString2(34286)));
        hashMap.put(createKey(string22, 64, 16, 131, 16), new DefaultXMSSOid(5, StubApp.getString2(34287)));
        hashMap.put(createKey(string22, 64, 16, 131, 20), new DefaultXMSSOid(6, StubApp.getString2(34288)));
        String string23 = StubApp.getString2(28183);
        hashMap.put(createKey(string23, 32, 16, 67, 10), new DefaultXMSSOid(7, StubApp.getString2(34289)));
        hashMap.put(createKey(string23, 32, 16, 67, 16), new DefaultXMSSOid(8, StubApp.getString2(34290)));
        hashMap.put(createKey(string23, 32, 16, 67, 20), new DefaultXMSSOid(9, StubApp.getString2(34291)));
        String string24 = StubApp.getString2(28184);
        hashMap.put(createKey(string24, 64, 16, 131, 10), new DefaultXMSSOid(10, StubApp.getString2(34292)));
        hashMap.put(createKey(string24, 64, 16, 131, 16), new DefaultXMSSOid(11, StubApp.getString2(34293)));
        hashMap.put(createKey(string24, 64, 16, 131, 20), new DefaultXMSSOid(12, StubApp.getString2(34294)));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private DefaultXMSSOid(int i3, String str) {
        this.oid = i3;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i3, int i10, int i11, int i12) {
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(34282));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(999);
        sb2.append(string2);
        sb2.append(i3);
        sb2.append(string2);
        sb2.append(i10);
        sb2.append(string2);
        sb2.append(i11);
        sb2.append(string2);
        sb2.append(i12);
        return sb2.toString();
    }

    public static DefaultXMSSOid lookup(String str, int i3, int i10, int i11, int i12) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i3, i10, i11, i12));
        }
        throw new NullPointerException(StubApp.getString2(34282));
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public int getOid() {
        return this.oid;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSOid
    public String toString() {
        return this.stringRepresentation;
    }
}
