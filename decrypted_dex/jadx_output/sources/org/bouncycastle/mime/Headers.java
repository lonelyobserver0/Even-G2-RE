package org.bouncycastle.mime;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.util.Iterable;
import org.bouncycastle.util.Strings;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Headers implements Iterable<String> {
    private String boundary;
    private final String contentTransferEncoding;
    private String contentType;
    private Map<String, String> contentTypeParameters;
    private final Map<String, List> headers;
    private final List<String> headersAsPresented;
    private boolean multipart;

    public static class KV {
        public final String key;
        public final String value;

        public KV(String str, String str2) {
            this.key = str;
            this.value = str2;
        }

        public KV(KV kv) {
            this.key = kv.key;
            this.value = kv.value;
        }
    }

    public Headers(InputStream inputStream, String str) throws IOException {
        this(parseHeaders(inputStream), str);
    }

    private Map<String, String> createContentTypeParameters(String str) {
        String[] split = str.split(StubApp.getString2(1262));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i3 = 0; i3 != split.length; i3++) {
            String str2 = split[i3];
            int indexOf = str2.indexOf(61);
            if (indexOf < 0) {
                throw new IllegalArgumentException(StubApp.getString2(33025));
            }
            linkedHashMap.put(str2.substring(0, indexOf).trim(), str2.substring(indexOf + 1).trim());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static List<String> parseHeaders(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        LineReader lineReader = new LineReader(inputStream);
        while (true) {
            String readLine = lineReader.readLine();
            if (readLine == null || readLine.length() == 0) {
                break;
            }
            arrayList.add(readLine);
        }
        return arrayList;
    }

    private void put(String str, String str2) {
        synchronized (this) {
            try {
                KV kv = new KV(str, str2);
                List list = this.headers.get(str);
                if (list == null) {
                    list = new ArrayList();
                    this.headers.put(str, list);
                }
                list.add(kv);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean containsKey(String str) {
        return this.headers.containsKey(str);
    }

    public void dumpHeaders(OutputStream outputStream) throws IOException {
        Iterator<String> it = this.headersAsPresented.iterator();
        while (it.hasNext()) {
            outputStream.write(Strings.toUTF8ByteArray(it.next().toString()));
            outputStream.write(13);
            outputStream.write(10);
        }
    }

    public String getBoundary() {
        return this.boundary;
    }

    public String getContentTransferEncoding() {
        return this.contentTransferEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getContentTypeAttributes() {
        return this.contentTypeParameters;
    }

    public Iterator<String> getNames() {
        return this.headers.keySet().iterator();
    }

    public String[] getValues(String str) {
        synchronized (this) {
            try {
                List list = this.headers.get(str);
                if (list == null) {
                    return null;
                }
                String[] strArr = new String[list.size()];
                for (int i3 = 0; i3 < list.size(); i3++) {
                    strArr[i3] = ((KV) list.get(i3)).value;
                }
                return strArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.headers.isEmpty();
        }
        return isEmpty;
    }

    public boolean isMultipart() {
        return this.multipart;
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<String> iterator() {
        return this.headers.keySet().iterator();
    }

    public Headers(String str, String str2) {
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        String j = a.j(StubApp.getString2(33022), str);
        ArrayList arrayList = new ArrayList();
        this.headersAsPresented = arrayList;
        arrayList.add(j);
        String string2 = StubApp.getString2(466);
        put(string2, str);
        String string22 = getValues(string2) == null ? StubApp.getString2(625) : getValues(string2)[0];
        int indexOf = string22.indexOf(59);
        if (indexOf < 0) {
            this.contentTypeParameters = Collections.EMPTY_MAP;
        } else {
            String substring = string22.substring(0, indexOf);
            this.contentTypeParameters = createContentTypeParameters(string22.substring(indexOf + 1).trim());
            string22 = substring;
        }
        String string23 = StubApp.getString2(29460);
        this.contentTransferEncoding = getValues(string23) != null ? getValues(string23)[0] : str2;
        if (string22.indexOf(StubApp.getString2(33023)) < 0) {
            this.boundary = null;
            this.multipart = false;
            return;
        }
        this.multipart = true;
        String str3 = this.contentTypeParameters.get(StubApp.getString2(33024));
        String string24 = StubApp.getString2(2123);
        if (str3.startsWith(string24) && str3.endsWith(string24)) {
            this.boundary = str3.substring(1, str3.length() - 1);
        } else {
            this.boundary = str3;
        }
    }

    public Headers(List<String> list, String str) {
        Map<String, String> createContentTypeParameters;
        this.headers = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.headersAsPresented = list;
        String str2 = "";
        for (String str3 : list) {
            if (str3.startsWith(StubApp.getString2(397)) || str3.startsWith(StubApp.getString2(4946))) {
                StringBuilder b2 = AbstractC1856e.b(str2);
                b2.append(str3.trim());
                str2 = b2.toString();
            } else {
                if (str2.length() != 0) {
                    put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
                }
                str2 = str3;
            }
        }
        if (str2.trim().length() != 0) {
            put(str2.substring(0, str2.indexOf(58)).trim(), str2.substring(str2.indexOf(58) + 1).trim());
        }
        String string2 = StubApp.getString2(466);
        String string22 = getValues(string2) == null ? StubApp.getString2(625) : getValues(string2)[0];
        int indexOf = string22.indexOf(59);
        if (indexOf < 0) {
            this.contentType = string22;
            createContentTypeParameters = Collections.EMPTY_MAP;
        } else {
            this.contentType = string22.substring(0, indexOf);
            createContentTypeParameters = createContentTypeParameters(string22.substring(indexOf + 1).trim());
        }
        this.contentTypeParameters = createContentTypeParameters;
        String string23 = StubApp.getString2(29460);
        this.contentTransferEncoding = getValues(string23) != null ? getValues(string23)[0] : str;
        if (this.contentType.indexOf(StubApp.getString2(33023)) < 0) {
            this.boundary = null;
            this.multipart = false;
        } else {
            this.multipart = true;
            String str4 = this.contentTypeParameters.get(StubApp.getString2(33024));
            this.boundary = str4.substring(1, str4.length() - 1);
        }
    }
}
