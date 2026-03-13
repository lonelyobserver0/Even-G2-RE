package H4;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f2737h = new int[3];

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f2738i = {0.0f, 0.5f, 1.0f};
    public static final int[] j = new int[4];

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f2739k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2740a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f2742c;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2746g = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final int f2743d = F.a.d(-16777216, 68);

    /* renamed from: e, reason: collision with root package name */
    public final int f2744e = F.a.d(-16777216, 20);

    /* renamed from: f, reason: collision with root package name */
    public final int f2745f = F.a.d(-16777216, 0);

    public a() {
        Paint paint = new Paint(4);
        this.f2741b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f2740a = paint2;
        paint2.setColor(this.f2743d);
        this.f2742c = new Paint(paint);
    }
}
