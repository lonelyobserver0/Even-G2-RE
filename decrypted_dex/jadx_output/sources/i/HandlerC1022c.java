package i;

import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import r7.C1580f;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class HandlerC1022c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14568a = 0;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f14569b;

    public /* synthetic */ HandlerC1022c() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        switch (this.f14568a) {
            case 0:
                int i3 = msg.what;
                if (i3 != -3 && i3 != -2 && i3 != -1) {
                    if (i3 == 1) {
                        ((DialogInterface) msg.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) msg.obj).onClick((DialogInterface) this.f14569b.get(), msg.what);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(msg, "msg");
                C1580f c1580f = (C1580f) this.f14569b.get();
                if (c1580f != null) {
                    int i10 = msg.what;
                    if (i10 == 0) {
                        c1580f.invalidate();
                        break;
                    } else if (i10 == 1) {
                        Canvas canvas = c1580f.f20391m;
                        if (canvas == null) {
                            c1580f.invalidate();
                        } else {
                            c1580f.draw(canvas);
                        }
                        sendEmptyMessageDelayed(1, c1580f.getSettings().f20809r);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ HandlerC1022c(Looper looper) {
        super(looper);
    }
}
