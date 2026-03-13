package Ac;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class p extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, int i3, String str) {
        super(str, true);
        this.f376e = i3;
        this.f377f = obj;
    }

    @Override // zc.a
    public final long a() {
        int i3 = 0;
        switch (this.f376e) {
            case 0:
                q qVar = (q) this.f377f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) qVar.f384e).iterator();
                long j = Long.MIN_VALUE;
                o oVar = null;
                int i10 = 0;
                while (it.hasNext()) {
                    o connection = (o) it.next();
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (qVar.c(connection, nanoTime) > 0) {
                            i10++;
                        } else {
                            i3++;
                            long j3 = nanoTime - connection.f375q;
                            if (j3 > j) {
                                oVar = connection;
                                j = j3;
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }
                long j10 = qVar.f381b;
                if (j < j10 && i3 <= 5) {
                    if (i3 > 0) {
                        return j10 - j;
                    }
                    if (i10 > 0) {
                        return j10;
                    }
                    return -1L;
                }
                Intrinsics.checkNotNull(oVar);
                synchronized (oVar) {
                    if (!oVar.f374p.isEmpty()) {
                        return 0L;
                    }
                    if (oVar.f375q + j != nanoTime) {
                        return 0L;
                    }
                    oVar.j = true;
                    ((ConcurrentLinkedQueue) qVar.f384e).remove(oVar);
                    Socket socket = oVar.f363d;
                    Intrinsics.checkNotNull(socket);
                    xc.b.d(socket);
                    if (!((ConcurrentLinkedQueue) qVar.f384e).isEmpty()) {
                        return 0L;
                    }
                    ((zc.b) qVar.f382c).a();
                    return 0L;
                }
            case 1:
                Dc.r rVar = (Dc.r) this.f377f;
                rVar.getClass();
                try {
                    rVar.f1615A.p(2, 0, false);
                } catch (IOException e10) {
                    rVar.d(e10);
                }
                return -1L;
            default:
                ((Dc.l) this.f377f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, String str) {
        super(str, true);
        this.f376e = 0;
        this.f377f = qVar;
    }
}
