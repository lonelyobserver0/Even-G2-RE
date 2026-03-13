package E9;

import Qb.L;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import com.mapbox.common.LoggingLevel;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.C1736c;
import t6.C1737d;
import t6.EnumC1738e;
import w6.InterfaceC1866a;
import x6.C1914a;
import x6.C1915b;
import x6.C1916c;
import x6.C1917d;
import y6.C1972a;
import z6.C2011a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2081b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2082c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2083d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2084e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2085f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2086g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2087h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2088i;

    public k(C1737d config, C1972a recorderListener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(recorderListener, "recorderListener");
        this.f2081b = config;
        this.f2082c = recorderListener;
        this.f2085f = new AtomicBoolean(false);
        this.f2086g = new AtomicBoolean(false);
        this.f2087h = new Semaphore(0);
        this.f2088i = Executors.newSingleThreadExecutor();
    }

    public void a(boolean z2) {
        Timer timer = (Timer) this.f2087h;
        if (timer != null) {
            timer.cancel();
        }
        if (!z2) {
            ((A1.a) this.f2083d).getClass();
            Timer timer2 = new Timer();
            ((G9.c) this.f2081b).getClass();
            timer2.schedule(new j(this, 0), 0L);
            this.f2087h = timer2;
            return;
        }
        A1.a callback = new A1.a(9);
        Q2.g gVar = (Q2.g) this.f2082c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((AudioManager) gVar.f5711b).abandonAudioFocusRequest(Q2.g.v((F9.a) gVar.f5713d, (r) gVar.f5712c));
    }

    public boolean b() {
        return ((InterfaceC1866a) this.f2084e) != null && ((AtomicBoolean) this.f2085f).get();
    }

    public void c(byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "bytes");
        C1972a c1972a = (C1972a) this.f2082c;
        Intrinsics.checkNotNullParameter(buffer, "chunk");
        C2011a c2011a = c1972a.f23524b;
        c2011a.getClass();
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        c2011a.f24126b.post(new com.even.translate.a(26, c2011a, buffer));
    }

    public void d() {
        int i3 = 1;
        int i10 = 0;
        l lVar = (l) ((ConcurrentLinkedQueue) this.f2084e).peek();
        if (lVar == null) {
            return;
        }
        LoggingLevel g10 = D9.l.g();
        LoggingLevel loggingLevel = LoggingLevel.DEBUG;
        boolean a3 = D9.l.a(g10, loggingLevel);
        F9.b currentPlay = lVar.f2089a;
        String string2 = StubApp.getString2(1943);
        if (a3) {
            D9.l.d(StubApp.getString2(1944) + currentPlay, string2);
        }
        File file = currentPlay.f2336c;
        F9.a owner = file == null ? F9.a.f2332b : F9.a.f2331a;
        A1.a callback = new A1.a(owner, this, currentPlay);
        Timer timer = (Timer) this.f2087h;
        if (timer != null) {
            timer.cancel();
        }
        Q2.g gVar = (Q2.g) this.f2082c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(callback, "callback");
        gVar.f5713d = owner;
        int requestAudioFocus = ((AudioManager) gVar.f5711b).requestAudioFocus(Q2.g.v(owner, (r) gVar.f5712c));
        boolean z2 = requestAudioFocus == 1 || requestAudioFocus == 2;
        Intrinsics.checkNotNullParameter(owner, "$owner");
        Intrinsics.checkNotNullParameter(this, "this$0");
        Intrinsics.checkNotNullParameter(currentPlay, "$currentPlay");
        if (D9.l.a(D9.l.g(), loggingLevel)) {
            D9.l.d(StubApp.getString2(1945) + z2 + StubApp.getString2(1946) + owner, string2);
        }
        C2.d callback2 = (C2.d) this.f2088i;
        if (!z2) {
            callback2.k(currentPlay);
            return;
        }
        int ordinal = owner.ordinal();
        String string22 = StubApp.getString2(1947);
        String string23 = StubApp.getString2(1303);
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            w wVar = (w) this.f2086g;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(currentPlay, string23);
            Intrinsics.checkNotNullParameter(callback2, "callback");
            wVar.f2115g = callback2;
            if (wVar.f2116h != null) {
                throw new IllegalStateException(string22);
            }
            wVar.f2116h = currentPlay;
            boolean z10 = wVar.f2111c;
            String string24 = StubApp.getString2(1948);
            if (z10) {
                String str = currentPlay.f2334a;
                if (!StringsKt.isBlank(str)) {
                    if (D9.l.a(D9.l.g(), loggingLevel)) {
                        D9.l.d(StubApp.getString2(1949) + str, string24);
                    }
                    L.j(wVar.f2112d.f1513b, null, new u(wVar, str, null), 3);
                    return;
                }
            }
            if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                D9.l.e(StubApp.getString2(1950), string24);
            }
            wVar.a();
            return;
        }
        p pVar = (p) this.f2085f;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(currentPlay, string23);
        Intrinsics.checkNotNullParameter(callback2, "callback");
        pVar.f2097d = callback2;
        if (pVar.f2098e != null) {
            throw new IllegalStateException(string22);
        }
        pVar.f2098e = currentPlay;
        if (file == null || !file.canRead()) {
            D9.l.e(StubApp.getString2(1951), StubApp.getString2(1952));
            pVar.a(pVar.f2095b);
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                Intrinsics.checkNotNull(mediaPlayer);
                Intrinsics.checkNotNull(fileInputStream);
                mediaPlayer.setDataSource(fileInputStream.getFD());
                r rVar = pVar.f2094a;
                Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
                new A8.a(rVar, i3).invoke(mediaPlayer);
                mediaPlayer.prepareAsync();
                pVar.f2095b = mediaPlayer;
                float f10 = pVar.f2096c;
                mediaPlayer.setVolume(f10, f10);
                MediaPlayer mediaPlayer2 = pVar.f2095b;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setOnErrorListener(new m(0));
                    mediaPlayer2.setOnPreparedListener(new n());
                    mediaPlayer2.setOnCompletionListener(new o(pVar, i10));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, null);
            } finally {
            }
        } catch (FileNotFoundException unused) {
            pVar.a(pVar.f2095b);
        } catch (IOException unused2) {
            pVar.a(pVar.f2095b);
        }
    }

    public void e(F9.b announcement, InterfaceC0853a consumer) {
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (this.f2080a) {
            if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
                D9.l.e(StubApp.getString2(1953) + announcement, StubApp.getString2(1943));
                return;
            }
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f2084e;
        concurrentLinkedQueue.add(new l(announcement, consumer));
        if (concurrentLinkedQueue.size() == 1) {
            d();
        }
    }

    public void f() {
        ((AtomicBoolean) this.f2085f).set(true);
        ((AtomicBoolean) this.f2086g).set(false);
        ((Semaphore) this.f2087h).release();
        C1972a c1972a = (C1972a) this.f2082c;
        c1972a.f23523a.a(EnumC1738e.f21205c);
    }

    public hc.b g() {
        switch (((C1737d) this.f2081b).f21203r.ordinal()) {
            case 0:
            case 1:
            case 2:
                C1914a c1914a = new C1914a(17);
                c1914a.f22892c = 44100;
                c1914a.f22893d = 2;
                c1914a.f22894e = 2;
                return c1914a;
            case 3:
                return new C1915b(0);
            case 4:
                return new C1915b(1);
            case 5:
                return new C1915b(2);
            case 6:
                return new C1916c(17);
            case 7:
                return new C1915b(3);
            case 8:
                return new C1917d(17);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void h() {
        C1972a c1972a = (C1972a) this.f2082c;
        try {
            try {
                C1736c c1736c = (C1736c) this.f2083d;
                if (c1736c != null) {
                    AudioRecord audioRecord = c1736c.f21181a;
                    try {
                        if (audioRecord.getRecordingState() == 3) {
                            audioRecord.stop();
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                C1736c c1736c2 = (C1736c) this.f2083d;
                if (c1736c2 != null) {
                    c1736c2.b();
                }
                this.f2083d = null;
                InterfaceC1866a interfaceC1866a = (InterfaceC1866a) this.f2084e;
                if (interfaceC1866a != null) {
                    interfaceC1866a.c();
                }
                this.f2084e = null;
                if (this.f2080a) {
                    android.support.v4.media.session.b.m(((C1737d) this.f2081b).f21187a);
                }
            } catch (Throwable th) {
                c1972a.i();
                throw th;
            }
        } catch (Exception e10) {
            c1972a.h(e10);
        }
        c1972a.i();
    }

    public void i(F9.e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        float f10 = state.f2339a;
        if (0.0f > f10 || f10 > 1.0f) {
            throw new IllegalArgumentException(StubApp.getString2(1954));
        }
        p pVar = (p) this.f2085f;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        pVar.f2096c = f10;
        MediaPlayer mediaPlayer = pVar.f2095b;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
        w wVar = (w) this.f2086g;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        wVar.f2114f = f10;
        TextToSpeech textToSpeech = wVar.f2113e;
        if (textToSpeech.isSpeaking() && f10 == 0.0f) {
            textToSpeech.stop();
        }
    }

    public k(Context context, String language) {
        G9.c options = new G9.c();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(options, "options");
        Object systemService = context.getSystemService(StubApp.getString2(643));
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        Intrinsics.checkNotNullParameter(options, "options");
        r playerAttributes = new r(options, new AudioAttributes.Builder());
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(playerAttributes, "playerAttributes");
        Q2.g audioFocusDelegate = new Q2.g(audioManager, playerAttributes);
        A1.a timerFactory = new A1.a(11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(audioFocusDelegate, "audioFocusDelegate");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        this.f2081b = options;
        this.f2082c = audioFocusDelegate;
        this.f2083d = timerFactory;
        Intrinsics.checkNotNullParameter(options, "options");
        r playerAttributes2 = new r(options, new AudioAttributes.Builder());
        this.f2084e = new ConcurrentLinkedQueue();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(playerAttributes2, "playerAttributes");
        this.f2085f = new p(context, playerAttributes2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(playerAttributes2, "playerAttributes");
        this.f2086g = new w(context, language, playerAttributes2);
        this.f2088i = new C2.d(this, 10);
    }
}
