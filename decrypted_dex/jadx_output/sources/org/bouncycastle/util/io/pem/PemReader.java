package org.bouncycastle.util.io.pem;

import E1.a;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.bouncycastle.util.encoders.Base64;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PemReader extends BufferedReader {
    private static final String BEGIN = StubApp.getString2(30872);
    private static final String END = StubApp.getString2(30874);

    public PemReader(Reader reader) {
        super(reader);
    }

    private PemObject loadObject(String str) throws IOException {
        String readLine;
        String j = a.j(StubApp.getString2(30874), str);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
            int indexOf = readLine.indexOf(58);
            if (indexOf >= 0) {
                arrayList.add(new PemHeader(readLine.substring(0, indexOf), readLine.substring(indexOf + 1).trim()));
            } else {
                if (readLine.indexOf(j) != -1) {
                    break;
                }
                stringBuffer.append(readLine.trim());
            }
        }
        if (readLine != null) {
            return new PemObject(str, arrayList, Base64.decode(stringBuffer.toString()));
        }
        throw new IOException(AbstractC1482f.g(j, StubApp.getString2(6390)));
    }

    public PemObject readPemObject() throws IOException {
        String readLine;
        String substring;
        int indexOf;
        do {
            readLine = readLine();
            if (readLine == null) {
                break;
            }
        } while (!readLine.startsWith(StubApp.getString2(30872)));
        if (readLine == null || (indexOf = (substring = readLine.substring(11)).indexOf(45)) <= 0 || !substring.endsWith(StubApp.getString2(30873)) || substring.length() - indexOf != 5) {
            return null;
        }
        return loadObject(substring.substring(0, indexOf));
    }
}
