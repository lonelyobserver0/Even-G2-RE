package E0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1560u;
import v6.InterfaceC1836b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements m, InterfaceC1836b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1734a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1735b;

    /* renamed from: c, reason: collision with root package name */
    public int f1736c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1737d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1738e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1739f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1740g;

    public d(String path, boolean z2, int i3) {
        this.f1734a = 1;
        Intrinsics.checkNotNullParameter(path, "path");
        this.f1737d = path;
        this.f1735b = z2;
        this.f1736c = i3;
        this.f1739f = new AtomicBoolean(false);
        this.f1740g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (r6 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(E0.d r4, android.media.MediaFormat r5, android.view.Surface r6, android.media.MediaCrypto r7, int r8) {
        /*
            java.lang.Object r0 = r4.f1738e
            E0.h r0 = (E0.h) r0
            android.os.Handler r1 = r0.f1758c
            r2 = 1
            if (r1 != 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.AbstractC1550k.g(r1)
            android.os.HandlerThread r1 = r0.f1757b
            r1.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r1 = r1.getLooper()
            r3.<init>(r1)
            java.lang.Object r1 = r4.f1737d
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1
            r1.setCallback(r0, r3)
            r0.f1758c = r3
            r0 = 1588(0x634, float:2.225E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            android.os.Trace.beginSection(r0)
            r1.configure(r5, r6, r7, r8)
            android.os.Trace.endSection()
            java.lang.Object r5 = r4.f1739f
            E0.n r5 = (E0.n) r5
            r5.start()
            r5 = 1589(0x635, float:2.227E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            android.os.Trace.beginSection(r5)
            r1.start()
            android.os.Trace.endSection()
            int r5 = r0.AbstractC1560u.f20190a
            r6 = 35
            if (r5 < r6) goto L71
            java.lang.Object r5 = r4.f1740g
            Q2.g r5 = (Q2.g) r5
            if (r5 == 0) goto L71
            java.lang.Object r6 = r5.f5713d
            android.media.LoudnessCodecController r6 = (android.media.LoudnessCodecController) r6
            if (r6 == 0) goto L66
            boolean r6 = E0.a.f(r6, r1)
            if (r6 != 0) goto L66
            goto L71
        L66:
            java.lang.Object r5 = r5.f5711b
            java.util.HashSet r5 = (java.util.HashSet) r5
            boolean r5 = r5.add(r1)
            r0.AbstractC1550k.g(r5)
        L71:
            r4.f1736c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.u(E0.d, android.media.MediaFormat, android.view.Surface, android.media.MediaCrypto, int):void");
    }

    public static String v(int i3, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i3 == 1) {
            sb2.append(StubApp.getString2(1590));
        } else if (i3 == 2) {
            sb2.append(StubApp.getString2(1591));
        } else {
            sb2.append(StubApp.getString2(1592));
            sb2.append(i3);
            sb2.append(StubApp.getString2(74));
        }
        return sb2.toString();
    }

    @Override // E0.m
    public void a(int i3, u0.b bVar, long j, int i10) {
        ((n) this.f1739f).a(i3, bVar, j, i10);
    }

    @Override // E0.m
    public void b(Bundle bundle) {
        ((n) this.f1739f).b(bundle);
    }

    @Override // E0.m
    public void c(int i3, int i10, long j, int i11) {
        ((n) this.f1739f).c(i3, i10, j, i11);
    }

    @Override // v6.InterfaceC1836b
    public boolean d() {
        return false;
    }

    @Override // E0.m
    public void e(int i3) {
        ((MediaCodec) this.f1737d).releaseOutputBuffer(i3, false);
    }

    @Override // E0.m
    public MediaFormat f() {
        MediaFormat mediaFormat;
        h hVar = (h) this.f1738e;
        synchronized (hVar.f1756a) {
            try {
                mediaFormat = hVar.f1763h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // E0.m
    public void flush() {
        ((n) this.f1739f).flush();
        ((MediaCodec) this.f1737d).flush();
        h hVar = (h) this.f1738e;
        synchronized (hVar.f1756a) {
            hVar.f1766l++;
            Handler handler = hVar.f1758c;
            int i3 = AbstractC1560u.f20190a;
            handler.post(new B0.o(hVar, 3));
        }
        ((MediaCodec) this.f1737d).start();
    }

    @Override // E0.m
    public void g() {
        ((MediaCodec) this.f1737d).detachOutputSurface();
    }

    @Override // E0.m
    public void h(int i3, long j) {
        ((MediaCodec) this.f1737d).releaseOutputBuffer(i3, j);
    }

    @Override // v6.InterfaceC1836b
    public void i(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxer mediaMuxer;
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        Intrinsics.checkNotNullParameter(bufferInfo, "bufferInfo");
        if (!((AtomicBoolean) this.f1739f).get() || ((AtomicBoolean) this.f1740g).get() || (mediaMuxer = (MediaMuxer) this.f1738e) == null) {
            return;
        }
        mediaMuxer.writeSampleData(i3, byteBuffer, bufferInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0034, B:26:0x004e, B:29:0x0042, B:30:0x0050, B:31:0x0055, B:33:0x0056, B:34:0x0058, B:35:0x0059, B:36:0x005b, B:37:0x005c, B:38:0x005e), top: B:3:0x000e }] */
    @Override // E0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1739f
            E0.n r0 = (E0.n) r0
            r0.d()
            java.lang.Object r0 = r7.f1738e
            E0.h r0 = (E0.h) r0
            java.lang.Object r1 = r0.f1756a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f1768n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L5c
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L59
            android.media.MediaCodec$CryptoException r2 = r0.f1765k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L56
            long r2 = r0.f1766l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f1767m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r5
        L32:
            r0 = move-exception
            goto L5f
        L34:
            Ab.g r0 = r0.f1759d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.f275b     // Catch: java.lang.Throwable -> L32
            int r6 = r0.f276c     // Catch: java.lang.Throwable -> L32
            if (r2 != r6) goto L3d
            r3 = r4
        L3d:
            if (r3 == 0) goto L40
            goto L4e
        L40:
            if (r2 == r6) goto L50
            java.lang.Object r3 = r0.f278e     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + r4
            int r3 = r0.f277d     // Catch: java.lang.Throwable -> L32
            r2 = r2 & r3
            r0.f275b = r2     // Catch: java.lang.Throwable -> L32
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r5
        L50:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f1765k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L59:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5c:
            r0.f1768n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.j():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0052, B:31:0x0079, B:35:0x006f, B:36:0x007b, B:37:0x0080, B:39:0x0081, B:40:0x0083, B:41:0x0084, B:42:0x0086, B:43:0x0087, B:44:0x0089), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:18:0x0030, B:21:0x0035, B:25:0x0040, B:28:0x0044, B:30:0x0052, B:31:0x0079, B:35:0x006f, B:36:0x007b, B:37:0x0080, B:39:0x0081, B:40:0x0083, B:41:0x0084, B:42:0x0086, B:43:0x0087, B:44:0x0089), top: B:3:0x000e }] */
    @Override // E0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1739f
            E0.n r0 = (E0.n) r0
            r0.d()
            java.lang.Object r0 = r10.f1738e
            E0.h r0 = (E0.h) r0
            java.lang.Object r1 = r0.f1756a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f1768n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L87
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L84
            android.media.MediaCodec$CryptoException r2 = r0.f1765k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L81
            long r2 = r0.f1766l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L2c
            boolean r2 = r0.f1767m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = r3
            goto L2d
        L2c:
            r2 = r4
        L2d:
            r5 = -1
            if (r2 == 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r5
        L32:
            r0 = move-exception
            r11 = r0
            goto L8a
        L35:
            Ab.g r2 = r0.f1760e     // Catch: java.lang.Throwable -> L32
            int r6 = r2.f275b     // Catch: java.lang.Throwable -> L32
            int r7 = r2.f276c     // Catch: java.lang.Throwable -> L32
            if (r6 != r7) goto L3e
            r3 = r4
        L3e:
            if (r3 == 0) goto L42
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            if (r6 == r7) goto L7b
            java.lang.Object r3 = r2.f278e     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + r4
            int r4 = r2.f277d     // Catch: java.lang.Throwable -> L32
            r4 = r4 & r6
            r2.f275b = r4     // Catch: java.lang.Throwable -> L32
            if (r3 < 0) goto L6c
            android.media.MediaFormat r2 = r0.f1763h     // Catch: java.lang.Throwable -> L32
            r0.AbstractC1550k.h(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f1761f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L32
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L32
            int r6 = r0.size     // Catch: java.lang.Throwable -> L32
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L32
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L32
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L32
            goto L79
        L6c:
            r11 = -2
            if (r3 != r11) goto L79
            java.util.ArrayDeque r11 = r0.f1762g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L32
            r0.f1763h = r11     // Catch: java.lang.Throwable -> L32
        L79:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r3
        L7b:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            throw r11     // Catch: java.lang.Throwable -> L32
        L81:
            r0.f1765k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L84:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L87:
            r0.f1768n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.d.k(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // E0.m
    public void l(R0.e eVar, Handler handler) {
        ((MediaCodec) this.f1737d).setOnFrameRenderedListener(new b(this, eVar, 0), handler);
    }

    @Override // v6.InterfaceC1836b
    public int m(MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "mediaFormat");
        if (((AtomicBoolean) this.f1739f).get() || ((AtomicBoolean) this.f1740g).get()) {
            return -1;
        }
        MediaMuxer mediaMuxer = new MediaMuxer((String) this.f1737d, this.f1736c);
        this.f1738e = mediaMuxer;
        Intrinsics.checkNotNull(mediaMuxer);
        return mediaMuxer.addTrack(mediaFormat);
    }

    @Override // E0.m
    public void n(int i3) {
        ((MediaCodec) this.f1737d).setVideoScalingMode(i3);
    }

    @Override // E0.m
    public ByteBuffer o(int i3) {
        return ((MediaCodec) this.f1737d).getInputBuffer(i3);
    }

    @Override // v6.InterfaceC1836b
    public byte[] p(int i3, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        F1.B(byteBuffer, bufferInfo);
        throw null;
    }

    @Override // E0.m
    public void q(Surface surface) {
        ((MediaCodec) this.f1737d).setOutputSurface(surface);
    }

    @Override // E0.m
    public ByteBuffer r(int i3) {
        return ((MediaCodec) this.f1737d).getOutputBuffer(i3);
    }

    @Override // E0.m, v6.InterfaceC1836b
    public final void release() {
        Q2.g gVar;
        Q2.g gVar2;
        switch (this.f1734a) {
            case 0:
                try {
                    if (this.f1736c == 1) {
                        ((n) this.f1739f).shutdown();
                        h hVar = (h) this.f1738e;
                        synchronized (hVar.f1756a) {
                            hVar.f1767m = true;
                            hVar.f1757b.quit();
                            hVar.a();
                        }
                    }
                    this.f1736c = 2;
                    if (this.f1735b) {
                        return;
                    }
                    try {
                        int i3 = AbstractC1560u.f20190a;
                        if (i3 >= 30 && i3 < 33) {
                            ((MediaCodec) this.f1737d).stop();
                        }
                        if (i3 >= 35 && (gVar2 = (Q2.g) this.f1740g) != null) {
                            gVar2.S((MediaCodec) this.f1737d);
                        }
                        ((MediaCodec) this.f1737d).release();
                        this.f1735b = true;
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (!this.f1735b) {
                        try {
                            int i10 = AbstractC1560u.f20190a;
                            if (i10 >= 30 && i10 < 33) {
                                ((MediaCodec) this.f1737d).stop();
                            }
                            if (i10 >= 35 && (gVar = (Q2.g) this.f1740g) != null) {
                                gVar.S((MediaCodec) this.f1737d);
                            }
                            ((MediaCodec) this.f1737d).release();
                            this.f1735b = true;
                        } finally {
                        }
                    }
                    throw th;
                }
            default:
                stop();
                MediaMuxer mediaMuxer = (MediaMuxer) this.f1738e;
                if (mediaMuxer != null) {
                    mediaMuxer.release();
                }
                this.f1738e = null;
                return;
        }
    }

    @Override // v6.InterfaceC1836b
    public boolean s() {
        return this.f1735b;
    }

    @Override // v6.InterfaceC1836b
    public void start() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1739f;
        if (atomicBoolean.get() || ((AtomicBoolean) this.f1740g).get()) {
            return;
        }
        atomicBoolean.set(true);
        MediaMuxer mediaMuxer = (MediaMuxer) this.f1738e;
        if (mediaMuxer != null) {
            mediaMuxer.start();
        }
    }

    @Override // v6.InterfaceC1836b
    public void stop() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1739f;
        if (atomicBoolean.get()) {
            AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1740g;
            if (atomicBoolean2.get()) {
                return;
            }
            atomicBoolean.set(false);
            atomicBoolean2.set(true);
            MediaMuxer mediaMuxer = (MediaMuxer) this.f1738e;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
            }
        }
    }

    @Override // E0.m
    public boolean t(s2.d dVar) {
        h hVar = (h) this.f1738e;
        synchronized (hVar.f1756a) {
            hVar.f1769o = dVar;
        }
        return true;
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, n nVar, Q2.g gVar) {
        this.f1734a = 0;
        this.f1737d = mediaCodec;
        this.f1738e = new h(handlerThread);
        this.f1739f = nVar;
        this.f1740g = gVar;
        this.f1736c = 0;
    }
}
