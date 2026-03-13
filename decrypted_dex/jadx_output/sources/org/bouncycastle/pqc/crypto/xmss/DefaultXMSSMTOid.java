package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class DefaultXMSSMTOid implements XMSSOid {
    private static final Map<String, DefaultXMSSMTOid> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 20, 2), new DefaultXMSSMTOid(1, StubApp.getString2(34250)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 20, 4), new DefaultXMSSMTOid(2, StubApp.getString2(34251)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 40, 2), new DefaultXMSSMTOid(3, StubApp.getString2(34252)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 40, 4), new DefaultXMSSMTOid(4, StubApp.getString2(34253)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 40, 8), new DefaultXMSSMTOid(5, StubApp.getString2(34254)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 60, 3), new DefaultXMSSMTOid(6, StubApp.getString2(34255)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 60, 6), new DefaultXMSSMTOid(7, StubApp.getString2(34256)));
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67, 60, 12), new DefaultXMSSMTOid(8, StubApp.getString2(34257)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 20, 2), new DefaultXMSSMTOid(9, StubApp.getString2(34258)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 20, 4), new DefaultXMSSMTOid(10, StubApp.getString2(34259)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 40, 2), new DefaultXMSSMTOid(11, StubApp.getString2(34260)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 40, 4), new DefaultXMSSMTOid(12, StubApp.getString2(34261)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 40, 8), new DefaultXMSSMTOid(13, StubApp.getString2(34262)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 60, 3), new DefaultXMSSMTOid(14, StubApp.getString2(34263)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 60, 6), new DefaultXMSSMTOid(15, StubApp.getString2(34264)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131, 60, 12), new DefaultXMSSMTOid(16, StubApp.getString2(34265)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 20, 2), new DefaultXMSSMTOid(17, StubApp.getString2(34266)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 20, 4), new DefaultXMSSMTOid(18, StubApp.getString2(34267)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 40, 2), new DefaultXMSSMTOid(19, StubApp.getString2(34268)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 40, 4), new DefaultXMSSMTOid(20, StubApp.getString2(34269)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 40, 8), new DefaultXMSSMTOid(21, StubApp.getString2(34270)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 60, 3), new DefaultXMSSMTOid(22, StubApp.getString2(34271)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 60, 6), new DefaultXMSSMTOid(23, StubApp.getString2(34272)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67, 60, 12), new DefaultXMSSMTOid(24, StubApp.getString2(34273)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 20, 2), new DefaultXMSSMTOid(25, StubApp.getString2(34274)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 20, 4), new DefaultXMSSMTOid(26, StubApp.getString2(34275)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 40, 2), new DefaultXMSSMTOid(27, StubApp.getString2(34276)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 40, 4), new DefaultXMSSMTOid(28, StubApp.getString2(34277)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 40, 8), new DefaultXMSSMTOid(29, StubApp.getString2(34278)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 60, 3), new DefaultXMSSMTOid(30, StubApp.getString2(34279)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 60, 6), new DefaultXMSSMTOid(31, StubApp.getString2(34280)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131, 60, 12), new DefaultXMSSMTOid(32, StubApp.getString2(34281)));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private DefaultXMSSMTOid(int i3, String str) {
        this.oid = i3;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i3, int i10, int i11, int i12, int i13) {
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
        sb2.append(string2);
        sb2.append(i13);
        return sb2.toString();
    }

    public static DefaultXMSSMTOid lookup(String str, int i3, int i10, int i11, int i12, int i13) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i3, i10, i11, i12, i13));
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
