package v0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.stub.StubApp;
import java.util.Objects;
import o0.C1428c;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1809d {

    /* renamed from: a, reason: collision with root package name */
    public final L4.k f21708a;

    /* renamed from: b, reason: collision with root package name */
    public final C1808c f21709b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC1827w f21710c;

    /* renamed from: d, reason: collision with root package name */
    public C1428c f21711d;

    /* renamed from: f, reason: collision with root package name */
    public int f21713f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f21715h;

    /* renamed from: g, reason: collision with root package name */
    public float f21714g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f21712e = 0;

    public C1809d(Context context, Handler handler, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w) {
        this.f21708a = Ec.d.B(new C1807b(context, 0));
        this.f21710c = surfaceHolderCallbackC1827w;
        this.f21709b = new C1808c(this, handler);
    }

    public final void a() {
        int i3 = this.f21712e;
        if (i3 == 1 || i3 == 0) {
            return;
        }
        int i10 = AbstractC1560u.f20190a;
        L4.k kVar = this.f21708a;
        if (i10 < 26) {
            ((AudioManager) kVar.get()).abandonAudioFocus(this.f21709b);
        } else if (this.f21715h != null) {
            ((AudioManager) kVar.get()).abandonAudioFocusRequest(this.f21715h);
        }
    }

    public final void b(C1428c c1428c) {
        C1428c c1428c2 = this.f21711d;
        int i3 = AbstractC1560u.f20190a;
        if (Objects.equals(c1428c2, c1428c)) {
            return;
        }
        this.f21711d = c1428c;
        int i10 = c1428c == null ? 0 : 1;
        this.f21713f = i10;
        AbstractC1550k.b(StubApp.getString2(23619), i10 == 1 || i10 == 0);
    }

    public final void c(int i3) {
        if (this.f21712e == i3) {
            return;
        }
        this.f21712e = i3;
        float f10 = i3 == 4 ? 0.2f : 1.0f;
        if (this.f21714g == f10) {
            return;
        }
        this.f21714g = f10;
        SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w = this.f21710c;
        if (surfaceHolderCallbackC1827w != null) {
            C1830z c1830z = surfaceHolderCallbackC1827w.f21810a;
            c1830z.E(1, 2, Float.valueOf(c1830z.f21847n0 * c1830z.f21816B.f21714g));
        }
    }

    public final int d(int i3, boolean z2) {
        int requestAudioFocus;
        boolean z10 = false;
        if (i3 == 1 || this.f21713f != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z2) {
            int i10 = this.f21712e;
            if (i10 == 1) {
                return -1;
            }
            if (i10 == 3) {
                return 0;
            }
        } else if (this.f21712e != 2) {
            int i11 = AbstractC1560u.f20190a;
            L4.k kVar = this.f21708a;
            C1808c c1808c = this.f21709b;
            if (i11 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f21715h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f21713f) : new AudioFocusRequest.Builder(this.f21715h);
                    C1428c c1428c = this.f21711d;
                    if (c1428c != null && c1428c.f18128a == 1) {
                        z10 = true;
                    }
                    c1428c.getClass();
                    this.f21715h = builder.setAudioAttributes((AudioAttributes) c1428c.a().f9233b).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(c1808c).build();
                }
                requestAudioFocus = ((AudioManager) kVar.get()).requestAudioFocus(this.f21715h);
            } else {
                AudioManager audioManager = (AudioManager) kVar.get();
                this.f21711d.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(c1808c, 3, this.f21713f);
            }
            if (requestAudioFocus == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}
