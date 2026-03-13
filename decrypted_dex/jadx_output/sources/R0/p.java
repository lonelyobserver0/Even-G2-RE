package R0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.stub.StubApp;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final p f6029e = new p();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f6030a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f6031b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f6032c;

    /* renamed from: d, reason: collision with root package name */
    public int f6033d;

    public p() {
        HandlerThread handlerThread = new HandlerThread(StubApp.getString2(5590));
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i3 = AbstractC1560u.f20190a;
        Handler handler = new Handler(looper, this);
        this.f6031b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f6030a = j;
        Choreographer choreographer = this.f6032c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            try {
                this.f6032c = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                AbstractC1550k.x(StubApp.getString2(5591), StubApp.getString2(5592), e10);
            }
            return true;
        }
        if (i3 == 2) {
            Choreographer choreographer = this.f6032c;
            if (choreographer != null) {
                int i10 = this.f6033d + 1;
                this.f6033d = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i3 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f6032c;
        if (choreographer2 != null) {
            int i11 = this.f6033d - 1;
            this.f6033d = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f6030a = -9223372036854775807L;
            }
        }
        return true;
    }
}
