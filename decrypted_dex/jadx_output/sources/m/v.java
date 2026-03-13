package m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16988a;

    /* renamed from: b, reason: collision with root package name */
    public final l f16989b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16991d;

    /* renamed from: e, reason: collision with root package name */
    public View f16992e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16994g;

    /* renamed from: h, reason: collision with root package name */
    public w f16995h;

    /* renamed from: i, reason: collision with root package name */
    public t f16996i;
    public u j;

    /* renamed from: f, reason: collision with root package name */
    public int f16993f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f16997k = new u(this);

    public v(int i3, Context context, View view, l lVar, boolean z2) {
        this.f16988a = context;
        this.f16989b = lVar;
        this.f16992e = view;
        this.f16990c = z2;
        this.f16991d = i3;
    }

    public final t a() {
        t viewOnKeyListenerC1256C;
        if (this.f16996i == null) {
            String string2 = StubApp.getString2(526);
            Context context = this.f16988a;
            Display defaultDisplay = ((WindowManager) context.getSystemService(string2)).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(2131099670)) {
                viewOnKeyListenerC1256C = new f(context, this.f16992e, this.f16991d, this.f16990c);
            } else {
                View view = this.f16992e;
                Context context2 = this.f16988a;
                boolean z2 = this.f16990c;
                viewOnKeyListenerC1256C = new ViewOnKeyListenerC1256C(this.f16991d, context2, view, this.f16989b, z2);
            }
            viewOnKeyListenerC1256C.k(this.f16989b);
            viewOnKeyListenerC1256C.q(this.f16997k);
            viewOnKeyListenerC1256C.m(this.f16992e);
            viewOnKeyListenerC1256C.e(this.f16995h);
            viewOnKeyListenerC1256C.n(this.f16994g);
            viewOnKeyListenerC1256C.o(this.f16993f);
            this.f16996i = viewOnKeyListenerC1256C;
        }
        return this.f16996i;
    }

    public final boolean b() {
        t tVar = this.f16996i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f16996i = null;
        u uVar = this.j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i3, int i10, boolean z2, boolean z10) {
        t a3 = a();
        a3.r(z10);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f16993f, this.f16992e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f16992e.getWidth();
            }
            a3.p(i3);
            a3.s(i10);
            int i11 = (int) ((this.f16988a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f16986a = new Rect(i3 - i11, i10 - i11, i3 + i11, i10 + i11);
        }
        a3.show();
    }
}
