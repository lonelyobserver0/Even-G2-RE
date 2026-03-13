package s;

import android.graphics.drawable.Drawable;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1592c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f20586a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z2) {
        if (!z2) {
            return f10;
        }
        return (float) (((1.0d - f20586a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z2) {
        if (!z2) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f20586a) * f11) + (f10 * 1.5f));
    }
}
