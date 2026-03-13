package Za;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.stub.StubApp;
import f5.u0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.AbstractC1748a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements BinaryMessenger, p {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9191a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9192b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f9193c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9194d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f9195e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f9196f;

    /* renamed from: g, reason: collision with root package name */
    public int f9197g;

    /* renamed from: h, reason: collision with root package name */
    public final g f9198h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f9199i;
    public final i j;

    public o(FlutterJNI flutterJNI) {
        i iVar = new i();
        iVar.f9180a = (ExecutorService) Q2.g.H().f5713d;
        this.f9192b = new HashMap();
        this.f9193c = new HashMap();
        this.f9194d = new Object();
        this.f9195e = new AtomicBoolean(false);
        this.f9196f = new HashMap();
        this.f9197g = 1;
        this.f9198h = new g();
        this.f9199i = new WeakHashMap();
        this.f9191a = flutterJNI;
        this.j = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [Za.e] */
    public final void a(final String str, final j jVar, final ByteBuffer byteBuffer, final int i3, final long j) {
        h hVar = jVar != null ? jVar.f9182b : null;
        String a3 = AbstractC1748a.a(StubApp.getString2(8262) + str);
        if (Build.VERSION.SDK_INT >= 29) {
            S1.a.a(i3, u0.A(a3));
        } else {
            String A4 = u0.A(a3);
            String string2 = StubApp.getString2(2893);
            try {
                if (u0.f14133c == null) {
                    u0.f14133c = Trace.class.getMethod(string2, Long.TYPE, String.class, Integer.TYPE);
                }
                u0.f14133c.invoke(null, Long.valueOf(u0.f14131a), A4, Integer.valueOf(i3));
            } catch (Exception e10) {
                u0.p(string2, e10);
            }
        }
        ?? r02 = new Runnable() { // from class: Za.e
            @Override // java.lang.Runnable
            public final void run() {
                long j3 = j;
                FlutterJNI flutterJNI = o.this.f9191a;
                String string22 = StubApp.getString2(8261);
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(8262));
                String str2 = str;
                sb2.append(str2);
                String a9 = AbstractC1748a.a(sb2.toString());
                int i10 = Build.VERSION.SDK_INT;
                int i11 = i3;
                if (i10 >= 29) {
                    S1.a.b(i11, u0.A(a9));
                } else {
                    String A5 = u0.A(a9);
                    String string23 = StubApp.getString2(2894);
                    try {
                        if (u0.f14134d == null) {
                            u0.f14134d = Trace.class.getMethod(string23, Long.TYPE, String.class, Integer.TYPE);
                        }
                        u0.f14134d.invoke(null, Long.valueOf(u0.f14131a), A5, Integer.valueOf(i11));
                    } catch (Exception e11) {
                        u0.p(string23, e11);
                    }
                }
                try {
                    AbstractC1748a.d(string22 + str2);
                    j jVar2 = jVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (jVar2 != null) {
                            try {
                                try {
                                    jVar2.f9181a.onMessage(byteBuffer2, new k(flutterJNI, i11));
                                } catch (Exception e12) {
                                    Log.e(StubApp.getString2("8263"), StubApp.getString2("8264"), e12);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
                                }
                            } catch (Error e13) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e13;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e13);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i11);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j3);
                }
            }
        };
        h hVar2 = hVar;
        if (hVar == null) {
            hVar2 = this.f9198h;
        }
        hVar2.a(r02);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void disableBufferingIncomingMessages() {
        HashMap hashMap;
        synchronized (this.f9194d) {
            this.f9195e.set(false);
            hashMap = this.f9193c;
            this.f9193c = new HashMap();
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            for (f fVar : (List) entry.getValue()) {
                a((String) entry.getKey(), null, fVar.f9175a, fVar.f9176b, fVar.f9177c);
            }
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void enableBufferingIncomingMessages() {
        this.f9195e.set(true);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        i iVar = this.j;
        iVar.getClass();
        boolean isSerial = taskQueueOptions.getIsSerial();
        ExecutorService executorService = iVar.f9180a;
        Object mVar = isSerial ? new m(executorService) : new g(executorService);
        n nVar = new n();
        this.f9199i.put(nVar, mVar);
        return nVar;
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer) {
        send(str, byteBuffer, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        setMessageHandler(str, binaryMessageHandler, null);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        AbstractC1748a.d(StubApp.getString2(8266) + str);
        try {
            int i3 = this.f9197g;
            this.f9197g = i3 + 1;
            if (binaryReply != null) {
                this.f9196f.put(Integer.valueOf(i3), binaryReply);
            }
            FlutterJNI flutterJNI = this.f9191a;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        h hVar;
        if (binaryMessageHandler == null) {
            synchronized (this.f9194d) {
                this.f9192b.remove(str);
            }
            return;
        }
        if (taskQueue != null) {
            hVar = (h) this.f9199i.get(taskQueue);
            if (hVar == null) {
                throw new IllegalArgumentException(StubApp.getString2(8267));
            }
        } else {
            hVar = null;
        }
        synchronized (this.f9194d) {
            try {
                this.f9192b.put(str, new j(binaryMessageHandler, hVar));
                List<f> list = (List) this.f9193c.remove(str);
                if (list == null) {
                    return;
                }
                for (f fVar : list) {
                    a(str, (j) this.f9192b.get(str), fVar.f9175a, fVar.f9176b, fVar.f9177c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
