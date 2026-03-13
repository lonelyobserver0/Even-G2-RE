package W6;

import com.mapbox.maps.StylePropertyValueKind;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8169a;

    static {
        int[] iArr = new int[StylePropertyValueKind.values().length];
        try {
            iArr[StylePropertyValueKind.CONSTANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StylePropertyValueKind.TRANSITION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StylePropertyValueKind.EXPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StylePropertyValueKind.UNDEFINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f8169a = iArr;
    }
}
