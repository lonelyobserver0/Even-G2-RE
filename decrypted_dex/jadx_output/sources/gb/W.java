package gb;

import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class W implements BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f14311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f14312b;

    public W(Y y10, X x7) {
        this.f14312b = y10;
        this.f14311a = x7;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        Y y10 = this.f14312b;
        ConcurrentLinkedQueue concurrentLinkedQueue = y10.f14316a;
        X x7 = this.f14311a;
        concurrentLinkedQueue.remove(x7);
        if (y10.f14316a.isEmpty()) {
            return;
        }
        Log.e(StubApp.getString2(17870), StubApp.getString2(17869) + String.valueOf(x7.f14314a));
    }
}
