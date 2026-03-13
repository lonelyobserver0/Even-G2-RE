package D5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.stub.StubApp;
import f5.u0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final URL f1454a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Future f1455b;

    /* renamed from: c, reason: collision with root package name */
    public q4.s f1456c;

    public t(URL url) {
        this.f1454a = url;
    }

    public final Bitmap a() {
        String string2 = StubApp.getString2(493);
        boolean isLoggable = Log.isLoggable(string2, 4);
        URL url = this.f1454a;
        if (isLoggable) {
            Log.i(string2, StubApp.getString2(1468) + url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException(StubApp.getString2(1474));
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] z2 = u0.z(new C0040d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(string2, 2)) {
                Log.v(string2, StubApp.getString2(1469) + z2.length + StubApp.getString2(1470) + url);
            }
            if (z2.length > 1048576) {
                throw new IOException(StubApp.getString2(1473));
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(z2, 0, z2.length);
            if (decodeByteArray == null) {
                throw new IOException(StubApp.getString2(1472) + url);
            }
            if (Log.isLoggable(string2, 3)) {
                Log.d(string2, StubApp.getString2(1471) + url);
            }
            return decodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1455b.cancel(true);
    }
}
