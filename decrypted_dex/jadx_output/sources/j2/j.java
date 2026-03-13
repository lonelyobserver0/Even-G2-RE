package j2;

import android.content.Context;
import com.stub.StubApp;
import i2.o;
import java.io.File;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15291a = o.g(StubApp.getString2(18990));

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f15292b = {StubApp.getString2(18993), StubApp.getString2(18991), StubApp.getString2(18992)};

    public static void a(Context context) {
        String string2 = StubApp.getString2(18994);
        if (context.getDatabasePath(string2).exists()) {
            String str = f15291a;
            o.e().b(str, StubApp.getString2(18995), new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath(string2);
            File file = new File(context.getNoBackupFilesDir(), string2);
            hashMap.put(databasePath, file);
            for (String str2 : f15292b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        o.e().h(str, String.format(StubApp.getString2(18996), file3), new Throwable[0]);
                    }
                    o.e().b(str, file2.renameTo(file3) ? String.format(StubApp.getString2(18997), file2, file3) : String.format(StubApp.getString2(18998), file2, file3), new Throwable[0]);
                }
            }
        }
    }
}
