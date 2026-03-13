package sb;

import android.webkit.ConsoleMessage;

/* renamed from: sb.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1657l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20972a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f20972a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20972a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f20972a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f20972a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f20972a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
