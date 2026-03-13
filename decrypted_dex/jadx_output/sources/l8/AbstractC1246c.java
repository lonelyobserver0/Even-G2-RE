package l8;

import com.mapbox.common.TransferState;

/* renamed from: l8.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1246c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16829a;

    static {
        int[] iArr = new int[TransferState.values().length];
        try {
            iArr[TransferState.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferState.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransferState.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransferState.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f16829a = iArr;
    }
}
