package y6;

import android.content.Context;
import android.media.MediaRecorder;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.C1737d;
import t6.EnumC1738e;
import z6.C2012b;

/* renamed from: y6.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1974c implements InterfaceC1973b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23535a;

    /* renamed from: b, reason: collision with root package name */
    public final C2012b f23536b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23537c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23538d;

    /* renamed from: e, reason: collision with root package name */
    public MediaRecorder f23539e;

    /* renamed from: f, reason: collision with root package name */
    public double f23540f;

    /* renamed from: g, reason: collision with root package name */
    public C1737d f23541g;

    public C1974c(Context context, C2012b recorderStateStreamHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorderStateStreamHandler, "recorderStateStreamHandler");
        this.f23535a = context;
        this.f23536b = recorderStateStreamHandler;
        this.f23540f = -160.0d;
    }

    @Override // y6.InterfaceC1973b
    public final boolean a() {
        return this.f23537c;
    }

    @Override // y6.InterfaceC1973b
    public final ArrayList b() {
        double d8;
        if (this.f23537c) {
            Intrinsics.checkNotNull(this.f23539e);
            d8 = Math.log10(r2.getMaxAmplitude() / 32768.0d) * 20;
            if (d8 > this.f23540f) {
                this.f23540f = d8;
            }
        } else {
            d8 = -160.0d;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(d8));
        arrayList.add(Double.valueOf(this.f23540f));
        return arrayList;
    }

    @Override // y6.InterfaceC1973b
    public final boolean c() {
        return this.f23538d;
    }

    @Override // y6.InterfaceC1973b
    public final void cancel() {
        f();
        C1737d c1737d = this.f23541g;
        android.support.v4.media.session.b.m(c1737d != null ? c1737d.f21187a : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    @Override // y6.InterfaceC1973b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(t6.C1737d r11) {
        /*
            r10 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r10.f()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L14
            android.media.MediaRecorder r1 = new android.media.MediaRecorder
            r1.<init>()
            goto L1c
        L14:
            android.media.MediaRecorder r1 = new android.media.MediaRecorder
            android.content.Context r1 = r10.f23535a
            android.media.MediaRecorder r1 = w0.g.d(r1)
        L1c:
            int r2 = r11.f21197l
            r1.setAudioSource(r2)
            int r2 = r11.f21188b
            r1.setAudioEncodingBitRate(r2)
            int r2 = r11.f21189c
            r1.setAudioSamplingRate(r2)
            int r2 = r11.f21201p
            r3 = 1
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r3, r2)
            r4 = 2
            int r2 = kotlin.ranges.RangesKt.coerceAtMost(r4, r2)
            r1.setAudioChannels(r2)
            t6.a r2 = r11.f21203r
            int r5 = r2.ordinal()
            r6 = 29
            r7 = 7
            r8 = 4
            r9 = 3
            if (r5 == 0) goto L58
            if (r5 == r3) goto L58
            if (r5 == r4) goto L58
            if (r5 == r9) goto L5a
            if (r5 == r8) goto L5a
            if (r5 == r7) goto L53
            r5 = 0
            goto L5b
        L53:
            if (r0 < r6) goto L58
            r5 = 11
            goto L5b
        L58:
            r5 = r4
            goto L5b
        L5a:
            r5 = r3
        L5b:
            r1.setOutputFormat(r5)
            int r2 = r2.ordinal()
            if (r2 == 0) goto L7f
            if (r2 == r3) goto L8d
            if (r2 == r4) goto L8b
            if (r2 == r9) goto L8e
            if (r2 == r8) goto L89
            r3 = 24663(0x6057, float:3.456E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r4 = 24664(0x6058, float:3.4562E-41)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            if (r2 == r7) goto L81
            android.util.Log.d(r4, r3)
        L7f:
            r3 = r9
            goto L8e
        L81:
            if (r0 < r6) goto L85
            r3 = r7
            goto L8e
        L85:
            android.util.Log.d(r4, r3)
            goto L7f
        L89:
            r3 = r4
            goto L8e
        L8b:
            r3 = r8
            goto L8e
        L8d:
            r3 = 5
        L8e:
            r1.setAudioEncoder(r3)
            java.lang.String r0 = r11.f21187a
            r1.setOutputFile(r0)
            r1.prepare()     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            r1.start()     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            r10.f23541g = r11     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            r10.f23539e = r1     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            t6.e r11 = t6.EnumC1738e.f21205c     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            r10.g(r11)     // Catch: java.lang.IllegalStateException -> La6 java.io.IOException -> La8
            return
        La6:
            r11 = move-exception
            goto Laa
        La8:
            r11 = move-exception
            goto Lb3
        Laa:
            r1.release()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r11)
            throw r0
        Lb3:
            r1.release()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.C1974c.d(t6.d):void");
    }

    @Override // y6.InterfaceC1973b
    public final void dispose() {
        f();
    }

    @Override // y6.InterfaceC1973b
    public final void e(Function1 function1) {
        f();
        C1737d c1737d = this.f23541g;
        function1.invoke(c1737d != null ? c1737d.f21187a : null);
    }

    public final void f() {
        MediaRecorder mediaRecorder = this.f23539e;
        if (mediaRecorder != null) {
            try {
            } catch (RuntimeException unused) {
            } catch (Throwable th) {
                MediaRecorder mediaRecorder2 = this.f23539e;
                Intrinsics.checkNotNull(mediaRecorder2);
                mediaRecorder2.reset();
                MediaRecorder mediaRecorder3 = this.f23539e;
                Intrinsics.checkNotNull(mediaRecorder3);
                mediaRecorder3.release();
                this.f23539e = null;
                throw th;
            }
            if (!this.f23537c) {
                if (this.f23538d) {
                }
                MediaRecorder mediaRecorder4 = this.f23539e;
                Intrinsics.checkNotNull(mediaRecorder4);
                mediaRecorder4.reset();
                MediaRecorder mediaRecorder5 = this.f23539e;
                Intrinsics.checkNotNull(mediaRecorder5);
                mediaRecorder5.release();
                this.f23539e = null;
            }
            Intrinsics.checkNotNull(mediaRecorder);
            mediaRecorder.stop();
            MediaRecorder mediaRecorder42 = this.f23539e;
            Intrinsics.checkNotNull(mediaRecorder42);
            mediaRecorder42.reset();
            MediaRecorder mediaRecorder52 = this.f23539e;
            Intrinsics.checkNotNull(mediaRecorder52);
            mediaRecorder52.release();
            this.f23539e = null;
        }
        g(EnumC1738e.f21206d);
        this.f23540f = -160.0d;
    }

    public final void g(EnumC1738e enumC1738e) {
        int ordinal = enumC1738e.ordinal();
        C2012b c2012b = this.f23536b;
        if (ordinal == 0) {
            this.f23537c = true;
            this.f23538d = true;
            c2012b.a(EnumC1738e.f21204b);
        } else if (ordinal == 1) {
            this.f23537c = true;
            this.f23538d = false;
            c2012b.a(EnumC1738e.f21205c);
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f23537c = false;
            this.f23538d = false;
            c2012b.a(EnumC1738e.f21206d);
        }
    }

    @Override // y6.InterfaceC1973b
    public final void pause() {
        MediaRecorder mediaRecorder = this.f23539e;
        if (mediaRecorder != null) {
            try {
                if (this.f23537c) {
                    Intrinsics.checkNotNull(mediaRecorder);
                    mediaRecorder.pause();
                    g(EnumC1738e.f21204b);
                }
            } catch (IllegalStateException e10) {
                Log.d(StubApp.getString2(24664), StringsKt.trimIndent(StubApp.getString2(24665) + e10.getMessage() + StubApp.getString2(1900)));
            }
        }
    }

    @Override // y6.InterfaceC1973b
    public final void resume() {
        MediaRecorder mediaRecorder = this.f23539e;
        if (mediaRecorder != null) {
            try {
                if (this.f23538d) {
                    Intrinsics.checkNotNull(mediaRecorder);
                    mediaRecorder.resume();
                    g(EnumC1738e.f21205c);
                }
            } catch (IllegalStateException e10) {
                Log.d(StubApp.getString2(24664), StringsKt.trimIndent(StubApp.getString2(24666) + e10.getMessage() + StubApp.getString2(1900)));
            }
        }
    }
}
