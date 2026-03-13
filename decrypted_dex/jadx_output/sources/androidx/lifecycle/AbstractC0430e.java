package androidx.lifecycle;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class AbstractC0430e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9908a;

    static {
        int[] iArr = new int[EnumC0438m.values().length];
        try {
            iArr[EnumC0438m.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0438m.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0438m.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0438m.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC0438m.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC0438m.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC0438m.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f9908a = iArr;
    }
}
