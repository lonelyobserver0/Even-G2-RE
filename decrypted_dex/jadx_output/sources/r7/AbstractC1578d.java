package r7;

import android.graphics.Paint;

/* renamed from: r7.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1578d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20376a;

    static {
        int[] iArr = new int[Paint.Align.values().length];
        try {
            iArr[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Paint.Align.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Paint.Align.RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f20376a = iArr;
    }
}
