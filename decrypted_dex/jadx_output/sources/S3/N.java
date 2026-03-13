package S3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class N implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f6478a;

    public /* synthetic */ N(O o5) {
        this.f6478a = o5;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String string2 = StubApp.getString2(5956);
        int i3 = message.what;
        if (i3 == 0) {
            synchronized (this.f6478a.f6482a) {
                try {
                    L l9 = (L) message.obj;
                    M m4 = (M) this.f6478a.f6482a.get(l9);
                    if (m4 != null && m4.f6471a.isEmpty()) {
                        if (m4.f6473c) {
                            m4.f6477g.f6484c.removeMessages(1, m4.f6475e);
                            O o5 = m4.f6477g;
                            o5.f6485d.c(o5.f6483b, m4);
                            m4.f6473c = false;
                            m4.f6472b = 2;
                        }
                        this.f6478a.f6482a.remove(l9);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        synchronized (this.f6478a.f6482a) {
            try {
                L l10 = (L) message.obj;
                M m10 = (M) this.f6478a.f6482a.get(l10);
                if (m10 != null && m10.f6472b == 3) {
                    Log.e(StubApp.getString2("5957"), string2.concat(String.valueOf(l10)), new Exception());
                    ComponentName componentName = m10.f6476f;
                    if (componentName == null) {
                        l10.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = l10.f6469b;
                        D.h(str);
                        componentName = new ComponentName(str, StubApp.getString2("351"));
                    }
                    m10.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
