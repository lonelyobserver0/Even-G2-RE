package c6;

import b6.AbstractC0528h;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: c6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0572a extends AbstractC0528h {

    /* renamed from: b, reason: collision with root package name */
    public final int[] f10975b;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f10978e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f10979f;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f10974a = new int[4];

    /* renamed from: c, reason: collision with root package name */
    public final float[] f10976c = new float[4];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f10977d = new float[4];

    public AbstractC0572a() {
        int[] iArr = new int[8];
        this.f10975b = iArr;
        this.f10978e = new int[iArr.length / 2];
        this.f10979f = new int[iArr.length / 2];
    }

    public static void g(int[] iArr, float[] fArr) {
        int i3 = 0;
        float f10 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f11 = fArr[i10];
            if (f11 < f10) {
                i3 = i10;
                f10 = f11;
            }
        }
        iArr[i3] = iArr[i3] - 1;
    }

    public static void h(int[] iArr, float[] fArr) {
        int i3 = 0;
        float f10 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f11 = fArr[i10];
            if (f11 > f10) {
                i3 = i10;
                f10 = f11;
            }
        }
        iArr[i3] = iArr[i3] + 1;
    }

    public static boolean i(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 >= 0.7916667f && f10 <= 0.89285713f) {
            int i3 = IntCompanionObject.MAX_VALUE;
            int i10 = Integer.MIN_VALUE;
            for (int i11 : iArr) {
                if (i11 > i10) {
                    i10 = i11;
                }
                if (i11 < i3) {
                    i3 = i11;
                }
            }
            if (i10 < i3 * 10) {
                return true;
            }
        }
        return false;
    }
}
