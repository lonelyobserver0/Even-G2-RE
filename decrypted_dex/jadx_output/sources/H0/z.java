package H0;

import android.os.Handler;
import android.os.HandlerThread;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class z implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f2664c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A f2665d;

    public z(A a3, OutputStream outputStream) {
        this.f2665d = a3;
        this.f2662a = outputStream;
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(2487));
        this.f2663b = handlerThread;
        handlerThread.start();
        this.f2664c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f2664c;
        HandlerThread handlerThread = this.f2663b;
        Objects.requireNonNull(handlerThread);
        handler.post(new B0.o(handlerThread, 4));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
