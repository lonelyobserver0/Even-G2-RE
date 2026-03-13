package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlusOid implements XMSSOid {
    private static final Map<String, WOTSPlusOid> oidLookupTable;
    private final int oid;
    private final String stringRepresentation;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(createKey(StubApp.getString2(1488), 32, 16, 67), new WOTSPlusOid(16777217, StubApp.getString2(34314)));
        hashMap.put(createKey(StubApp.getString2(23705), 64, 16, 131), new WOTSPlusOid(33554434, StubApp.getString2(34315)));
        hashMap.put(createKey(StubApp.getString2(28183), 32, 16, 67), new WOTSPlusOid(50331651, StubApp.getString2(34316)));
        hashMap.put(createKey(StubApp.getString2(28184), 64, 16, 131), new WOTSPlusOid(67108868, StubApp.getString2(34317)));
        oidLookupTable = Collections.unmodifiableMap(hashMap);
    }

    private WOTSPlusOid(int i3, String str) {
        this.oid = i3;
        this.stringRepresentation = str;
    }

    private static String createKey(String str, int i3, int i10, int i11) {
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
        return sb2.toString();
    }

    public static WOTSPlusOid lookup(String str, int i3, int i10, int i11) {
        if (str != null) {
            return oidLookupTable.get(createKey(str, i3, i10, i11));
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
