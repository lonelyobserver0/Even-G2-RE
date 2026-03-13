package Kc;

import com.stub.StubApp;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class G extends C0099f {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f3788m;

    public G(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f3788m = socket;
    }

    @Override // Kc.C0099f
    public final void k() {
        String string2 = StubApp.getString2(25336);
        Socket socket = this.f3788m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (!AbstractC0095b.g(e10)) {
                throw e10;
            }
            v.f3853a.log(Level.WARNING, string2 + socket, (Throwable) e10);
        } catch (Exception e11) {
            v.f3853a.log(Level.WARNING, string2 + socket, (Throwable) e11);
        }
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(StubApp.getString2(1987));
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
