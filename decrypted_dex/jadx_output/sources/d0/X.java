package d0;

import android.util.Log;
import com.stub.StubApp;
import java.io.Writer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class X extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f13234b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f13233a = StubApp.getString2(49);

    public final void a() {
        StringBuilder sb2 = this.f13234b;
        if (sb2.length() > 0) {
            Log.d(this.f13233a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i3 + i11];
            if (c10 == '\n') {
                a();
            } else {
                this.f13234b.append(c10);
            }
        }
    }
}
