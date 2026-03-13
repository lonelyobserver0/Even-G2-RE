package a4;

import com.stub.StubApp;
import dalvik.system.PathClassLoader;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z2) {
        if (!str.startsWith(StubApp.getString2(8445)) && !str.startsWith(StubApp.getString2(8446))) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z2);
    }
}
