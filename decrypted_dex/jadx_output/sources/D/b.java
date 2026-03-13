package D;

import android.net.Uri;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1215a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1216b = new HashMap();

    public b(String str) {
        this.f1215a = str;
    }

    public final File a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            throw new IllegalArgumentException(StubApp.getString2(1244) + uri);
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f1216b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException(StubApp.getString2(1243) + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            if (c.a(path).startsWith(c.a(path2) + '/')) {
                return canonicalFile;
            }
            throw new SecurityException(StubApp.getString2(1241));
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(1242) + file2);
        }
    }
}
