package P3;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f5514b;

    public /* synthetic */ j(k kVar, int i3) {
        this.f5513a = i3;
        this.f5514b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5513a) {
            case 0:
                break;
            case 1:
                k kVar = this.f5514b;
                synchronized (kVar) {
                    if (kVar.f5515a == 1) {
                        kVar.a(StubApp.getString2("4879"));
                    }
                }
                return;
            default:
                this.f5514b.a(StubApp.getString2(4878));
                return;
        }
        while (true) {
            k kVar2 = this.f5514b;
            synchronized (kVar2) {
                try {
                    if (kVar2.f5515a != 2) {
                        return;
                    }
                    if (kVar2.f5518d.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.f5518d.poll();
                    kVar2.f5519e.put(lVar.f5521a, lVar);
                    ((ScheduledExecutorService) kVar2.f5520f.f5530d).schedule(new Q4.b(9, kVar2, lVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(lVar);
                        Log.d(StubApp.getString2(3016), StubApp.getString2(4853).concat(valueOf));
                    }
                    m mVar = kVar2.f5520f;
                    Messenger messenger = kVar2.f5516b;
                    int i3 = lVar.f5523c;
                    Context context = (Context) mVar.f5529c;
                    Message obtain = Message.obtain();
                    obtain.what = i3;
                    obtain.arg1 = lVar.f5521a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(StubApp.getString2(4880), lVar.a());
                    bundle.putString(StubApp.getString2(4881), context.getPackageName());
                    bundle.putBundle(StubApp.getString2(1485), lVar.f5524d);
                    obtain.setData(bundle);
                    try {
                        E0 e02 = kVar2.f5517c;
                        Messenger messenger2 = (Messenger) e02.f16037b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) e02.f16038c;
                            if (gVar == null) {
                                throw new IllegalStateException(StubApp.getString2("4882"));
                            }
                            Messenger messenger3 = gVar.f5504a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e10) {
                        kVar2.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
