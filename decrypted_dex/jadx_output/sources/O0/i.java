package O0;

import M4.I;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.stub.StubApp;
import java.util.Locale;
import o0.C1419P;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i extends C1419P {

    /* renamed from: r, reason: collision with root package name */
    public boolean f5122r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5123s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5124t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5125u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5126v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5127w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5128x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f5129y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f5130z;

    public i(Context context) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        String[] split;
        int i3 = AbstractC1560u.f20190a;
        if ((i3 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService(StubApp.getString2(3957))) != null && captioningManager.isEnabled()) {
            this.f18086o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f18085n = I.q(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService(StubApp.getString2(3958));
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService(StubApp.getString2(526));
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC1560u.I(context)) {
            String B7 = i3 < 28 ? AbstractC1560u.B(StubApp.getString2(3959)) : AbstractC1560u.B(StubApp.getString2(3960));
            if (!TextUtils.isEmpty(B7)) {
                try {
                    split = B7.trim().split(StubApp.getString2("925"), -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point2 = new Point(parseInt, parseInt2);
                        a(point2.x, point2.y);
                        this.f5129y = new SparseArray();
                        this.f5130z = new SparseBooleanArray();
                        b();
                    }
                }
                AbstractC1550k.k(StubApp.getString2(3962), StubApp.getString2(3961) + B7);
            }
            if (StubApp.getString2(3963).equals(AbstractC1560u.f20192c) && AbstractC1560u.f20193d.startsWith(StubApp.getString2(3964)) && context.getPackageManager().hasSystemFeature(StubApp.getString2(3965))) {
                point = new Point(3840, 2160);
                point2 = point;
                a(point2.x, point2.y);
                this.f5129y = new SparseArray();
                this.f5130z = new SparseBooleanArray();
                b();
            }
        }
        point = new Point();
        if (i3 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        point2 = point;
        a(point2.x, point2.y);
        this.f5129y = new SparseArray();
        this.f5130z = new SparseBooleanArray();
        b();
    }

    @Override // o0.C1419P
    public final C1419P a(int i3, int i10) {
        super.a(i3, i10);
        return this;
    }

    public final void b() {
        this.f5122r = true;
        this.f5123s = true;
        this.f5124t = true;
        this.f5125u = true;
        this.f5126v = true;
        this.f5127w = true;
        this.f5128x = true;
    }

    public i() {
        this.f5129y = new SparseArray();
        this.f5130z = new SparseBooleanArray();
        b();
    }
}
