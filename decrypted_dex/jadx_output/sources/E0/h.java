package E0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import v0.C1798A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f1757b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1758c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f1763h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f1764i;
    public MediaCodec.CodecException j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f1765k;

    /* renamed from: l, reason: collision with root package name */
    public long f1766l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1767m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f1768n;

    /* renamed from: o, reason: collision with root package name */
    public s2.d f1769o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1756a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Ab.g f1759d = new Ab.g();

    /* renamed from: e, reason: collision with root package name */
    public final Ab.g f1760e = new Ab.g();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f1761f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1762g = new ArrayDeque();

    public h(HandlerThread handlerThread) {
        this.f1757b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f1762g;
        if (!arrayDeque.isEmpty()) {
            this.f1764i = (MediaFormat) arrayDeque.getLast();
        }
        Ab.g gVar = this.f1759d;
        gVar.f276c = gVar.f275b;
        Ab.g gVar2 = this.f1760e;
        gVar2.f276c = gVar2.f275b;
        this.f1761f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f1756a) {
            this.f1765k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f1756a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i3) {
        C1798A c1798a;
        synchronized (this.f1756a) {
            this.f1759d.a(i3);
            s2.d dVar = this.f1769o;
            if (dVar != null && (c1798a = ((s) dVar.f20712b).f1812I) != null) {
                c1798a.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i3, MediaCodec.BufferInfo bufferInfo) {
        C1798A c1798a;
        synchronized (this.f1756a) {
            try {
                MediaFormat mediaFormat = this.f1764i;
                if (mediaFormat != null) {
                    this.f1760e.a(-2);
                    this.f1762g.add(mediaFormat);
                    this.f1764i = null;
                }
                this.f1760e.a(i3);
                this.f1761f.add(bufferInfo);
                s2.d dVar = this.f1769o;
                if (dVar != null && (c1798a = ((s) dVar.f20712b).f1812I) != null) {
                    c1798a.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f1756a) {
            this.f1760e.a(-2);
            this.f1762g.add(mediaFormat);
            this.f1764i = null;
        }
    }
}
