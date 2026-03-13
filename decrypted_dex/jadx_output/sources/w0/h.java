package w0;

import L0.B;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.stub.StubApp;
import java.util.HashMap;
import o0.AbstractC1407D;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;
import o0.C1438m;
import o0.C1444s;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public boolean f22014A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22015a;

    /* renamed from: b, reason: collision with root package name */
    public final e f22016b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f22017c;

    /* renamed from: i, reason: collision with root package name */
    public String f22023i;
    public PlaybackMetrics.Builder j;

    /* renamed from: k, reason: collision with root package name */
    public int f22024k;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1407D f22027n;

    /* renamed from: o, reason: collision with root package name */
    public Bc.i f22028o;

    /* renamed from: p, reason: collision with root package name */
    public Bc.i f22029p;

    /* renamed from: q, reason: collision with root package name */
    public Bc.i f22030q;

    /* renamed from: r, reason: collision with root package name */
    public C1438m f22031r;

    /* renamed from: s, reason: collision with root package name */
    public C1438m f22032s;

    /* renamed from: t, reason: collision with root package name */
    public C1438m f22033t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22034u;

    /* renamed from: v, reason: collision with root package name */
    public int f22035v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22036w;

    /* renamed from: x, reason: collision with root package name */
    public int f22037x;

    /* renamed from: y, reason: collision with root package name */
    public int f22038y;

    /* renamed from: z, reason: collision with root package name */
    public int f22039z;

    /* renamed from: e, reason: collision with root package name */
    public final C1415L f22019e = new C1415L();

    /* renamed from: f, reason: collision with root package name */
    public final C1414K f22020f = new C1414K();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f22022h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f22021g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f22018d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f22025l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f22026m = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f22015a = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f22017c = playbackSession;
        e eVar = new e();
        this.f22016b = eVar;
        eVar.f22010d = this;
    }

    public final boolean a(Bc.i iVar) {
        String str;
        if (iVar == null) {
            return false;
        }
        String str2 = (String) iVar.f768d;
        e eVar = this.f22016b;
        synchronized (eVar) {
            str = eVar.f22012f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f22014A) {
            builder.setAudioUnderrunCount(this.f22039z);
            this.j.setVideoFramesDropped(this.f22037x);
            this.j.setVideoFramesPlayed(this.f22038y);
            Long l9 = (Long) this.f22021g.get(this.f22023i);
            this.j.setNetworkTransferDurationMillis(l9 == null ? 0L : l9.longValue());
            Long l10 = (Long) this.f22022h.get(this.f22023i);
            this.j.setNetworkBytesRead(l10 == null ? 0L : l10.longValue());
            this.j.setStreamSource((l10 == null || l10.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.f22017c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.f22023i = null;
        this.f22039z = 0;
        this.f22037x = 0;
        this.f22038y = 0;
        this.f22031r = null;
        this.f22032s = null;
        this.f22033t = null;
        this.f22014A = false;
    }

    public final void c(AbstractC1416M abstractC1416M, B b2) {
        int b10;
        PlaybackMetrics.Builder builder = this.j;
        if (b2 == null || (b10 = abstractC1416M.b(b2.f3881a)) == -1) {
            return;
        }
        C1414K c1414k = this.f22020f;
        int i3 = 0;
        abstractC1416M.f(b10, c1414k, false);
        int i10 = c1414k.f18044c;
        C1415L c1415l = this.f22019e;
        abstractC1416M.n(i10, c1415l);
        C1444s c1444s = c1415l.f18053c.f18249b;
        if (c1444s != null) {
            int D6 = AbstractC1560u.D(c1444s.f18242a, c1444s.f18243b);
            i3 = D6 != 0 ? D6 != 1 ? D6 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i3);
        if (c1415l.f18062m != -9223372036854775807L && !c1415l.f18060k && !c1415l.f18059i && !c1415l.a()) {
            builder.setMediaDurationMillis(AbstractC1560u.V(c1415l.f18062m));
        }
        builder.setPlaybackType(c1415l.a() ? 2 : 1);
        this.f22014A = true;
    }

    public final void d(a aVar, String str) {
        B b2 = aVar.f21982d;
        if ((b2 == null || !b2.b()) && str.equals(this.f22023i)) {
            b();
        }
        this.f22021g.remove(str);
        this.f22022h.remove(str);
    }

    public final void e(int i3, long j, C1438m c1438m, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        timeSinceCreatedMillis = io.flutter.view.a.k(i3).setTimeSinceCreatedMillis(j - this.f22018d);
        if (c1438m != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    i11 = i10 != 3 ? 1 : 4;
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str = c1438m.f18215m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c1438m.f18216n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c1438m.f18213k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c1438m.j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c1438m.f18223u;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c1438m.f18224v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c1438m.f18193C;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c1438m.f18194D;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c1438m.f18207d;
            if (str4 != null) {
                int i17 = AbstractC1560u.f20190a;
                String[] split = str4.split(StubApp.getString2(999), -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c1438m.f18225w;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f22014A = true;
        PlaybackSession playbackSession = this.f22017c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
