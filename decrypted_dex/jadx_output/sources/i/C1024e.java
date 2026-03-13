package i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.stub.StubApp;
import h.AbstractC0997a;
import java.lang.ref.WeakReference;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1024e {

    /* renamed from: A, reason: collision with root package name */
    public final int f14570A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f14571B;

    /* renamed from: C, reason: collision with root package name */
    public final HandlerC1022c f14572C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14574a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogInterfaceC1025f f14575b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f14576c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f14577d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14578e;

    /* renamed from: f, reason: collision with root package name */
    public AlertController$RecycleListView f14579f;

    /* renamed from: g, reason: collision with root package name */
    public Button f14580g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f14581h;

    /* renamed from: i, reason: collision with root package name */
    public Message f14582i;
    public Button j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f14583k;

    /* renamed from: l, reason: collision with root package name */
    public Message f14584l;

    /* renamed from: m, reason: collision with root package name */
    public Button f14585m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f14586n;

    /* renamed from: o, reason: collision with root package name */
    public Message f14587o;

    /* renamed from: p, reason: collision with root package name */
    public NestedScrollView f14588p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f14589q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f14590r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f14591s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f14592t;

    /* renamed from: u, reason: collision with root package name */
    public View f14593u;

    /* renamed from: v, reason: collision with root package name */
    public ListAdapter f14594v;

    /* renamed from: x, reason: collision with root package name */
    public final int f14596x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14597y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14598z;

    /* renamed from: w, reason: collision with root package name */
    public int f14595w = -1;

    /* renamed from: D, reason: collision with root package name */
    public final K4.c f14573D = new K4.c(this, 5);

    public C1024e(Context context, DialogInterfaceC1025f dialogInterfaceC1025f, Window window) {
        this.f14574a = context;
        this.f14575b = dialogInterfaceC1025f;
        this.f14576c = window;
        HandlerC1022c handlerC1022c = new HandlerC1022c();
        handlerC1022c.f14569b = new WeakReference(dialogInterfaceC1025f);
        this.f14572C = handlerC1022c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0997a.f14398e, 2130903082, 0);
        this.f14596x = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f14597y = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f14598z = obtainStyledAttributes.getResourceId(7, 0);
        this.f14570A = obtainStyledAttributes.getResourceId(3, 0);
        this.f14571B = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC1025f.d().g(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(int i3, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f14572C.obtainMessage(i3, onClickListener) : null;
        if (i3 == -3) {
            this.f14586n = charSequence;
            this.f14587o = obtainMessage;
        } else if (i3 == -2) {
            this.f14583k = charSequence;
            this.f14584l = obtainMessage;
        } else {
            if (i3 != -1) {
                throw new IllegalArgumentException(StubApp.getString2(18374));
            }
            this.f14581h = charSequence;
            this.f14582i = obtainMessage;
        }
    }
}
