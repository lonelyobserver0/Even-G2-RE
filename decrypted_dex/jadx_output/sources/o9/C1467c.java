package o9;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import kotlin.jvm.internal.Intrinsics;
import m7.C1275a;

/* renamed from: o9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1467c implements TimeInterpolator, TypeEvaluator {

    /* renamed from: c, reason: collision with root package name */
    public static final C1275a f18390c = new C1275a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Point[] f18391a;

    /* renamed from: b, reason: collision with root package name */
    public C1466b f18392b;

    public C1467c(Point[] keyPoints) {
        Intrinsics.checkNotNullParameter(keyPoints, "keyPoints");
        this.f18391a = keyPoints;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        Point startValue = (Point) obj;
        Point endValue = (Point) obj2;
        Intrinsics.checkNotNullParameter(startValue, "startValue");
        Intrinsics.checkNotNullParameter(endValue, "endValue");
        if (this.f18392b == null) {
            this.f18392b = new C1466b(startValue, this.f18391a);
        }
        Object evaluate = f18390c.evaluate(f10, startValue, endValue);
        Intrinsics.checkNotNullExpressionValue(evaluate, "POINT.evaluate(fraction, startValue, endValue)");
        return (Point) evaluate;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        C1466b c1466b = this.f18392b;
        return c1466b != null ? c1466b.f18389a.getInterpolation(f10) : f10;
    }
}
