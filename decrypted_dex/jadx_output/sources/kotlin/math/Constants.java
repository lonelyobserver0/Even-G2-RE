package kotlin.math;

import kotlin.Metadata;
import kotlin.jvm.JvmField;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/math/Constants;", "", "<init>", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class Constants {
    public static final Constants INSTANCE = new Constants();

    @JvmField
    public static final double LN2 = Math.log(2.0d);

    @JvmField
    public static final double epsilon;

    @JvmField
    public static final double taylor_2_bound;

    @JvmField
    public static final double taylor_n_bound;

    @JvmField
    public static final double upper_taylor_2_bound;

    @JvmField
    public static final double upper_taylor_n_bound;

    static {
        double ulp = Math.ulp(1.0d);
        epsilon = ulp;
        double sqrt = Math.sqrt(ulp);
        taylor_2_bound = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        taylor_n_bound = sqrt2;
        double d8 = 1;
        upper_taylor_2_bound = d8 / sqrt;
        upper_taylor_n_bound = d8 / sqrt2;
    }

    private Constants() {
    }
}
