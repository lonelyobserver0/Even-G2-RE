package w6;

import E9.k;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import t6.C1737d;
import v6.InterfaceC1836b;
import y6.C1972a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d extends HandlerThread implements InterfaceC1866a, Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C1737d f22120a;

    /* renamed from: b, reason: collision with root package name */
    public final hc.b f22121b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaFormat f22122c;

    /* renamed from: d, reason: collision with root package name */
    public final k f22123d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22124e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f22125f;

    /* renamed from: g, reason: collision with root package name */
    public MediaCodec f22126g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1836b f22127h;
    public final LinkedList j;

    /* renamed from: k, reason: collision with root package name */
    public float f22128k;

    /* renamed from: l, reason: collision with root package name */
    public long f22129l;

    /* renamed from: m, reason: collision with root package name */
    public int f22130m;

    /* renamed from: n, reason: collision with root package name */
    public int f22131n;

    /* renamed from: p, reason: collision with root package name */
    public Semaphore f22132p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f22133q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1737d config, hc.b format, MediaFormat mediaFormat, k listener, String codec) {
        super(StubApp.getString2(23861));
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f22120a = config;
        this.f22121b = format;
        this.f22122c = mediaFormat;
        this.f22123d = listener;
        this.f22124e = codec;
        this.j = new LinkedList();
        this.f22130m = -1;
        this.f22133q = new AtomicBoolean(false);
    }

    @Override // w6.InterfaceC1866a
    public final void a(byte[] bytes) {
        Message obtainMessage;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f22133q.get()) {
            return;
        }
        C1868c c1868c = new C1868c();
        Intrinsics.checkNotNullParameter(bytes, "<set-?>");
        c1868c.f22118a = bytes;
        Handler handler = this.f22125f;
        if (handler == null || (obtainMessage = handler.obtainMessage(101, c1868c)) == null) {
            return;
        }
        obtainMessage.sendToTarget();
    }

    @Override // w6.InterfaceC1866a
    public final void b() {
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f22125f = handler;
        Message obtainMessage = handler.obtainMessage(100);
        if (obtainMessage != null) {
            obtainMessage.sendToTarget();
        }
    }

    @Override // w6.InterfaceC1866a
    public final void c() {
        Message obtainMessage;
        AtomicBoolean atomicBoolean = this.f22133q;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        Semaphore semaphore = new Semaphore(0);
        Handler handler = this.f22125f;
        if (handler != null && (obtainMessage = handler.obtainMessage(999, semaphore)) != null) {
            obtainMessage.sendToTarget();
        }
        try {
            semaphore.acquire();
        } finally {
            quitSafely();
        }
    }

    public final void d(Exception ex) {
        this.f22133q.set(true);
        f();
        k kVar = this.f22123d;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(ex, "ex");
        ((C1972a) kVar.f2082c).h(ex);
    }

    public final void e() {
        MediaCodec mediaCodec = this.f22126g;
        if (mediaCodec == null) {
            return;
        }
        LinkedList linkedList = this.j;
        try {
            C1868c c1868c = (C1868c) linkedList.peekFirst();
            if (c1868c == null) {
                if (this.f22132p != null) {
                    mediaCodec.queueInputBuffer(this.f22130m, 0, 0, (long) (this.f22129l / this.f22128k), 4);
                    this.f22130m = -1;
                    return;
                }
                return;
            }
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(this.f22130m);
            Intrinsics.checkNotNull(inputBuffer);
            int min = (int) Math.min(inputBuffer.capacity(), c1868c.f22118a.length - c1868c.f22119b);
            long j = (long) (this.f22129l / this.f22128k);
            inputBuffer.put(c1868c.f22118a, c1868c.f22119b, min);
            mediaCodec.queueInputBuffer(this.f22130m, 0, min, j, 0);
            this.f22129l += min;
            int i3 = c1868c.f22119b + min;
            c1868c.f22119b = i3;
            if (i3 >= c1868c.f22118a.length) {
                linkedList.pop();
            }
            this.f22130m = -1;
        } catch (Exception e10) {
            d(e10);
        }
    }

    public final void f() {
        MediaCodec mediaCodec = this.f22126g;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        MediaCodec mediaCodec2 = this.f22126g;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f22126g = null;
        InterfaceC1836b interfaceC1836b = this.f22127h;
        if (interfaceC1836b != null) {
            interfaceC1836b.stop();
        }
        InterfaceC1836b interfaceC1836b2 = this.f22127h;
        if (interfaceC1836b2 != null) {
            interfaceC1836b2.release();
        }
        this.f22127h = null;
        Semaphore semaphore = this.f22132p;
        if (semaphore != null) {
            semaphore.release();
        }
        this.f22132p = null;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i3 = msg.what;
        if (i3 == 100) {
            this.f22128k = 16.0f;
            String string2 = StubApp.getString2(23466);
            MediaFormat mediaFormat = this.f22122c;
            float integer = 16.0f * mediaFormat.getInteger(string2);
            this.f22128k = integer;
            this.f22128k = ((integer * mediaFormat.getInteger(StubApp.getString2(23467))) * 1.0E-6f) / 8.0f;
            try {
                MediaCodec createByCodecName = MediaCodec.createByCodecName(this.f22124e);
                this.f22126g = createByCodecName;
                if (createByCodecName != null) {
                    createByCodecName.setCallback(new C1867b(this), new Handler(getLooper()));
                }
                MediaCodec mediaCodec = this.f22126g;
                if (mediaCodec != null) {
                    mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                }
                MediaCodec mediaCodec2 = this.f22126g;
                if (mediaCodec2 != null) {
                    mediaCodec2.start();
                }
                try {
                    this.f22127h = this.f22121b.w(this.f22120a.f21187a);
                } catch (Exception e10) {
                    d(e10);
                }
            } catch (Exception e11) {
                MediaCodec mediaCodec3 = this.f22126g;
                if (mediaCodec3 != null) {
                    mediaCodec3.release();
                }
                this.f22126g = null;
                d(e11);
            }
        } else if (i3 == 999) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.concurrent.Semaphore");
            this.f22132p = (Semaphore) obj;
            if (this.f22130m >= 0) {
                e();
                return true;
            }
        } else if (i3 == 101 && !this.f22133q.get()) {
            LinkedList linkedList = this.j;
            Object obj2 = msg.obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.llfbandit.record.record.encoder.MediaCodecEncoder.Sample");
            linkedList.add((C1868c) obj2);
            if (this.f22130m >= 0) {
                e();
            }
        }
        return true;
    }
}
