package Q1;

import android.util.Log;
import com.stub.StubApp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f5693e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5694a;

    /* renamed from: b, reason: collision with root package name */
    public final File f5695b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f5696c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f5697d;

    public a(String name, File file, boolean z2) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5694a = z2;
        this.f5695b = file != null ? new File(file, AbstractC1482f.g(name, StubApp.getString2(5052))) : null;
        HashMap hashMap = f5693e;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(name);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(name, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5696c = lock;
    }

    public final void a(boolean z2) {
        this.f5696c.lock();
        if (z2) {
            File file = this.f5695b;
            try {
                if (file == null) {
                    throw new IOException(StubApp.getString2("5053"));
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f5697d = channel;
            } catch (IOException e10) {
                this.f5697d = null;
                Log.w(StubApp.getString2(5054), StubApp.getString2(5055), e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f5697d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f5696c.unlock();
    }
}
