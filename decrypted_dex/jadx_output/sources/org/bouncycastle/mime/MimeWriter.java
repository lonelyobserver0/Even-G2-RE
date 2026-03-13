package org.bouncycastle.mime;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class MimeWriter {
    protected final Headers headers;

    public MimeWriter(Headers headers) {
        this.headers = headers;
    }

    public static List<String> mapToLines(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            StringBuilder n10 = AbstractC1482f.n(str, StubApp.getString2(994));
            n10.append(map.get(str));
            arrayList.add(n10.toString());
        }
        return arrayList;
    }

    public abstract OutputStream getContentStream() throws IOException;

    public Headers getHeaders() {
        return this.headers;
    }
}
