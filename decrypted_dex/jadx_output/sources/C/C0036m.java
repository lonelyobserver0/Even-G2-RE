package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: C.m, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0036m {

    /* renamed from: B, reason: collision with root package name */
    public RemoteViews f850B;

    /* renamed from: C, reason: collision with root package name */
    public RemoteViews f851C;

    /* renamed from: D, reason: collision with root package name */
    public String f852D;

    /* renamed from: E, reason: collision with root package name */
    public String f853E;

    /* renamed from: F, reason: collision with root package name */
    public long f854F;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f856H;

    /* renamed from: I, reason: collision with root package name */
    public final Notification f857I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f858J;

    /* renamed from: K, reason: collision with root package name */
    public final ArrayList f859K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f860a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f864e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f865f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f866g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f867h;

    /* renamed from: i, reason: collision with root package name */
    public IconCompat f868i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f869k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f871m;

    /* renamed from: n, reason: collision with root package name */
    public C f872n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f873o;

    /* renamed from: p, reason: collision with root package name */
    public int f874p;

    /* renamed from: q, reason: collision with root package name */
    public int f875q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f876r;

    /* renamed from: s, reason: collision with root package name */
    public String f877s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f878t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f880v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f881w;

    /* renamed from: x, reason: collision with root package name */
    public String f882x;

    /* renamed from: y, reason: collision with root package name */
    public Bundle f883y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f861b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f862c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f863d = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f870l = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f879u = false;

    /* renamed from: z, reason: collision with root package name */
    public int f884z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f849A = 0;

    /* renamed from: G, reason: collision with root package name */
    public int f855G = 0;

    public C0036m(Context context, String str) {
        Notification notification = new Notification();
        this.f857I = notification;
        this.f860a = context;
        this.f852D = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f869k = 0;
        this.f859K = new ArrayList();
        this.f856H = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i3, String str, PendingIntent pendingIntent) {
        this.f861b.add(new C0030g(i3 != 0 ? IconCompat.e(null, "", i3) : null, str, pendingIntent, new Bundle(), null, null, true, 0, true, false));
    }

    public final Notification b() {
        Bundle bundle;
        E e10 = new E(this);
        C0036m c0036m = (C0036m) e10.f787d;
        C c10 = c0036m.f872n;
        if (c10 != null) {
            c10.b(e10);
        }
        Notification build = ((Notification.Builder) e10.f786c).build();
        RemoteViews remoteViews = c0036m.f850B;
        if (remoteViews != null) {
            build.contentView = remoteViews;
        }
        if (c10 != null) {
            c0036m.f872n.getClass();
        }
        if (c10 != null && (bundle = build.extras) != null) {
            c10.a(bundle);
        }
        return build;
    }

    public final void d(int i3, boolean z2) {
        Notification notification = this.f857I;
        if (z2) {
            notification.flags = i3 | notification.flags;
        } else {
            notification.flags = (~i3) & notification.flags;
        }
    }

    public final void e(int i3, int i10, boolean z2) {
        this.f874p = i3;
        this.f875q = i10;
        this.f876r = z2;
    }

    public final void f(Uri uri) {
        Notification notification = this.f857I;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = AbstractC0035l.a(AbstractC0035l.d(AbstractC0035l.c(AbstractC0035l.b(), 4), 5));
    }

    public final void g(C c10) {
        if (this.f872n != c10) {
            this.f872n = c10;
            if (c10 == null || c10.f780a == this) {
                return;
            }
            c10.f780a = this;
            g(c10);
        }
    }
}
