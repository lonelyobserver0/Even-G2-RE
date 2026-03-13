package E0;

import H5.Y;
import Qb.J;
import Qb.L;
import android.content.Intent;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l0.C1136a;
import l0.C1137b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1741a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1742b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Looper looper, int i3) {
        super(looper);
        this.f1741a = i3;
        this.f1742b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        int size;
        Y.m[] mVarArr;
        switch (this.f1741a) {
            case 0:
                g gVar = (g) this.f1742b;
                gVar.getClass();
                int i3 = msg.what;
                f fVar = null;
                if (i3 == 1) {
                    f fVar2 = (f) msg.obj;
                    try {
                        gVar.f1750a.queueInputBuffer(fVar2.f1743a, 0, fVar2.f1744b, fVar2.f1746d, fVar2.f1747e);
                    } catch (RuntimeException e10) {
                        AtomicReference atomicReference = gVar.f1753d;
                        while (!atomicReference.compareAndSet(null, e10) && atomicReference.get() == null) {
                        }
                    }
                    fVar = fVar2;
                } else if (i3 == 2) {
                    f fVar3 = (f) msg.obj;
                    int i10 = fVar3.f1743a;
                    MediaCodec.CryptoInfo cryptoInfo = fVar3.f1745c;
                    long j = fVar3.f1746d;
                    int i11 = fVar3.f1747e;
                    try {
                        synchronized (g.f1749h) {
                            gVar.f1750a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                        }
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference2 = gVar.f1753d;
                        while (!atomicReference2.compareAndSet(null, e11) && atomicReference2.get() == null) {
                        }
                    }
                    fVar = fVar3;
                } else if (i3 == 3) {
                    gVar.f1754e.a();
                } else if (i3 != 4) {
                    AtomicReference atomicReference3 = gVar.f1753d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        gVar.f1750a.setParameters((Bundle) msg.obj);
                    } catch (RuntimeException e12) {
                        AtomicReference atomicReference4 = gVar.f1753d;
                        while (!atomicReference4.compareAndSet(null, e12) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (fVar != null) {
                    ArrayDeque arrayDeque = g.f1748g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(fVar);
                    }
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(msg, "msg");
                int i12 = msg.what;
                String string2 = StubApp.getString2(88);
                if (i12 != 3) {
                    Log.w(string2, StubApp.getString2(1595) + msg);
                    super.handleMessage(msg);
                    return;
                }
                Bundle data = msg.getData();
                if (data == null || (str = data.getString(StubApp.getString2(1593))) == null) {
                    str = "";
                }
                Log.d(string2, StubApp.getString2(1594));
                L.j(J.a((CoroutineContext) this.f1742b), null, new Y(str, null), 3);
                return;
            default:
                if (msg.what != 1) {
                    super.handleMessage(msg);
                    return;
                }
                C1137b c1137b = (C1137b) this.f1742b;
                while (true) {
                    synchronized (c1137b.f15718b) {
                        try {
                            size = c1137b.f15720d.size();
                            if (size <= 0) {
                                return;
                            }
                            mVarArr = new Y.m[size];
                            c1137b.f15720d.toArray(mVarArr);
                            c1137b.f15720d.clear();
                        } finally {
                        }
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        Y.m mVar = mVarArr[i13];
                        int size2 = ((ArrayList) mVar.f8675c).size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C1136a c1136a = (C1136a) ((ArrayList) mVar.f8675c).get(i14);
                            if (!c1136a.f15714d) {
                                c1136a.f15712b.onReceive(c1137b.f15717a, (Intent) mVar.f8674b);
                            }
                        }
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CoroutineContext backgroundDispatcher) {
        super(Looper.getMainLooper());
        this.f1741a = 1;
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f1742b = backgroundDispatcher;
    }
}
