package T6;

import com.mapbox.maps.TileCacheBudget;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7221a;

    static {
        int[] iArr = new int[TileCacheBudget.Type.values().length];
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_MEGABYTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_TILES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f7221a = iArr;
    }
}
